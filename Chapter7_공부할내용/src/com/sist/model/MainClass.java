package com.sist.model;
import java.util.Scanner;
public class MainClass {
	
	public static int menu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("========= MENU =========");
		System.out.println("1. Home");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화");
		System.out.println("4. 공지사항");
		System.out.println("5. 게시판");
		System.out.println("6. 종료");
		System.out.println("========================");
		System.out.println("메뉴 선택 : ");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		
		Move mm = null;	// Map ==> 어노테이션 @
		while(true)
		{
			int m = menu();
			switch(m)
			{
				case 1:		// 홈으로 이동
					mm = new Home();
					mm.move();
					break;
				case 2:		// 회원가입으로 이동
					mm = new Join();
					mm.move();
					break;
				case 3:		// 영화
					mm = new Movie();
					mm.move();
					break;
				case 4:
					mm = new Notice();
					mm.move();
					break;
				case 5:
					mm = new Board();
					mm.move();
					break;
				case 6:
					System.out.println("사이트를 종료합니다!");
					System.exit(0);
					
			}
					
		}
	}
}
