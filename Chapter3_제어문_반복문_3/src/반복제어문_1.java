/*
 * 반복제어문
 * = break => 반복문을 종료
 * 			=> 반복문(for,do~while,while) , 선택문(switch~case)
 * 			=> break문 밑에는 소스 코딩이 불가능
 *				for() {
 *					if() {
 *					break;
 *					// 코딩이 불가능하다
 *					} 
 *				}
 *
 * = continue => 특정부분을 제외할 때 사용(반복문을 계속 수행)
 * 				=> 반복문(for,do~while,while)에서만 사용이 가능
 * 				=> 웹에서는 특별한 경우에만 사용
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== break =====");
		for(int i=1; i<=10; i++) {
			if(i==5)
				break; // 5가 되면 반복문 중단
			System.out.print(i+ " "); //=> 1 2 3 4
		}
		/*
		 * for => break 종료, continue => 증가식으로 이동
		 * while => break 종료, continue => 조건식으로 이동  ---- 처음부터 다시 실행할 때 / 잘못하면 무한루프
		 */
		System.out.println("\n======= continue ========");
		for(int i= 1; i<=10; i++) {
			if(i==5 || i==7 || i==9) // 5 7 9 sysout 제외
				continue; // i++(증가식)로 이동
			System.out.print(i +" "); // 1 2 3 4 6 8 10
		}
		System.out.println("\n================");
		int i=1;
		while(i<=10) {
			if(i==5)
				continue; // 조건식으로 이동 => 게임: 잘못된 입력이 있는 경우 처음으로 다시 돌아갈 때 주로 사용
			System.out.print(i+ " ");
			i++;
		}
	}

}
