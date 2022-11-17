package com.sist.exception;
import java.util.Arrays;
import java.util.Scanner;
public class 예외처리_6 {

	public static void main(String[] args) {
		
		// 숫자야구게임
		int[] com = new int[3];
		int[] user = new int[3];	// 사용자 입력값
		for(int i=0; i<com.length; i++)
		{
			com[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
	
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			try
			{
				// 입력값 받기
				System.out.println("세자리 정수 입력 : ");
				int input = scan.nextInt();
				if(input<100 || input>999)
				{
					throw new Exception("세자리 정수만 입력이 가능합니다!!");
					// throw에서 catch로 이동하기 때문에 코드 입력이 불가능한 위치
					/*					
						명령문
						=> 밑에 코딩이 안되는 키워드
						 throw
						 break
						 continue
						 return
						=> 위에 코딩이 안되는 키워드
						 this(), super()
					*/
				}
				user[0] = input/100;
				user[1] = (input%100)/10;
				user[2] = input%10;
				/*
				  	Exception e = new Exception();
				  	throw e;
				  	
					throw new Exception()
					
					Thread t = new Tread()
					t.start()
				
					new Thread().start()
				*/
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
				{
					throw new Exception("같은 수는 입력이 불가능합니다!!");
				}
				if(user[0]==0 || user[1]==0 || user[2]==0)
				{
					throw new Exception("0은 입력할 수 없습니다!!");
					// 고의로 발생 ==> 테스팅
				}
				int s=0, b=0;
				for(int i=0; i<3; i++)
				{
					for(int j=0; j<3; j++)
					{
						if(com[i]==user[j])
						{
							if(i==j)
								s++;
							else
								b++;
						}
					}
				}
				// 힌트 출력
				System.out.printf("Input Number : %d \nResult : %dS-%dB\n",input,s,b);
				
				// 종료 여부
				if(s==3)
				{
					System.out.println("Game Over!!");
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	
	
	}
}










