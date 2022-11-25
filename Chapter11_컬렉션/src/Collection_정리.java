/*
	578page => 컬렉션 : 데이터를 모아서 메모리에 저장 (자료구조 : 메모리에 저장된 데이터를 쉽게 관리)
			   컬렉션 프레임워크 : 표준화 (동일하게 사용)
			   				   |
			   				 인터페이스
			   				 
			   			   Collection
			   				   |
				_______________|_______________
				|			   |			  |
				List		  Set			Map
		________|________	   |			  |
		|		|		|	 HashSet		HashMap
		|		|		|
	ArrayList Vector LinkedList
	
	--------------------------------------------------------
	List : 순서가 있다, 데이터 중복 허용
		   ArrayList, Vector, LinkedList, Stack, Queue
		   => 데이터베이스 연결, 네트워크 사용자 정보 저장, C언어 호환
	--------------------------------------------------------
	Set : 순서가 없다, 데이터 중복을 허용하지 않는다
		  HashSet, TreeSet
	--------------------------------------------------------
	Map : key, value => 쌍으로 저장
		  key : 중복할 수 없다
		  value : 중복이 가능
		  put("id","admin")
		  => 시험 (도서) ISBN, session, cookie
		  => Spring, MyBatis, JPA
		  => HashMap, Hashtable, Properties
	--------------------------------------------------------
	
	Collection(자료구조 => CURD)
	 => add() : 데이터 추가
	 => set() : 데이터 수정
	 => remove() : 데이터 삭제
	 => get() : 데이터 읽기
	 => size() : 데이터 개수

	ArrayList()
		단점 : 인덱스번호를 자동으로 조절 => 항상 순차적으로 생성 : 데이터 수집용
			  모든 데이터형을 받을 수 있도록 Object => 항상 형변환 해야 함 ==> 제네릭스
		
	
	
*/
import java.util.*;
public class Collection_정리 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		Vector vec = new Vector();
		vec.add(1);
		vec.add(2);
		System.out.println(vec);
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
	}
}