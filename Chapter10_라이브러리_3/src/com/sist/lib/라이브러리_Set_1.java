package com.sist.lib;
import java.util.*;
class Person implements Cloneable
{
	// 은닉화
	private String name;
	private int age;
	
	// 캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Object의 메소드를 오버라이딩 : 주소값 => 데이터값으로 변경
//	public String toString()
//	{
//		return name+"("+age+")";
//	}
	
	// 복제 => 새로운 메모리를 만들어서 사용
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// 매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class 라이브러리_Set_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Set set=new HashSet();
		Person p1=new Person("홍길동", 25); // 데이터값이 같을 뿐 주소는 다름, 객체도 다름
		Person p2=new Person("홍길동", 25);
		System.out.println(p1);
		System.out.println(p2);
		Person p3=p1; // 중복 => 저장이 안됨
		System.out.println(p3);
		Person p4=(Person)p1.clone(); // 새로운 메모리 => 저장
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}

}
