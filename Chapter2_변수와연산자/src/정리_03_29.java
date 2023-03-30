/*
 * 4p : 자바 실행과정
 * A.java ==========> A.class ==========> 화면에 결과값 출력
 * 		  컴파일(javac)		 인터프리터(java) ==> 동시에 처리 (ctrl + f11)
 * 
 * 5p : 운영체제가 독립적이다 (운영체제마다 같은 번역을 한다)
 * 
 * 19p
 *  1) 파일명과 클래스명이 동일해야된다
 *  2) 가급적이면 한 개의 파일에 한 클래스 사용을 권장한다
 *  3) 클래스명은 대문자
 *  4) 실행 => main
 *  
 *  자바에 화면 출력 메소드
 *  -----------------
 *  System.out.print() => 옆에 출력
 *  *** System.out.println() => \n 다음 줄에 출력
 *  System.out.printf() => 출력형식을 만들 경우
 *  
 *  22p : 들여쓰기
 *  // 어떤 코드 작성했는지
 *  {
 *  
 *  }
 *  
 *  23p 주석 : 번역이 안되는 파트 //
 *  
 *  25p 변수 => 한 개의 데이터만 저장하는 메모리 공간
 *  		=> 데이터 값을 변경할 수 있다
 *  
 *  26p 변수 선언 규칙
 *  		데이터형 변수명 = 초기값
 * 		예)   int    a   = 10
 *  
 *  
 *  
 *  
 */
public class 정리_03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a ='A';
		char op = '+';
		System.out.println(a+op); // int로 나옴 a의 숫자, +의 숫자
		System.out.println(a+""+op);
	}

}
