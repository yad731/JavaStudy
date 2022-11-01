/*
	★
	★★
	★★★
	★★★★
	
	★★★★
	★★★
	★★
	★
	
	A
	BC
	DEF
	GHIJ
	
	A
	AB
	ABC
	ABCD

*/
import java.util.Scanner;
public class 반복문_중첩for4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i>=j)
				System.out.print("★");
			}
			System.out.println();
		}

System.out.println();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i<=j)
				System.out.print("★");
			}
			System.out.println();
		}
		
System.out.println();
		
		char c = 'A';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=1; i<=4; i++)
		{
			c = 'A';
			for(int j=1; j<=i; j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	
//	==> 정렬, 빈도수 구하기, 통계, 순위 결정 ==> 배열
	
	}
}



