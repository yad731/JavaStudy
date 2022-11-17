package com.sist.exception;
// 멀티 catch 블럭
import java.util.Scanner;
public class 예외처리_2 {

	public static void main(String[] args) {
		
		// 문자열로 받아서 정수 변환 ==> 나누기
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("첫번째 정수 입력 : ");
			String num1 = scan.next();
			System.out.println("두번째 정수 입력 : ");
			String num2 = scan.next();
			
			// 오류 예상 => 정수
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);	// NumberFormatException
			
			// 나누기 => 오류 예상 (0)
			int n3 = n1/n2;
			
			System.out.println("결과값 = "+n3);
		} // 오류 발생 시 처리
		catch(NumberFormatException | ArithmeticException e)
		{
			// e는 객체 => 어떤 클래스의 객체인지 확인할 때 사용하는 instanceof 연산자
//			e.printStackTrace();
			if(e instanceof NumberFormatException)
				System.out.println("문자열이 입력되었습니다. \n 정수를 입력하세요");
			else if(e instanceof ArithmeticException)
				System.out.println("0으로 나눌 수 없습니다!!");
		}
		// 웹 ==> 화면 출력
//		System.out.print("프로그램 종료");	// 비정상종료 방지하고 정상 수행이 가능하게 프로그램 제작
		System.out.println("화면 출력 유지...");
	
		/*
			catch는 여러 번 사용 가능
			catch에 사용되는 예외처리 클래스는 순서가 존재한다 (계층구조 ==> 상위 클래스가 여럿을 동시에 처리 가능)
		*/
	}
}







