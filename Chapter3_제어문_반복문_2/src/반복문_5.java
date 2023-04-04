// 가위바위보

import java.util.Scanner;

public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0, lose=0, same=0;
	
		while(true) { // for(;;) // 무한루프
			System.out.print("가위 바위 보 종료:");
			// 컴퓨터 난수 발생
			int com=(int)(Math.random()*3);
			int user=scan.nextInt();
			// 종료 조건
			if(user==9) {
				System.out.println("게임 종료");
				break; // while 종료
			}
			// 컴퓨터와 사용자의 가위바위보
			if(com==0)
				System.out.println("컴:가위");
			else if(com==1)
				System.out.println("컴:바위");
			else if(com==2)
					System.out.println("컴:보");
			
			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else if(user==2)
					System.out.println("사용자:보");
			// 결과값 출력
			switch(com-user) {
			case -1: case 2:
				System.out.println("사용자 win");
				win++;
				break;
			case 1: case -2:
				System.out.println("컴 win");
				lose++;
				break;
			case 0:
				System.out.println("비김");
				same++;
				break;
			}
		}
		// while 종료
		System.out.println("결과값");
		int total=win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무 \n", total, win, lose, same);
	}

}
