package com.sist.exam3;
// A => a,b,name,A(),print()
// 공유 => addr,display() => A가 마음대로 제어를 못한다
class A
{
	int a;
	int b;
	String name;
	static String addr;
	public A()
	{
//		int a;
//		int b;
//		String name;
//		static String addr;
//		print();
//		display();
		a=10;
		b=20;
		name="hong";
		addr="Seoul";
	}
	public void print()
	{
//		int a;
//		int b;
//		String name;
//		static String addr;
//		print();
//		display();
		a=10;
		b=20;
		name="hong";
		addr="Seoul";
	}
	public static void display()
	{
		// addr => static은 static만 사용이 가능
		addr="";
		
		A aa=new A(); // 인스턴스를 사용하려면 객체 생성 후 사용 가능
		
		aa.a=10;
		aa.b=20;
		aa.name="hong";
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
