
// do ~ while => 후조건, 무조건 한 번은 수행
/*
 * 	1. 초기화
 * 	2. 게임
 *
 *	형식)
 *		초기값
 *		do { 1
 *			반복 실행문장 2
 *			증가식 3
 *		} while(조건식); 4 => 증가된 변수로 조건검색
 */

import java.util.Scanner;

public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1~10
		int i=1;
		do {
			System.out.print(i+ " ");
			i++;
		} while(i<=10);
		System.out.println("\n==================");
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		int dan= scan.nextInt();
		i=1;
		do {
			System.out.printf("%d * %d = %-2d \n", dan, i , dan*i); // %2d: 두자리를 사용하겠다 %-2d: 앞의 두자리를 사용하겠다
			i++;
		} while(i<=9);
		
		System.out.println("=============================");
		System.out.println("===========for============");
		i=10;
		for(i=10; i<10;i++) {
			System.out.println("i="+i);
		}
		System.out.println("===========while============");
		i=10;
		while(i<10) {
			System.out.println("i="+i);
			i++;
		}
		System.out.println("===========do while============");
		i=10;
		do {
			System.out.println("i="+i);
			i++;
		} while(i<10);
	}

}
