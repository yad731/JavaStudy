import java.util.Scanner;

/*
		aBCDE
		AbCDE
		ABcDE
		ABCdE
		ABCDe
		
		주사위 두 개를 던져서 합이 N(ex)5)이 나오는 경우의 수 출력
		[1,4] [2,3] [3,2] [4,1]
		
*/
public class 반복문_중첩for6 {
	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				char c = 'A';
//				if(i==j)
//					c+=32;
//				System.out.print(c);
//				c++;
//			}
//			System.out.println();
//		}
		
		/*for(int i=1; i<=5; i++)
		{
			char c = 'A';
			for(int j=1; j<=5; j++)
			{
				
				if(i==j)
					System.out.print((char)(c+32));
				else
					System.out.print(c);
				c++;
			}
			System.out.println();
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2~12 사이의 정수를 입력 : ");
		int hap = scan.nextInt();
		
		for(int i=1; i<=6; i++)	//첫번째 주사위
		{
			for(int j=1; j<=6; j++) //두번째 주사위
			{
				if(i+j==hap)
				{
					System.out.println("["+i+","+j+"]");
				}				
			}
		}
		
		
	}
}


