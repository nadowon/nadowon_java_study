package com.sist.util;
import java.util.*;
/*
 * subList(int start,int end) => index번호가 start부터 end까지 부분적으로 데이터 복사
 *                                                  ---- end-1
 * ==> 페이지 나누기
 *     addAll() => ArrayList가 가지고 있는 모든 데이터 복사
 *     retainAll() => 두 개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 *     Collections.sort() => ArrayList 정렬
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names1=new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		for(Object name:names1) {
			System.out.println(name);
		}
		System.out.println("================");
		
		ArrayList names2=new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		for(Object name:names2) {
			System.out.println(name);
		}
		System.out.println("=============");
		
		// 원본을 유지할 경우
		ArrayList temp=new ArrayList();
		temp.addAll(names1);
		
		// 교집합 구하기 => retainAll
		temp.retainAll(names2); // temp와 naems2에 같은 데이터를 찾아라
		// 찾은 데이터를 temp에 저장한다
		// 이제 temp에는 중복 데이터만 남는다 
		// names2는 그대로 유지
		
		for(Object name:temp) {
			System.out.println(name);
		}
	}

}
