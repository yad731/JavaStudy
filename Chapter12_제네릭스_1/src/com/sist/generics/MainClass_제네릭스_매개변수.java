package com.sist.generics;
import java.util.*;
public class MainClass_제네릭스_매개변수 {
	/*
		ArrayList<String> list = new ArrayList<String>();	==> 저장된 데이터로 받는 경우 : String
		ArrayList list = new ArrayList<String>();	==> 저장된 데이터를 받는 경우 : Object
	*/
	public static void display1(ArrayList<String> list)
	{
		for(String f:list)
			System.out.println(f);
	}
	public static void display2(ArrayList<Integer> list)
	{
		for(int f:list)
			System.out.println(f);
	}
	public static void display3(ArrayList<Double> list)
	{
		for(double f:list)
			System.out.println(f);
	}
	public static void display4(ArrayList<?> list)		// 와일드 카드 => 어떤 데이터형이든 관계없이 사용
	{
		// 상속이 있는 경우 , 인터페이스 구현 시에 주로 사용 => 데이터형을 통일할 수 있다
		for(Object obj:list)
			System.out.println(obj);
	}
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("사과");
		list1.add("배");
		list1.add("바나나");
		display1(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		display2(list2);
		
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(10.0);
		list3.add(20.0);
		list3.add(30.0);
		display3(list3);
		System.out.println("====== <?>와일드 카드 사용 ======");
		display4(list1);
		display4(list2);
		display4(list3);
		
		
	}
}
