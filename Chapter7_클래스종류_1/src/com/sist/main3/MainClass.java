package com.sist.main3;
/*
 * 인터페이스 간의 상속
 * interface A
 * interface B extends A
 *             -------
 *             
 * interface A
 * {
 *    void aaa();
 * }
 * interface B extends A
 * {
 *    void bbb();
 *    // void aaa();
 * }
 * class C implements B
 * {
 *    public void aaa(){}
 *    public void bbb(){}
 * }
 * 
 */
interface A
{
	
}
interface B extends A // B < A
{
	
}
class C implements B // C < B => interface도 클래스와 동일하다 => 구분(클래스는 단일 상속, 인터페이스는 다중 상속)
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		B b=new C();
		C c=new C(); // 
		
//		if(c instanceof A) // c 객체는 A 소속이냐, c객체는 A보다 작냐 => c객체는 A에 포함 C<A
//			System.out.println("OK");
//		if(c instanceof B) // C < B
//			System.out.println("OK2");
//		if(b instanceof A) // B < A
//			System.out.println("OK3");
//		if(a instanceof C) // A == C
//			System.out.println("OK4");
//		if(a instanceof B) // A < B
//			System.out.println("OK5");
		
		String s="";
		StringBuffer sb=new StringBuffer();
		Object o=new Object();
		if(s instanceof Object)
			System.out.println("OK");
		if(sb instanceof Object)
			System.out.println("OK2");
		if(o instanceof String)
			System.out.println("OK3");
		// instanceof는 객체 크기 비교
		// 오른쪽 클래스가 크거나 같으면 => true
		// if(s instanceof StringBuffer) ==> 오류 발생(상속, 포함관계가 아닌 경우에는 크기를 잴 수 없다) string과 stringbuffer는 관계가 없음
	}

}
