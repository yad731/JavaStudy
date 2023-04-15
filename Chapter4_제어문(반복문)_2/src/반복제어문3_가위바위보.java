/*
	1. 컴퓨터와 가위바위보
	 ==================> 계속 진행 / y Y 입력시 종료
*/
import java.util.Scanner;
public class 반복제어문3_가위바위보 {
	
	//종료 => break, while문 종료
	//continue : 잘못된 입력의 경우 경고
	public static void main(String[] args) {
		
		int win = 0, lose = 0, same = 0;
		int count = 0;	//게임 횟수
		// new ==> 메모리가 공간이 다르다
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			//난수 생성 ==> 게임이 계속되어야 하기 때문에 while문 내에서 생성
			int com = (int)(Math.random()*3); //0~2
			//==> 웹에서도 사용 // 예약일(날짜에 예약이 가능한 장소?)
			System.out.print("가위(0), 바위(1), 보(2) : ");
			int user = scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("가위(0), 바위(1), 보(2)를 입력하세요!!");
				continue;	//처음부터 다시 실행 ==> while의 조건문으로 이동
			}
			count++;
			
			//결과값
			if(com==0)
				System.out.println("컴퓨터 : 가위");
			else if(com==1)
				System.out.println("컴퓨터 : 바위");
			else if(com==2)
				System.out.println("컴퓨터 : 보");
			
			if(user==0)
				System.out.println("사용자 : 가위");
			else if(user==1)
				System.out.println("사용자 : 바위");
			else if(user==2)
				System.out.println("사용자 : 보");
			
			// 확인
			/*
			 * 	 com	user	  com - user
			 * 	  0		  0			0  : same
			 * 			  1			-1 : user win
			 * 			  2			-2 : com win
			 *    1		  0			1  : com win
			 * 			  1			0  : same
			 * 			  2			-1 : user win
			 *    2		  0			2  : user win
			 * 			  1			1  : com win
			 * 			  2			0  : same
			 * 	====================================>   user win => -1,2
			 * 											com win ==> -2,1
			 */
			
			switch(com-user)
			{
				case -1:
				case 2:
					System.out.println("사용자 Win!!");
					win++;
					break;
				case -2:
				case 1:
					System.out.println("컴퓨터 Win!!");
					lose++;
					break;
				case 0:
					System.out.println("비겻다...");
					same++;
			}
			
			// 종료 확인
			System.out.print("게임을 종료할까요?(y/n) : ");
			char c = scan.next().charAt(0);	//Scanner로 문자 한 개 받기
			System.out.println();
			
			if(c=='y' || c=='Y')
			{	
				System.out.println("Game over!!");
				break;	// while문 종료
			}
				
		}
		
		// 게임 종료 여부 확인
		System.out.printf("%d전 %d승 %d무 %d패\n",count,win,same,lose);
//		System.out.println(count+"전 "+win+"승 "+same+"무 "+lose+"패");
		
			
	}
}
