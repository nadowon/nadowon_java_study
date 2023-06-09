/*
 * 1장 자바의 특징
 * ------------------------------------------------------------------------
 * 1) 특징
 *  1. 운영체제의 독립적 (모든 운영체제의 호환성이 좋다)
 *  	예) 윈도우에서 작성 => 리눅스에서 사용이 가능
 *  	C/C++ => 소스 작성 ==> 컴파일 (컴퓨터가 인식하는 언어로 변경)
 *							.obg (운영체제마다 다름)
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *		Java => 소스 작성 ==> 컴파일
 *							.class (운영체제마다 동일한 파일 생성)
 *
 *		** 자바 실행
 *		A.java =======> A.class ========> 실행 화면 출력		
 *				컴파일	 바이트	인터프리터
 *			  (javac)	(2진파일)  (java)
 *
 *		두 번의 검증을 거친다 (보안이 뛰어나다)
 *
 *	***2. 객체 지향 프로그램 (재사용 편리한 상태) => 유지보수 (대규모 프로그램)
 *
 *		**재사용 : 수정, 추가, 데이터보호 (캡슐화) ==> 5장에서 수업
 *		-----------------오버라이딩/오버로딩
 *		포함 (수정할 내용이 없는 경우) => has-a
 *		상속 (수정할 내용이 있는 경우) => is-a
 *
 *	3. 비교적 배우기 쉽다
 *		C/C++에서 파생 => 포인터(메모리 주소), 구조체, 다중 상속, 지원하는 API가 미약
 *		=> 자바언어 => 강력한 API를 가지고 있다 (필요한 기능이 이미 제작)
 *		=> 조립식 (자바 공부 => 직접 구현)
 *
 *	4. 자동 메모리 관리 (가비지 컬렉션)
 *
 *	5. 네트워크/분산/멀티쓰레드 기능을 가지고 있다
 *
 * --------------------------------------------------------------------------
 * 2) 소스 코딩 방법
 *		주석 : // => 번역이 안된다 (프로그래머만 보는 상태)
 *		프로그램은 명령어 (JVM) => ;
 *		대소문자를 구분한다 a/A
 *		{}를 사용
 *		들여쓰기
 *		== 구성요소
 *			***1. 클래스명: 첫 자는 대문자
 *			***2. 변수: 소문자 시작
 *			***3. 상수: 전체가 대문자
 *			4. 메소드: 소문자
 *			5. 생성자: 클래스명과 동일
 *
 *	----------------------------------------------------------------------------
 *	공부
 *	1) 데이터 저장 방법 : 변수 / 상수
 *		--------------- 메모리 저장 (메모리 크기 결정) => 기본형(데이터형)
 *		--------------- 사용자 정의 : 참조형(배열,클래스)
 * 	2) 데이터 가공 : 연산자 / 제어문 ------- 기본 문법
 * 	3) 관련된 데이터를 모아서 관리 : 배열
 * 	4) 관련된 명령어를 모아서 관리 : 메소드
 * 	5) 데이터/명령어를 동시에 관리 : 클래스
 * 	6) 객체 지향 프로그램
 * 	7) 프로그램이 비정상 종료를 방지 / 오류를 처리 = 예외처리 (예: 계산기: 0이 나와도 종료하지 x)
 * 	============================================================================= ***자바기본(책 8장)
 * 	8) 자바에서 지원하는 라이브러리 (책 9장부터는 암기)
 * 
 * 	1-2주: 기본형식
 * 	3주 이후: 활용(알고리즘)
 * 
 * -------------------------------------------------------------------------------
 * 	3) 자바의 구성
 * 		package : 한번만 사용 => 위치
 * 		import  : 기존에 만들어진 클래스를 불러온다 (여러개)
 * 
 * 		class ClassName{
 * 		변수설정
 * 		생성자
 * 		메소드
 * 		public static void main(String[] arg)
 * 		{
 * 		
 * 		}
 * 
 * 	}
 * 
 * ----------------------------------------------------------------------------------
 * 
 * *** 변수
 *	=> 한 개의 데이터를 저장하는 공간
 * 	=> 사용법
 * 		데이터형 변수명=값;
 * 		-----
 * 	=> 변수명 식별자 : 변수 => 같은 이름을 사용할 수 없다
 * 		1) 알파벳, 한글로 시작한다 (알파벳은 대소문자를 구분한다)
 * 			a/A
 * 		2) 숫자 사용이 가능하다 (단, 앞에 사용 금지)
 * 			2a (x) => a2 (o)
 * 		3) 특수문자 사용이 가능 (_,$)
 * 			file_name_ (임시변수, 단어가 2개인 경우 사용)
 * 		4) 키워드는 사용할 수 없다 (자바에서 사용하는 단어)
 * 			=> 빨간색으로 표시
 * 		5) 길이는 제한이 없다 => (3~7)
 * 			변수 => 의미 약간 부여
 * 			사용자의 이름 => name
 * 
 * 		저장 시에는 반드시 앞에 메모리 크기 지정
 * 		기본형(자바에서 지원)
 * 		찹조형(사용자 정의) => 배열/클래스
 * 	-------------------------------------------------
 * 	기본형
 * 	1) 정수 저장 방법
 * 		1byte => byte    byte a = 10; (네트워크 전송, 파일 읽기..)
 * 		2byte => short   short (C언어와 호환)
 * 		4byte => int     int a = 10; (평상시에 사용하는 모든 정수)
 * 						 system.out.prinln(100)
 * 		8byte => long
 * 
 * 	2) 실수 저장 방법
 * 		4byte => float 		  	  => 소수점 6자리
 * 		8byte => double (default) => 소수점 15자리
 * 		10.5(double), 10.5f(float)
 * 
 * 	3) 문자 저장 방법
 * 		2byte => char
 * 		=> 1byte (싱글바이트 => ASC) / 2byte (멀티바이트 => UniCode)
 * 		*** 한국, 중국어, 독일, 일본.. 한 글 당 바이트가 2byte
 * 		byte => bit(8) => 256문자 사용 가능
 * 			 => bit(64) => 65,545문자 사용 가능
 * 		각 문자마다 번호를 가짐
 * 
 * 	4) 논리 저장 방법
 * 		true/false만 저장 => 1byte => boolean
 * 
 * 	5) 자동 지정 (jdk 10이상)
 * 		var a = 10    => a: int
 * 		var b = 10.5  => b: double
 * 		var c = 'A'   => c: char
 * 	
 *  => 저장이 가능한 데이터
 *  	byte = -128 ~ 127
 *  	1byte
 * 		
 * 		128 64 32 16 8 4 2 1(0)
 * 		 0   1  1  1 1 1 1 1    => 64+32+16+8+4+2+1 => 127
 * 		맨 앞: 부호비트 (0:양수, 1:음수)
 * 
 * 		2byte = -32,768 ~ 32,767    => short
 * 		4byte = -21억 4천 ~ 21억 4천  => int
 * 		8byte = 경 단위 (금융권)       => long
 * 
 * 		변수
 * 		데이터형 변수명 = 값;
 * 		-----------------
 * 
 * 		값을 부여 : 크기에 맞게 지정한다
 * 		int 범위보다 작은 값은 가능한데 큰 값은 불가능하다
 * 		long을 사용하더라도 숫자만 넣을 경우 int로 인식해서 숫자 뒤에 L(l)을 붙여준다
 * 		int a = 10.5 ==> 오류
 * 		4byte   8byte
 * 
 * 		*데이터형 크기 순서 (byte 크기 순서와 무관)
 * 		byte < short, char < int < long < float < double
 * 
 * 		형변환 : 큰 범위에서 작은 범위로만 변환 가능
 * 
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		long s = (long)10.5; // 실수를 정수로 변환 (float -> long)
//		
//		int a = 123456;
//		double b = 123456.78;
//		int c =(int)((b-a)*100);
//		
//		System.out.println(s);
//		System.out.println(c); // 77.999라서 77로 나옴
		
		// 모든 숫자는 int 인식
		
		byte byte_value = 127; // -128 ~ 127 *****
		// 127을 byte_value라는 공간에 첨부해라 = 오른쪽에서 왼쪽으로 이동
		short short_value = 32767; // -32,768 ~ 32,767
		// int/long의 구분은 변수에 L(l)
		int int_value = 2140000000; // *****
		long long_value = 100000000000L; // *****
		char char_value = '홍';
		// 정수는 int, 실수는 double을 기본적으로 인식한다 / float을 사용하고 싶다면 변수에 F(f)
		float float_value = 10.5f;
		double double_value = 10.5; // *****
		boolean boolean_value = true; // *****
		
		// 모든 정수는 int
		// 모든 실수는 double
		// 지역변수는 반드시 초기값을 부여한 후에 사용이 가능
		/*
		멤버변수
		공유변수
		--------- 프로그램 종료시까지 메모리 유지 => 자동 초기화
		지역변수
		--------- 블록이 종료되면 사라지는 변수 => 직접 초기화
		
		class A {
		멤버변수/공유변수
		public static void main(String[] arg) {
		지역변수 main(){}안에서만 사용이 가능 => 반드시 초기화
			}
		
		}
		변수 => 변경 가능
		상수 => 변경할 수 없다(고정)
		
		변수 예) 데이터형 변수명 = 값        int a = 10;
		상수 예) 데이터형 변수명 = 값  final int a = 10;
		
		*/
		
		int kor = 100;
		kor = 90; // int를 붙이면 안된다
		kor = 70;
		
		final int SCORE = 70; // 상수는 변수명을 대문자로만 쓴다
		// 자바: = 대입 == 같다 ! 같지않다
		// 자바스크립트: =     ===    !==
		// 오라클: (=)
		
		/*
		 * 선언
		 * int a;
		 * a=10;
		 * 
		 * 선언과 동시에 초기화
		 * int a=10; 
		 * 
		 * int a;
		 * int b;
		 * int c;
		 * => int a,b,c; (데이터형이 같을 경우에만 묶을 수 있다)
		 */
		
		// 자동 지정 변수
//		var d=100; // int d=100;
//		var e=10.5;
//		var f='A';
//		f=97;
//		
//		System.out.println(f);
		// char는 int와 호한
		
		
		// temp 임시변수를 넣어준다
		int a=10;
		int b=20;
		int temp=a;
		a=b; // a=20
		b=temp; // b=10
		
		// 10 + "20" => 1020
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(temp);
		
	}

}
