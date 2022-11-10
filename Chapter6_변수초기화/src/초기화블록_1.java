import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
  	  변수(인스턴스 변수, 정적 변수-클래스변수, 지역변수, 매개변수)
  	  1. 인스턴스 변수, 클래스 변수 ==> 기본 디폴트로 자동 초기화
  	  	  1) 자동 초기화 => 나중에 값을 변경
  	  	  2) 시작과 동시에 데이터값이 필요할 때도 있다
  	  	  	  = 명시적인 초기화
  	  	  	  	class A
  	  	  	  	{
  	  	  	  		int a = 10;				// 0
  	  	  	  		String s = "aaa";		// null
  	  	  	  	}
  	  	  	  	예) Movie[] movie = new Movie[1938]; ==> 초기화를 먼저 시키는 것이 프로그래밍하기 좋음(명시적 초기화 X => 루프 사용, 초기화 블록)
			  = 생성자 ==> 변수의 초기화를 담당하는 메소드
			  	class A 
			  	{
			  		Movie[] movie = new Movie[1938];
			  		A()
			  		{
			  			for()
			  			{
			  				movie[i] = 값;
			  			}
			  		}
			  	}
			  = 초기화 블록 : 자동 인식	==> 구현하여 변수 값을 구하는 경우
			  						*** 구현 : 메소드 호출, 제어문, 연산 처리, 파일 읽기 ...
			  						*** 선언 : 변수 선언, 메소드 선언
			  								  int a;   abstract void aaa();
			  								  void aaa()
			  								  {
			  								  		블록을 연 건 구현
			  								  }
			  		1. 인스턴스 블록 : 인스턴스 변수, static 변수에 대한 초기화
			  		2. static 블록 : static 변수에 대한 초기화
			  		
			  		사용법
			  		class A
			  		{
			  			int a = 10;
			  			a = 100; ==> 오류
			  			
			  			{
			  				a = 100;
			  			}	==> 인스턴스 블록
			  		}
	  				
	  				class A
	  				{
	  					static int a = 100;
	  					a = 200;
	  					
	  					static
	  					{
	  						a = 200;
	  					}
	  				}
	  				
  	  2. 지역변수 => 반드시 초기화한 후 사용
  	  3. 매개변수는 메소드가 호출될 때 초기화
  	  --------------------------------
  	  
  	  *** 초기화되는 순서
  	  1. 클래스 변수 (static)
  	  	 기본값 ==> 명시적 초기화 ==> 클래스 블록(1 먼저) ==> 생성자			// 클래스블록과 생성자를 굳이 둘 다 쓸 필요 없음 어느 곳에서 초기화를 하는지 : 클래스 블록
  	  2. 인스턴스														// static은 자동으로 저장이 되기 때문에 생성자 호출 않고 클래스명. ~
  	  	 기본값 ==> 명시적 초기화 ==> 인스턴스 블록(2 그 다음) ==> 생성자		// 인스턴스블록과 생성자를 굳이 둘 다 쓸 필요 없음 어느 곳에서 초기화를 하는지 : 생성자
  	  	 															// 인스턴스는 많으니까 생성자에서 초기화
  	  	 															 
  	  	객체지향 (재사용, 보안)
			재사용
			 = 변경해서 사용 = 상속 is-a
			 = 있는 그대로 사용 = 포함 has-a
			보안
			 = 은닉화
			 = 캡슐화
			다형성
			 = 수정
			 = 추가
		객체지향 3대 요소 (상속, 캡슐화, 다형성) + 추상화(객체지향 4대 요소)
  	  
 */
/*
<ol class="list_movieranking">
                                  <li>
                      <div class="item_poster">
                          <div class="thumb_item">
                              <div class="poster_movie">
                                      <img src="https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2Ff2e234313de6543bb1ba4ad0e5d6ae389a26765b" class="img_thumb" alt="블랙 팬서: 와칸다 포에버">
                                  <span class="rank_num">1</span>
                                      <span class="txt_tag">
                                          <span class="ico_movie ico_see see12">12세이상관람가</span>
                                      </span>
                              </div>
                              <div class="poster_info">
                                  <a href="/moviedb/main?movieId=133423" class="link_story" data-tiara-layer="poster">
                                      “와칸다를 지켜라!”거대한 두 세계의 충돌, 운명을 건 최후의 전투가 시작된다! 국왕이자 ‘블랙 팬서’인 '티찰라'의 죽음 이후수많은 강대국으로부터 위협을 받게 된 '와칸다'.'라몬다', '슈리' 그리고 '나키아', '오코예, '음바쿠'는각자 사명감을 갖고 '와칸다'를 지키기 위해 외로운 싸움을 이어간다.한편, 비브라늄의 패권을 둘러싼 미스터리한 음모와 함께깊은 해저에서 모습을 드러낸 최강의 적 '네이머'와 '탈로칸'의 전사들은'와칸다'를 향해 무차별 공격을 퍼붓기 시작하는데…
                                  </a>
                              </div>
                          </div>
                          <div class="thumb_cont">
                              <strong class="tit_item">
                                  <a href="/moviedb/main?movieId=133423" class="link_txt" data-tiara-layer="moviename">블랙 팬서: 와칸다 포에버</a>
                              </strong>
                              <span class="txt_append">
                                  <span class="info_txt">평점<span class="txt_grade">7.4</span></span>
                                  <span class="info_txt">예매율<span class="txt_num">69.2%</span></span>
                              </span>
                              <span class="txt_info">
							        개봉<span class="txt_num">22.11.09</span>
						        </span>
                          </div>
                      </div>
                  </li> 
*/


// 중심이 변수 : 데이터형 클래스 (변수만 가지고 있는 상태)
class Movie
{
	int mno;
	String title;
	String story;
	String reserve;
}
// 중심이 메소드 : 데이터를 관리 => 중심을 기능에 : 액션 클래스
class MovieSystem
{
	static Movie[] movie = new Movie[20];		// 선언만 할 수 있고 구현을 할 수 없어서
	
//	{
//		이렇게 블록을 사용하게 되면 인스턴스 초기화 : static을 가져다 사용할 수 없음	
//	}
	
	static										// static 블록으로 값을 초기화
	{
		try
		{
			Document doc = Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			System.out.println(doc.toString());
			Elements title = doc.select("ol.list_movieranking strong.tit_item a");
			Elements story = doc.select("ol.list_movieranking div.poster_info a");
			Elements reserve = doc.select("ol.list_movieranking span.txt_append span.txt_num");
			
			for(int i=0; i<title.size(); i++)
			{
				movie[i] = new Movie();
				movie[i].title = title.get(i).text();
				movie[i].story = story.get(i).text();
				movie[i].reserve = reserve.get(i).text();
			}
			
			
		}catch(Exception ex) {}
	}
}


class MusicSystem
{
	Movie[] movie = new Movie[20];	// 인스턴스 블록 => 객체 생성해야
	
	{
		// 인스턴스 블록 => 초기화 (초기화 블록, 생성자) => 상속 예외 (상속되지 않음)
		try
		{
			Document doc = Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			System.out.println(doc.toString());
			Elements title = doc.select("ol.list_movieranking strong.tit_item a");
			Elements story = doc.select("ol.list_movieranking div.poster_info a");
			Elements reserve = doc.select("ol.list_movieranking span.txt_append span.txt_num");
			
			for(int i=0; i<title.size(); i++)
			{
				movie[i] = new Movie();
				movie[i].title = title.get(i).text();
				movie[i].story = story.get(i).text();
				movie[i].reserve = reserve.get(i).text();
			}
			
			
		}catch(Exception ex) {}
	}
}

public class 초기화블록_1 {

	public static void main(String[] args) {
		
		Movie[] m = MovieSystem.movie;
		for(Movie mm:m)
		{
			System.out.println(mm.title);
			System.out.println(mm.story);
			System.out.println(mm.reserve);
			System.out.println("======================================");
		}
		
		System.out.println("\n===================== 인스턴스 블록 ========================\n");
		
		MusicSystem ms = new MusicSystem();		// 저장
		Movie[] mm = ms.movie;
		for(Movie mmm:mm)
		{
			System.out.println(mmm.title);
			System.out.println(mmm.story);
			System.out.println(mmm.reserve);
			System.out.println("======================================");
		}
		
		
	}
}









