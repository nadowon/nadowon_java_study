import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// 정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값/최소값 ==> 위치
/*
 * 		1 2 3 4 5 6 7 8 10 9
 * 		---------------------
 * 		max=10 ==> [8]
 * 		min=1  ==> [0]
 * 
 * 		=> 영화 (용도가 다르면 배열 따로) => 같은 인덱스번호로 묶는다
 * 		제목
 * 		포스터
 * 		장르
 * 		감독
 * 		개봉일
 * 		출연진
 * 		순위
 */

public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 최대값
		int max=arr[0];
		// 최소값
		int min=arr[0];
		for(int i:arr) {
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		// 위치
		int index1=0, index2=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				index1=i; // i가 인덱스 번호
			}
			else if(arr[i]==min) {
				index2=i;
			}
		}
		System.out.println("최대값 위치:"+(index1+1));
		System.out.println("최소값 위치:"+(index2+1));
	}

}
