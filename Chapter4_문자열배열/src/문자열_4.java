// length() => 문자 갯수 => 예) 비밀번호를 10자리 이상으로 만드시오, length가 1보다 작을 때 다음 단계를 진행하지 못하게 한다(아이디 입력안하고 넘어갈 떄)
// trim() ==> 좌우의 공백을 제거할 때 사용
// javascript와 java 메소드 동일 => Jquery / VueJS / ReactJS

import java.util.Scanner;

public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s=scan.next();
		System.out.println("입력된 값:"+s);
		System.out.println("문자 갯수:"+s.length()); */
		String s="Hello Java!! ";
		System.out.println(s.length()); // 공백도 포함
		System.out.println(s.trim().length()); // 문자의 시작과 마지막 공백만 제거, 가운데 공백x
	}

}
