package IO19.sec02_fileinputoutputstream.EX05_FileOutputStream_2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException{
		// 1. 입력 파일 생성
		File outFile = new File("src/main/java/IO19/sec02_fileinputoutputstream/files/FileOutputStream2.txt");
		
		// 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기
		OutputStream os2 = new FileOutputStream(outFile,false);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "당신의 개발 인생과 끝까지 함께할 단 한 권의 자바 기본서".getBytes(Charset.defaultCharset());
		os3.write(byteArray2,10,6);
		os3.flush();
		os3.close();
	}
}
