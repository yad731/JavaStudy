package com.sist.collection;
import java.util.*;
public class MainClass_Queue {

	public static void main(String[] args) {
		
//		Queue q = new Queue();	// Stack은 일반 클래스이지만 Queue는 생성자가 없어서 이렇게 생성할 수 없음
		Queue q = new LinkedList();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
