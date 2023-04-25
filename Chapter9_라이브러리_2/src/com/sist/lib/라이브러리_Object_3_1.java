package com.sist.lib;
class Sawon2
{
	private int sabun;
	private String name;
	// 초기화
	public Sawon2(int sabun,String name) // 한 번만 생성하고 나서
	{
		this.sabun=sabun;
		this.name=name;
	}
	public int getSabun() { // 한 메모리에서 값을 변경해야한다 => getter/setter 사용 : 같은 메모리에서 값 계속 변경 가능
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;
		return name.equals(s.name) && sabun==s.sabun;
	}
	
}
public class 라이브러리_Object_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1,"홍길동");
		Sawon2 s2=new Sawon2(1,"홍길동");
		
		// 오버라이딩을 하지 않는 경우 => 주소비교(==)
		if(s1.equals(s2)) {
			System.out.println("같은 사원이다");
		}
		else
			System.out.println("다른 사원이다");
		
		// Sawon s1=new Sawon(1,"박문수"); 
		// s1=new Sawon(1, "박문수");
		// 다른 메모리를 가지고 있다
		// 생성자 하나가지고 s1의 메모리값을 계속 변경할 수 없다
		
	}

}
