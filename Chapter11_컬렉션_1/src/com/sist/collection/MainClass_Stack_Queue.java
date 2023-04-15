package com.sist.collection;
/*
	Stack : LIFO => 메모리 ==> 메모리명(Stack), 메소드 호출(Call stack)
	 int a = 10;
	 {
	 	int b = 20;
	 	{
	 		int c = 30;
	 	}
	 }
	
	Queue : FIFO => 운영체제(스케줄러)
					메모장 / 그림판 / 브라우저
					네트워크 Hello Java =X=> avaJ olleH
	
	Stack : 저장 / 출력
			push / pop
	Queue : 저장 / 출력
			offer / poll
			=> !empty()

	Stack : 최신의 정보를 먼저 보여주는 형식 => 브라우저 (이전 페이지 버튼 : 가장 마지막에 봤던 웹페이지를 가장 먼저 보여줌)
	Queue

*/
import java.util.*;
public class MainClass_Stack_Queue {

	private int s_index;
	private int e_index;
	private int[] arr = new int[10];
	public MainClass_Stack_Queue()
	{
		s_index = 0;
		e_index = arr.length-1;
	}
	public void push(int a)
	{
		arr[s_index]=a;
		s_index++;
	}
	public void pop()
	{
		for(int i = e_index; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		MainClass_Stack_Queue sq = new MainClass_Stack_Queue();
		sq.push(1);
		sq.pop();
		System.out.println("===============");
		sq.push(2);
		sq.pop();
		System.out.println("===============");
		sq.push(3);
		sq.pop();
	}
}
