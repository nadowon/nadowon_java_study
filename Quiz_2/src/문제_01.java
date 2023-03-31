import java.util.Scanner;

public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int a=scan.nextInt();
		
		if(a>=50)
			System.out.println("50이상입니다");
		else
			System.out.println("50미만입니다");
	}

}
