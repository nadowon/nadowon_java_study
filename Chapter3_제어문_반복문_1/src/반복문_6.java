import java.util.Scanner;

// up down 게임
/*
 * 	컴퓨터 난수 발생 (1 ~ 100 사이의 난수)
 * 	=> 사용자 입력
 * 	=> 입력 시에 힌트
 * 	=> for문 횟수?
 * 		=> 무한루프 : for(;;) = . while(true)
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		for(;;) { // 무한루프 => whlie문 => 종료시점
			System.out.print("1~100까지 사이의 정수 입력:");
			int user=scan.nextInt();
			// count++; // 정상적인 종료, 비정상적인 종료 둘다 세겠다는 의미
			if(user>=1 && user<=100) {
				count++; // if 안에 있다는 것은 정상적인 종료만 횟수를 세겠다는 의미
				// 힌트
				if(com>user) {
					System.out.println("up");
				}
				else if(com<user) {
					System.out.println("down");
				}
				else if(com==user) {
					System.out.println("Game Over!");
					System.out.println("입력 횟수:"+count);
					System.exit(0);
				}
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}
	}

}
