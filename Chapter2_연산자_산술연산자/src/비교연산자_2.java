// 조건문 (if)

public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// char는 연산시에 정수로 변경 후 처리
		char c1=(char)((Math.random()*26)+65); // 'A'는 65 B 67 C 68
		char c2=(char)((Math.random()*26)+65); // 'a'는 97 b 98 c 99
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		
		boolean b1 = c1==c2;
		System.out.println("b1=" + b1);
		
		b1 = c1!=c2;
		System.out.println("b1=" + b1);
		
		b1 = c1>c2;
		System.out.println("b1=" + b1);
		
		b1 = c1<c2;
		System.out.println("b1=" + b1);
		
		b1 = c1>=c2;
		System.out.println("b1=" + b1);
		
		b1 = c1<=c2;
		System.out.println("b1=" + b1);
		
	}

}
