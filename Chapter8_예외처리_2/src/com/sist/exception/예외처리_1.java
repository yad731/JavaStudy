package com.sist.exception;
/*
	컴파일(이진파일 변경), 인터프리터(한 줄씩 읽어서 출력)
	----------------  ------------------------
		 javac					java
		   |					  |
		프로그래머				 사용자의 오류
	----------------		------------
	 CheckException		  UnCheckException
	 컴파일러가 예외처리가		확인하지 않는다
	 되었는지 여부 확인			=> 예외처리 생략 가능
	 
	
	CheckException
		= IOException : 파일명, 경로명에 이상
		= ClassNotFoundException : 클래스가 없는 경우 (리플렉션 => new 없이 메모리 할당)
		= SQLException : 데이터베이스 연결 (오라클, MySQL)
		= InterruptedException : 쓰레드 충돌
		= MalformedURLException : IP, URL주소에 이상 ==> 크롤링
	UnCheckException
		= ArrayIndexOutOfBoundsException : 배열 범위 초과 시에 (인덱스 번호 오류) ==> 컬렉션(12장)
		= NumberFormatException : 정수 변환에 오류 ==> 웹/윈도우는 정수를 전송할 수 없다
		= NullPointerException : 객체 생성없이 선언 후 사용
				모든 클래스의 기본 값 : null => 메소드나 변수 사용이 안 됨
		= ClassCastException : 클래스 형변환 => 제네릭스 (자동 형변환 가능)
				class A<T> ==> 임시클래스 Object
				{
					T t;
					String
					public void set(T t)
					{
					}
					public T getT()
					{
					}
				}
	
	-------------------------------------------------------------------------------------
	 1) 처리방법
	 ***1. 예외복구 (직접처리) try~catch~finally ==> 프로그래머가 처리
	 ***2. 예외회피 (간접처리) throws ==> 시스템에 알려준다 (예외 떠넘기기)
	 								  라이브러리에 많이 존재
	 								  sleep() throws InterruptedException
	 	3. 예외던지기 (임의로 발생) throw ==> 사용빈도는 거의 없다 (continue)
	 									 사용자 정의 예외처리
	 2) 사용법
	 	try : 정상 수행이 가능한 코딩 (예외 발생 가능) ==> 에러에 대비한 코딩
	 		  => 프로그래머 실수
	 		  => 사용자 입력 오류
	 	catch : 오류 발생 시에 어떻게 처리할지 (복구 => 에러 확인)
	 			=> 프로그래머 실수 : 복구를 위해서는 소스를 수정해야
	 			=> 사용자 실수 : 다시 입력을 요청
	 			=> 예상되는 에러만큼 catch를 사용 (멀티, 통합)
	 			=> 전체 예외처리가 가능한 클래스 : Exception / Throwable
	 	finally : 무조건 수행
	 			  => try에서 수행 ==> 정상 수행
	 			  => catch에서 수행 ==> 오류가 발생
	 			  => try/catch 수행 상관없이 무조건 수행 (파일 닫기, 서버연결 해제, 데이터베이스 닫기)
				  => 생략이 가능 (필요 시에만 사용)
		
		
		에러 발생에 대한 대비
		try
		{		   
			문장 1  
			문장 2
			문장 3
			
		} catch(A)
		{
			처리문장 4
		}
		catch(B)
		{
			처리문장 5
		}
		catch(C)
		{
			처리문장 6
		}
		문장 7
		------------------
		try
		{		   
			문장 1  
			문장 2
			문장 3
			
		} catch(A|B|C)
		{
			처리문장 6
		}
		문장 7
		------------------
		try
		{		   
			문장 1  
			문장 2
			문장 3
			
		} catch(Exception)
		{
			처리문장 6
		}
		문장 7


*/
import java.util.Scanner;
public class 예외처리_1 {

	public static void main(String[] args) {
		
		// UnCheckException => 예외처리 생략 가능 => 정수 변환, 배열, 나누기, Null
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("정수 두 개 입력(10 10) : ");
			int[] arr = new int[2];
			arr[0] = scan.nextInt();
			arr[2] = scan.nextInt();	// 오류 발생
			
			int res = arr[0]/arr[1];
			System.out.println("res = "+res);
		} catch(ArrayIndexOutOfBoundsException ex)
		{
			// 에러 확인
//			System.out.println(ex.getMessage());
			ex.printStackTrace();	// 실행 과정을 출력
		}
		System.out.println("프로그램 종료");
		
		
		
	}
}
