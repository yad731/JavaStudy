package com.sist.collection;
import java.util.*;
public class MainClass_Stack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		// 저장
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		while(!s.empty())
		{
			System.out.println(s.pop());
		}
		
	}
}
