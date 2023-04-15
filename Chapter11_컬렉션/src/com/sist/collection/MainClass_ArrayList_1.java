package com.sist.collection;
// 정수 저장
import java.util.*;	// ArrayList
public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 저장 공간
		list.add(7);	// 0
		list.add(4);	// 1
		list.add(3);	// 2
		list.add(6);	// 3
		list.add(2);	// 4
		list.add(5);	// 5
		list.add(1);	// 6	==> index 번호는 add하는 순서대로 지정된다
		for(Object i:list) // 데이터형 일치 (혹은 더 커야 한다)
		{
			System.out.println(i);
		}
		
		
		System.out.println("========= 정렬 =========");
		Collections.sort(list);		// sort를 사용함으로써 기존 정수를 정렬
		for(Object i:list) // 데이터형 일치 (혹은 더 커야 한다)
		{
			System.out.println(i);
		}
		
		System.out.println("========= Copy =========");
		ArrayList list2 = new ArrayList(list.subList(1, 5));
		// sort 정렬을 사용할 때, 사용하지 않을 때의 결과가 다르다
		// 배열 => copy => arraycopy(), clone()
		for(Object i:list2) 
		{
			System.out.println(i);
		}
		// 원하는 부분만 copy =>  subList => 페이지 나누기
		// CURD => Create(add) Update(set) Read(get) Delete(remove) => 웹의 핵심
		
		
		
	}
}
