package com.sist.generics;
import java.lang.reflect.Array;
/*
	=> 컬렉션에 데이터를 저장할 때 같은 데이터형을 저장해야 제어가 편하다 (제네릭스) => 한 개의 데이터형만 저장
							 ---------- 배열 형식으로 저장 (데이터형을 통일하는 역할)
		Collection : 인터페이스 (1.독립적으로 사용 가능, 2.표준화, 3.필요시에 오버라이딩해서 사용 가능)
			|
	________|________________ 
	|			|			|
	List	   Set		  Map
	-------------------------- (인터페이스)
	List : 중복된 데이터가 있는 경우 사용
		   순서가 존재한다 (인덱스 번호가 있다) => 배열(고정적)을 확장, 보완 -> 가변적
		=> ArrayList : Vector를 보완
					   데이터베이스에 있는 데이터를 읽어와서 브라우저에 전송할 목적
					   읽기/쓰기 => 웹
					   데이터베이스를 사용 시에는 ArrayList에 있는 데이터는 거의 변경이 없다 (수정, 삭제 기능 X)
					   접근성이 뛰어나다, 순차적으로 데이터 첨부 시 속도가 빠르다
		=> Vector
 		=> LinkedList : 수정, 삭제가 많은 경우에 주로 사용 => 애플리케이션
 	
 	Set : 중복이 없는 데이터를 저장할 경우 (중복을 허용하지 않는다)
 		  순서가 없다
 		  List에 중복이 있는 경우 => 제거할 때 사용 => DISTINCT
 		  => WebSocket => 사용자의 정보를 저장(IP, PORT) => 네트워크에서 주로 사용
 		  웹 : 검색 => 데이터베이스
 		=> HashSet***
 		=> TreeSet(검색) : Application => Oracle SELECT
 	
 	Map : 두 개를 동시에 저장 (key,value) => (도서 -> ISBN/책제목), (우편 -> 우편번호/주소), (전화번호 -> 국번/전화번호)
 		=> 웹에서 주로 사용되는 기법 => id=admin, pwd=admin1
 		   사용자의 요청, 서버에서 브라우저로 전송 시, 서버에 저장, 브라우저에 저장
 		   (HttpServletRequest)(HttpServletResponse)(HttpSession)(Cookie)
 		   클래스 저장(Spring), SQL 문장 찾기(MyBatis)
 		=> Hashtable
 		=> HashMap : Hashtable의 단점 보완
 	
 	==> 저장하는 데이터형을 명시한다
 		형식)
 			ArrayList<String>
 			Set<String>
 			Map<String, Object>
 		   	=> 데이터형 뿐 아니라 사용자정의 데이터형도 첨부 가능 / <?>(매개변수) / <? extends A> : A로부터 상속받은 클래스만 (사용자 정의 제네릭스)
 			

 		
		   
*/
import java.util.*;
public class MainClass_제네릭스활용_1 {

	public static void main(String[] args) {
		
		// 1. ArrayList
		System.out.println("===== ArrayList에서 제네릭스 사용법 =====");
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
//		ArrayList<Double> list = new ArrayList<Integer>();	오류 무조건 일치
//		ArrayList list = new ArrayList<String>();
//		list.add 	// Object로 받아짐
		// 데이터형 : ArrayList<String>
		/*
			void display(ArrayList<String> list)	==> 이렇게 써야 사용 가능
		*/
		for(String f : list) {
			System.out.println(f);
		}
		
		
		// 2. HashSet
		System.out.println("===== HashSet에서 제네릭스 사용법 =====");
//		HashSet set = new HashSet();	// Object (모든 데이터형의 값을 첨부)
		HashSet<Integer> set = new HashSet<Integer>();
		// set은 저장할 수 있는 데이터형으로 int만 가능
		set.add(100);
//		set.add(10.5);	// 데이터가 안 들어감
//		set.add('A');	// 역시 마찬가지
		set.add(200);
		set.add(300);
		set.add(300);
		set.add(300);
		
		for(int i:set){
			System.out.println(i);	// 중복을 허용하지 않는다 (Primary) => id
		}	
		// 데이터베이스 : 저장공간(table) ==> 반드시 중복이 안된 데이터가 1개 이상 필요 (이상현상) => 수정, 삭제
		
		
		// 3. Vector
		System.out.println("===== Vector에서 제네릭스 사용법 =====");
		Vector<Double> vec = new Vector<Double>();
		vec.add(89.9);
		vec.add(10.5);
		vec.add(30.6);		// Wrapper 클래스는 형변환 안 됨 꼭 double만 입력
		for(double d:vec)
			System.out.println(d);
		
		
		// 4. LinkedList
		System.out.println("===== LinkedList에서 제네릭스 사용법 =====");
		LinkedList<Character> in = new LinkedList<Character>();
		in.add('A');
		in.add('B');
		in.add('C');
		for(char c:in)
			System.out.println(c);
		
		
		// 5. HashMap
		System.out.println("===== HashMap에서 제네릭스 사용법 =====");
		HashMap<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("a", true);
		map.put("b", false);
		map.put("c", true);
		map.put("d", false);
		map.put("e", true);
//		 ==> id, boolean : 로그인 상태 확인
		
		String[] key = {"a","b","c","d","e"};
		for(String k : key)
			System.out.println(map.get(k));		
		
	}
}
