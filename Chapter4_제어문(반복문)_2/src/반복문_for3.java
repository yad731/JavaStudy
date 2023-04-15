/*
		1~10  홀수만 출력
*/
public class 반복문_for3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
		
		System.out.println();
		// 1~10 짝수만 출력
		
		for(i=2; i<=10; i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		i = 2;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
		
		
		
	}
}
