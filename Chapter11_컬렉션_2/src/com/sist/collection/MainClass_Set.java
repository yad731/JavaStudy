package com.sist.collection;
/*
			Collection
				|
			   Set
		------------------- interface (오버라이딩 가능)
				|
		________|____________
		|					|
	   HashSet			TreeSet
	   --------------------------
	   
	   특징) 순서가 없다, 데이터 중복을 허용하지 않는다
	   		중복없는 데이터를 처리 (접속자 정보, 장르 읽기, 장바구니 ...)
	   
	   주요 메소드)
			HashSet
				= add() => 추가
				= remove(Object o) => 삭제
				= clear() : 메모리 전체 삭제
				= isEmpty() : 빈 공백 여부 확인
				= retainAll() => 교집합
				= size() : 저장 개수
				= iterator() : 데이터를 모아서 한 번에 관리
				  ---------- List, Set, Properties, Map
			TreeSet : 검색용으로 주로 사용 ==> LIKE, REGEXP_LIKE
				= headSet 
				= tailSet



*/
import java.util.*;
class Person implements Cloneable
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	// ==> toString() ==> 객체의 메모리 주소를 저장
//	public String toString()
//	{
////		System.out.println(this);
//		return name + ":" + age;
//	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class MainClass_Set {
	// 객체를 저장했을 경우에는 객체의 주소에 유의
	public static void main(String[] args) throws Exception{
		Set set = new HashSet();
		set.add("ABC");
		set.add("ABC");
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("홍길동", 25);
		Person p3 = p1;
		Person p4 = (Person)p1.clone();
//		System.out.println("p1 = "+p1);
//		System.out.println("p2 = "+p2);
		set.add(p1);
		set.add(p2);
		set.add(p3);	// 객체는 주소값을 기준으로 비교
		set.add(p4);
		System.out.println(set);
	}
}









