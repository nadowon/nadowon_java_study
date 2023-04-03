/*
 * 데이터 저장					 		__________ 			데이터 처리           _________ 	 요청 결과 출력					=> 전부 묵는 것: Component: 클래스 안에서 제작 => 재사용 목적 / 변경,추가: 객체지향: 최종목적 => 유지보수
 * 정수/실수/문자/문자열/논리
 * 
 * 한개 저장: 변수/상수										 사용자 요청						Application
 * --------------------------------------------		 * => 결과값을 추출						Web Application
 * ^관련된 데이터 여러개: 배열(같은 데이터형만 저장이 가능)		 * => 연산처리/제어(흐름)				Mobile Application
 * ^클래스(다른 데이터형을 모아서 관리)						 * => ^연산자/제어문
 * ^: 묶으면 메소드
 * 
 * ==========================================================
 * 	다중 조건문: 조건이 맞는 문장을 수행하고 종료 (한 개 문장만 수행)
 * 			=> 여러 개를 수행하고 싶다면 단일 조건문을 사용한다.
 * 
 * 	예) 1~100까지 숫자 중 3,5,7의 배수의 합을 출력한다 --- 단일 3개 사용 (다중은 3에서 빠져나간다 그래서 x)
 * 
 * 	형식)
 * 		if(조건문)
 * 		{
 * 			true일 때 수행하는 문장 작성 ==> 종료
 * 			false
 * 			  ↓
 * 		}
 * 
 * 		else if(조건문)
 * 		{
 * 			true일 때 수행하는 문장 작성 ==> 종료
 * 			false
 * 			  ↓
 * 		}
 * 
 * 		else ==> 생략 가능
 * 		{
 * 			해당 조건이 없는 경우에 처리되는 문장
 * 		}
 * 
 * 		사칙연산:  + - & /     else %
 * 
 */

// 사칙연산 처리

import java.util.Scanner;

public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자 입력:");
		char op=scan.next().charAt(0); // 문자열 중에 첫번째에 있는 문자를 추출
		// + - * / => charAt(1)= + => 자바의 단점: char는 받을 수 없다 (문자열)
		
		// 경우: + - * / 외 다른 문자 입력시(else)
		if(op=='+')	{
			System.out.printf("%d + %d =%d \n", num1, num2, num1+num2);
		}
		else if(op=='-') {
			System.out.printf("%d - %d =%d \n", num1, num2, num1-num2);
		}
		else if(op=='*') {
			System.out.printf("%d * %d =%d \n", num1, num2, num1*num2);
		}
		else if(op=='/') {
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다!");
			else // 0이 아니라면
				System.out.printf("%d / %d =%.2f \n", num1, num2, num1/(double)num2);
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
				

	}

}
