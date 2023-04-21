package com.sist.exception;
/*
 * 에러 => 컴파일(javac) / 실행 시(java)
 *        -----------    -----------
 *         Check          UnCheck - 예외처리 생략가능
 *           |
 *       자바문법(반드시 예외처리)
 * 에러
 * ---
 *  = Error 수정이 불가능한 에러(심각한 오류)
 *    => 메모리가 부족한 경우, 윈도우에 덤프생긴 경우(파란 창)
 *  = Exception 수정이 가능한 에러(가벼운 오류) : 소스상에서 수정이 가능
 *    => 파일을 읽을 때 파일명이 틀리는 경우, 배열 인덱스를 벗어난 경우, 웹 연결할 때 URL이 틀리는 경우
 *    
 * 에러 발생
 * -------
 *  1. 프로그래머의 실수
 *    => 초기값이 없는 상태에서 비교
 *    => 배열 인덱스 오류
 *    => 무한 루프
 *    => 파일명 오류...
 *    
 *  2. 사용자 입력 오류
 *    => 계산기 나누기 => 0
 *    => 정수 => 문자열...
 *    --------------------- 웹에서는 유효성 검사
 *   
 *    예외처리 : 견고한 프로그램을 만들기 위해 사용
 * (Exception) ------------ 비정상을 방지하고 정상상태 유지
 *             ------------ 사전에 에러를 방지하는 프로그램
 *  
 * 예외처리 방식
 * ----------
 *  = 고려할 점 : if => 예외처리 (if문을 통해서 예외처리를 한다)
 *  = 예외처리 : 복잡한 에러, if문으로 해결이 불가능
 *    웹 에러
 *     404 : 파일이 없는 경우
 *     500 : 소스오류
 *     415 : 한글변환 예) UTF를 UFT로 잘못적은 경우
 *     400 : 값을 잘못 받는 경우
 *     403 : 접속거부
 *     
 * 예외처리 종류
 * ----------
 * 1. 예외발생 시 => 복구
 *    try ~ catch
 *    형식)
 *      try
 *      {
 *         정상수행하는 문장
 *         int a=10;
 *         int b=0;
 *         double d=a/(double)b; ==> 오류 발생 시 catch로 이동
 *         System.out.println(d); // 수행못함
 *         
 *      } catch (NumberFormatException e) // 예외예상1
 *      {
 *         예외발생 시 처리하는 영역
 *      } catch (ArrayIndexOutOfBoundsException e) // 예외예상2
 *      {
 *         예외발생 시 처리하는 영역
 *      } catch (나누기...) // 예외예상3
 *      {
 *         예외발생 시 처리하는 영역
 *      } catch (Exception e) // 기타 오류 잡아줌
 *      {
 *      }
 *      사용자로부터 문자열을 받아서 정수로 변경 후
 *                --------------------- 예외예상1
 *      배열에 저장
 *      -------- 예외예상2
 *      나누기를 한 후 출력
 *      ----- 예외예상3
 * 2. 예외발생 시 => 회피
 *    throws
 * 3. 예외발생(에러발생 시켜버리기) => 테스트
 *    throw
 * 4. 사용자 정의 예외
 *    지원하지 않는 예외가 존재
 *    
 * 예외처리의 계층구조 : 상위클래스일수록 에러잡는 범위가 커진다
 * ---------------
 *              Object
 *                 |
 *             Throwable
 *                 |
 *       ---------------------
 *      |                     |
 *    Error               Exception
 *                            |
 *                    ------------------
 *                   |                  |
 *             CheckException    UnCheckException
 *                  존재x               존재x
 *             (예외처리 반드시)       (예외처리 x)
 *                   |                  |필요 시에만 사용
 *                   |           RuntimeException (밑에 있는 에러를 전부 잡아줌)
 *                   |                  |
 *                   |           NumberFormatException
 *                   |           문자열 => 정수형으로 변경
 *                   |           윈도우/웹
 *                   |            주소란 오류
 *                   |            main.jsp?page=1
 *                   |
 *                   |           NullPointerExecption
 *                   |           객체초기화가 안 된 상태 => 참조할 주소가 없는 경우(선언)
 *                   |
 *                   |           ArrayIndexOfOutBoundsException
 *                   |           배열범위 초과 시 발생
 *                   |           
 *                   |           ArithmeticException
 *                   |           0으로 나눌 경우
 *                   |            
 *                   |           ClassCastException
 *                   |           class 형변환이 틀린 경우 
 *                   |
 *                   |           IllegalArgumentException
 *                   |           부적절한 인자 전달
 *                   
 *                   |           IndexOfOutBoundsException
 *                   |           문자열 관련
 *                   |
 *             IOException(입출력) => 메모리 입출력, 파일 입출력, 네트워크 입출력
 *                                  (java.io => 클래스가 동일)
 *             SQLException(오라클 연동) (java.sql => 네트워크 통신)
 *                                     자바응용프로그램 <============> 오라클
 *                                         (C)                      (S)
 *                                        Client                  Server
 *                                       => 웹에 출력하는 모든 데이터 => 오라클
 *                                       => 자바 ============= 오라클
 *                                                 자바전송 x
 *                                           오라클이 인식하는 언어전송(SQL)
 *                                           SELECT * FROM 테이블명
 *             ClassNotFoundException(리플렉션) => 클래스명이 틀린 경우
 *                                               Class.forName("패키지.클래스명")
 *                                               => .을 안 찍어도 문법상의 오류는 없으나
 *                                                  실행할 때 오류발생
 *             MalformedURLException => URL 주소가 틀린경우 => Jsoup
 *             
 *             InterruptedException => 쓰레드 충돌
 *             
 * 263p.
 * -----
 * 예외의 의미 : 프로그램에서 돌발적으로 (의도하지 않은 상황)에서 문제가 발생 시 처리를 어떻게 할지
 *                               ----------------                ---------------
 *            => 프로그램은 에러 시에 비정상으로 종료
 *            => 방지하고 정상적으로 종료가 가능하게 만드는 과정(예외처리)
 *            
 */
class AAAAA
{
	public void display() {
	System.out.println("A");
	}
}
class BBBBB
{
	
}
class CCCCC extends BBBBB
{
	public void disp(int a,int b,int c)
	{
		System.out.println("1");
	}
	public void disp(int a,char b,byte c)
	{
		System.out.println("2");
	}
	public void disp(char a,char b,int c)
	{
		System.out.println("3");
	}
}
public class 예외처리_1 {
	static String s; // null
	static AAAAA a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("J"))); // IndexOutOfBoundsException
//		a.display();
		//CCCCC cc=(CCCCC)new BBBBB(); // ClassCastException
		CCCCC cc=new CCCCC();
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s \n",10,65,"30");
		System.out.println(10/0); // ArithmeticException
		
		System.out.println("1");
		
		int[] arr=new int[2];
		arr[2]=10; // ArrayIndexOfOutBoundsException
		
		System.out.println("2");
		
		if(s.equals("Hello")) {
			System.out.println("ok");
		} // NullPointerExecption
		
		System.out.println("3");
		
		int a=10;
		int b=0; // 사용자로부터 값을 받았을 때
		// 처리
		if(b!=0) { // 정상수행 ==> try
		int c=a/b;
		System.out.println("c="+c);
		}
		else { // 예외처리 ==> catch
			System.out.println("0으로 나눌 수 없다");
		}
		// 1. 정상적으로 종료가 되게 만든다
		// 2. 우선적으로 if문으로 처리가 가능한지 여부 --> 불가능하다면 자바에 제공하는 예외처리를 이용한다
		// 3. if문은 주로 (검색용도, 사용자 입력 제한...)에서 사용
		
		String page="1";
		System.out.println(Integer.parseInt(page));
	}

}
