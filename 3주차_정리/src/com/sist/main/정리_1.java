package com.sist.main;
/*
 * class : 한 개에 대한 설계(사원 => 1명, 컴퓨터 => 1대)
 *         영화 1개
 * --------------------------------------------
 * 변수 ===> 배열 ===> 구조체 ===> 클래스
 * ---              ------    ----- 다른 데이터형 여러개 저장 + 메소드 저장
 * 1개만저장  ----     다른 데이터형 여러개 저장(삭제)
 *       같은 데이터형 여러개 저장 
 *       
 *  명령문 => 변수선언 + 연산처리 + 제어문
 *         ----------------------
 *         => 메소드
 *  클래스 : 변수여러개 ====> 사용자 정의 데이터형(일반 기본형과 동일)
 *                             |
 *                             배열이용 가능
 *                             형변환
 *         변수 + 메소드
 *         ---------
 *  클래스 영역은 선언만 가능
 *   - 변수 선언
 *     int a; => 선언과 동시에 초기화
 *     int a=10;
 *     ----------
 *     int a;
 *     a=100; ==> 구현 ==> 생성자, 초기화블록
 *   - 메소드 선언
 *     리턴형 메소드명(매개변수목록)
 *     {
 *       구현
 *     }
 *     
 *     class A
 *     {
 *       {
 *       
 *       }
 *       A()
 *       {
 *         구현 => 제어문, 변수값 읽기, 변수값 변경, 파일읽기
 *         시작과 동시에 변수의 초기화 => 생성자
 *       }
 *       void display()
 *       {
 *         구현
 *         사용자 요청시 초기화 => 일반 메소드
 *       }
 *     }
 *  
 */
import javax.swing.*;
public class 정리_1 extends JFrame{
	JButton b, b2;
	정리_1()
	{
		b=new JButton("click");
		b2=new JButton("click");
		add("North",b);
		add("South",b2);
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 정리_1();
	}

}
