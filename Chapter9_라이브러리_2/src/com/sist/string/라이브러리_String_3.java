package com.sist.string;

import java.util.Scanner;

// String 메소드 (문자열을 제어하는 기능)
/*
 * String은 문자열 배열
 * ------ 문자마다 인덱스 번호를 가지고 있다 (0부터 시작)
 * String s="Hello Java";
 *           0123456789 ==> 오라클은 1번부터 / 자바는 0번부터
 *           자바       => ==  !=   substring(0,5) => Hello
 *                                             -- 인덱스번호
 *           오라클     =>  =   <>   substr(1,5) => Hello
 *                                          -- 글자수
 *           자바스크립트 => === !==
 *           
 *  주요기능 310p.
 *  1) 문자열에서 문자 한 개씩 추출 => char charAt(int index)
 */
public class 라이브러리_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg="Hello Java";
//		for(int i=0;i<msg.length();i++) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
//		
//		// 코딩테스트 문제 : msg를 거꾸로 출력하는 프로그램을 작성해라
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
		
		// 알파벳 문자열을 입력받아서 대문자 몇 개, 소문자 몇 개를 출력하는 프로그램을 작성해라
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String num=scan.nextLine(); // nextLine은 공백까지 다 나옴
		int a=0,b=0;
		for(int i=0;i<num.length();i++) {
			char c=num.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			else if(c>='a' && c<='z')
				b++;
		}
		System.out.println("대문자 갯수:"+a);
		System.out.println("소문자 갯수:"+b);
		
		
	}

}
