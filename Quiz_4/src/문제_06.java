import java.util.Scanner;

public class 문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 두개 입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=1;
		
		for(int i=a; i<=b; i++) {
			c*=i;
		}
				System.out.println(c);
	}

}
