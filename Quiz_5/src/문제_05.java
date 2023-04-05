import java.util.Arrays;
//import java.util.Scanner;

public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		//초기화
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 출력(3의 배수)
		for(int i:arr) {
			if(i%3==0)
				System.out.println(i);
		}
		
//		arr[i]=(int)scan.nextInt();
//		System.out.print("양의 정수 10개 입력:");
//		if(i<0) {
//			System.out.println("양의 정수를 입력하세요");
//			continue;
//		}
//		for(int i=0; i<arr.length; i++) {
//			
//				if(i%3==0)
//					System.out.print("3의 배수만 출력:");
//			}
			
		
	}

}
