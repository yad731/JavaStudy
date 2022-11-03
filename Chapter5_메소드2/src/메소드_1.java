/*
	page ==> 249
	
		클래스
		----
		  구성요소
		  	1) 변수 => 기본형, 참조형(배열)
		  	2) 메소드
		  	========================== + 클래스 (객체지향)
		1. 메소드 : 특정 작업을 수행하는 일련의 명령문을 모아서 관리
				  -------- 한 가지 기능 (로그인 기능.... 목록 출력 기능, 상세보기 기능)
				  데이터 저장 : 변수, 배열
				  명령문 (CPU) : 메소드 ==> 명령
				  예)
				  	{
				  		int a=10;
				  		int b=20;
				  		int c=a+b;
				  	}
				  ==> 다른 클래스와 연결
				  	  클래스 <=======> 통신
				  	  		  메소드
		2. 사용하는 이유
		   => 재사용
		   => 가독성 (소스를 관련된 내용으로 나눈다) => 문장의 단락을 나눠서 처리하는 것과 같다
		   => 중복코드 제거
		3. 메소드 구조
		   리턴형 메소드명(매개변수) => 선언부 (인터페이스,추상클래스 => 선언만 하는 경우도 있음)
		   {
		   		구현부
		   }
		   
		   리턴형 ==> 사용요청 처리 결과 : 한 개만 설정이 가능
		   							 --------------- 반드시 배열, 클래스로 묶어서 전송
		   매개변수 ==> 사용자가 처리할 데이터 전송
		   			  여러 개 사용이 가능 (구분은 ,로)
		   구현부
			   {
			   		return 값; ==> 리턴형에 지정된 데이터값이어야 한다
			   		------ 리턴형이 void일 경우 생략할 수 있다(자체에서 결과값 출력)
			   }
		   
		   *** return은 메소드 종료를 알려준다
		   	   return은 항상 마지막에 추가되는 것은 아니다 (중간에 어떠한 조건을 부여하느냐에 따라 return)
		 
		 4. 메소드 유형
			 결과값(리턴형)		매개변수(지역변수의 일종) ==> 메소드 종료와 동시에 메모리에서 사라지는 변수
		   -------------------------				메소드 안에서만 사용이 가능 => stack 메모리에서 관리
			   O				O		==> 라이브러리)
			                                  		String substring(int s)
			                                  		boolean contains(String fd)
			                                  		boolean equals(String fd)	===> 매개변수가 있는 경우
			                                  										 1)개수 일치, 2)데이터형 일치
			                                  		예)
			                                  			int void add(int a, int b, double d)
			                                  						 a=10	b=20	d=30
			                                  			=> 호출 : add(10,20,30)
			                                  			=> 메소드는 같은 이름으로 만들 수 있다 (매개변수 개수나 데이터형이 다르면 된다)
			                                  			   println, print	// printf는 아님
			                                  			   					   가변 매개변수
			                                  			   					   String...arg
			                                  			   					   printf(String pattern,Object...obj)
			                                  			   					   ==> 데이터형 관계없이 무조건 ==> Object (가장 큰 데이터형)
			                                  			   					   
		   -------------------------			           
			   O				X		==> String trim()
			   								double Math.random()
		   -------------------------			 	
			   X				O		==> 리턴형이 없는 경우에는 void를 사용한다 ==> 메소드 자체에서 처리
	   	   									네트워크(모바일, 게임) / 데이터베이스(웹)
	   	   														CURD(Create, Update, Read, Delete)
	   	   														데이터 검색, 데이터 추가, 데이터 수정, 데이터 삭제
			   				  			 							  	  ------------------------------ void
	   	   -------------------------			   
			   X				X		==> 자체 처리 System.out.println()
				  

*/
// printf(String format, Object... args)
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
public class 메소드_1 {

	static boolean isLogin(String id, String pwd)
	{
		final String ID = "admin";
		final String PWD = "1234";
		
//		if(id.equals(ID) && pwd.equals(PWD))
//		{
//			return true;	// 메소드는 return이 있는 곳에서 종료 ===> for = break
//		}
//		return false;
		
		boolean bCheck = false;
		/*
		 * 		equals : 대소문자 구분해서 비교 (로그인)
		 * 		equalsIgnoreCase : 대소문자 구분없이 비교 (검색)
		 */

		if(id.equals(ID) && pwd.equals(PWD))
			bCheck=true;
//		else
//			bCheck=false;		// boolean bCheck = false; 라고 디폴트값을 부여했기 때문에 boolean에서는 else를 굳이 작성하지 않아도 됨
		
		return bCheck;
		
	}
	static String recommand()
	{
		String[] title={
        		"That That (Prod. & Feat. SUGA of BTS)",
        		"봄여름가을겨울 (Still Life)",
        		"TOMBOY",
        		"LOVE DIVE",
        		"사랑인가 봐",
        		"Feel My Rhythm",
        		"사랑은 늘 도망가",
        		"GANADARA (Feat. 아이유)",
        		"LOVE me",
        		"취중고백",
        		"우리들의 블루스",
        		"ZOOM",
        		"다정히 내 이름을 부르면",
        		"다시 만날 수 있을까",
        		"나의 X에게",
        		"신호등",
        		"Celeb",
        		"듣고 싶을까",
        		"이제 나만 믿어요",
        		"INVU",
        		"ELEVEN",
        		"Stay",
        		"무지개",
        		"strawberry moon",
        		"MY BAG",
        		"라일락",
        		"아버지",
        		"A bientot",
        		"감동이야 (Feat. 성시경)",
        		"Celebrity",
        		"너의 모든 순간",
        		"손이 참 곱던 그대",
        		"19금 abcdefu",
        		"회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)",
        		"사랑해 진짜",
        		"사랑역",
        		"Stronger (What Doesn't Kill You)",
        		"연애편지",
        		"FEARLESS",
        		"보금자리",
        		"정이라고 하자 (Feat. 10CM)",
        		"Next Level",
        		"너를 생각해",
        		"리무진 (Feat. MINO) (Prod. by GRAY)",
        		"언제나 사랑해",
        		"사랑해요 그대를",
        		"인생찬가",
        		"Bad Habits",
        		"Weekend",
        		"Butter",
        		"스물다섯, 스물하나",
        		"OHAYO MY NIGHT",
        		"바라만 본다",
        		"Dynamite",
        		"Counting Stars (Feat. Beenzino)",
        		"호랑수월가",
        		"내 손을 잡아",
        		"어제처럼",
        		"흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야",
        		"Seoul",
        		"문득",
        		"초록을거머쥔우리는",
        		"Tiny Riot",
        		"SMILEY (Feat. BIBI)",
        		"That's Hilarious",
        		"2002",
        		"Timeless",
        		"찰나가 영원이 될 때 (The Eternal Moment)",
        		"서랍",
        		"My Universe",
        		"모든 날, 모든 순간 (Every day, Every Moment)",
        		"Permission to Dance",
        		"고백",
        		"RUN2U",
        		"오래된 노래",
        		"밤하늘의 별을 (2020)",
        		"낙하 (With 아이유)",
        		"내가 아니라도",
        		"Blueming",
        		"드라마",
        		"오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)",
        		"Loving You Girl (Feat. Hkeem)",
        		"나는 트로트가 싫어요",
        		"With you",
        		"밤이 깊었네 (Feat. 헤이즈)",
        		"헤픈 우연",
        		"눈이 오잖아 (Feat. 헤이즈)",
        		"Dun Dun Dance",
        		"Step Back",
        		"At My Worst",
        		"작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
        		"만남은 쉽고 이별은 어려워 (Feat. Leellamarz) (Prod. by TOIL)",
        		"Because Of You",
        		"Savage",
        		"Off My Face",
        		"봄 to 러브",
        		"이제는 (Feat. 화사)",
        		"선물",
        		"사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)",
        		"롤린 (Rollin')",
        		"Every Second",
        		"존재만으로",
        		"에잇 (Prod. & Feat. SUGA of BTS)",
        		"아무래도 난",
        		"12 : 45 (Stripped)",
        		"여행",
        		"Hey Mama (Feat. Nicki Minaj & Bebe Rexha & Afrojack)",
        		"겨울잠",
        		"19금 Peaches (Feat. Daniel Caesar & Giveon)",
        		"Real Love",
        		"밝게 빛나는 별이 되어 비춰줄게",
        		"어떻게 이별까지 사랑하겠어, 널 사랑하는 거지",
        		"아로하",
        		"너의 번호를 누르고 (Prod. by 영화처럼)",
        		"비와 당신",
        		"초대",
        		"그게 더 편할 것 같아 (N번째 연애 X 멜로망스)",
        		"추억은 만남보다 이별에 남아",
        		"Savage Love (Laxed - Siren Beat) (BTS Remix)",
        		"내 곁에",
        		"봄날",
        		"Bad",
        		"사랑하게 될 줄 알았어",
        		"Starlight",
        		"우리가 헤어져야 했던 이유",
        		"Dance Monkey",
        		"Memories",
        		"Dreams Come True",
        		"주저하는 연인들을 위해",
        		"나보다 더 사랑해요",
        		"parachute",
        		"만개 (Prod. 신지후)",
        		"METEOR",
        		"어땠을까 (Feat. 박정현)",
        		"그래서 그래 (Feat. 윤하)",
        		"취기를 빌려 (취향저격 그녀 X 산들)",
        		"Way Back Home",
        		"흰눈",
        		"여름가을겨울 봄.",
        		"비가 오는 날엔 (2021)",
        		"너, 너 (N번째 연애 X 휘인 (Whee In))",
        		"잊을 수 있을까",
        		"운전만해 (We Ride)",
        		"Shape Of You",
        		"첫눈처럼 너에게 가겠다",
        		"어떻게 지내 (Prod. by VAN.C)",
        		"우연히 봄",
        		"늦은 밤 너의 집 앞 골목길에서",
        		"Wake Up (Prod. by 코드 쿤스트)",
        		"Kiss Me More (Feat. SZA)",
        		"Lovesick Girls",
        		"밤편지",
        		"그날에 나는 맘이 편했을까",
        		"Light Switch",
        		"마음을 드려요",
        		"마지막 너의 인사",
        		"Rainy day (Feat. ASH ISLAND & Skinny Brown)",
        		"시간을 거슬러 (낮에 뜨는 달 X 케이윌)",
        		"너의 번호를 누르고",
        		"쉬어 (Feat. MINO) (Prod. by GRAY)",
        		"안녕",
        		"GANJI (Feat. Jessi)",
        		"Can't Control Myself",
        		"Ashes",
        		"어푸 (Ah puh)",
        		"시작",
        		"희재",
        		"멜로디",
        		"Good Boy Gone Bad",
        		"레이디버드",
        		"슬픔이여안녕",
        		"사랑인가 봐 (Acoustic Ver.)",
        		"벚꽃이 피면 우리 그만 헤어져",
        		"Paris In The Rain",
        		"좋아좋아",
        		"있잖아",
        		"기억해 줘요",
        		"LOVE",
        		"잠이 오질 않네요",
        		"고맙소",
        		"Christmas Tree",
        		"사실 나는 (Feat. 전건호)",
        		"MILLIONS",
        		"9INTRO",
        		"노래 (The Song)",
        		"살았소",
        		"다시 사랑한다면 (김필 Ver.)",
        		"Don't Start Now",
        		"네가 없는 밤 (Feat. ASH ISLAND) (Prod. by GRAY)",
        		"Whisky on the Rock",
        		"DAYDREAM",
        		"All For You",
        		"우산이 없어요",
        		"살짝 설렜어 (Nonstop)",
        		"상상더하기",
        		"Leave The Door Open",
        		"Forever Young",
        		"선물 (Feat. 은지원)",
        		"하루만 더",
        		"Circles"
        };
		String result = "";
		int no = (int)(Math.random()*title.length);
		result = title[no];	//노래 추천
		return result;
	}
	static void sort(int[] arr)
	{
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n---------------");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void gugudan()
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		//1
//		String id = JOptionPane.showInputDialog("ID 입력 : ");	//무조건 String으로만 사용 가능한 라이브러리
//		String pwd = JOptionPane.showInputDialog("Password 입력 : ");		
//	
//		boolean bCheck = isLogin(id,pwd);
//		if(bCheck)		// true라는 뜻
//		{
//			System.out.println(id+"님 로그인되었습니다!!");
//		}
//		else
//		{
//			System.out.println("ID 혹은 Password가 틀립니다!!");
//		}
	
		
		//2
//		String title = recommand();
//		System.out.println(title);
	
	
		//3
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		//정렬해서 출력 요청
		sort(arr);
		System.out.println();
		
		
		//4
		gugudan();
		
	}
	
}






