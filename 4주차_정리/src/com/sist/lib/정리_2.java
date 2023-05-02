package com.sist.lib;
/*
 * 제네릭(JDK1.5에 도입)
 * => JDK1.8(호환성) ==> 17버전(Spring-Boot), SpringFrame(14버전)
 * 
 * 1) 제네릭이 도입된 이유
 *    => 컬렉션(ArrayList, Set, Map) => 데이터형(매개변수,리턴형) = Object
 *       반드시 형변환 후에 사용
 *       오류 발생이 많다 => 모든 데이터형을 사용할수 있다 => 방지
 *    => 데이터형을 통일화, 데이터형의 안정성 => 데이터 고정
 *    => 데이터형을 명시화 => 가독성이 좋다
 *       List<Object> list=new ArrayList<Object>(); => 가독성이 떨어짐
 *           -------- 생략 가능
 *       List<String> list=new ArrayList<String>();
 *           --------                   --------
 *               |-----------일치------------|
 *       ***기본형은 사용할 수 없다 ==> Wrapper
 *    => 데이터형을 모르는 경우 (와일드 카드)
 *       List<?> list=new ArrayList<String>();
 *           --- => String으로 변경
 *       예)
 *           class Box<T> => 임시클래스 => default (T -> Object)
 *           {
 *           }
 *           Box<String> => Object -> String : 매개변수, 리턴형을 변경
 *           <>안에는 라이브러리 뿐만 아니라 사용자 정의 클래스도 첨부 가능
 *           Box<MovieVO>...
 *           
 *           임시 제네릭
 *           T => 임시 데이터형(클래스형 => type) 사용자 정의 제네릭
 *           E => 임시 데이터형(클래스형 => element) 요소
 *                ArrayList<E>, Vector<E>, LinkedList<E>
 *           K => key(클래스형)
 *           V => value(클래스형)
 *           Map<K,V>
 * -----------------------------------------------------------------------
 * Iterator / ListIterator => 데이터를 모아서 관리
 * -------- hasNext(), next(), remove()
 * -------- hasNext(), next(), remove(), hasPrevious()
 * -------- 순서가 없는 경우 주로 사용 Set, Map
 * ArrayList => for문이 더 나음(index를 가지고 있다)
 */
import java.util.*;
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list=new ArrayList<String>();
//		// 초기화 (값을 첨부)
//		list.add("사과");
//		list.add("포도");
//		list.add("배");
//		list.add("딸기");
//		list.add("참외");
//		// 일반 출력 => for-each
//		for(String s:list) {
//			System.out.print(s+" ");
//		}
//		System.out.println();
//		// 데이터를 모아서 한 번에 출력
//		// 출력이 어려운 경우 => 단방향
//		System.out.println("====== Iterator ======"); 
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}
//		// 위에 한번만 쓰여서 재출력이 안된다
//		System.out.println("\n====== 재출력 ======");
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}
		
		// ListIterator => List에서만 사용이 가능
		//List<?> list=new ArrayList<Integer>();
		
		//List<String> list1=new ArrayList<String>();
		//list1=new ArrayList<Integer>(); ==> 오류
		
//		List<?> list=new ArrayList<String>(); // 지니뮤직에서
//		list.clear();
//		list=new ArrayList<Integer>(); // 멜론으로 바꿀 수 있음
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println("\n============");
//		for(int i=list.size()-1;i>=0;i--) {
//			System.out.print(list.get(i)+" ");
//		}
		
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\n==============");
		while(it.hasPrevious()) { // 거꾸로
			System.out.print(it.previous()+" ");
		}
	}

}
