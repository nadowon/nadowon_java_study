package com.sist.main;
/*
 * 1. 사용처 => 응용
 * ---------------
 * 인터페이스 : 추상클래스의 일종 (보완)
 *   1) 다중 상속
 *   2) 인터페이스는 클래스와 동일 (상속을 받으면 상위클래스다)
 *   3) 설계만 되어있다 (구현이 안된 메소드만 모아서 선언)
 *   4) 장점
 *     = 기능 설계 => 개발시간 단축 ==> 개발기간 8개월
 *       
 *          3개월          1개월
 *       아키텍처(PM)        DBA
 *     = 요구사항 분석 => 데이터베이스 설계 => 데이터 수집
 *       ------------------------------------
 *         추상클래스 / 인터페이스 설계
 *                 => 화면 UI ==> 퍼블리셔       1개월
 *                 => 구현    ==> 웹 프로그래머   2개월
 *                 => 테스팅   ==> 테스터        1개월
 *                 => 배포    ==> PL          1개월
 *                 
 *     = 표준화가 가능 : 같은 메소드를 사용
 *       ---------Spring(통합)
 *       프레임워크 : 세트 ===> 마이버티스, JPA, Jquery, VueJS, React
 *       
 *     = 서로 관계없는 클래스 연결해서 사용이 가능
 *     
 *     = 유지보수가 편리하다
 *       (수정)
 *       
 *     = 독립적으로 사용이 가능
 * --------------------------------------------------------------
 * 클래스 여러 개를 묶어서 한 개의 이름으로 제어가 가능
 *       List(*****) 가변형  Map, Set
 *        |
 *      ----------------------------------------
 *      |            |         |        |      |
 *  ArrayList   LinkedList   Vector   Queue   Stack
 *  
 *   List list=new ArrayList()
 *   list=new Vector()
 *   list=new LinkedList()
 *   list=new Queue()
 *   list=new Stack()
 *   
 *   웹에서 가장 많이 사용하는 라이브러리(3대)
 *   ------------------------------
 *   1. String
 *   2. List
 *   3. Integer(int를 사용하기 편리하게 만든 클래스)
 *      웹/윈도우 => 모든 데이터형 (String)
 *      page=1 => "1" => 1 ==> Wrapper
 *      <input type=text>
 *      JTextField
 *   -------------------------------
 *   
 *   => 형식)
 *      [접근지정어] interface InterfaceName
 *      {
 *         -----------------------------
 *          상수
 *           int a; ==> 오류 발생
 *           (public static final) int a=10;
 *           ---------------------
 *                  자동추가
 *         -----------------------------
 *          추상메소드
 *           (public abstract) void display();
 *           -----------------
 *                 생략
 *         -----------------------------
 *      }
 *      
 *      자동추가되는 경우
 *      1) import java.lang.*; => String, Math...
 *      2) 메소드 => void aaa()
 *                {
 *                   => return;
 *                }
 *      3) 생성자 => class A
 *                 {
 *                   => A(){}
 *                 }
 *      4) 인터페이스
 *         변수 선언 => (public static final) int a=10;
 *                    (public abstract) void display();
 *                    - 구현이 가능한 메소드
 *                    (public) default void aaa(){}
 *         interface는 상수,메소드 => public만 사용한다
 *    => 선언만 되어있다 => 상속을 내린다
 *      => 상속받은 클래스를 구현을 해서 사용 (오버라이딩)
 *    => 다중상속을 지원한다
 *       ------
 *       상속과정
 *       ------
 *       interface A
 *       class B extends A ===> 오류
 *               ------- 확장해서 사용
 *       class B implements A
 *               ---------- 구현해서 사용
 *               
 *       interface ===> interface
 *       interface A
 *       interface B extends A
 *       
 *       interface ===> class
 *       interface A
 *       class B implements A
 *       
 *       class     ===> interface
 *       class A
 *       interface B (       ) A ==> 오류 발생  // 확장 불가능
 *       
 *       interface A 
 *       interface B extends A
 *       class C implements B => 단일 상속
 *       
 *       interface A
 *       interface B
 *       class C implements A,B => 다중 상속, 임플리먼스는 여러개 받을 수 있다
 *       
 *       interface A
 *       interface B
 *       class C
 *       class D extends C implements A,B
 *       
 *       class E extends JFrame implements MouseListener,KeyListener,ActionListener,Runnable)
 *                                 => Game : 마우스 이용,     키보드 이용,     버튼 이용,      쓰레드
 *      247p.
 *      일반메소드에서
 *      interface A
 *      {
 *         (public) JDK1.8이상 =>
 *         (public) abstract default void display(){}
 *      }
 *      
 *      interface A
 *      {
 *        (public abstract) void aaa;
 *      }
 *      class B implements A
 *      {
 *        void aaa(){} => 오류 발생 // void 앞에 public을 추가해줘야함
 *      }
 *      
 *      249p.
 *      1) 인터페이스는 객체를 생성할 수 없다(구현이 안 된 메소드를 가지고 있기 때문에 메모리에 저장이 불가능)
 *         인터페이스=new 구현한 클래스()
 *         => 거짓말이다 (익명의 클래스를 이용하면 객체를 생성할 수 있다)
 *      2) 인터페이스는 다중상속이 가능하다
 *         class A implements 인터페이스, 인터페이스... 
 *         
 */
interface AA // AA aa => a,aaa()
{
	int a=10;
	void aaa();
}
interface BB // BB bb => a,bbb()
{
	int a=10;
	void bbb();
}
class CC implements AA,BB // CC c => a,aaa(),bbb()
{
	// AA.a, BB.a
	public void print()
	{
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb()구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa()구현");
	}
	
}
public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CC c=new CC();
		//c.print();
		CC c=new CC();
		c.print();
		c.aaa();
		c.bbb();
		// aaa(),print(),bbb()
		///////////////////
		AA aa=new CC(); // implements도 extends와 동일하게 적용
		// bbb() 호출을 못한다
		// aaa()
		aa.aaa();
		
		
		BB bb=new CC();
		// bbb()
		bb.bbb();
		
	}

}
