
// 한 개의 정수를 받아 60점이상이면 합겹, 아니면 불합격

import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:"); // 입력
		
		int num=scan.nextInt(); // 저장
		
		// 요청 => 처리
		if(num>=60)
			System.out.println(num + "는 합격 입니다");
		else
			System.out.println(num + "는 불합격 입니다");
	}

}
