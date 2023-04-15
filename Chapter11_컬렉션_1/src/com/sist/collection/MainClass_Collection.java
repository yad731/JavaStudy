package com.sist.collection;
/*
	컬렉션 프레임워크
	------------- 데이터를 모아서 관리하기 쉽게 라이브러리로 제작하는 클래스의 모음
				  라이브러리 제작 => 표준화하기 좋음
	Collection
		- List
		- Set
		- Map
	
	1) List
		특징)
			= 순서를 가지고 있다 (인덱스)
			= 중복 데이터를 허용
			= 데이터베이스에서 주로 사용
			= 구현된 클래스
			 ***ArrayList
					데이터베이스 있는 데이터를 모아서 브라우저에 전송
				Vector
					동기화 (네트워크에서 주로 사용) => 서버 개발자
				LinkedList
					C 언어 호환
				Stack
					LIFO => last in first out => 메모리 구조
				Queue
					FIFO => first in first out => 네트워크, 운영체제 스케줄러
	2) Set
		특징)
			= 순서가 없다
			= 데이터 중복을 허용하지 않는다
			= Map의 데이터 읽을 때, 데이터 중복을 제거할 때 주로 사용
			= TreeSet(검색) / ***HashSet

	3) Map
		특징) key, value로 만들어진다 (둘을 동시에 쌍으로 저장)
			= key는 중복이 불가능, value는 중복 가능
			= Map<K,V>
			= 사용처 : 일반 스프링, MyBatis => Map을 이용하여 저장 => id, value
					 --------- 클래스 등록 (스프링 => 클래스 관리)
			= HashTable / HashMap ==> HashTable의 단점 보완 => 주로 사용
			
	4) 기타 : Properties (파일 처리 => 데이터베이스 (유저, PWD)) => Map
			 id = aaa
			 pwd = 1234
			 	=> 스프링에서 주로 사용 (유효성 검사)
			 	=> MyBatis (데이터베이스 정보 저장)
	
	----------------------------------------------------------------------------
	12장 => 컬렉션 프레임워크를 쉽게 사용 가능하도록 제작
				Object를 형변환 => 형변환 없이 사용 : 제네릭스
		 ***어노테이션 : 스프링의 기반
			열거형
			
	1) 주요 메소드 (메모리에서 데이터를 제어 ==> 추가, 수정, 삭제, 검색)
		ArrayList (단점 => 메모리가 크다, 메모리 누수현상, 장점 => 가장 간단하고 속도가 빠르다)
		추가 : add(Object o)
		수정 : set(int i, Object o)
		삭제 : remove(int index)
		검색 : get(int index)
		갯수 : size()
		전체 삭제 : clear()
		확인 : isEmpty
		---------------------------> Vector, LinkedList
		HashSet : 중복 데이터 제거
			add(), remove(), clear, isEmpty
		HashMap : 
			추가 : push(key, 값)
			읽기 : get(key)
		---------------------------------------------------
		=> removeAll()(MINUS), addAll()(UNION, UNIONALL), retainAll()(INTERSECT) ==> JOIN
		   ---------차집합	   ------합집합				  -----------교집합
			
		
*/
// Vector => 기존의 Vector로 개발된 프로그램과의 호환을 위해 => ArrayList가 보완된 것
import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		
		// Vector 생성
		Vector list = new Vector();
		// List 인터페이스 구현, Vector만 가지고 있는 메소드
		/*
			자료구조 (데이터 관리) => 메모리 상에서
			  추가 : add() ============> addElement()
			  수정 : set() ============> set()
			  삭제 : remove() =========> remove(), removeAll(), clear()
			  읽기 : get() ============> elementAt()
			  개수 : size()
		*/
		// 추가
		list.addElement("홍길동"); // index => 0
		list.addElement("심청이"); // 1
		list.addElement("강감찬");
		list.addElement("이순신");
		list.addElement("박문수");
		
		// 출력
		System.out.println("====== 일반 for ======");
		for(int i=0; i<list.size(); i++)
		{
			String name = (String)list.elementAt(i);
			System.out.println(name);
		}
		// 출력 2
		System.out.println("====== 람다식 ======");
		list.forEach((name)->System.out.println(name));
		// 출력 3
		System.out.println("====== forEach ======");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		
		// ArrayList로 변경
		// 방법 1
		ArrayList list2 = new ArrayList(list);
		System.out.println("====== 1. Vector ==> ArrayList로 변경");
		System.out.println(list2);
		// 방법 2
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		System.out.println("====== 2. Vector ==> ArrayList로 변경");
		System.out.println(list3);
		
		// Vector 데이터 수정
		System.out.println("===== Vector에서 데이터 수정 =====");
		list.setElementAt("을지문덕", 2);
		System.out.println(list);
		
		System.out.println("===== Vector에서 데이터 삭제 =====");
		list.removeElementAt(1);	// remove(index)
		System.out.println(list);
		
		// Vector에서 데이터 전체 삭제
		System.out.println("===== Vector에서 데이터 전체 삭제 =====");
		list.removeAllElements();	// clear()
		System.out.println(list);
		
		
		
		
	}
}
