package com.sist.util;
/*
 * List의 메소드
 * 
 *   add, remove, set, size, clear => 기본 메소드
 *   ------------------------------------------
 *   containsAll() => 두 개의 list에서 중복된 데이터를 모아서 관리
 *     => JOIN 
 *   retainAll => 두 개의 list에서 중복된 데이터만 남기기
 *   addAll => 데이터 전체 복사
 *   subList => 부분적 데이터를 복사할 경우
 *   ------------------------------------------------------- 장바구니(중복 구매), 예매
 */
import java.util.*;
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(3); // 0
		list.add(5); // 1
		list.add(7); // 2
		list.add(6); // 3
		list.add(9); // 4
		list.add(2); // 5
		list.add(1); // 6
		list.add(4); // 7
		
		// 출력
		for(Object i:list) {
			System.out.println(i);
		}
		System.out.println("======= 일부만 추가 ========");
		
		// 일부만 추가 subList(start, end) // 실제는 start부터 end-1까지 보여짐
		ArrayList list2=new ArrayList(list.subList(1, 4));
		//                                           --- index 3번까지만 보여짐
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object i:list2) {
			System.out.println(i); // 5 7 6
		}
		System.out.println("======= 순서대로 정렬 ========");
		
		// sort 순서대로 정렬
		Collections.sort(list);
		for(Object i:list) {
			System.out.println(i);
		}
		System.out.println("======= 같은 데이터 추출 ========");
		
		// 같은 데이터만 추출
		System.out.println(list.containsAll(list2)); // list2 전체가 list에 포함이 되느냐
		for(Object i:list) {
			System.out.println(i);
		}
		System.out.println("======= 중복된 데이터 추출 ========");
		
		// 중복된 데이터만 추출 => INTERSECT => 교집합
		System.out.println(list.retainAll(list2)); // list2와 list에 중복된 데이터 추출
		for(Object i:list) {
			System.out.println(i); // 중복된 데이터 추출 // 이제 list에는 5 6 7만 남아있음
		}
		System.out.println("======= add All ========");
		
		// addAll
		ArrayList list3=new ArrayList();
		list3.addAll(list); // list3에 list값을 다 넣어줌
		for(Object i:list3) {
			System.out.println(i); 
		}
	}

}
