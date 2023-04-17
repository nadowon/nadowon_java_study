package com.sist.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

class Sawon
{
	private int sabun;
	private String name;
	private String detp;
	private String loc;
	private int pay;
}
// 객체지향의 3대 특성은 문법 사항이 아니다 => 권장사항 / 모든 데이터는 private를 사용해야한다(캡슐화)
public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1명 저장
		//sa => sabun,name,detp,loc,pay 메모리 공간 생성
		Sawon sa=new Sawon();
		sa.setSabun(1); // 메모리 저장
		sa.setName("홍길동");
		sa.setDetp("개발부");
		sa.setLoc("서울");
		sa.setPay(3000);
		
		System.out.println(sa.getSabun()+" "
				+sa.getName()+" " // 메모리값 출력
				+sa.getDetp()+" "
				+sa.getLoc()+" "
				+sa.getPay());
	}

}
