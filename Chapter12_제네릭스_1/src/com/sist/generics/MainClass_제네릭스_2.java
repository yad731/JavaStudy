package com.sist.generics;
class Box<T>	// T는 임시 저장 클래스형 데이터 => 지정된 데이터형으로 변경 (사용하지 않을 경우에는 Object)
{
	T item;
	// Box<String> ===> T -> String
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
public class MainClass_제네릭스_2 {

	public static void main(String[] args) {
		
		Box box = new Box();	// T -> Object
		box.setItem("aaa");
		String s = (String)box.getItem();	// Object가 String보다 크기 때문에 형변환 필요
		Box<String> box1 = new Box<String>();
		box1.setItem("");
		s = box1.getItem();	// 형변환이 필요없다
		Box<Integer> box2 = new Box<Integer>();
		box2.setItem(1);
		int i = box2.getItem();	// 언박싱
		// Integer i = 100; => 박싱
		// int ii = i;	=> Integer를 int로 받을 때 => 언박싱
		/*
			Wrapper
			클래스형에 기본형 데이터 대입 : 박싱
			기본형에 클래스형 데이터 대입 : 언박싱
			==> 호환
		*/
		Integer ii = 100;
		int aa = new Integer(100).intValue();	// 경고
	}
}
