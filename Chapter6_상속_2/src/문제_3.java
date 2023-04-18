class A
{
	int a=10;
	static int b=20;
	{
		a=100;
		System.out.println(a); // 2
	}
	static 
	{
		b=200;
		System.out.println(b); // 1
	}
	A(){
		a=1000;
		b=1000;
		System.out.println(a+b); // 3
	}
	
}
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		/*
		 * 3.
		 * 인스턴스 변수 : 데이터를 각각 저장시에 사용 kind, num
		 * 정적변수(공유변수) : 공통으로 사용되는 변수 => 메모리가 1개만 생성 width, height
		 * --------------------------------------------------------------------------- 프로그램 종료시까지 메모리 유지(자동 초기화)
		 * 지역변수 : 메소드에서 선언되는 변수 (지역변수,매개변수) k, n
		 *         => 메소드 안에서만 사용
		 *            {}을 벗어나면 사라진다
		 *            반드시 초기화 후에 사용
		 *            
		 *\4. b,e => b,c,e
		 * - 생성자
		 *     1) 모든 생성자의 이름은 클래스명과 동일하다
		 *     2) 생성자는 객체를 생성하기 위한 것이다 (x) => new / 생성자는 초기화 역할
		 *     3) 클래스는 생성자가 없어도 상관없다 => 컴파일러가 자동으로 기본 생성자를 추가한다
		 *     4) 생성자는 오버로딩을 할 수 있다 => 같은 이름의 메소드를 여러개 만들어서 사용 
		 *    * 오버로딩의 조건
		 *     = 한 개의 클래스나 상속 관계의 클래스
		 *     = 메소드명 동일
		 *     = 매개변수의 갯수나 데이터형이 다르다
		 *     = 리턴형은 관계없다
		 *     
		 *     class A
		 *     {
		 *       public void display(){}
		 *       public int display(int a){}
		 *     }
		 *     class B extends A
		 *     {
		 *       //public void display(){}
		 *       //public int display(int a){} => 오버라이딩
		 *       public int display(int a,int b){} => 오버로딩
		 *     }
		 *     
		 * \5. b,d => b
		 * - this
		 *    1) 모든 클래스는 this를 가지고 있다
		 *    2) 객체 자신을 가리키는 참조변수(static Object this) => new
		 *      => this는 생성자, 인스턴스메소드에서 사용이 가능
		 *      class A
		 *      {
		 *        public A(){
		 *        }
		 *        public void display(){
		 *        }
		 *        public static void aaa(){ // this 사용 불가
		 *        }
		 *      }
		 *    3) 클래스 내에서는 어디서든 사용이 가능(x) => static에서 사용 불가
		 *    4) 지역변수와 인스턴스 변수를 구분할 때 사용
		 *      class A
		 *      { // 메모리 공간이 나눠져 있음 
		 *        private String name; => heap
		 *        public void display(String name) => stack
		 *        {
		 *          this.name=name
		 *          --------- ----매개변수
		 *          A클래스에 설정된 변수
		 *        }
		 *      }
		 *    5) 클래스 메소드(static) 내에서는 사용할 수 없다
		 *       인스턴스메소드, 객체메소드
		 *        객체명.메소드
		 *       정적메소드, 공유메소드, 클래스메소드
		 *        클래스명.메소드
		 *       
		 * 6. c,d
		 * - 오버로딩의 조건
		 *    1) 메소드명이 동일(한 개의 이름으로 여러 개의 새로운 기능을 추가)
		 *    2) 매개변수의 갯수나 데이터형이 달라야한다
		 *    3) 리턴형은 관계없다
		 *    4) 매개변수의 이름이 달라야한다
		 *       void display(int a) => display(int)
		 *       void display(int b) => display(int)
		 *       
		 * \7. 메소드, 매개변수, 리턴형->매개변수명
		 * 
		 * \8. a,b => b,c,d
		 *    add(int,int)
		 *    add(long,long)
		 *    add(byte,byte)
		 *    add(long,int)
		 *    
		 * \9. c,d,e => c,e
		 *  - 멤버변수: 인스턴스변수, 정적변수 => 자동초기화
		 *    int=0; double=0.0; boolean=false; String=null;(클래스,배열) null은 참조하는 주소가 없는 경우
		 *    String s=null
		 *    if(s==null)
		 *    
		 *    String s="";
		 *    if(s.equals(""))
		 *  - 지역변수는 자동초기화가 안된다(반드시 초기화 후 사용)
		 *  - 명시적초기화 ->      초기화 블록      -> 생성자  
		 *               클래스변수 -> 인스턴스변수
		 *  - 클래스변수 컴파일 시, new
		 *  
		 * \10. c => a
		 *  - 초기화블럭도 static 다음 instance
		 *  
		 * \11. a,c,e => a,d,e
		 * 
		 * 12. a
		 * 
		 * \13. 멤버변수 메소드 생성자 클래스 => private default protected public
		 * 
		 * 14. c
		 *  - 지역변수는 static, 접근지정어, abstract는 사용이 불가능하다
		 *  - 지역변수 중에 유일하게 사용 : final
		 */
	}

}
