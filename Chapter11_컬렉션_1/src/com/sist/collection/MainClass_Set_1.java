package com.sist.collection;
// ArrayList, HashSet, HashMap
import java.util.*;
// CBD => Component Base Developer
// 이미 만들어진 라이브러리를 이용해서 프로그램을 조립하여 만든다 (자바)
public class MainClass_Set_1 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		for(;;)
		{
			int r = (int)(Math.random()*45)+1;
			set.add(r);
			if(set.size()==6)
				break;
		}
		System.out.println(set);
		
		// List로 변환
		List list = new ArrayList(set);
		Collections.sort(list);		// sort는 list만 받기 때문에 list로 변환이 필요
		System.out.println(list);
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.print(list.get(i)+" ");
		}
	
	}
}
