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
	   		1) toUpperCase : 대문자 변환
	   		2) toLowerCase : 소문자 변환
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
	   	 ***1) indexOf : 앞에서부터 데이터 찾기
	   					String s = "Hello Java"
	   					s.indexOf("a");		===> J'a'va
	   		2) lastIndexOf : 뒤에서부터 데이터 찾기 
	   					String s = "Hello Java"
	   					s.lastIndexOf("a"); ===> Jav'a'
	   6. 기타
	   		concat("a","b") ==> ab ==> + 연산자로 대신
	   								  "a"+"b" ==> "ab"
	   	 ***charAt() ==> 문자 한 개를 가지고 올 때
	   		toCharArray() ==> 문자열을 문자배열(char[])로 변경
	   		
	   ------------------------------------------------------- 라이브러리 공부 : 1.기능 2.용도 3.사용처		
	   		
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
		msg = " Hello Java ";	//선언과 초기화를 따로 하는 경우 : 입력값을 받거나, 파일을 읽을 때 등...
		
		// 3. 활용(요청처리)
		//	1) 문자의 개수 확인 (length())	==> PW는 8자 이상, 댓글 200자 제한, MMS 전환
		System.out.println(msg.length()); 	// ***공백도 문자로 취급한다
		
		//	2) 공백을 제거
		System.out.println(msg.trim().length()); 	// 좌우에 있는 공백만 제거가 가능
		
		
		// 4. 출력

	}
}





