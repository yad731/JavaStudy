/*
  156 ~ 177 page

	자바 / 오라클 / JSP / Spring / JavaScript (Ajax, VueJS, ReactJS)
	------------------------------------------------------------- AWS
		오라클 <===> 자바 (JDBC = MyBatis, JPA) ==> JSTL/ThymeLeaf(VueJS)

	VueJs, React, MyBatis, JPA : 교재 없음
  	===================================================================
  	for - 반복 횟수를 알고 있는 상태 (화면 UI) page 156 ~ 157
  		형식) 초기값
  			 조건식
  			 = 범위 지정 (횟수)
  			 증감식 (++, --) ==> 쿠키에 저장
  			 여러 개 ==> 복합 대입연산자 사용 +=, -=
  			 for(초기값;조건문;증감식)
  			 {
  			 	실행 내용
  			 }
  			 초기값 ===> 조건문 ===> 실행 내용 ===> 증감식
  	while - 반복 횟수를 알지 못할 때 (database) page 167 ~ 168
  		=> 조건식을 생략할 수 없음 (for문은 가능한...)
  		형식) 초기값
  			 while(조건식)
  			 {
  			 	반복수행문장
  			 	증가식
  			 }
  			 
  			 while(true)
  			 {
  			 	반복수행문장
  			 	if()
  			 	{
  			 		종료 조건
  			 		break;		===========> 이렇게 더 많이 쓰임
  			 	}
  			 }
  	
  	break - page 175
  	 	=> switch~case, 반복문에서만 사용이 가능 // if문 안에서만은 사용 불가. 오류남....
  	 	=> break가 있는 반복문만 제어가 가능
  	 	=> 반복문을 종료시킴
  	continue - page 176 
  		=> 반복문에서만 사용이 가능
  		=> continue가 있는 반복문만 제어가 가능
  		=> 특정 부분을 제외하고 실행 / 처음으로 돌아가 실행할 때
  		=> for문에서는 증가식으로 이동, while문(이 true일 때 주로 사용)에서는 조건식으로 이동

*/
public class 반복문정리 {
	public static void main(String[] args) {
		
		String msg="Hello Java";
		System.out.println(msg);
		for(int i=msg.length()-1; i>=0; i--)
		{
			System.out.print(msg.charAt(i));
		}
		
		int a=10;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(j==2)
					break;
			}
		}
		
	}
}
