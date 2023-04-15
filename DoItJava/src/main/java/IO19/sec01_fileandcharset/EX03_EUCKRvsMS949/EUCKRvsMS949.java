package IO19.sec01_fileandcharset.EX03_EUCKRvsMS949;
import java.io.UnsupportedEncodingException;
// EUC-KR 문자셋과 MS949 문자셋의 비교
public class EUCKRvsMS949 {
	public static void main(String[] args) throws UnsupportedEncodingException{
		// EUC-KR vs. MS949
		byte[] b1 = "a".getBytes("EUC-KR");
		byte[] b2 = "a".getBytes("MS949");
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(new String(b1,"EUC-KR"));
		System.out.println(new String(b2,"MS949"));
		System.out.println();
		
		byte[] b3 = "가".getBytes("EUC-KR");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(new String(b3,"EUC-KR"));
		System.out.println(new String(b3,"MS949"));
		System.out.println(new String(b4,"MS949"));
		System.out.println(new String(b4,"EUC-KR"));
		System.out.println();
		
		byte[] b5 = "봵".getBytes("EUC-KR");
		byte[] b6 = "봵".getBytes("MS949");
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b5.length); // 1 => EUC-KR 문자셋에 포함되어있지 않기 때문에 한글인지조차 모름
		System.out.println(b6.length); // 2 => MS949는 모든 한글을 포함하고 있기에 정상 분해
		System.out.println(new String(b5,"EUC-KR"));
		System.out.println(new String(b5,"MS949"));
		System.out.println(new String(b6,"MS949"));
		System.out.println(new String(b6,"EUC-KR"));
	}
}
