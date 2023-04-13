/*
 *  기초
 *   = 변수, 데이터형 (정수: int, byte, long, 실수: double, boolean, char)
 *   = 연산자, 제어문
 *     ----- 단항연산자 (++,--,!,(type))
 *     ----- 이항연산자 (산술,비교,논리,대입)
 *     ----- 삼항연산자
 *     ----- 조건문 (단일 if, 선택 if~else, 다중 if~else if...)
 *     ----- 반복문 (for, while)
 *                 ---- 2차 for문, for-each
 *     ----- 반복제어문 (break)
 *      
 *   = 배열 : 1차
 *   = 문자열 저장 => String
 *     기능 :
 *           JavaScript도 동일
 *         ***1) equals : 문자열 비교
 *            boolean equals(String s)
 *            DB : WHERE name='홍길동'
 *         2) startsWtith : 시작문자열
 *            boolean startsWith(String s)
 *            DB : WHERE name LIKE '홍%'
 *         3) endsWith : 끝문자열
 *            boolean endsWith(String s)
 *            DB : WHERE name LIKE '%홍'
 *         ***4) contains : 포함
 *            boolean contains(String s)
 *            DB : WHERE name LIKE '%홍%'
 *         5) length : 문자 갯수
 *            int length()
 *         6) indexOf : 문자 또는 문자열의 위치 (처음부터)
 *            int indexOf(char)
 *            int indexOf(String)
 *            String s="Hello Java";
 *                      0123456789
 *            s.indexOf('a')
 *            s.indexOf("a")
 *            => 7
 *             *** 문자열은 index번호가 0부터 시작
 *             
 *         7) lastIndexOf : 문자 또는 문자열의 위치 (뒤에서부터)
 *            int lastIndexOf(char)
 *            int lastIndexOf(String)
 *            String s="Hello Java";
 *                      0123456789
 *            s.lastIndexOf('a')
 *            s.lastIndexOf("a")
 *            => 9
 *         8) trim : 좌우의 공백 제거(가운데 공백x)
 *            String trim()
 *         ***9) valueOf : 모든 데이터형을 문자열로 변환
 *            valueOf(1) => "1"
 *            **윈도우 / 웹 => 모든 데이터형이 문자열
 *            static String valueOf(모든 데이터형) : String에서 유일하다 // 나머지는 인스턴스
 *            String.valueOf(1)
 *            -----------------
 *         10) replace() : 변환(문자열, 문자)
 *             String replace(char,char)
 *                            ---- ----
 *                            old → new
 *             String replace(String, String)
 *         11) replaceAll : 변환(문자열)
 *             String replaceAll(String,String)
 *                               ------ regexp => 정규식[가-힣] [A-Z] [a-z] [0-9]
 *             replaceAll("[가-힣]","") => 한글 전체를 없애라
 *         12) substring() : 문자열을 자르는 경우
 *             String substring(int s)
 *             String s="Hello Java"
 *                       0123456789
 *             s.substring(6) => Java
 *             
 *             String substring(int s,int e)
 *             String s="Hello Java"
 *                       0123456789
 *             s.substring(0,5) => Hello
 *                          --- 제외(마지막 1개는 제외 -1)
 *  Class : 설계 => 속성, 기능
 *                ---- ----
 *                 변수  메소드
 *          웹 => 출력 내용 (변수)
 *            => 메뉴, 버튼 클릭 => 기능
 *            --------------------- 요구사항 분석 (설계)
 *         1) 추상화 : 설계 (기능, 데이터) : 사물을 단순화
 *           예) 
 *              사원 : 사번, 이름...(변수)
 *                    출근한다, 퇴근한다...(메소드)
 *         2) class 설계 ====================> 메모리 저장 (인스턴스)
 *                       new(클래스를 저장할 때)
 *                       ** Spring은 new를 사용하지 않는다
 *                       ** new 없이 저장이 가능 => 리플렉션
 *  1. 구성요소
 *     class ClassName : 클래스 선언부
 *     {
 *       --------------
 *        변수(속성)
 *          멤버변수
 *            = 인스턴스변수 => new 사용시마다 따로 메모리를 만든다
 *            = 정적변수 (static) => 한 개의 공간만 생성 => 공유변수 
 *              => 컴파일러에 의해 자동 생성
 *       --------------
 *        ***메소드(동작) : 기능
 *       --------------
 *        ***생성자 : 멤버변수(인스턴스변수)를 초기화할 때
 *               메모리 저장 시 처음으로 호출되는 메소드
 *       --------------
 *     }
 *  2. 구성요소 사용법
 *    1) 메모리에 저장
 *       class Board
 *       {
 *         변수 / 메소드
 *       }
 *       Board a; 선언
 *       a=new Board();
 *       
 *       Board a=new Board();
 *       
 *       class Sin
 *       {
 *        int sabun;
 *        String name;
 *        String getName(){}
 *        int getSabun(){}
 *        void run(){}
 *       }
 *       
 *       Sin a=new Sin();
 *       -----
 *       a.sabun => 100이라는 주소에 있는 sabun의 값을 가지고 온다
 *      ---         . => 메모리 주소 접근 연산자
 *      주소값        new => 데이터메모리를 모아준다
 *                       a
 *             주소값 -----------
 *                  sabun 저장공간 
 *                  name 저장공간
 *                  -----------
 *                  getName() => a.getName()
 *                  getSabun() => a.getSabun()
 *       
 *       
 *  3. 접근범위
 *  4. 객체지향의 3대 요소
 *  5. 클래스의 종류
 *  6. 예외처리
 *  --------------------
 *  API => 지정된 라이브러리 사용법
 *  
 *  class A
 *  {
 *    int aa;
 *  }
 *  class B
 *  {
 *    A a=new A(); => has-a (클래스 안에 클래스 포함)
 *  }
 *  
 *  B b=new B();
 *  b.a.aa
 */
class Student
{
	int hakbun;
	String name;
}
public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		// hong => hakbun,name
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim=hong; // 같은 곳을 제어한다
		shim.hakbun=2;
		shim.name="심청이";
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
		// 같은 메모리라서 hong의 이름은 마지막 심청이 이름을 가진다
	}

}
