/*
	int a = 100;
	void aaa(int b)
	{
		a = b;		//1.		1이 있어야
	}
	aaa(300);		//2.		2를 수행할 수 있음

*/
class Member
{
	int mno = 1;		// 0
	String name = "홍길동";	// null
	String address = "서울";	// null
	String tel = "010-0000-0000";	// null
	
	Member(){
		
	}
	Member(String name, String address, String tel){
		mno = ++mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	Member(int mno, String name, String address, String tel) {
		
		this(name, address, tel);
		
		this.mno = mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	// 메모리 할당 시에 초기화
	
	void print()
	{
		System.out.println("회원 번호 : "+mno);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화 : "+tel);
	}

}	

	public class 매개변수생성자_2 {

	public static void main(String[] args) {
		
		Member m1 = new Member(1,"G","서울","010-0000-0000");
		Member m2 = new Member(2,"Q","경기","010-1111-1111");
		Member m3 = new Member(3,"D","부산","010-2222-2222");
		m1.print();
		m2.print();
		m3.print();
		Member m4 = new Member("강감찬","인천","010-3333-3333");
		m4.print();
		
	}
}
