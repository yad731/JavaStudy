package com.sist.collection2;
import java.util.*;
interface Model
{
	public void execute();
}
class BoardModel implements Model
{
	public void execute()
	{
		System.out.println("게시판 처리");
	}
}
class NoticeModel implements Model
{
	public void execute()
	{
		System.out.println("공지사항 처리");
	}
}
class ReserveModel implements Model
{
	public void execute()
	{
		System.out.println("예약 처리");
	}
}
/*
	clear()
	get()
	***keySet() => 키 전체를 모아서 관리
	***put() => 데이터 저장 put(Object key, Object obj)
	isEmpty()
	size()
	values()
*/
class Container
{
	private Map map = new HashMap();
	public Container()
	{
		map.put("board", new BoardModel());
		map.put("notice", new NoticeModel());
		map.put("reserve", new ReserveModel());
	}
	public Model getBean(String key)
	{
		return (Model) map.get(key);
	}
}
public class MainClass_Map2 {

	public static void main(String[] args) {
		
		Container c = new Container();
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		String menu = scan.next();
		
		Model m = c.getBean(menu);
		m.execute();
		
	
	}
}
