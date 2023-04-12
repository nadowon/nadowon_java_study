/*
 * method => 140p.
 * 메소드 왕왕 중요해
 * 1) 메소드 형식 => 기능처리
 *    --------
 *    웹 => 화면 변경 ----- 메뉴클릭, 버튼클릭, 이미지클릭...
 *    검색, 글쓰기, 수정, 회원가입, 회원탈퇴...
 *    사용자의 동작과 관련
 *    
 *    리턴형 메소드명(매개변수...) => 선언부
 *    {
 *       => 구현부
 *    }
 *    
 *   - 리턴 타입(리턴형)
 *     처리 후 결과값 한 개만 전송이 가능하다
 *     *** 여러 개인 경우: 배열, 클래스
 *     *** 한 개인 경우: 일반 기본형, String
 *     
 *     1) 결과값이 있는 경우
 *        리턴형 메소드명(매개변수...)
 *        ----
 *        {
 *          return 값;
 *                 --- ==> 리턴형과 값이 일치해야한다. 리턴형이 클수도 있다
 *        }
 *        예) int method()
 *           {
 *              return 10.5; => 오류발생
 *           }
 *           
 *           int method()
 *           {
 *              return (int)10.5;
 *           }
 *           ===> int a=method(); 결과값을 받아서 처리
 *           
 *           int[] method()
 *           {
 *             int[] arr={1,2,3,4,5};
 *             return arr; // 배열은 주소만 넘겨준다
 *           }
 *           
 *           String method()
 *           {
 *             return "";
 *           }
 *           ===> String s=method()
 *     
 *     2) 결과값이 없는 경우
 *        void method()
 *        ---- 
 *        {
 *          return; // 메소드 종료
 *        }
 *        ==> method();
 *        
 *        void method1()
 *        {
 *          생략 => 컴파일러가 자동으로 추가 return 
 *        }
 *        
 *        cf) import 자동으로 추가/ import java.lang.*
 *                                      System
 *                                      String
 *                                      Math
 *     
 *   - 메소드명 => 식별자와 동일
 *               길이에 제한이 없다 => 의미를 부여
 *              
 *   - 매개변수 : 사용자 요청값
 *   
 */

import java.util.Scanner;

public class 문제_3 {

	static void process1()
	{
		// 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력:");
		int a=scan.nextInt();
		// 처리
		int [] binary=new int[16];
		int index=15; // 뒤에서부터 출력
		
		while(true) {
			binary[index]=a%2;
			a=a/2;
			if(a==0)
				break;
			index--;
		}
		// 출력
		for(int i=0; i<binary.length;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	
	}
	static void process2()
	{
		// select sort
		// bubble sort
		// api sort Arrays.sort()
	}
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		if((year%4==0)&& (year%100!=0)||(year%400==0))
			System.out.println(year+" 는 윤년입니다");
		else
			System.out.println(year+" 는 윤년이 아닙니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process1();
		process3();
	}

}
