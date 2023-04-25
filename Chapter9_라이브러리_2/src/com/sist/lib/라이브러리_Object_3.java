package com.sist.lib;
// equals => Object에서는 객체비교, String에서는 문자열비교
class Student2
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name)
	{
		this.name=name;
	}
	// equals를 재정의를 하지 않은 경우 ==과 동일하다
	// Object => equals는 사용빈도가 많지 않다 => 오버라이딩을 시켜야한다
	// => String ... equals가 재정의되어있다(실제 문자열)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2) {
			// 문자열 비교
			// if(s1.equals(s2))
			// return name: s1, ((Student2)obj).name: s2
			
			 Student2 s=(Student2)obj; // 형변환 먼저 시켜주고
			 return name==s.name; // 문자열 비교
			// return name==((Student2)obj).name;  // 위에 두개랑 이거 하나랑 같음
			 
		    // ((Student2)obj).name : 자주 쓰이는 형변환/ 형변환을 먼저 하고(괄호 먼저 해줌) .name을 실행해줘야한다 (.이 형변환보다 우선순위)
		}
		else
			return false;
	}
	public void print()
	{
		System.out.println("이름:"+name);
	}
	
}
// == : 객체 주소 비교 / equals : 객체가 가지고 있는 변수값 비교
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		/*
		 * 객체비교 ==은 주소값을 비교한다
		 *  s1=com.sist.lib.Student2@5e91993f
		 *  s2=com.sist.lib.Student2@1c4af82c
		 */
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		// 주소값을 비교 => default(주소값 비교)
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		s1.print();
		new Student2("박문수").print();
		/*
		 * String s="Hello";
		 * 
		 * s.length();
		 * "Hello".length(); // 둘이 같은 값
		 */
		
	}

}
