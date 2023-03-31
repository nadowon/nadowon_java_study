/*
 * 자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복 제어
 * => 변수/연산자/제어문
 * 	   |  --------- 메소드 
 * 	 여러개
 * 
 * *** 자바에서 지원하는 모든 제어문은 바로 밑에 있는 명령문만 제어할 수 있다
 * 		if(조건)
 * 		  문장 1 => 제어
 * 		  문장 2 => if문과 관련없는 문장 (제어x)
 * 
 * 		=> 한 개 이상 명령문을 수행시에는 반드시 {}으로 묶어준다
 * 		if(조건)
 * 		{
 * 		  문장 1
 * 		  문장 2
 * 		}
 * ---------------------------------------------------------
 * => 조건문
 * 		1) 단일조건문
 * 			if(조건 => 부정연산자(!), 비교연산자, 논리연산자) => true/false
 * 			{
 * 				조건이 true일 경우에만 수행하는 문장을 작성
 * 			}
 * 
 * 		2) 선택조건문
 * 		3) 다중조건문
 * => 선택문
 * => 반복문
 * 		1) while
 * 		2) do~while
 * 		3) for
 * 			= 일반 for
 * 			= 향상된 for => for-each (웹에서 핵심)
 * => 반복제어문
 * 		1) break;
 * 		2) continue
 * ================================================= 응용(연산자) => 54p
 * 
 */

// 조건문(단일조건문) => 짝수/홀수
import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = scan.nextInt();
		
		if(num%2==0) // 짝수
			System.out.println(num + "는 짝수입니다");
			System.out.println("num=" + num); // if와 상관없이 무조건 수행 (if문과 관련이 없는 문장)
			
		if(num%2!=0) // 홀수
			System.out.println(num + "는 홀수입니다");
			System.out.println("프로그램 종료!!"); // (if문과 관련이 없는 문장) => 이유: {}괄호로 묶지 않았기 때문
	}

}
