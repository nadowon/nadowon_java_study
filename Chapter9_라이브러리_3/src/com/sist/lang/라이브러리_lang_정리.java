package com.sist.lang;
/*
 * java.lang => 기본 (가장 많이 사용되는 클래스의 집합)
 * --------- import 생략 가능
 * 
 * - Object : 최상위클래스 => 모든 클래스는 Object 상속을 받는다
 *            --------- 데이터형으로 사용 (가장 큰 데이터형)
 *           Object o=10
 *           o=10.3 // 오토박싱 : 기본형 = 클래스
 *           o=""
 *           o='A'
 *           o=true
 *           o=new 클래스
 *           -----------
 *           여러 개의 데이터형을 묶어서 관리
 *           Object[] oo={10,10.2,'A',"aaa"...}
 *           단점) 라이브러리에서 제공하는 메소드는 
 *                리턴형 / 매개변수 ==> 대부분 Object
 *                => 형변환을 꼭 해줘야한다 => 제네릭스 (리턴형/매개변수변경) : 데이터형 통일시켜버림
 *           
 *           기능
 *           1) clone 복제(새로운 메모리 생성)
 *           2) toString 객체를 문자열화
 *           3) finalize 소멸자
 *           4) equals 비교(기본 => 주소값, 실제값 비교 => 오버라이딩)
 *           
 * - String : 문자열 저장 클래스
 *            기능
 *            1) length()
 *            2) substring()
 *            3) trim()
 *            4) charAt()
 *            5) replace()
 *            6) equals()
 *            7) startsWith()
 *            8) contains()
 *            9) indexOf()
 *            10) lastIndexOf()
 *            11) valueOf()
 *  
 * - StringBuffer : append() 문자열결합
 *  
 * - Wrapper : 기본형을 클래스화시킨 클래스 집합
 *             int      Integer
 *             long     Long
 *             double   Double
 *             boolean  Boolean
 *            -------------------> 기본형을 객체형으로 저장, 문자열을 기본형으로 변환
 *            정수 변경 => Integer.parseInt()
 *            실수 변경 => Double.parseDouble()
 *            논리 변경 => Boolean.parseBoolean()
 *            
 * - Math : 수학
 *          random() 난수발생(0.0~0.99)
 *          ceil() 올림메소드 (총 페이지 구하기)
 *          round() 반올림메소드 (평균,통계)
 *          
 * - System : 
 *           System.currentTimeMillis() 실제 시간을 long으로 알려줌
 *             로그파일 => 웹
 *           System.gc() 가비지컬렉션 호출 (메모리 회수)
 *           System.out 화면 출력 (outputStream)
 *           System.in 키보드 입력값, 파일 (inputStream)
 */
import java.util.*;
public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("aaa");
		list.add(1);
		String a=(String) list.get(0);
		int b=(int)list.get(1); // 언박싱 : 클래스 = 기본형값
		// Integer와 int는 호환이 된다 // Integer는 기능을 가짐
		// Integer i=10; int i=10;
		int aa=new Integer(10);
		aa=12;
		System.out.println(aa);
	}

}
