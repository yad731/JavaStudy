package com.sist.collection;
import java.util.*;
// 블로그 / 카페 글 불러와 추천받기
// 명사형 추출 (챗봇)
// 구글 600만 건 => 경로
public class MainClass_Set_3 {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");
		set1.add("F");
		set1.add("G");
		
		Set set2 = new HashSet();
		set2.add("L");
		set2.add("M");
		set2.add("N");
		set2.add("D");
		set2.add("E");
		set2.add("O");
		set2.add("P");
		
		System.out.println("====== set1 원본 ======");
		System.out.println(set1);
		System.out.println("====== set2 원본 ======");
		System.out.println(set2);
		
		System.out.println("===== 교집합 =====");
//		set1.retainAll(set2);
//		System.out.println("set1 n set2 : "+set1);
//		
//		System.out.println("===== 차집합 =====");
//		set1.removeAll(set2);
//		System.out.println("set1-set2 : "+set1);
		
		set1.addAll(set2);
		System.out.println(set1);
		
		
//		Iterator it = set2.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
	}
}
