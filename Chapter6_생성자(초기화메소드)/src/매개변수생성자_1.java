
import java.util.Scanner;
class Sawon
{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	Sawon()
	{
		sabun = 1;
		name = "홍길동";
		dept = "개발부";
		loc = "서울";
		pay = 5000;
	}
	Sawon(int sabun, String name)
	{
		this();	// 자신의 생성자 호출이 가능 ==> Sawon의 매개변수가 없는 생성자를 호출
		// 메소드 this()는 생성자에서만 호출이 가능하며 가장 첫 줄에 작성해야 한다
		this.sabun = sabun;
		this.name = name;		// ==> sabun, name이 아닌 항목은 Sawon() 생성자의 값으로 채워지게 될 것
	}
	Sawon(String dept, String loc, long pay)
	{
		this();
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	Sawon(int sabun, String name, String dept, String loc, long pay) {

		this(dept,loc,pay);
//		this.sabun = sabun;
//		this.name = name;
//		this.dept = dept;
//		this.loc = loc;
//		this.pay = pay;
	}
	void print()
	{
		System.out.println("사번 : "+sabun);
		System.out.println("이름 : "+name);
		System.out.println("부서 : "+dept);
		System.out.println("근무지 : "+loc);
		System.out.println("연봉 : "+pay);
	}
}
public class 매개변수생성자_1 {

	public static void main(String[] args) {
		
		Sawon sa1 = new Sawon();
		sa1.print();
		Sawon sa2 = new Sawon(2, "박문수");
		sa2.print();
		Sawon sa3 = new Sawon("총무부","경기",4200);
		sa3.print();
		Sawon sa4 = new Sawon(3,"김두한","기획부","부산",5500);
		sa4.print();
		
	}
}
