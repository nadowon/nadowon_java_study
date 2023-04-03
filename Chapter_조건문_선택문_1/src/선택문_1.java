/*
 * switch ~ case
 * => 범위를 지정하는 것이 아니라 특정값으로 설정
 * => 사용이 가능한 특정값은 char(문자''), int(정수), String(문자열"")
 * => 많이 사용되는 위치: 게임(키보드별 처리), 메뉴, 네트워크(기능별 처리)
 * 						웹 ==> 화면 전환 (클릭하면 화면바꾸는 기능)
 * 
 * 	=> 형식)
 * 		switch (문자)
 * 				 B => 문장2, 문장3, 문장4 (break가 들어가면 문장2까지만)
 * 		{
 * 			case 'A': // (정수)case 1:  (문자열)case "login"
 * 				문장 1
 * 				break; // switch 종료
 * 			case 'B':
 * 				문장 2
 * 				break;
 * 			case 'C':
 * 				문장 3
 * 				break;
 * 			default:
 * 				문장 4 ==> A,B,C가 아닌 경우에 처리 => 생략 가능
 * 		}
 * 
 * 
 */
import java.util.Scanner;

public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====메뉴=====");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피 만들기");
		System.out.println("6.프로그램 종료");
		System.out.println("============");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 클릭:");
		
		int menu=scan.nextInt();
		switch(menu) {
			case 1:
				System.out.println("로그인을 요청하셨습니다");
				break;
			case 2:
				System.out.println("회원가입을 요청하셨습니다");
				break;
			case 3:
				System.out.println("로그아웃을 요청하셨습니다");
				break;
			case 4:
				System.out.println("맛집추천을 요청하셨습니다");
				break;
			case 5:
				System.out.println("레시피 만들기를 요청하셨습니다");
				break;
			case 6:
				System.exit(0); // 프로그램 완전 종료 // 0이면 정상종료, 다른 번호면 비정상 종료
			default: // 없는 메뉴 선택시에 => else
				System.out.println("메뉴에 없는 번호입니다");
		}
		
	}

}
