package IO19.sec04_filterinputoutputstream.EX03_CombineFilterStream;
import java.io.*;
public class CombineFilterStream {
	// Buffered(Input/Output)Stream과 Data(Input/Output)Stream의 조합
	public static void main(String[] args) throws IOException{
		// 파일 생성
		File dataFile = new File("src/main/java/IO19/sec04_filterinputoutputstream/files/file2.data");
		// 데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}
		// 데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);){
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}
	}
}
