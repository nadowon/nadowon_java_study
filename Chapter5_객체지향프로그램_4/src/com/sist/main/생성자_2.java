package com.sist.main;
/*
 * 	멤버변수 초기화방법 // 중복으로 사용하지 않고 하나만 사용
 *  1. 디폴트 값 지정 // 단점: 값을 하나만 지정할 수 있음
 *     int => 0, String => null, boolean => false
 *     class A
 *     {
 *       int a;
 *     }
 *  2. 명시적 초기화: 직접 값을 설정
 *     class A
 *     {
 *       int a=10;
 *     }
 *  3. 생성자 초기화
 *     class A
 *     {
 *       int a;
 *       A(){
 *       a=100;
 *       }
 *     }
 *  4. 초기화 블럭 // 생성자 초기화와 같이 쓰이지 않는다
 *     class A
 *     {
 *       int a;
 *       {
 *         a=100;
 *       }
 *     }
 *     
 *   => 우선순위 : default - 명시적 - 초기화 블럭 - 생성자
 *                               ----------------
 *                               // 연산처리, 제어문, 파일읽기
 *   
 *  
 */
/*class Student
{
	int hakbun=10;
	String name;
	{
		hakbun=100;
	}
	Student(){
		hakbun=1000;
	}
	
	class A
	{
	  void a(){}
	  void a(
	}
	
}*/
class Student
{
	int hakbun;
	String name;
	Student(){
		System.out.println("Student() call...");
		hakbun=1;
		name="홍길동";
	}
	Student(int h,String n) // 생성 시마다 다른 초기값을 원할 땐 매개변수 있어야 함
	{
		hakbun=h;
		name=n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출 시 new를 앞에 붙여서 호출한다
		Student s=new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		// 초기값 같게
		Student s1=new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		// 초기값 다르게(매개변수 o)
		Student s2=new Student(2, "심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3=new Student(3, "박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
	}

}
