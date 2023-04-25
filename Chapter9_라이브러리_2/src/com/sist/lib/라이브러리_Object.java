package com.sist.lib;
/*
 * 사용자 정의 클래스 + 라이브러리
 * ------------------------- 조립
 * 1) 자바의 모든 클래스(라이브러리 클래스, 사용자 정의 클래스)
 *    => 상위클래스(Object)
 * 2) 자바에서 지원하는 라이브러리
 *    = java.lang : 자바의 기본 클래스 (가장 많이 사용되는 라이브러리)
 *       => import 생략
 *       예) Object, String, StringBuffer, Wrapper, System, Thread
 *    = java.util : 유용하게 사용이 가능하게 만든 라이브러리
 *      예) Scanner, StringTokenizer, 자료구조(데이터를 쉽게 관리)
 *                                   -----------------------
 *          Date / Calendar
 *    = java.io : 입출력 (메모리, 파일, 네트워크) => CheckException
 *    = java.net : 네트워크 => CheckException
 *    = java.sql : 데이터베이스 연결
 *    = java.text : 변환할 때(날짜형식, 문자열형식)
 * ----------------------------------------------------------------------- Web 관련 라이브러리
 * ----------------------------------------------------------------------- ***Spring 관련 라이브러리
 * ----------------------------------------------------------------------- 데이터 수집(Jsoup,JSON)
 * 
 * 자동 처리
 * -------
 * 1) import java.lang.*
 * 2) 메소드
 *    void method()
 *    {
 *      return => 생략 => 자동추가
 *    }
 * 3) 생성자
 *    class A
 *    {
 *      public A(){} => 자동 추가
 *    }
 * 4) 상속
 *    class A extends Object
 * ------------------------------------
 *  java.lang에서 지원하는 클래스는 대부분이 final 클래스
 *    => 상속을 받아서 확장이 불가능하다(있는 그대로 사용)
 *    => 상속을 받아서 확장이 가능한 것 => Object
 *    => Object : 모든 데이터형을 받을 수 있다 (Object o=10, Object o=""...)
 *    
 *    데이터형을 여러 개 사용 시에는 라이브러리에서 리턴형 대부분이 Object이다
 *     => 형변환을 사용해야 사용이 가능하다
 *     => 클래스를 형변환 => (int)new Object()--- (x)
 *                        (Integer)new Object()--- (o)
 *                         Integer i=10; => 오토박싱
 *                         int a=new Integer(10) => 언박싱
 * 
 *  Object
 *  ------
 *  주요기능
 *   finalize() : 소멸자(메모리 할당 => 해제할 때 호출)
 *   toString() : 객체를 문자열로 변환
 *   clone() : 새로운 메모리를 생성할 때 복제
 *   getClass() : 클래스 객체 읽어오기
 *   equals() : 객체 비교
 *   
 *   class A
 *   A a=new A();
 *   a.getClass(); ==> 객체를 가져옴
 * 
 *   class A
 *   -------
 *   => super(상속을 내린 클래스) : Object
 *   class B extends A
 *   ------------------
 *   => super(상속을 내린 클래스) : A
 */
class Student
{
	private int hakbun;
	private String name;
	public Student()
	{
		// super => Object
		hakbun=1; // this.hakbun=1; // this.생략 // 지역변수와 같은 이름일 때 구분
		name="홍길동";
		System.out.println("생성자: 멤버변수에 대한 초기화");
	}
	public void print()
	{
		System.out.println("학번:"+hakbun+",이름:"+name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
}
public class 라이브러리_Object /*extends Object*/{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 메모리 할당(메모리에 저장)
		Student s=new Student();
		// 객체를 활용(메소드 호출, 변수변경)
		s.print();
		// 객체 메모리 해제(메모리에서 삭제) => 자동 호출
		s=null; // GC대상
		// 메모리를 해제 => 강제로 명령
		System.gc(); // finalize() 소멸자함수 => 멀티미디어
		// A(), ~A()
	}

}
