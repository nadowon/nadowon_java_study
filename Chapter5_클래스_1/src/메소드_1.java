/*
 * 메소드
 *   1) 구조화된 프로그램(문장을 기능별로 나눠서 작업)
 *   2) 반복 제거 => Spring(AOP)
 *   3) 메소드는 한 개의 기능만 수행 +기능 따로 -기능 따로
 *   -------------------------------------------
 *   리턴형 : 처리 후 결과값 (한 개만 설정이 가능)
 *   매개변수 : 사용자가 요청하는 값 (여러 개 보낼 수 있다)
 *           => 3개 이상이면 [],class
 *   형식)
 *       리턴형  메소드명(매개변수...)
 *                    --------- 갯수와는 상관없다(사용자 요청값)
 *       ----  ------  같은 메소드명이 있을 수 있다(매개변수는 다 달라야한다)
 *        |            한 자바파일 안에 모든 메소드명이 달라야 한다(x)
 *       요청 결과값 (한 개만) ==> 여러개 : int[], class
 *       
 *      *** 사용자가 요청한 값(매개변수)을 받아서 처리 후에 결과값을 보내주거나 화면에 출력
 *                                                             --------- 결과값이 없는 상태(void)
 *          --------------------- 입력, 마우스 클릭, 버튼 클릭...
 *   
 *   
 *   
 *   
 *   
 */
// 정수 2개를 보내고 더한 값을 받는다
// => return a+b
// => System.out.println("a+b="+(a+b))

// 단을 보내고 해당 단의 구구단을 출력
// => 자체 출력이 편하다

// main메소드에서는 가급적이면 => 연결(변수 선언x)

// void 사용
// 구구단 => 단을 입력받아서 => 자체에서 출력이 가능

import java.util.Scanner;

public class 메소드_1 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d \n",dan,i,dan*i);
		}
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.printf("단 입력:");
		int dan=scan.nextInt();
		
		gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
