import java.util.Scanner;

public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int a=scan.nextInt();
		if(a<0)
			System.out.println("음수");
		else
			System.out.println("양수");
	}

}
