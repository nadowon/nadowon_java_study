package com.sist.util;
/*
 *  라이브러리
 *  = 자바에서 지원
 *    java.lang, java.util, java.io, java.net, java.text, java.sql
 *    => 웹: java.xml, javax.servlet
 *  = 외부업체에서 지원
 *    Jsoup(HTML parse), 셀레니움
 *    MyBatis, Spring, DBCP...
 *  =======================================================================  
 *  java.lang
 *  ---------
 *    import 생략
 *    Object, String, System, Math, StringBuffer
 *    
 *   = Object : 최상위 클래스, 모든 데이터형을 받을 수 있다
 *              저장 => 일반 기본형, 사용자 정의 클래스 => 기본적으로 Object로 설정
 *              주요기능
 *               1) clone() : 복제(새로운 메모리 생성) => 디자인 패턴(GOF 23)
 *                  finalize() : 소멸자 (자동호출 => 메모리해제)
 *                  toString() : 객체를 문자열화
 *                  equals() : 객체 비교 (기본은 객체의 주소값)
 *   = System : gc()
 *              System.out, System.in => 표준 입출력
 *   = Math : 수학
 *            round() : 반올림
 *            ceil() : 올림
 *            random() : 난수 (임의의 수 추출)
 *   = StringBuffer : 문자열이 많은 경우 (제어)
 *                    append() : 문자열 결합
 *                    delete() : 문자 제거
 *                    insert() : 문자열 추가
 *                    ------------------------- String에 존재하지 않는다
 *   = String : 문자열을 쉽게 제어가 가능하게 만든 클래스
 *              => 웹, 윈도우, 빅데이터(AI)
 *              => equals(), trim(), substring(), length(), valueOf(), contains(),
 *                 startsWith(), split(), replace(), replaceAll()
 *  ================================================================================
 *  java.util : 사용빈도가 많다
 *  ---------
 *   = StringTokenizer : 문자열 분리(쉽게 분리)
 *     - counterToken() : 분리된 단어의 갯수
 *     - hasMoreToken() : 분리된 갯수만큼 반복문 수행
 *     - nextToken() : 실제 분리된 단어 읽기
 *     
 *   = Wrapper : 기본형을 클래스화 (기능을 수행)
 *     -------
 *      Integer => int
 *      Double  => double
 *      Boolean => boolean
 *      Long    => long
 *     ------------------- --parseInt(), parseDouble(), parseBoolean(), parseLong()
 *      => 웹은 무조건 데이터가 String
 *                String
 *      => 요청  ===========> 요청처리 (응답)
 *      => 기본형 / Wrapper는 호환
 *         Integer i=10; ====> 실제 값(리턴형) 대입 가능
 *         ------------- 오토박싱(박싱)
 *         int a=new Integer(10) ====> 기본형에서 클래스 객체 값을 받을 수 있다
 *         --------------------- 언박싱
 *         
 *   = Random
 *     - nextInt(int bound)
 *        nextInt(10) => 0~9
 *        
 *   = Arrays : 배열을 쉽게 관리할 수 있다
 *     - sort() : 정렬
 *     - toString() : 배열 출력
 *     - asList() : List형 변환
 *     
 *   = 날짜 관련
 *     - Date : 기능이 없다 => 다른 프로그램과 호환
 *              오라클/MySQL에서 전송된 날짜 데이터를 받는 경우에 사용
 *              날짜 저장용으로 주로 사용
 *     - Calendar : 날짜에 대한 기능이 필요할 때 사용
 *                  Date를 보완한 클래스
 *                  날짜 설정
 *                  -------
 *                   set() : 년도/월/일/시간/분/초
 *                   get()
 *                   요일읽기 => get(Calendar.DAY_OF_WEEK)
 *                   각 달의 마지막 날 => getActualMaximum
 *                   
 *   ***** 웹의 3대 클래스 : String, Integer, List
 *   
 *   = 컬렉션 : 배열을 대체
 *             데이터를 쉽게 관리 => 10개(자동으로 저장공간이 설정)
 *             Collection
 *                 |
 *           -------------
 *           |           |
 *          List        Set      Map => 인터페이스
 *           |           |        |
 *      *ArrayList   *HashSet  *HashMap
 *       Vector       TreeSet   Hashtable
 *       LinkedList-Queue
 *       ==> 제네릭스
 *     -------------------------------------------
 *       List : 순서가 있고 중복이 있다 예)데이터베이스
 *       Set : 순서가 없고 중복이 없다
 *       Map : 데이터는 중복되나 키는 중복이 안된다 예) 우편번호
 */
// Calendar 응용
import java.util.*; // Calendar와 Scanner 둘다 써야하기 때문에 *로 받는다
public class 라이브러리_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 년도/월을 받는다 => 예약 / 체크인 / 체크아웃 => 달력
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 월 입력(2023 4):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		// 1일자의 요일을 가져온다 (4를 입력하면 => 4월 1일의 요일 가져옴)
		Calendar cal=Calendar.getInstance(); // static 메소드
		// 추상클래스는 미완성된 클래스 (메소드가 구현이 안 된 상태)
		// 구현한 클래스를 이용한다, 싱글턴-메모리를 하나만 사용 (newInstance(),getInstanc())
		/*
		 * static => 클래스명.메소드명()
		 * Math.random()
		 * 클래스명 객체명=new 생성자()
		 * ------          ------- 동일 => 일반 클래스
		 * ------          ------- 다름 => 추상클래스 / 상속 / 인터페이스
		 * 클래스명 객체명=메소드() => 추상클래스
		 */
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // month는 0부터 시작
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1; // week는 1부터 시작
		// 입력 달의 마지막 날 구하기
		int lastday=cal.getActualMaximum(Calendar.DATE);
		// 달력 출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday;i++) {
			// 맨 처음 => 공백을 설정
			if(i==1) { 
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			// 달력 출력
			System.out.printf("%2d\t",i);
			week++; // 0 ~ 6
			// 일요일이면
			if(week>6) { 
				week=0; // 일요일 설정
				System.out.println(); // 다음 줄에 출력
			}
		}
	}

}
