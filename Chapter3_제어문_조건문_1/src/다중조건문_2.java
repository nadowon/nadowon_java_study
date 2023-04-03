/*
// 성적 계산 => 순위, 정렬 ...
// 세 개의 정수를 받아서 평균을 구해서 => 등급을 출력하시오
// 다중조건문 사용
 * 
 * 
 * Web 개발 / 호스팅 (AWS) => 운영체제와 고정 IP를 빌려서 PaaS
 * ----------------------------------------------------------
 * Java: 데이터 관리
 * Oracle: 데이터 저장(공유)
 * HTML/CSS: 브라우저에서 인식하는 언어
 * JavaScript: 동적(클라이언트)
 * ------------------------------ 라이브러리 Spring / MyBatis / JPA => ReactJS / Ajax / VueJS
 * 
 * HTML ----- Java(둘 사이를 이어주는 역할) ----- Oracle
*/

import java.util.Scanner;

public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in 키보드 입력값 => 입력값을 받아서 메모리에 저장해주는 역할
		// 정수: nextInt(), 실수: nextDouble(), nextBoolean()
		// 문자열: next() => char는 존재하지 않는다
		// Scanner는 도스에서만 사용이 가능 (웹에서는 사용x)
		Scanner scan=new Scanner(System.in);
		System.out.print("세 개의 정수 입력:");
		
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		System.out.println("국어점수"+kor);
		System.out.println("영어점수"+eng);
		System.out.println("수학점수"+math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f \n",(kor+eng+math)/3.0);
		
		// 학점 계산
		char score ='F'; // 값이 변경이 없는 경우에 처리되는 값(default)
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else // 생략이 가능
			score='F';
		
		System.out.println("학점:"+score);
		
	}

}
