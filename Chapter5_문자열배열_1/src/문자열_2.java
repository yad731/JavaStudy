import java.util.Arrays;

/*
	concat : 문자열 결합
	문자열.concat(문자열) ==> 문자열문자열
*/
public class 문자열_2 {

	public static void main(String[] args) {
		
		String s1 = "Hello ";
		String s2 = "Java!!";
		System.out.println(s1.concat(s2));
		// + 연산자로 대체 가능
		System.out.println(s1+s2);
		
		// 문자열 ==> 기능 수행 후에 원본은 변경되지 않는다.
		System.out.println(s1);
		System.out.println(s1.substring(3));
		System.out.println(s1);
		s1 = s1.substring(3);	// 문자열을 다시 초기화하면 값은 변경됨.
		System.out.println(s1);
		
		// replace	==> 문자열 내의 그 문자를 모두 바꿈
		String msg = "Hello Java";
		// a => b	==> "Hello Jbvb";
		System.out.println(msg.replace("a", "b"));
		
		String msg1 = "홍길동 version 2!!";
		System.out.println(msg1.replaceAll("[^가-힣]", ""));	// 한글을 제외하고 나머지는 "" 처리(공백을 줘라=>잘라라)
		// [가-힣] [A-Za-z] [0-9]
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));
		
		String movie="범죄, 스릴러|한국|105분|2022 .10.26 개봉";
		String[] m = movie.split("\\|");		// ^,|,?,.,+ ==> 이미 사용중인 기호는 앞에 \\를 붙여야 원하는대로 출력
		System.out.println(Arrays.toString(m));
	
	}
}








