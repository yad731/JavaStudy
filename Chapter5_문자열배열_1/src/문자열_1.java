import java.util.Arrays;

/*
	문자열 관련 데이터형(자바) ==> " "	// char ' '
	---------------
	String
	------ 문자열을 저장하는 기능, 문자열 제어하는 기능 (라이브러리)
	1) 저장 방법
		***String s = "";	=> 가장 많이 사용되는 방법 (기본형처럼 사용) => 웹에 90% (모든 데이터가 문자열)
		String id = "admin" <=== char[] c = {'a','d','m','i','n'}
		------ char[]을 사용하기 쉽게 만든 클래스
		String s = new String("");
	2) String 기능 (메소드)
	   ----------
	   1. 문자 변환
	   		1) toUpperCase : 대문자 변환 ===> 대소문자 구분없이 검색
	   		2) toLowerCase : 소문자 변환 ===> 대소문자 구분없이 검색
	   *****3) valueOf : 모든 데이터형을 문자열로 변경
	   					 int a = 10;
	   					 valueOf(a) ==> "10" ==> parseInt("10") ==> 10
	   					 boolean b = true;
	   					 valueOf(b) ==> "true" ==> parseBoolean("true") ==> true
	   2. 문자 제어
************1) substring() ==> 문자열 자를 때 사용 : ...더보기(화면 UI)
	   3. 문자 변경
	   	 ***1) trim() ==> 좌우에 공백을 제거 (입력) ==> 입력값을 사용자로부터 받을 때
	     ***2) replace() ==> 글자 변경 ==> 오라클 (크롤링) ==> 이미지
	   									 replace('&','^') : 오라클에서는 &가 출력의 의미
	   		3) replaceAll() ==> 정규식 (문자 형식)
	   							ip를 찾아라
	   							replaceAll("[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}") : 모든 ip를 가져오는 코드
	   							맛있는 맛있고 맛있게...
	   							--------------- 맛있+ : '맛있' 뒤에 한 글자가 더 있는 형태의 단어를 모조리 찾아옴
	   							분석 (빅데이터, AI) / 챗봇
	   		4) split() ==> 문자열을 배열로 변경
					   		String s = "red,blue,green";
					   		String[] arr = s.split(",") ==> {"red","blue","green"}
	   4. 문자 비교
	   	 ***1) equals() : 대소문자 구분 후 비교 (로그인, id 중복 체크, id 찾기..., 상세보기)
	   	 ***2) contains() : 포함 (검색)
	   		3) startsWith : 서제스트 (자동완성기) , 시작 단어
	   		4) endsWith : 끝나는 단어
	   		   ------------------------------------------- 검색기
	   5. 문자 찾기
	   	 ***1) indexOf : 앞에서부터 데이터의 위치값(숫자) 찾기
	   					String s = "Hello Java"
	   					s.indexOf("a");		===> J'a'va	: 7
	   		2) lastIndexOf : 뒤에서부터 데이터의 위치값(숫자) 찾기 
	   					String s = "Hello Java"
	   					s.lastIndexOf("a"); ===> Jav'a'	: 9
	   6. 기타
	   		concat("a","b") ==> ab ==> + 연산자로 대신
	   								  "a"+"b" ==> "ab"
	   	 ***charAt() ==> 문자 한 개를 가지고 올 때
	   		toCharArray() ==> 문자열을 문자배열(char[])로 변경
	   		
	   ------------------------------------------------------- 라이브러리 공부 : 1.기능 2.용도 3.사용처		
	   		라이브러리	1. 메소드명(기능)
	   				2. 매개변수(어떤 값을 넣을지)
	   				3. 리턴형(어떤 값을 받아올지)
*/
public class 문자열_1 {

	public static void main(String[] args) {

		/*
		 * String s = "Hello Java";
		 * char[] c = s.toCharArray();
		 * System.out.println(Arrays.toString(c));
		 */

		// 1. 변수(문자열) 선언
		String msg;
		
		// char[] ===>
		/*
		 * 		"Hello Java" ==> {H, e, l, l, o,  , J, a, v, a}
		 * 		
		 * 		charAt(0) ==> 'H'
		 * 
		 */
		// 2. 초기화
		msg = "Hello Java";	//선언과 초기화를 따로 하는 경우 : 입력값을 받거나, 파일을 읽을 때 등...
		
		// 3. 활용(요청처리)
		//	1) 문자의 개수 확인 (length())	==> PW는 8자 이상, 댓글 200자 제한, MMS 전환
		System.out.println(msg.length()); 	// ***공백도 문자로 취급한다
		
		//	2) 공백을 제거
		System.out.println(msg.trim().length()); 	// 좌우에 있는 공백만 제거가 가능
		
		//	3) 대문자로 변환
		System.out.println(msg.toUpperCase());		// 검색
		//	4) 소문자로 변환
		System.out.println(msg.toLowerCase());		// 검색
		// 한글 검색시 초성만으로 자동완성 기능을 어떻게 만들 수 있는지 ==> 메소드
		
		//	5) 자르기 substring()
		/*
		 * 		substring(int start) => 지정된 위치부터
		 * 		substring(int start, int end) => 어디서부터 어디 전까지 중간을 자름
		 * 
		 * 		확장자를 가져올 때 등
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5)); // end 위치는 제외함
		
				String post = "101-123";
				System.out.println(post.substring(0,3));
				System.out.println(post.substring(4));
				
				String fileName = "문자열_1.java";
				System.out.println(fileName.substring(6));
				// 확장자가 필요할 때마다 글자 수를 세어야 한다는 단점 ==> indexOf
				// 파일명 중간에 .이 들어갈 수 있음 ==> lastIndexOf
				System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		
		System.out.println(msg.indexOf("o"));
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		
		// 4. 출력

	}
}





