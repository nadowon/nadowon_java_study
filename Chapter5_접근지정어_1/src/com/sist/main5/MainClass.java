package com.sist.main5;
// 조립하는 부분
/*
 * 1. 데이터형 (변수 묶음) => 사용자 정의 데이터형
 * 2. 기능을 가지고 있는 클래스 제작 (메소드)
 * 3. 사용자에게 보여준다 (조립) => 웹 (메인페이지)
 */
import com.sist.main3.*;
import com.sist.main4.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.init();
		ss.stdTotal();
		ss.stdAvg();
		ss.stdScore();
		ss.stdRank();
		ss.display(); // 순서대로 호출해야한다. display를 stdTotal과 stdAvg 앞에 작성하면 0값이 나옴
		/*
		 * 1. 변수는 개인마다 가지고 있는 속성 => 함부로 접근할 수 없다
		 *    변수는 (private : 은닉화, 캡슐화) 해야함
		 * 2. 요청 : 개인정보를 공개 (접근이 가능하게 만든다)
		 *         ------------
		 *         getter/setter
		 *         -------------
		 *         name => setName(), getName() => 읽기/쓰기
		 *                 setXxx(), getXxx()
		 * 3. 메소드를 이용해서 접근 (메소드는 public이 기본)
		 * 4. 다른 클래스에서 메모리 할당 : 생성자 (public이 기본)
		 */
	}

}
