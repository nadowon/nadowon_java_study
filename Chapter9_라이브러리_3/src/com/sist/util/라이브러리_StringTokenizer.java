package com.sist.util;
import java.util.*;
/*
 * StringTokenizer : 문자열 분리
 *  1) split()로 대체할 수 있다 (but, StringTokenizer가 더 많이 쓰임)
 *  2) 빅데이터 / 네트워크 / 웹 에서 많이 등장한다
 *  ---------------------------------------
 *  
 *   = 생성자
 *     StringTokenizer st=new StringTokenizer("구분할 문자열", 구분자)
 *     StringTokenizer st=new StringTokenizer("구분할 문자열") => 공백
 *     
 *     String s1="애니메이션/어드벤처/코미디";
 *     StringTokenizer st=new StringTokenizer(s1,"/")
 *     
 *     String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
 *     StringTokenizer st=new StringTokenizer(s2)
 *     
 *   = 기능
 *    1) countTokens() : 분리된 데이터 갯수
 *    2) nextToken() : 분리된 데이터 읽기 
 *    3) hasMoreTokens() : 분리된 갯수만큼 루프수행
 */
public class 라이브러리_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="애니메이션/어드벤처/코미디";
		StringTokenizer st=new StringTokenizer(s1,"/");
		System.out.println(st.countTokens());
		System.out.println(st.nextToken()); // 애니메이션
		System.out.println(st.nextToken()); // 어드벤처
		System.out.println(st.nextToken()); // 코미디
		
		String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬"
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
		StringTokenizer at=new StringTokenizer(s2);
		while(at.hasMoreTokens()) {
			System.out.println(at.nextToken());
		}
//		StringTokenizer at=new StringTokenizer(s2);
//		System.out.println(at.countTokens());
//		int a=at.countTokens();
//		for(int i=0;i<a;i++) {
//			System.out.println(at.nextToken());
//		}
	}

}
