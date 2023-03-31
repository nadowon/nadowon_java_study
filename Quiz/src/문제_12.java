import java.util.Scanner;
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 두개를 입력하세요:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("뺄샘:" + (a-b));
		System.out.println("곱셈:" + (a*b));
		
		//System.out.printf("뺄셈: %d \n", a-b);
		//System.out.printf("뺄셈: %d \n", a*b);
		
		/*
		 * 1. 변수 : int a,b;
		 * 2. 초기화 : Scanner
		 * 3. 연산처리 : a-b, a*b
		 * 4. 결과 출력
		 * 
		 * 						 연산자			System.out.print
		 * 						  |					  |
		 * 데이터 저장 ========> 데이터 가공 =========> 결과값 출력
		 *     |
		 * 1) 직접 값을 입력 int a=10;
		 * 2) 사용자로부터 입력을 받는다 scan.nextIn()
		 * 3) 난수 Math.random()
		 * ------------------------------ 메모리
		 * 4) 파일에 읽기
		 * 5) 오라클에서 값 읽기
		 * 
		 */
	}

}
