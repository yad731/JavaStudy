package IO19.sec04_filterinputoutputstream.EX02_DataInputOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class DataInputOutputStream {
	// Data(Input/Output)Stream 클래스를 활용한 다양한 타입의 입출력 구현
	public static void main(String[] args) throws IOException {
		// 파일 생성
		File dataFile = new File("src/main/java/IO19/sec04_filterinputoutputstream/files/file1.data");
		// 데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}
		// 데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}
	}
}
