/*
 *  같은 문자열인지 확인하기
 *  => 기본형(== !=)
 *  => 문자열 비교(equals() !equals())
 *  => login => id/password
 */

import java.util.Scanner;

public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="hong";
		final String PWD="H1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		
		// String => 문자열 저장이 아니고 메모리 주소값이 저장이 된다 // 문자열 비교는 ==이 아닌 equals 사용
		// equals => 메모리에 저장되어있는 문자열 비교, 대소문자를 구분한다
		// 예) 로그인, 아이디 찾기, 아이디 중복체크, 비밀번호 찾기
		// 대소문자를 구분하지 않는 기능 ==> equalsIgnoreCase 예) 검색할 경우 
		
		// 로그인 처리
		if(id.equals(ID) && pwd.equals(PWD)) { // equalsIgnoreCase : 대소문자를 구분하지 않는다
			System.out.println(id+"님 로그인 되었습니다");
		}
		else
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
	}

}
