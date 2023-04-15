/*
	163page
	
	2*1			9*1
	-
	-
	-
	2*9			9*9
	
*/
public class 반복문_중첩for5 {
	public static void main(String[] args) {
		
		System.out.println("구구단 출력");
		
//		for(int i=2; i<=9; i++)
			
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				System.out.printf("%-2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		
		
	}
}
