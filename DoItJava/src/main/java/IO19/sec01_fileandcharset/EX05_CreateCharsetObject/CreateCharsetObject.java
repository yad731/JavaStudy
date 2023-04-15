package IO19.sec01_fileandcharset.EX05_CreateCharsetObject;
import java.nio.charset.Charset;
// 문자셋을 저장 및 관리하는 Charset 객체 생성 및 지원 여부 확인
public class CreateCharsetObject {
	public static void main(String[] args) {
		Charset cs1 = Charset.defaultCharset();
		Charset cs2 = Charset.forName("MS949");
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);
		System.out.println();
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
	}
}