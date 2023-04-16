package IO19.sec04_filterinputoutputstream.EX01_BufferedInputOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class BufferedInputOutputStream {
	// Buffered(Input/Output)Stream 클래스를 활용한 입출력 속도 개선
	public static void main(String[] args) {
		// 파일 생성
		File orgfile = new File("src/main/java/IO19/sec04_filterinputoutputstream/files/mycat_origin.jpg");
		File copyfile1 = new File("src/main/java/IO19/sec04_filterinputoutputstream/files/mycat_copy1.jpg");
		File copyfile2 = new File("src/main/java/IO19/sec04_filterinputoutputstream/files/mycat_copy2.jpg");
		long start, end, time1, time2;
		
		// 1. BufferedInputStream, BufferedOutputStream을 사용하지 않을 때
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			OutputStream os = new FileOutputStream(copyfile1);){
			// 복사하는 코드
			int data;
			while((data=is.read())!=-1) {
				os.write(data);
			}
		}catch(IOException ex) {ex.printStackTrace();}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedStream: "+time1);
		
		// 2. BufferedInputStream, BufferedOutputStream을 사용할 때
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgfile);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);){
			// 복사하는 코드
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
		}catch(IOException ex) {ex.printStackTrace();}
		end = System.nanoTime();
		time2 = end-start;
		System.out.println("With BufferedStream: "+time2);
		
		// 사용했을 때와 사용하지 않았을 때 비교
		System.out.println("Ratio of with and without: "+time1/time2); // 24
	}
}
