package IO19.sec01_fileandcharset.EX02_FileMethods;
import java.io.File;
// 파일 클래스의 주요 메서드
public class FileMethods {
	public static void main(String[] args) {
		// C 드라이브 내에 temp 폴더가 없을 때 생성
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) tempDir.mkdir();
		
		// 1. 파일 객체 생성
		File file = new File("C:/Windows");
		// 2. 파일 메서드
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		System.out.println("폴더(?) : "+file.isDirectory());
		System.out.println("파일(?) : "+file.isFile());
		System.out.println("파일/폴더명 : "+file.getName());
		System.out.println("부모 폴더 : "+file.getParent());
		
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir());	// true : 기존에 없는 폴더 새로 생성 시 리턴
		File newfile2 = new File("C:/temp/bcd/cde");
		System.out.println(newfile2.mkdir());	// false : 폴더를 생성할 수 없거나 폴더가 이미 있을 때 리턴
		System.out.println(newfile2.mkdirs());	// true : 생성 가능
		File[] fnames = file.listFiles();
		for(File fname:fnames) {
			System.out.println((fname.isDirectory()?"폴더: ":"파일: ")+fname.getName());
		}
	}
}