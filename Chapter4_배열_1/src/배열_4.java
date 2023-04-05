// 임의의 정수 10개를 받아서 최대값/최소값 구하기

import java.util.*;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; // 변수 10개 선언과 동일
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		// 1번 출력 : 일반 for
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		// Arrays.toString(arr) 출력 : 배열안에 있는 데이터를 문자로 추출
		System.out.println();
		System.out.println(Arrays.toString(arr)); // [...]
		
		// 2번 출력 : for-each => 배열, 컬렉션 => 데이터 여러 개를 모아서 관리할 때 사용
		// for(int a:arr) // 실제 데이터를 가져올 때
		// 출력용으로 사용 => 웹(브라우저) 제어x
		// Vue, React
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		// 최대값, 최소값
		int max=arr[0];
		int min=arr[0];
		for(int a:arr) {
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	
	}

}
