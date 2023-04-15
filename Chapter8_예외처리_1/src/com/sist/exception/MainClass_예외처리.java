package com.sist.exception;
/*
	오작동 / 비정상 종료 ==> 에러
	------------------------
	
	에러
		1) 수정 불가능
		2) 수정 가능 에러 ==> 예외처리
		 	에러 => 사용자가 잘못된 값을 입력 (유효성),
		 		   	 계산기 => 0으로 나눈다
		 		   프로그래머 실수
		 		     배열, 캐스트, null
		 		     int[] arr = new int[2];	// 0, 1
		 		     arr[2] = 100;
		 		     --------------------------
		 		     String s;		// 주소값 null
		 		     s.trim();
				=> 복구 try~catch
				   회피 throws
				   
	*** 컴파일 에러 : 컴파일 시 에러 (문법 에러) javac
	*** 런타임 에러 : 실행 시 에러 java
		논리적 에러 : 실행되나 프로그램 제작 의도와 다르게 동작
		-------------------------------------------
		견고한 프로그램 : 에러가 발생 시 종료하지 않고 정상 수행이 가능하도록 만드는 것
			1) 에러를 사전에 방지하는 프로그램을 고민
				if문을 먼저 고려
				=> if문으로 처리가 어려운 부분 : 예외처리
			2) 예외처리 : 가벼운 에러, 수정이 가능한 에러
				웹 - 404, 500, 415, 400
					404 : 파일이 없는 경우 (웹 => 서버에 파일을 요청) => 파일명 오류 => 파일명 변경
					500 : 문법 에러
					415 : 한글 변환 오류 (UTF-8) => UFT-8 등의 오류
					400 : 전송 데이터 ==> 받는 데이터의 데이터형이 다른 경우 => int "홍길동"
				자바 => Exception : NullPointException, ArrayIndexOutOfBoundsException => output 창
			3) 예외처리의 종류
			*** = 예외 복구 : 예외가 발생하면 복구하여 다시 수행이 가능
							try{
								정상 수행 문장
								=> 에러 발생할 수 있다
							} catch()
							{
								에러가 발생 시 복구
							}
			*** = 예외 회피 : 에러 부분을 제외하고 다음 문장으로 수행
							method() throws 예외 처리 종류....
				= 예외 임의 발생 : 테스팅 시 예외를 발생해서 견고한 프로그램인지 확인 		// 배포할 때
							throw 예외 처리;
				= 사용자 정의 예외처리 : 자바에서 지원하지 않는 경우에 직접 제작
							class A extends Exception
			4) 예외처리 정의 & 목적
				정의 : 프로그램 실행 시 발생할 수 있는 에러에 대비한 코드를 작성
						회원가입 : *필수 입력 (값이 없는 경우(null) 오라클에서 에러 발생) ==> NOT NULL
				목적 : 프로그램 비정상 종료를 방지하고 정상 상태를 유지
			5) 자바에서 지원하는 예외처리의 계층구조
				Error : 메모리가 부족, 윈도우 작동을 안 함, 이클립스 문제 발생
				Exception : 파일명이 틀리다, IP가 틀리다, 웹사이트주소가 틀리다, SQL 문장을 잘못 수행
									Object
									   |
								   Throwable : 에러 처리하는 최상위 클래스
								   	   |
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				|								   |
				Error (수정이 불가능)				Exception (수정이 가능한 에러)
												   |
									ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
									|									|
									|									|
//								<<CheckException>>					<<UnCheckException>>
								IOException(파일)						RuntimeException
								SQLException(데이터베이스)					|
								MalformedURLException(URL,서버)		ArrayIndexOutOfBoundsException
								ClassNotFoundException(리플렉션)		NumberFormatException
								InterruptedException(쓰레드)			NullPointerException
																	ClassCastException
																	ArithmeticException
																	
				CheckException : 컴파일 시 예외처리 여부를 확인
				UnCheckException : 예외처리 여부를 확인하지 않음
								   필요 시에 예외처리

			6) 예외처리 형식
		   	*** 1. 직접처리(예외 복구) => 프로그래머가 직접 처리한다
			   	2. 간접처리(예외 회피 = 예외 떠넘기기) => 자바 시스템에 맡긴다
			   	3. 예외 임의 발생(사용자가 예외처리)
			   	4. 사용자 정의 예외처리

				1. 직접처리 (예외 복구) : 웹, 데이터베이스는 CheckException (무조건 예외처리를 해야 한다)
					1) 변수, 2) 메소드, 3) 예외처리, 4) SQL
				2. 형식
					try
					{
						정상 수행이 가능한 소스
						= 지금까지 코딩한 부분
					} catch(예외처리 종류)
					{
						에러 발생 시 처리하는 영역 => 에러 확인 => 예상되는 예외처리 => catch (여러 번 사용 가능)
					}
					finally
					{
						try, catch 수행 상관없이 무조건 수행하는 문장 => 생략 가능
						에러 발생, 정상 수행 상관없이 무조건 수행하는 문장
							1) 파일 닫기
							2) 오라클 닫기 => test(XE) 50명 동시 접근 시 서버 무너짐 (닫기를 수행하지 못하면 50번 도달 가능)
							3) 서버 닫기
					}
					
					*** 예외처리
						1. 고민 : 예상되는 에러
								 예)
								 	두 개의 정수를 문자열을 받아서 정수 배열에 저장, 저장된 데이터를 나누기를 하는 프로그램을 제작
								 	1. 배열 인덱스에서 오류
								 	2. 문자열을 정수로 변환하는 과정에서 오류
								 	3. 0으로 나눌 수 있는 가능성
								 	==> 3개의 catch + 1개의 기타 catch(예상하지 못한 에러 => Exception : 폭넓은 처리)
						2. 고민 : 예외처리의 위치
								 
				
		
*/
public class MainClass_예외처리 {

	public static void main(String[] args) {
		
//		int[] arr = new int[2];	// 0, 1
//	    arr[2] = 100;
		
//		try
//		{
//			
//		}catch(ArithmeticException ex) {}
//		catch(ArrayIndexOutOfBoundsException ex) {}			// catch 여러 개 작성 가능
//		catch(RuntimeException ex) {}						// 낮은 계층의 exception부터 작성 ~ 상위 클래스
		
//		try
//		{
//			for(int i=1; i<=10; i++)
//			{
//				int r = (int)(Math.random()*3);		//0 1 2
//				if(r==0)
//				{
//					i--;
//					continue;
//				}
//				System.out.println(i+"-"+r+"  "+(i/r));
//			}
//		} catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
		
		
		// try~catch는 부분적으로 사용이 가능하다
		for(int i=1; i<=10; i++)
		{
			try
			{
				int r = (int)(Math.random()*3);
				System.out.println(i+"-"+r+"  "+(i/r));
			} catch(Exception ex)
			{
				i--;
			}
		}
		
		
	}
}
