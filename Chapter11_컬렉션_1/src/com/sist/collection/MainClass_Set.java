package com.sist.collection;
/*
			Collection
				|
			   Set
		________|________
		|				|
	  HashSet		  TreeSet (검색) => X
	  
 	
 	HashSet
 		특징) 
 			데이터 중복을 허용하지 않는다
 				웹 접속 => Set (WebSocket)
 			순서가 없다
 			중복 데이터를 제거 ===> DISTINCT
 		기능)
 		 	추가 : add()
 		 	삭제 : remove()
 		 	복사 : addAll()
 		 	전체 삭제 : clear()
 		 	존재 여부 : isEmpty()
 		 	크기 (데이터 개수) 확인 : size()
 		 	두 개의 Set이 있는 경우에 같은 데이터만 모아준다 (교집합) : retainAll()
 			
 			
*/
import java.util.*;
public class MainClass_Set {

	public static void main(String[] args) {
		
		String[] names = {"홍길동","심청이","박문수","이순신","강감찬","손흥민","박지성","김민재","홍길동","박문수"};
		Set set = new HashSet();
//		for(String name : names)
//		{
//			set.add(name); 	// 중복을 제거 => add : 중복된 데이터가 있는 경우에는 추가할 수 없다
//		}
//		System.out.println(set);
	
		List list = Arrays.asList(names);	// 배열을 List로 변환
		set.addAll(list);	// list에 있는 데이터 전체를 복사 => set (중복을 제외하고)
		System.out.println(set);	// set에 저장된 데이터 출력
		
		System.out.println("====== 삭제 ======");
		set.remove("박문수");
		System.out.println(set);
		System.out.println(Arrays.toString(names));
		
		System.out.println("====== 전체 삭제 ======");
		set.clear();
		if(set.isEmpty())
			System.out.println("데이터가 없습니다 : "+set.size());
	
	
	
	}
}



