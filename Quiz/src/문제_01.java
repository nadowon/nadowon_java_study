
public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;   
		int b;   
		a=3;   
		b=a+5;       
		System.out.printf("a의 값: %d \n", a); // 3
		System.out.printf("b의 값: %d \n", b); // 8
		
		/*
		 * 1. 메모리 저장
		 * 2. System.out.printf() => JDK 15 => C언어에서 도입 (printf())
		 * 		서식이 있는 출력
		 * 		%d : 정수값
		 * 		%f : 실수값
		 * 		%c : 문자
		 * 		%s : 문자열
		 */
		
		int a1=10;
		double d=10.5;
		char c='A';
		
		System.out.println("a1="+ a1 + ",d=" + d + ",c=" + c);
		System.out.printf("a1=%d b=%.1f c=%c",a1,d,c);
	
	}

}
