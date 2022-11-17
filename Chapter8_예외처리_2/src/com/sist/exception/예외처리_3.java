package com.sist.exception;
// CheckException : 컴파일러가 검증 (예외처리 했는지 여부)
/*
	파일 입출력
	URL 이용
	쓰레드 이용
	서버(Network)
	데이터베이스
*/
import java.io.*;
public class 예외처리_3 {

	public static void main(String[] args) {
		
//		FileReader fr = new FileReader("c:\\javaDev\\예외처리_1.java");
		// 예외처리하지 않으면 컴파일러가 오류 발생
		
//		FileReader fr = null;
//		try
//		{
//			fr = new FileReader("c:\\javaDev\\예외처리_1.java"); 
//			int i = 0;	// 한 글자씩 읽어온다 (char => int)
//			while((i=fr.read())!=-1)	// -1 EOF(end of file)
//			{
//				System.out.print((char)i);
//			}
//		}catch(IOException e)
//		{
//			System.out.println("파일이 존재하지 않습니다!!");
//		}
//		finally
//		{
//			try
//			{
//				fr.close();
//			}catch(IOException ex)
//			{
//				System.out.println("파일 닫기 실패");
//			}
//		}
	
		try (FileReader fr = new FileReader("c:\\javaDev\\예외처리_1.java"))	// fr.close() 자동 반환
		{
			int i = 0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
		}catch(IOException e)
		{
			System.out.println("파일이 존재하지 않습니다!!");
		}
		
		
		
		
	}
}








