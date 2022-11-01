/*
 		1####
 		#2###
 		##3##
 		###4#
 		####5
		
		★☆☆☆☆
		☆★☆☆☆
		☆☆★☆☆
		☆☆☆★☆
		☆☆☆☆★
		
		☆☆☆☆★
		☆☆☆★☆
		☆☆★☆☆
		☆★☆☆☆
		★☆☆☆☆
		
		i	  j	
		1	  5
		2	  4
		3	  3
		4	  2
		5	  1
		
		★☆☆☆★
		☆★☆★☆
		☆☆★☆☆
		☆★☆★☆
		★☆☆☆★
		
*/
public class 반복문_중첩for3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(6-i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
System.out.println();	

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i+j==6 || i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		

		
	}
}
