/*
	       *
	      **
	     ***
	    ****
	    
	    i   j   k
	    줄수 공백 별
	    1	3	1
	    2	2	2	
	    3	1	3
	    4	0	4		===> i+j=4 ===> j=4-1  k=i
	   
 	
  		****
	     ***
	      **
	       *
	    
	    i   j   k
	    줄수 공백 별
	    1	0	4
	    2	1	3	
	    3	2	2
	    4	3	1		===> j+1=i	==> j=i-1 k=5-i
 	
 	    
	 	  *
	     ***
	    *****
	   *******
	   
	    i   j   k
	    줄수 공백 별
	    1	3	1
	    2	2	3	
	    3	1	5
	    4	2	7		===> i+j=4   i*2-1=k
	   
  
  // 중첩 for문 중 변수의 위치, 두번째 for문의 조건문 내용이 핵심
  
 */
public class 문제_보너스 {
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

				
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
				
				
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	/////////////////////////////////////////////////	
		
		int k=1;
		for(int i=1; i<=5; i++)
		{
//			k=1;
			for(int j=1; j<=5; j++)
			{
				System.out.print(k);
			}
			k++;
			System.out.println();
		}
		

		
		
		for(int i=1; i<=5; i++)
		{
			k=1;
			for(int j=1; j<=5; j++)
			{
				System.out.print(k++);
			}
//			k++;
			System.out.println();
		}
		
	}
}


