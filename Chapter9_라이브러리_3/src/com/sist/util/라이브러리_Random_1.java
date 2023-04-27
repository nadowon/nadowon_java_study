package com.sist.util;
import java.util.*;
public class 라이브러리_Random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳 난수 발생
		char[] alpha=new char[10];
		Random r=new Random();
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)(r.nextInt(26)+65);
		}
		System.out.println(Arrays.toString(alpha));
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
		
		// 325p. 성적 구하는 방식
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)(r.nextInt(5)+65);
			if(alpha[i]=='E')
				alpha[i]='F';
			System.out.println((i+1)+"번 학생 성적:"+alpha[i]);
		}
	}

}
