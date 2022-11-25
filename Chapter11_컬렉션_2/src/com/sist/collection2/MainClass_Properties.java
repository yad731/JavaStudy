package com.sist.collection2;
/*
	Properties
	----------
		파일을 읽어서 데이터를 가지고 온다
		=> 중요한 데이터가 있는 경우 (데이터베이스 정보)
								------------- 오라클 위치, ID, password
		=> 유효성 검사
		------------------ MyBatis, 스프링 ... (XML, properties)
		Spring 4 => XML
		Spring 5 => Java
		---------------- 자동 세팅 (Spring-Boot)
		1) 객체 생성
		2) 파일 읽기
		3) 키 => 값 읽기


*/
import java.util.*;
import java.io.*;
public class MainClass_Properties {
	
	public static void main(String[] args) {
		
		try
		{
			Properties prop = new Properties();
			// 파일 읽기
			prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_컬렉션_2\\src\\com\\sist\\collection2\\info.properties"));
			String name = prop.getProperty("name");
			String address = prop.getProperty("address");
			String tel = prop.getProperty("tel");
			System.out.println(name+" "+address+" "+tel);
			
			Properties props = System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			props.list(System.out);
			// System에 저장된 정보
			
			// 파일에 값을 저장하는 과정
			Properties props2 = new Properties();
			props2.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			props2.setProperty("url", "jdbc:oracle:thin@localhost:1521:XE");
			props2.setProperty("username", "hr");
			props2.setProperty("password", "happy");
			try
			{
				props2.store(new FileOutputStream("db.propertis"), "데이터베이스 정보");
				props2.storeToXML(new FileOutputStream("db.xml"), "database info");
			}catch(Exception ex){}
		}catch(Exception ex) {}
		
	}
}
