package com.sist.game;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  1.컴퓨터 난수 발생 int[] com
 *  2.사용자 입력 int[] user
 *  3.비교 int[] com/ int[] user => s,b
 *  4.힌트 s,b
 *  5.종료여부 확인 s
 */
public class BaseBallGame {
	// 중복적으로 발생하는 정수는 멤버변수로 만든다(전역변수)
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b;
	
	// 1. 컴퓨터 난수 발생
	void rand()
	{
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--; // 중복 없애기, 다음 차례로 넘어가지 않고 다시 뽑기
					break;
				}
			}
		}
	}
	// 2. 사용자 입력 void
	void userInput()
	{
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다");
				continue; // 도스에서만 사용, 웹이나 윈도우에서는 사용안함
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[0]==user[2] ||user[2]==user[1]) {
				System.out.println("같은 숫자는 사용할 수 없다");
				continue;
			}
			if(user[0]==0 || user[1]==0 ||user[2]==0) {
				System.out.println("0은 사용할 수 없다");
				continue;
			}
			break; // 정상입력이 되면 종료
		}
	
	}
	// 3. 비교 void
	void compare()
	{
		s=0;
		b=0;
		for(int i=0;i<com.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(com[i]==user[j]) { // 같은 숫자 있나
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
	}
	// 4. 힌트 void
	void hint()
	{
		System.out.printf("InputNumber:%d%d%d, Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
	}
	// 5. 종료여부 void
	boolean isEnd(int s)
	{
		boolean bCheck=false; // if문 해당사항이 없으면 최기화한 false, 3이 아니면 false
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	// 6. 조립 => process
	void process()
	{
		Scanner scan=new Scanner(System.in);
		rand();
		while(true) {
			userInput();
			compare();
			hint();
			if(isEnd(s)) {
				System.out.println("게임을 다시 시작하겠습니까?(Y/N)");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("새 게임을 시작합니다!!");
					process(); // 재귀호출
				}
				else {
					System.out.println("Game Over~~~~~~");
					System.exit(0); // 시스템 종료
					// break; // while문을 빠져나갈 때 break 사용
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BaseBallGame b=new BaseBallGame();
		b.rand();
		b.process();
	}
	
}
