// 중첩 switch
/*
 * // 특별한 경우가 아니면 거의 사용빈도가 없다
 * switch 중첩
 * switch() {
 * 	  case 값:
 * 		switch() {
 * 		}
 * 	}
 * ----------------------
 * 	if문 중첩
 * 	if() {
 * 		if() {
 * 		}
 * 	}
 * 
 */

// 가위바위보

import java.util.Scanner;

public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터가 먼저 가위바위보 설정
		int com=(int)(Math.random()*3); // 0 가위 1 바위 2 보
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("가위 바위 보 입력:");
		int user=scan.nextInt();
		// 출력
		switch(com) {
			case 0:
				System.out.println("컴퓨터:가위");
				break;
				// break 밑에는 소스 코딩이 불가능하다 오류 발생 / break 밑에 sysout 적용 안됨
			case 1:
				System.out.println("컴퓨터:바위");
				break;
			case 2:
				System.out.println("컴퓨터:보");
		} switch(user) {
			case 0:
				System.out.println("플레이어:가위");
				break;
				// break 밑에는 소스 코딩이 불가능하다 오류 발생 / break 밑에 sysout 적용 안됨
			case 1:
				System.out.println("플레이어:바위");
				break;
			case 2:
				System.out.println("플레이어:보");
	}
		
		// 비교(처리과정) => 결과값 출력
			switch(com) {
				case 0: {
					switch(user) {
					case 0:
						System.out.println("비겼다!");
						break;
					case 1:
						System.out.println("사용자 win");
						break;
					case 2:
						System.out.println("컴퓨터 win");
						break;
					}
				}
				break;
			case 1: {
				switch(user) {
				case 0:
					System.out.println("비겼다!");
					break;
				case 1:
					System.out.println("사용자 win");
					break;
				case 2:
					System.out.println("컴퓨터 win");
					break;
				}
			}
				break;
			case 2:  {
				switch(user) {
				case 0:
					System.out.println("비겼다!");
					break;
				case 1:
					System.out.println("사용자 win");
					break;
				case 2:
					System.out.println("컴퓨터 win");
					break;
				}
			}	
		}
			
			// 변수 설정 => 변수에 대한 처리(연산자, 제어문) => 결과값 출력
		
	}

}
