import java.util.Scanner;

public class 문제_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 세개 입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		// 최대값
		int max= a;
		if(max<b) max=b;
		if(max<c) max=c;
		
		// 최소값
		int min= a;
		if(min>b) min=b;
		if(min>c) min=c;
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("합계:" + total);
		System.out.printf("평균:%.2f", avg);
				
	}

}
