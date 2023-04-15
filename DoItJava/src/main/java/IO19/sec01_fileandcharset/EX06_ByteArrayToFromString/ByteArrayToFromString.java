package IO19.sec01_fileandcharset.EX06_ByteArrayToFromString;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
// String->byte[]와 byte[]->String 변환 (UTF-8이 기본 문자셋일 때)
public class ByteArrayToFromString {
	public static void main(String[] args) throws UnsupportedEncodingException{
		// 1. String getBytes() : String -> byte[] 분해
		byte[] array1 = "안녕".getBytes();
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));
		byte[] array4 = "감사".getBytes("UTF-8");
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		System.out.println();
		
		// 2. new String()을 이용 : byte[] -> String 조합
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));
		String str4 = new String(array4, "UTF-8");
		String str5 = new String(array3, "UTF-8");
		String str6 = new String(array4, "MS949");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
