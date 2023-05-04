package com.sist.io;
// 한글 깨짐 방지 => UTF-8 => AWS(리눅스)
import java.io.*;
import java.util.*;
// Properties => Spring / Spring-Boot => 파서기
// MyBatis
// .properties
// 형식 => Map
// 키=값 ==> 데이터베이스 정보 저장 => 사용자 계정 / 비밀번호
public class 입출력_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 만든 파일 읽기
		Properties pro=new Properties();
		pro.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\src\\com\\sist\\io\\db.properties"));
		String driver=pro.getProperty("driver");
		String url=pro.getProperty("url");
		String username=pro.getProperty("username");
		String password=pro.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		// 시스템 정보 읽기
		Properties pro2=System.getProperties();
		System.out.println(pro2.getProperty("java.version"));
		System.out.println(pro2.getProperty("user.language"));
		
		// 파일 쓰기
		Properties pro3=new Properties();
		pro3.setProperty("name", "홍길동");
		pro3.setProperty("sex", "남자");
		pro3.setProperty("age", "25");
		pro3.store(new FileOutputStream("info.properties"), "회원정보"); // store : 파일 저장
		
		Properties pro4=new Properties();
		pro4.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\info.properties"));
		String name=pro4.getProperty("name");
		String sex=pro4.getProperty("sex");
		String age=pro4.getProperty("age");
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		// 키가 중복되면 안된다(Map)
		// 이동 화면 board.list=http://localhost~
		// properties => xml => json
		// ----------------- spring/mybatis/maven
	}

}
