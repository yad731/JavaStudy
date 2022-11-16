package com.sist.main;
class A
{
	
}
public class MainClass {

	public static void main(String[] args) {
	
		
		for(int i=1; i<=10; i++)
		{
			A a = new A();
			System.out.println("a = "+a);
		}
		// 객체 10개 생성, 메모리 낭비
		
		A b = null;
		for(int i=1; i<=10; i++)
		{
			b = new A();
			System.out.println("b = "+b);
		}
		// 메모리 하나로 객체 이름 변경
	}
}
