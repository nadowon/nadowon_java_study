
public class 문제_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b); // 8 // %d는 정수 .2f는 실수
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  // 4
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  // 12
	    System.out.printf("나누기 연산 결과: %d \n", a/b); // 3
	    System.out.printf("나머지 연산 결과: %d \n", a%b); // 0
	    
	    /*
	     *  + (산술,문자열) 왼---->오
	     *  / 0으로 나눌 수 없다, 정수/정수=정수
	     *  % 결과값의 부호는 왼쪽을 따라간다
	     *  
	     */

	    System.out.println("-------------------");
	    
	    int num1, num2;   
	      num1 = 10/3;
	       // '몫' 출력   
	      num2 = 10%3;
	       // '나머지' 출력
	   System.out.printf("   몫: %d \n", num1);   // 3
	   System.out.printf("나머지: %d \n", num2);   // 1
	   
	   

	}

}
