package com.sist.collection;
/*
	1. String : 웹 => 문자열 제어
	2. Integer / Double
	3. Date / Calendar
	--------------------------> 오라클의 데이터형 (문자열, 날짜형, 숫자형)
	4. 데이터를 모아서 관리 : 배열
	   배열 => 단점 (고정적) => 크기를 확장하기 어렵다 (크기 확장 시 메모리 누수 현상 => 최적화의 문제)
	   고정적 -> 가변형(수시로 변경이 가능) ==> 크기를 정하지 않는다 : 컬렉션
	5. 컬렉션 : 데이터는 어떤 형이든 등록이 가능 => 형변환 => 데이터형 한 개로 통일(제네릭스)
	   ---- 열거형, Properties
	   		if문을 사용해서 구분 => if 대신 사용할 수 있는 프로그램 : 어노테이션
	----------------------------------------------------------------- 스프링, MyBatis(Mapper) ==> 스프링부트, JPA

	6. 컬렉션 프레임워크 (578page)
		     프레임워크 (표준화) => 형식이 동일	// 스프링 프레임워크, Jquery 프레임워크, MyBatis 프레임워크...
		     표준화 (스프링 형식을 모방)
	     Collection : 데이터그룹, 다수의 데이터 => 모아서 처리
	     개발자가 누구든 상관없이 같은 메소드를 이용해야 한다
	   = 종류
	   							Collection : 인터페이스
	   						 		|
	   			_________________________________________
	   			|					|					|
	   		  List				   Set				   Map  ==> 인터페이스 ==> 메소드가 거의 동일
	   		    |					|					|
	   		    |					|				____|____________
	   		    |					|				|				|
	   		    |					|			HashTable		  HashMap
	   		    |			________|________
	   		    |			|				|
	   		    |		  HashSet		 TreeSet
	   	________|________________
	   	| 			|			|	==> 인터페이스를 구현한 클래스 (주로 사용)
	  ArrayList	  Vector	  Queue
	  							|
	  						LinkedList
	  				
	  ***List
	  	1) 순서를 가지고 있다 (인덱스) ==> 배열 형식
	  	2) 저장된 데이터 중복 가능
	  	3) 비동기화 => 데이터베이스 프로그램에서 주로 사용 ******** 		// 웹프로그램의 핵심은 List에 달려있다
	  	4) CURD => 데이터 처리(추가, 수정, 삭제, 검색)
	  		=> INSERT, UPDATE, DELETE, SELECT (데이터 조작:DML)
	  	5) 주요 메소드
	  		= add() => 데이터 추가
	  		= remove() => 데이터 삭제
	  		= set() => 데이터 수정
	  		= get() => 데이터 읽기
	  		= size() => 저장된 개수
	  		= clear() => 전체를 삭제
	  		= isEmpty() => 존재 여부 확인
	  	------------------------------------> 모든 데이터는 오라클에 저장 ===> 메모리 저장 ===> 브라우저에 전송
	  
	  ***Set
	  	1) 순서가 없다 (인덱스 번호가 없다) => 출력(forEach)
	  	2) 데이터 중복을 허용하지 않는다 (영화의 장르, 음식의 종류) => 분야별 분류
	  	3) List에서 중복이 없는 데이터를 추출할 때
	  	4) HashSet ...
	  	5) 주요 메소드
	  		= add() => 데이터 추가
	  		= remove() => 데이터 삭제
	  		= set() => 데이터 수정
	  		= get() => 데이터 읽기
	  		= size() => 저장된 개수
	  		= clear() => 전체를 삭제
	  		= isEmpty() => 존재 여부 확인
	  
	  ***Map (웹에서 지원하는 모든 클래스는 Map 형식을 가지고 있다)
	  		  --------------------- HttpServletRequest (사용자가 보내주는 데이터를 가지고 있다)
	  		  					    HttpServletResponse (요청 처리 결과를 브라우저로 전송)
									HttpSession (서버에 데이터를 저장)
									Cookie (사용자의 브라우저에 저장)
		1) 키와 값으로 이루어져 쌍으로 저장
			id, admin
		2) 키는 중복이 불가, 값만 중복 가능
		3) 클래스 관리, 요청값 관리, 전송값 관리
		   --------- 스프링, MyBatis ==> id, 실제값
		4) 주로 사용 => HashMap (동일 ==> 파일 (Properties))
		
		
	1. ArrayList (584page)
		= 주로 사용 (데이터 중복을 허용 => 데이터베이스와 연동) ******핵심
	 	데이터가 없다 (데이터만 크롤링)
		특징) MyBatis/JPA/JDBC/ (오라클 관련)
		저장 ==> Object
			add() ==> 오버로딩
			add(데이터)
			add(인덱스 번호, 데이터) ==> 권장되지 않음 (속도 저하) => LinkedList
				-------- 항상 순차적으로 생성 및 유지 (인덱스를 이용할 때), 삭제 시에도 자동으로 빈틈 없게
			==> 데이터를 가지고 올 때 형변환 ==> 같은 데이터형이 아니라면 제어(for문 사용)하기 어려움
		
		
	 1) 1차 프로젝트 : 데이터베이스 연결이 주 목적 (최대한으로 오라클 연결 => SQL)
					JDBC / Jquery (Ajax)
	 2) 2차 프로젝트 : 스프링을 익히는 것이 주 목적
	 				MyBatis / VueJS
	 3) 3차 프로젝트 : 우대사항(신기술)
	 				JPA / ReactJS
	 ** 모방 => 전체를 구현
	   			
*/
import java.util.*;

public class MainClass_Collection {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();	// 크기를 지정하지 않는다 => 가변형
		// 저장
		list.add("홍길동");	// 인덱스 0
		list.add("심청이");	// 인덱스 1
		list.add("이순신");	// 2	==> 인덱스 3
		list.add("강감찬");	// 3	==> 인덱스 4
		list.add(2,"을지문덕");	// 인덱스 2	==> for문 사용 편리
		
		System.out.println("저장된 인원 수 : "+list.size());
		// 출력	// size() ==> 저장된 갯수 ==> 배열 (length)
		System.out.println("========== 컬렉션에 추가 add() ==========");
		for(int i=0; i<list.size(); i++)
		{
//			String name = (String) list.get(i);	// 데이터 읽기
			String name = list.get(i).toString();
			//			  ----------- Object
			System.out.println(i+" => "+name);
		}
		
		System.out.println("========== 컬렉션 수정 set() ==========");
		// 2번 수정 => set(2, "수정데이터")
		list.set(2, "박문수");	// 을지문덕 ==> 박문수
		for(int i=0; i<list.size(); i++)
		{
			String name = list.get(i).toString();
			System.out.println(i+" => "+name);
		}
		
		System.out.println("========== 컬렉션 삭제 remove() ==========");
		// remove(int index)
		// 3번 => 퇴사 (삭제)
		list.remove(3);
		System.out.println("저장된 인원 수 : "+list.size());
		for(int i=0; i<list.size(); i++)
		{
			String name = list.get(i).toString();
			System.out.println(i+" => "+name);
		}
		
		System.out.println("========== 전체 삭제 clear() ==========");
		list.clear();
		System.out.println("저장된 인원 수 : "+list.size());
		if(list.isEmpty()) // 데이터가 없는지 확인
		{
			System.out.println("저장된 데이터가 없습니다!!");
		}
		/*
			1. add(Object o) ==> Object (데이터형은 모든 것을 사용할 수 있다) ==> 클래스형을 저장
			2. set(int index, Object o)
			3. remove(int index)
			4. int size()
			5. boolean isEmpty()
			6. Object get(int index)
			
			==> [] ==(asList())==> List
		
		*/
	}
}



