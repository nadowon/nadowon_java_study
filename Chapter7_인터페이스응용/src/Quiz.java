
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 *\1. 1 // 인터페이스는 다중 구현
	 *  1) 자바는 단일상속
	 *     자바(class => 상속, interface => 구현)
	 *         단일상속         다중구현
	 *  2) class A
	 *     {
	 *       void display(){} // 상위클래스의 코드가 기존에 있는 기능
	 *     }
	 *     class B extends A
	 *     {
	 *       // void display(){} // 하위클래스의 코드 변경시 재정의를 한다는 뜻
	 *     }
	 *   3) private는 상속은 가능하나 접근이 불가능하다
	 *      자바 상속은 내리...
	 *      static, 생성자, 초기화블록 (상속x)
	 *      private(상속o, 접근x) => 상속의 예외조건
	 *   4) final이 붙어있으면 있는 그대로 사용한다(확장,변경x)
	 *      예) String, Math, System
	 *      
	 * 2. 2 (항상이란 단어가 틀림)
	 *   1) class A
	 *      class B extends A => A a=new B(); B b=new B(); => A,B
	 *      
	 * 3. 1
	 *   Final => 상수변수 예) String, Math, System
	 *   Static final => 변수
	 *   final 클래스는 상속이 불가능하므로 부모클래스가 될 수 없다
	 *   
	 * 4. 4
	 *   2) 축소가 불가능하다
	 *   4) protected는 상속조건이 있을 경우 다른 패키지에 접근 가능
	 * 
	 * 5. 
	 *   이유 1) 생성자는 상속이 되지 않는다
	 *   이유 2) Child c=new Child("",1) -> 상위클래스의 기본 생성자가 호출된다
	 *   해결) 기본생성자를 포함시켜야한다, 부모클래스에 public Parent(){} 추가
	 *   
	 * 6. 2
	 *   class A
	 *   class B extends A
	 *   class D extends B
	 *   class E extends B
	 *   ------------------
	 *   A a=new A()
	 *   A a=new B()
	 *   B b=new B()
	 *   B b=new D()
	 *   B b=new E()
	 *   -----------
	 *   B b=(B) new A (x) => ClassCastException
	 *   => A가 가지는 메소드를 가져온다 => 정의하지 않는 값을 들고온다
	 *   --------------
	 *   A a=new B()
	 *   B b=(B)a;
	 *   => B가 가지는 메소드를 가져온다?
	 *   
	 * \7. 2 => 3
	 *   인터페이스는 상수형변수만 가지고 있다
	 *   public static final =>공유
	 *   변수 = 필드 = 속성 (같은말)
	 *   
	 * 8. 4
	 *   interface A
	 *   Class C implements A
	 *   A a=new C();
	 *   C c=(C)a;
	 *   A a=c;
	 *   class 사람 implements 동물 => 동물도 사람도 될 수 있다
	 *   4) 자동으로 상위클래스 타입으로 변환된다
	 *   
	 * 1. 4
	 *   3) A a=new A()
	 *      A b=a
	 *      if(a==b)
	 *   4) A a=null;
	 *   
	 * \2. 2 => 3
	 *   2) 
	 *     - 정적영역
	 *         Method Area / static
	 *     - Stack(메모리 자체 관리)
	 *         지역변수 / 매개변수  => {} 이 종료되면 자동 소멸
	 *     - Heap(주소를 참조하는 영역)
	 *         객체 / 배열 / 인터페이스 / 열거형
	 *         => 사용이 없는 경우, null인 경우 => 프로그래머 영역 (GC)
	 *     ====================================================
	 *     => 정적영역, Stack, Heap을 전체 관리: JVM
	 *   3) 자동소멸 => 자동 메모리 회수를 이용한다(GC) 예) 멀티미디어 프로그램(화상채팅, CCTV, 스트리밍서비스)
	 *         
	 * 3. 2
	 *   1) 
	 *      String은 클래스형(참조타입)
	 *      => 메소드
	 *      => 문자열 데이터형, 클래스 참조형
	 *   2) 
	 *      문자열의 비교는 equals()를 사용한다 (실제 저장된 문자열)
	 *      문자열에서 ==을 사용할 경우 주소값을 비교하게 된다
	 *      String s="Hello";
	 *      String s1=new String("Hello");
	 *      if(s==s1) => false
	 *      if(s.equals(s1))
	 *   3) 
	 *      String s1="Hello"; => 문자열 자체가 주소
	 *      {'H','e','l','l','o'}
	 *      String s2="Hello";
	 *      if(s1==s2) => true => 동일한 객체
	 *      
	 *      문자열 비교 equals
	 *      주소 비교 ==
	 *      문자열이 같으면 동일한 객체
	 * 6.
	 *    다중 상속/단일 상속
	 *    모든 메소드 변수 => public
	 *    여러 개의 클래스를 모아서 관리
	 *    
	 * 7. 다중구현/단일구현
	 * 
	 * 8.
	 *    인터페이스의 장점(기능은 없고 클래스를 연결해준다 : 리모컨 역할)
	 *    - 표준화 가능
	 *    - 서로 다른 클래스 연결
	 *    - 독립적 사용
	 *    - 개발시간 단축
	 * \9. a => e
	 *    e) 패키지간의 연결 => import
	 *    
	 * \10. a => d
	 *    a) 필드=멤버변수 => 자동초기화된다
	 *       int => 0 , double => 0.0, boolean => false, String => null
	 *    b) 클래스에 생성자가 없을 경우 컴파일러가 자동으로 기본 생성자 추가
	 *    c) 생성자의 역할
	 *       = 객체 생성시에 호출 (생성자는 반드시 한 개 이상이 필요하다)
	 *       = 멤버변수에 대한 초기화
	 *       = 클래스명과 동일하다/리턴형이 없다/접근지정어는 보통 public
	 *       = 오버로딩을 지원한다(여러 개의 생성자가 있을 수 있다)
	 *       = 초기화
	 *         1) 명시적 초기화
	 *         2) 구현 후 초기화값 대입 => 파일읽기, 제어문 이용, 데이터베이스 이용
	 *           - 초기화 블록
	 *           - 생성자 => 사용빈도 많음
	 *    d) 
	 *       public class ClassName
	 *       {
	 *          멤버변수
	 *          생성자    =>   순서는 자유(권장)
	 *          메소드
	 *       }
	 *      class 설계 순서는 상관없다
	 *           
	 * 11. b
	 *   a) 자바의 모든 클래스는 Object로부터 상속을 받는다
	 *      Object는 모든 데이터형의 가장 큰 데이터형이다
	 *      라이브러리에서는 주로 매개변수/리턴형 => 반드시 형변환을 해야한다
	 *      class A 
	 *      {
	 *         int a,b,c
	 *         public void(){}
	 *      }
	 *      Object o=new A();
	 *      // Object 클래스가 선언됐으므로, Object의 값만 가져올 수 있다
	 *      
	 * 12. c
	 *    private 변수를 사용하고 싶다면 getter/settter 사용
	 * 13. oooo public
	 *     ooox protected
	 *     ooxx default
	 *     oxxx private
	 * 14. public void number
	 * 15. c
	 * 16. implements A
	 * \17. extends -> implements
	 *     new Printable(); -> 삭제
	 *     void print -> public void print
	 * 18. 오버로딩/오버라이딩
	 */
	}

}
