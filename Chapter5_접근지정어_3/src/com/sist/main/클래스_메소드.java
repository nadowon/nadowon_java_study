package com.sist.main;
// Math 클래스는 지원하는 모든 메소드가 static
import static java.lang.Math.random;
public class 클래스_메소드 {
/*
 * import 패키지명.클래스명;
 * import 패키지명.*;
 * import static java.lang.Math.random;
 * java.lang* => 자동 로딩이 된다, import를 사용하지 않는다
 * ---------- String, Math
 * 
 * void method()
 * {
 *    return; // 자동 설정(생략이 가능) => void 에서만
 *    =======> 중간에 존재할 때도 있다 // return이 있는 곳에서 종료
 * }
 * 
 * class A
 * {
 *    A(){} // default 생성자, 기본 생성자
 * }
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		if(a%2==0)
		{
			System.out.println("a="+a);
			return;
		}
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		return;

		
	}

}
