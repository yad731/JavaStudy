/*
	continue ==> 제외
	
	1~10 출력, 5 9는 제외하고

*/
public class 반복제어문_2 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//무한루프
		int i=1;
		while(i<=10)
		{
			
			if(i==5 || i==9)
				continue;			//===> 원하는대로 값을 출력할 수 없음 //무한루프 //continue는 주로 for문에서 쓰임
			System.out.print(i+" ");
			i++;
			
		}
		
	}
}
