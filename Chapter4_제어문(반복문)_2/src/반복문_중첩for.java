/*
	1) 조건문 중첩
		if(조건문)  => 로그인
		{
			if(조건문)  => Admin
			{
				=============> if(조건문 && 조건문) ==> Admin 메뉴
			}
			else => User
			{
				==> User 메뉴
			}
		}
		else
		{
		   => Guest 로그인 ==> 일반 메뉴
		}
	
	2) 선택문 중첩	=======> 게임, 네트워크
		switch(변수)
		{
			case 값:
				switch(변수)
				{
					case 값:
				}
				break;
		}
		
	3) 반복문 중첩 
	   ======== for
	   for()
	   {
	   		for()
	   		{
	   		}
	   }				=============> 이게 가장 많이 쓰임
	   
	   for()
	   {
	   		while()
	   		{
	   		}
	   }
	   
	   while()
	   {
	   		for()
	   		{
	   		}
	   }
	   
	   while()
	   {
	   		while()
	   		{
	   		}
	   }
	   ====================================
	   이중 for문 : 변수 위치를 어디에 둘 것인지가 핵심
	   for()	======> 줄 수
	   {
	   		변수 위치?
	   		for()	====> 실제 출력문
	   		{
	   			변수 위치?
	   		}
	   }
	   
	   형식)			  	↗ false => for 종료
	   			  1	  2 9	 8
	   		for(초기값;조건식;증가식)
	   		{		  3	  4 7 	 6
	   			for(초기값;조건식;증가식)
	   			{		 ----- false => 1차 for문의 증가식으로
	   				실행문장 => 5 조건식(4)이 true일 때 실행
	   			}
	   		}
		
*/
public class 반복문_중첩for {
	public static void main(String[] args) {
		
//		*****
//		*****
//		*****
//		*****
//		*****
		
		System.out.println("1차 for문");
		//1차 for문
		for(int i=1; i<=5; i++)
			System.out.print("*");
		System.out.println();
		for(int i=1; i<=5; i++)
			System.out.print("*");
		System.out.println();
		for(int i=1; i<=5; i++)
			System.out.print("*");
		System.out.println();
		for(int i=1; i<=5; i++)
			System.out.print("*");
		System.out.println();
		for(int i=1; i<=5; i++)
			System.out.print("*");
		
		System.out.println();
		
		System.out.println("2차 for문");
		//2차 for문
		// 줄수 ==> 5
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}
}


