/*
		startsWith : 문자열이 지정한 문자로 시작하는지 판단, 같으면 true 반환 아니면 false를 반환한다 (대소문자 구별)
		원형
			boolean startsWith(String fs)
			메소드는 사용자가 값을 요청하면 어떤 값을 출력하는지	
		endsWith : 문자열 마지막에 지정한 문자가 있는지를 판단, 있으면 true 없으면 false를 반환한다 (대소문자 구별)
			boolean endsWith(String s)
***		equals : 두 개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다 (대소문자 구별)
			boolean equals(String fs)
			
***		indexOf : 지정한 문자가 문자열에 몇 번째에 있는지를 반환한다
			int indexOf(char c)		// '/'
			int indexOf(String s)	// "Java"
***		lastIndexOf : 문자열에 지정한 문자가 마지막 몇 번째에 있는지 int를 반환
			int lastIndexOf(char c)
			int lastIndexOf(String s)
***		length : 문자열의 길이를 반환한다
			int length() 
			
				boolean login(String id, String pwd)
				사칙연산 ==> 정수, 연산자, 정수
		
		replace : 문자열에 지정한 문자""가 있으면 새로 지정한 문자""로 바꿔서 출력한다
			String replace(char o, char n)
			String replace(String s1, String s2)
		replaceAll : 정규표현식을 지정한 문자로 바꿔서 출력한다
			String replaceAll(String s, String s1)
		split : 지정한 문자로 문자열을 나눌 수 있다 (배열로 반환)
			String[] split(String s)
			
***		substring : 문자열에 지정한 범위에 속하는 문자열을 반환한다 (시작범위의 값은 포함하고, 끝나는 범위의 값은 포함하지 않는다)
			String substring(int s)
			String substring(int s, int e) ==> e-1 (마지막은 제외)
		toLowerCase : 문자열에 대문자를 소문자로 변환한다
			String toLowerCase()
		toUpperCase : 문자열에 소문자를 대문자로 변환한다
			String toUpperCase()
			
***		trim : 문자열의 공백을 없애준다
			String trim()
		toString : 지정한 개체의 원시 값을 반환
			String toString()
***		contains : 두 개의 String을 비교하여 비교대상 String을 포함하고 있으면 true, 다르면 false를 반환한다
			String contains(String s)
		charAt : 지정한 index번째에 문자를 반환한다
			char charAt(int i)
			
***		valueOf : 모든 데이터형을 문자열로 변경 (웹, 네트워크, 윈도우)

		String / Integer / ArrayList
		
*/
public class 문자열정리 {
	
	public static void main(String[] args) {
		
		String s = "Hello Java,Java";
		System.out.println(s.replace("Java", "JSP"));
		
		
		
	}
}
