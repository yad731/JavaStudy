class A
{
	int a=10;
	static int b=20;
	
	{
		a=100;
	}
	
	static
	{
		b=200;
	}
	
	A()
	{
		a=1000;
		b=2000;
	}
}
/*
  		1. 명시적 초기화가 가능한지
  		2. 인스턴스의 경우 => 생성자를 이용해서 초기화
  		   static의 경우 => static() 초기화 블록을 이용
 */
public class 초기화블록_2 {

	public static void main(String[] args) {
		
		A a = new A();
		/*
		  	 b 저장 & 0 초기화 => 20 => 200 => 2000
		  	 a 저장 & 0 초기화 => 10 => 100 => 1000
		 */
		
		
	}
}
