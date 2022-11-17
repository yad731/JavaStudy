package com.sist.exception;
/*
	1. try~catch : 
	2. throws : 예외선언 (예외회피) => 시스템에 예외를 알려준다
				형식)
					public void display() throws NumberFormatException, RuntimeException, Exception
												 -------------------------------------------------- throws는 catch와 다르게 순서가 없다
					=> 라이브러리는 예상된 예외를 throws로 이용해서 등록(처리하면서 사용을해야 한다)
					=> 사용법 1) try~catch : 직접 처리하는 방법
							2) throws : 선언만 처리
							
					public void display() throws Exception => display를 호출 시에는 Exception 처리한 후 사용
					{
					}
					
					public void aaa()
					{
						display();		// 오류 코드
					}
					
					1)
						public void aaa()
						{
							try
							{
								display();
							} catch(Exception e){}
						}
						
					2) 
						public void aaa() throws Exception
						{
							display();
						}
					----------------------------------------
					public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundsException
					{
					}
					
					main()
					{
						aaa();		// 정상 수행
					}
					
					// Exception / Throwable
					   모든 예외를 처리할 수 있는 클래스
					   
					   void aaa() throws IOException, ClassNotFoundException
					   void bbb() throws Exception => 확대
					   void ccc() throws Throwable
					   
					   void aaa() throws Throwable
					   void bbb() throws Exception ==> X
					   
					   // 예외처리도 확대의 경우 오류가 없지만 축소의 경우 오류 있음
					   



*/
public class MainClass_예외처리_1 {
	public static void aaa() throws Exception
	{
		
	}
	public static void bbb() throws NumberFormatException, NullPointerException
	{
		
	}
	public static void main(String[] args) throws Exception {
		
		bbb();		// Runtime => 예외처리 하지 않아도 무방
//		aaa();		// CheckException 포함 => 예외처리가 필수
		try
		{
			Thread.sleep(1000);
		} catch(Exception ex) {}	// 프로그래머가 직접 처리
	
	
	}
}














