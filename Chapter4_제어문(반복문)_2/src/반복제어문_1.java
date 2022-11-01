/*
	반복제어문
	  => 반복문 종료 : break
	  => 특정 부분을 제거 : continue
	  *** 주의점
	  	  break;
	  	  continue;	===> 블록을 빠져나가기 때문에 밑에는 소스 코딩을 할 수 없다
	  	  
	  	  break : 제어문을 종료 ==> 반복문, 선택문에서만 사용이 가능 (조건문에서는 사용할 수 없음)
	  	  continue : 제외하고 반복문을 이어 수행 ==> 반복문이 있는 경우에만 사용이 가능
	  	  
	  	  	while()
	  	  	{
	  	  		break; ==> 중단
	  	  	}
	  	  	for()
	  	  	{
	  	  		break; ==> 중단
	  	  	}
	  	  	
	  	  	while(조건식)
	  	  	{
	  	  		continue; ==> 조건식 이동
	  	  	}
	  	  	for(초기값;조건식;증감식)
	  	  	{
	  	  		continue; ==> 증감식 이동
	  	  	}
	  	  	
	  
*/

// 1~100까지 출력 ==> 5까지 출력 후 for문을 중단
public class 반복제어문_1 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++)	// 입력값 ==> q,Q	/ 게임 ESC => break 게임 종료
		{
			System.out.print(i+" ");
			if(i==5)
				break;	//System.exit(0);을 여기서 사용하면 프로그램 완전 종료 => 아래의 while문 수행할 수 없음
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=100)
		{
			System.out.print(i+" ");
			if(i==5)
				break;	// System.exit(0);
			i++;
		}
		
		
		
	}
}



