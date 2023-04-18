package com.sist.exam;

import java.util.Scanner;
/*
 * 네트워크 => 접속(사용자 정보) => ip
 */
public class MemberSystem {
	static Member[] members=new Member[10]; // 같은 데이터를 사용한다 // static이 없는 데이터는 메모리를 따로 저장한다
	static int index=0;
	// 오라클 => 모든 데이터가 static
	// 회원가입
	public void join() {
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디,이름,성별 입력(hong 홍길동 남자):");
		members[index]=new Member(); // 메모리값 할당
		members[index].setId(scan.next());
		members[index].setName(scan.next());
		members[index].setSex(scan.next());
		index++;
	}
	public void print() {
		for(Member m:members) {
			if(m!=null) {
				System.out.println(m.getId()+" "
						+m.getName()+" "
						+m.getSex());
			}
		}
	}
}
