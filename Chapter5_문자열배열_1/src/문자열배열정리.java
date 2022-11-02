/*
	배열 : 같은 데이터형을 묶어서 관리
	--------------------------
	String : 일반 데이터형식
		int a = 10;
		String s = "10";	==> new String("10") (사용빈도가 없다)
		// 모든 클래스형
		 	A a = new A();
		 	| |	   |  |
		 	클래스명(데이터형)
		 	  변수(객체)
		 	  	동적메모리 할당
		 	  		생성자
		   ==> Call By Value : 기본형(실제 값 저장) ==> String
		   	   Call By Reference : 배열, 클래스(주소)
		   	   
	String ==> 문자 여러 개를 묶어서 저장
			   "문자 저장"
			   => char[]를 조작해서 만든 클래스
	String을 여러 개 묶어서 관리 ==> String 배열
	
	1) 배열
	   선언
	   	String[] 배열명; (권장사항)
	   	String 배열명[];
	   초기화
	    String[] 배열명 = {"","","","",""}
	    String[] 배열명 = new String[10];
	    ------------------------------- 자동 초기화
	     								 int	==> 0
	     								 double	==> 0.0
	     								 float	==> 0.0f
	     								 boolean==> false
	     								 long	==> 10L
	     								 String	==> null	===============> 206 page
	   출력 방법
	    for(int i=0; i<배열명.length; i++)
	    {
	    	System.out.println(배열명[i]) 	==> 인덱스 번호
	    }
	    for(String s:배열명)
	    {
	    	실제 데이터를 읽어서 출력하는 방법
	    }
	   값 변경
	   	배열명[인덱스] = 값;
	   	
	   	String[] f = {"사과", "배", "수박"}
	   		f		  f[0]	   f[1]		f[2]		==> 일반 변수와 동일한 역할
	   	--------	---------------------------
	   	  0x100		  사과 	|	배	|	수박
		--------	|--------------------------
	   	  		   0x100

		사과 ==> 포도
		f[0]=포도;
		=====================> 모든 데이터형의 배열을 동일



*/
public class 문자열배열정리 {
	
	public static void main(String[] args) {
		
	}
}
