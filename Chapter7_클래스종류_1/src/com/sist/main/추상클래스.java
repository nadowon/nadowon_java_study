package com.sist.main;
/*
 * 232p.
 * 추상클래스(abstract) => 메소드 관련 (구현이 안된 메소드)
 *                     ------------------------- 상속 관련 (오버라이딩)
 *                     *** 오버라이딩
 *                        => 상속을 받아서 기존의 기능을 변경해서 사용하는 기법(modify)
 *                        => 조건
 *                         1) 상속관계가 존재
 *                           => 추상클래스는 단독으로 사용이 불가능(미완성된 클래스)
 *                           => 사용법은 상속을 내린 후에 상속을 받을 클래스를 통해서 메모리 할당이 되는 상태
 *                              class A
 *                              class B extends A
 *                              => A a=new B();
 *                              => A a=new A(); => 오류
 *                         2) 메소드명 동일
 *                         3) 리턴형 동일
 *                         4) 매개변수 동일 (매개변수가 다른 경우 => 오버로딩)
 *                         5) 접근지정어는 확대 가능, 축소하면 오류 발생
 *                            -------
 *                            private < default < protected < public
 *                        *** 기본 목적: 여러 개의 클래스를 모아서 한 개의 이름으로 제어
 *                                    ------             ----
 *                        *** 프로그램 설계(미완성된 클래스)
 *                           = 요구사항분석
 *                             벤치마킹은 여러 개 사이트를 참조한다
 *                             예) 로그인 => 만개의 레시피
 *                                회원가입 => 망고플레이트
 *                                예약 => CGV
 *                                결제 => 옥션
 *                           = 프로그램에 맞게 구현해서 사용
 *                             예) void getConnection();
 *                               => 데이터베이스 연결
 *                               => 오라클/MS-SQL/MYSQL/MariaDB...
 *                                  ----        --------------
 *                           = 한 개의 객체로 여러 개를 제어하는 프로그램
 *                             예) 게시판
 *                                갤러리게시판
 *                                댓글형게시판
 *                                묻고답하기
 *  
 *  추상클래스 ==> 공통적으로 사용하는 부분(코딩 내용을 다르게 만들 경우)
 *  예)
 *     게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기
 *     묻고답하기 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 답변하기
 *     댓글형 게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 *     후기형 게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 *     
 *     abstract class Board
 *     {
 *       목록출력();
 *       찾기(){} // 찾기 기능은 다 동일하므로 구현을 함
 *       글쓰기();
 *       내용보기(){}
 *       수정하기(){}
 *       삭제하기(){}
 *     }
 *     *** 권장사항 => 한 개이상의 추상메소드를 포함한다
 *                           ------- 구현이 안 된 메소드
 *         abstract void find();
 *         Board content(){}
 *         void wirte(){}
 *         
 *    추상클래스의 특징
 *    1) 단일상속 => extends
 *    2) 메소드가 구현이 안된 것이 있으면 미완성 클래스
 *       => 메모리에 단독으로 저장이 불가능하다
 *       abstract class A
 *       => A a=new A() ==> 오류 발생
 *    3) 상속을 내려서 구현된 클래스를 이용해서 메모리 할당
 *       abstract class A
 *       class B extends A
 *       ------------------ 구현이 안 된 메소드를 구현한다
 *       => A a=new B(); // 묵시적 형변환(자동형변환)
 *          double=10;
 *       => A a=new B();
 *          B b=(B)a; // 명시적 형변환
 *     *** 클래스는 상속관계나 포함관계가 있을 경우 크기를 잴 수 있다
 *         상속을 내리는 클래스 > 상속을 받는 클래스
 *         포함하고 있는 클래스 > 포함되고 있는 클래스
 *         
 *         class A
 *         class B extends A // A>B (is-a)
 *         
 *         class A
 *         {
 *            B b=new B();
 *         }
 *         class B // A>B (has-a)
 *    4) 목적: 관련된 여러 클래스를 묶어서 한 개의 이름으로 관리
 *           --------------
 *             공통적인 기능 예)버스,마을버스,고속버스... ==> 버스로 한번에 묶음(추상클래스)
 *                          개,돼지,말... ==> 동물로 묶음(추상클래스)
 *                          선,네모,삼각형... ==> 도형으로 묶음(추상클래스)
 *    5) 선언된 메소드가 있는 경우 => 상속 시 반드시 구현해야한다 (강제성)
 *    
 */
import java.io.*;
abstract class 도형
{
	// 무조건 구현이 필요하다
	public abstract void draw();
	// 필요에 따라서 오버라이딩을 한다
	public void color() {
		System.out.println("검정색");
	}
}
class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 네모 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("네모를 그린다");
	}
	
}

/*
 * 1. 일반 클래스 => new (o)
 * 2. 추상 클래스 => 구현 후 사용
 * 3. 인터페이스 => 추상클래스와 동일 (o)
 * 4. 종단 클래스 => 상속해서 확장이 불가능
 * 5. static  => 메모리 => 클래스명으로 접근
 * -----------------------------------
 * 
 */
abstract class A
{
	public abstract void aaa(); // 필수로 구현 // 상속 후 오버라이딩 꼭 해야함(강제성)
	public void bbb() {}
	public void ccc() {}
	public void ddd() {}
	public abstract void eee(); // 필수로 구현
}
class B extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오버라이딩 기법
		도형 a=new 선();
		a.draw();
		a=new 원();
		a.draw();
		a=new 네모();
		a.draw();
		//OutputStream out;
	}

}
