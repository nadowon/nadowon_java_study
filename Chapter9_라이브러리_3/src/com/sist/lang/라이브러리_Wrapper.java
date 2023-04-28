package com.sist.lang;

import java.util.ArrayList;
import java.util.List;

/*
 * Wrapper : 전체를 감싼다
 * ------- CSS(container)
 * 프로그램 개발 => 기본형 데이터형을 객체단위로 저장할 때
 * 
 * List<int> => 오류
 *     ----- 클래스형이 들어가야 한다
 * List<Integer>
 * => 기본형을 클래스화 시켜서 사용
 *    ------------- Wrapper
 *    
 *    기본형        클래스형=> 기본형에 기능을 추가해서 클래스화시킨 것(Wrapper)
 *  -----------------------
 *    int         Integer
 *    long        Long
 *    byte        Byte
 *    double      Double
 *    boolean     Boolean
 *    
 *    웹에서 4.3의 평점은 double이 아니라 String으로 불러온다
 *    String score=(String)4.3; ==> 오류
 *    double score=(double)"4.3"; ==> 오류
 *    double score=Double.parseDouble("4.3"); ---(o)
 */

		/*
		 * *** Wrapper의 목적
		 *    --------------
		 * 1. 문자열을 해당 데이터형으로 변환 (기본형 => 기능부여)
		 *    문자열 => 정수형 Integer.parseInt("10")
		 *    문자열 => 실수형 Double.parseDouble("4.5")
		 *    문자열 => 논리형 Boolean.parseBoolean("true")
		 *    
		 * 2. 객체단위로 저장할 때가 있다 ***(자료구조 => Collection)
		 * 
		 */

public class 라이브러리_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Double.parseDouble : 문자열을 숫자로 변경
		// 사용처: 문자열을 원하는 데이터형으로 변경할 때 주로 사용
		// => 클라이언트에 배포 => 윈도우 / 브라우저 / 핸드폰
		//                     --------------------- 모든 데이터형이 문자열 => 기본형 데이터형으로 변경
		// 클래스명 : 객체단위로 저장(List<>)
		// 문자열을 해당 데이터형으로 변환할 때 ==> parseXxxx (static으로 되어있음)
		String s="4.3";
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		// 오토박싱 / 언박싱 => 서로 호환되게 함
		
		/*
		 * 오토박싱 : 클래스에 해당 데이터값을 설정
		 * Integer i=new Integer(10); (굳이 x)
		 * Integer i=10; // 메모리 할당이 아닌 실제값을 바로 입력 가능, 클래스 안에 기본 데이터형 값을 바로 넣을 수 있음
		 * 
		 * 언박싱 : 기본형에 클래스 객체를 설정
		 * int aa=i;
		 */
		Integer i=100; // int랑 같은 역할을 함
		System.out.println(i);
		int aa=i;
		System.out.println(aa);
		/*
		 * void display(Integer i1, Integer i2)
		 *  => display(10,20)
		 */
		
		// List<Integer> list=new ArrayList<Integer>();
		// 이제 배열대신 이거 사용 // 갯수를 지정 안해도 되는 장점
		
		// 기술면접 : 게시판 만들줄아냐 => 페이징기법 쓸 줄 아냐 => 자바에서는 어떻게, 오라클에서는 어떻게 페이지를 나누냐
		
	}

}
