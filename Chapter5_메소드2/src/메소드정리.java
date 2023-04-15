/*
		메소드 : 명령문의 집합(관련된 명령만 모아서 처리)
			   -----
			   사용목적
			    1) 분석 (가독성)	==> 수정, 오류 (404,403,500,412,415,400)
			    	기능별 분리
			    2) 다른 클래스와 연결시 사용
			    3) 반복 수행을 제거
			    4) 재사용이 용이
			    
			    예) 데이터베이스
			    	목록 출력
			    	 => 오라클 연결
			    	 => SQL 문장 전송
			    	 => 실행 결과값 (목록)
			    	 => 오라클 닫기
			    	상세보기
			    	 => 오라클 연결
			    	 => SQL 문장 전송
			    	 => 실행 결과값 (상세)
			    	 => 오라클 닫기
			    	추가
			    	 => 오라클 연결
			    	 => SQL 문장 전송
			    	 => 추가
			    	 => 오라클 닫기
			    	수정
			    	 => 오라클 연결
			    	 => SQL 문장 전송
			    	 => 수정
			    	 => 오라클 닫기
					삭제
					 => 오라클 연결
			    	 => SQL 문장 전송
			    	 => 삭제
			    	 => 오라클 닫기
		메소드 제작
			[static] 리턴형 메소드명(매개변수)	==> 사용자가 보내준 데이터를 받아서 가공(요청 처리)한 결과값을 전송한다 (원형, 선언)
			----보낸다	------받는다
			{
				구현 ==> 요청에 대한 처리
			}
			static ==> 자동 저장
					   없는 경우는 프로그래머가 저장
					   class A
					   {
					   		void display(){}	==> 저장이 안됨
					   		static void aaa(){}	==> 자동 저장
					   }
					   A a = new A();
			1) 메소드 제작시 고민
				=> 호출 후에 사용하는 값이 있는 경우 ==> 리턴형이 존재
				=> 호출 후에 출력만 한다 ==> 리턴형이 없어도 된다
				=> 리턴형의 데이터형 (배열, 클래스, 일반 데이터형)
					1. 나누기값을 달라 ==> double
					2. 영화 제목을 달라 ==> String[]
					3. 경우의 수 2 => boolean
					4. 경우의 수 여러 개 => String
					==> 리턴형 1개 설정
				=> 매개변수는 제한이 없다 (3개 이상이면 배열, 클래스)
					1. 사칙연산 ==> int, int
					2. 로그인 ==> id, pwd
					3. 회원가입 ==> Object[]
					
		메소드 호출
			메소드명(매개변수의 값, 매개변수의 값...)
			
				void add(int a, int b){}
					a=10, b=20
				add(10,20)
				
				int add(int a, int b){}
					a=10, b=20
				int a = add(10,20)
				
				System.out.println(add(10,20)) 	==> 30
			    	
*/
public class 메소드정리 {

	static int max(int[] arr)		//int 변수로 지정되었기 때문에 값을 받아 아래에서도 사용 가능
	{
		int max=0;
		for(int i:arr)
		{
			if(max<i)
				max=i;
		}
		System.out.println("max : "+max);
		return max;
	}
	static void min(int[] arr)		//값이 출력과 동시에 사라짐 void
	{
		int min=100;
		for(int i:arr)
		{
			if(min>i)
				min=i;
		}
		System.out.println("min : "+min);
	}
	public static void main(String[] args) {
		
		int[] arr = {10,40,50,60,70};
		max(arr);
		min(arr);
	
	}
}
