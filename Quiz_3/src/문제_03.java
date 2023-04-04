import java.util.Scanner;

public class 문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		if(a<0) 
			System.out.println(-a);
		else
			System.out.println(a);
		
		// System.out.println(Math.abs(a));
	}
	
}
