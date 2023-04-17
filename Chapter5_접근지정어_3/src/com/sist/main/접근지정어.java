package com.sist.main;
/*
 * 접근지정어 : 접근 범위 지정 => 생성자, 메소드, 변수
 * private : 자신의 클래스에서만 사용이 가능 => 멤버변수는 private
 *          = 단점은 다른 클래스와 연결이 안된다
 *          = 단점을 보완 => getter/setter
 *          캡슐화 : 변수는 은닉화를 하고 메소드를 통해서 접근하는 방식
 *          ***기술면접: 은닉화/캡슐화 차이 , 캡슐화를 쓰는 목적은? 데이터를 보호하는 목적
 * default : 같은 패키지 안에서만 접근
 *           => 한 파일에 class 두 개를 만들지 않는다
 * protected : 같은 패키지 안에서 접근, 상속이 있는 경우에는 다른 패키지에 접근 가능
 * public : 패키지 관계없이 모든 클래스에서 접근이 가능
 * --------------------------------------------------------------------
 * 형식) 멤버변수는 private
 *      메소드,생성자 => 다른 클래스와 연결 담당 : public
 *                   --------
 * --------------------------------------------------------------------
 * 매개변수로 객체 전송 => 메모리 주소(변경 => 자체가 변경)
 * ==> 얕은 복사
 * class A
 * 
 * A a=new A();
 * A b=a;
 * 
 * 매개변수 전송 방식 160p
 * -------------
 * 값 복사 : 값만 전송, 복사본 ==> 기본형, String
 * 주소 복사 : 주소 전송, 원본 ==> 배열, 클래스
 * 
 * class Member
 * {
 *    번호
 *    이름
 *    아이디
 *    비밀번호
 *    성별
 *    생년월일
 * }
 *  => void memberJoin(번호,이름,아이디,비밀번호,성별,생년월일)
 *     {
 *       오라클에 저장
 *     }
 *  => void memberJoin(Member m)
 *     {
 *     }
 */
class Value
{
	int a=10;
	int b=20;
}
public class 접근지정어 {
	static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+","+"b="+b);
	}
	static void swap(Value v)
	{
		System.out.println("v="+v);
		int temp=v.a;
		v.a=v.b;
		v.b=temp;
		System.out.println("v.a="+v.a+","+"v.b="+v.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		swap(x,y);
		System.out.println("x="+x+","+"y="+y);
		
		Value a=new Value();
		// Value v=a;
		System.out.println("a="+a);
		swap(a);
		System.out.println("a.a="+a.a+","+"a.b="+a.b);
	}

}
