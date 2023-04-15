/*
	for/while
	A~Z 출력
	
	반복문 : 출력 대상이 패턴을 가지고 있어야, 즉 수열의 형태여야 함
*/
public class 반복문_for2 {
	public static void main(String[] args) {
		
		int count = 0;
		for(char c='다'; c<='띻'; c++)
		{
			System.out.print(c+" ");
			count++;
		}
		System.out.println(count);	//1176	588
		
		System.out.println();
		
		char c = 'A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		
	}
}


