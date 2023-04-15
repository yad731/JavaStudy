/*
	메소드
		구성 요소
		처리 결과값(리턴값)		사용자 요청값(매개변수)
		예) 정수 두 개를 보내주고 더한 값을 달라
		   --------- 매개변수	------ 리턴값
		   id, pwd ===> 로그인 여부 확인 요청 ===> boolean
		   
		메소드 제작
			-------------------------------
			  결과값(리턴형)		매개변수
			-------------------------------
				  O				   O		====> String substring(int s)
			-------------------------------
				  O				   X		====> String trim()
			-------------------------------
				  X				   O		====> System.out.println("A")
				  								  void println(String a) // 결과값이 없다
	  	  	-------------------------------
				  X				   X		====> System.out.println();
			-------------------------------
		기존에 있는 프로그램을 기능별로 나눠서 작업 (분업화)
		*** 메소드는 반드시 한 개의 기능만 수행할 수 있게 만든다 (재사용이 편하도록)
			입력 기능
			처리 기능 ==> 세분화
			출력 기능
			
		메소드
		 = 선언부(원형)
		 	리턴형(=결과값) 메소드명(매개변수)
		 = 구현부
		 	선언부
		 	{
		 		//구현부
		 	}
		 = 더하기 기능
		 	int add(int a, int b)
		 	--- long,double도 가능하지만 가급적이면 데이터형을 동일하게 맞추길 권장
		 	{
		 		//맨 마지막 줄에
		 		 return a+b;	//메소드 종료 시점
		 	}
		 	
		 	void insert()
		 	---- 메소드를 자체 처리 (데이터베이스 ==> insert,update,delete)
		 	{
		 		return; 	// void에 한하여 생략이 가능
		 	}
		 	
		메소드 호출
			메소드명(매개변수로 사용할 값)
			
		1) 구성요소
			1. 매개변수 => 사용자가 요청한 값
						 = 로그인요청 => (id,pwd)
						 = id 중복체크 => (id)
						 *** 매개변수가 여럿일 경우 ,로 구분한다
						 	 		 ---- 3개 이상이면 배열, 클래스를 이용해서 전송
						 	 		 예) 정렬 => 배열
						 	 		 	 회원가입 => 클래스
			2. 메소드명 => 변수(식별자)
						 1) 알파벳,한글 (알파벳=>대소문자 구분)
						 2) 숫자 (맨 앞에 사용 불가)
						 3) 특수문자 (_,$)
						 4) 키워드는 사용 금지
						 	권장사항 ==> 소문자로 시작한다
						 			   단어가 2개 이상인 경우 => getFileName, get_file_name
			3. 리턴형(결과값) => 사용자 요청을 처리한 결과값
							  메소드
							  	=> 자체 처리 (구구단 출력)
							  	=> 결과값을 넘겨준다 (로그인 여부 확인) => 해당 데이터형을 설정
							  	   ---- 반드시 한 개만 설정이 가능하다
							  	   		----------- 여러 개일 경우 배열, 클래스로
			4. 매개변수
			   ------ 1) 사용자가 입력 (명시적인 초기화, Scanner, random())
			   ------ 2) 반복 제어 => 다른 문장
			   ------ 3) 웹 => 검색, 입력, 버튼 클릭, 메뉴 클릭, 페이지 요청, 상세보기
			   		  ==> 반드시 자체 출력인지 결과값을 넘겨줄지 결정해야
		   
*/
// => 년도, 월, 일을 입력
import java.util.Scanner;
public class 메소드_1 {

	/*
		int userInput()
		{
		}
		=====================> 메소드_1 a = new 메소드_1;
								a.userInput()
								
		static int userInput()
		{
		}
		======================> 자동 메모리 할등
	*/
	static int userInput(String msg) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print(msg);
		int value = scan.nextInt();
		
		return value;
	}
	
	public static void main(String[] args) {
		
		int year = userInput("연도 입력 : ");
		int month = userInput("월 입력 : ");
		int day = userInput("일 입력 : ");
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("연도 입력 : ");
//		int year = scan.nextInt();
//		System.out.print("월 입력 : ");
//		int month = scan.nextInt();		
//		System.out.print("일 입력 : ");
//		int day = scan.nextInt();
		
		System.out.println("\n"+year+"년도 "+month+"월 "+day+"일");
		
		
		
	}
}















