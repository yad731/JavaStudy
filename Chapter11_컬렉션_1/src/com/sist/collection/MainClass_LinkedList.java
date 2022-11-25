package com.sist.collection;
import java.util.*;
/*		
						읽기 		추가/삭제		사용처
	ArrayList		   빠르다		느리다	  주로 출력용/데이터 수집	==> 데이터베이스에서 값을 제어
	LinkedList		   느리다		빠르다	  데이터에서 수정, 삭제가 많은 경우
	
	웹 => ArrayList
	Application => LinkedList
*/
public class MainClass_LinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		System.out.println("===== 수정 =====");
		list.set(1, 20);
		System.out.println(list);
		
		System.out.println("===== 삭제 =====");
		list.remove(3);
		System.out.println(list);
		
		System.out.println("===== 전체 삭제 =====");
		list.clear();
		if(list.isEmpty())
			System.out.println("데이터가 없습니다");
		
	}
}
