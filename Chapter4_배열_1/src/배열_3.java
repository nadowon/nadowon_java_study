/*
 * 	3명의 학생의 국어 영어 수학 => 총점, 평균, 학점, 등수 : 등수 알고리즘
 * 	------------------------------------------ 관련된 것끼리 모으기
 * 
 * - 2차원 배열 => 잘 안쓰이고 컬렉션이 쓰임
 *	 [3]	  [7]
 * 	학생수 학생 한명당 저장개수
 * 
 */

import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열선언
		int[] kor=new int[3];  // 0 1 2
		int[] eng=new int[3];  // 0 1 2
		int[] math=new int[3]; // 0 1 2
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		// Object[][] student=new Object[3][7]; // Object는 모든 데이터를 통합한다
		
		Scanner scan=new Scanner(System.in);
		// 점수
		for(int i=0; i<kor.length; i++) {
			System.out.print((i+1)+"번째 국어점수 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어점수 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학점수 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// 학점
		for(int i=0;i<kor.length;i++) {
			switch((int)avg[i]/10) {
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
				
			}
		}
		// 등수
		for(int i=0; i<kor.length; i++) {
			rank[i]=1;
			for(int j=0; j<kor.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("======= 성적표 =======");
		for(int i=0; i<kor.length; i++) {
			System.out.printf("%-5d %-5d %-5d %-7d %-7.2f %-3c %-5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}

}
