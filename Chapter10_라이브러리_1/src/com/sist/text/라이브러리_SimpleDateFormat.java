package com.sist.text;
/*
 * java.text => 출력 형태를 만들어서 사용 (변경)
 * ---------
 *  SimpleDateFormat : 날짜 변경
 *  DecimalFormat : 숫자 변환 => 가격 출력 시 10,000원
 *  MessageFormat : 데이터베이스 => INSERT, UPDATE
 *    String name="",sex="",addr="",tel="";
 *    int age=10;
 *    String sql="INSERT INTO member VALUES("+"'"+name+"','"+sex+"','"+addr+"','"+tel+"',"+age")";
 *    String sql="INSERT INTO member VALUES('{1}','{2}','{3}','{4}',{5})
 */
//import java.util.Date; // util과 sql에 Date가 둘 다 있어 충돌됨 => 사용할 라이브러리에 .Date 삽입
//import java.sql.*;
import java.util.*;
import java.text.*;
public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		// yyyy-MM-dd , yyyy/MM/dd
		System.out.println(sdf.format(date));
		/*
		 * 자바      오라클
		 * yyyy ==> rrrr
		 * MM   ==> mm
		 * dd   ==> dd
		 * hh   ==> hh24
		 * mm   ==> mi
		 * ss   ==> ss
		 */
	}

}
