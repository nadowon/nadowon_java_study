package com.sist.string;
// concat : 문자열 결합 (+)
/*
 * String concat(String s)
 * String s1="Hello ";
 * String s2="Java";
 * s1.concat(s2) ==> "Hello Java";
 * 
 * ===> concat ==> MySQL LIKE문장을 만들때
 *      WHERE name LIKE CONCAT('%','홍','%')
 *      WHERE name LIKE '%'||홍||'%' => 오라클은 순수하게 더하기만 함, 문자열 결합 안함
 */

// endsWith : 끝나는 문자열이 같은 경우에 사용
/*
 * boolean endsWith(String s)
 */

/*
 * charAt()
 * equals() 대소문자 구분 - ID,PWD / equalsIgnorcase() 대소문자 구분x - 영어검색, 영문이름
 * indexOf() 문자나 문자열의 위치확인 - 앞에서부터 찾기 / lastIndexOf() - 뒤에서부터 찾기
 * length() 문자의 갯수
 * startsWith() 시작문자열이 같은 경우 => 서제스트 (검색할 때 그 문자를 포함한 관련된 여러가지 단어가 뜸)
 * substring() 원하는 문자열을 자르는 경우
 * trim() 앞뒤 공백 제거
 * split() 특정문자로 자르는 경우
 * contains() 포함문자열인지 확인
 * valueOf() 모든 데이터형을 문자열로 변환
 */
public class 라이브러리_String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="Hello "; // 공백도 문자다
//		String s2="Java!!";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		if(s2.endsWith("!!"))
//			System.out.println("!!자로 끝난다");
//		else
//			System.out.println("!!자로 끝나지 않는다");
		
		// equals는 대소문자를 구분해서 비교 
		// 원형 : boolean equals(String s)
		// 라이브러리를 사용할 때 고려해야할 점 : 1) 기능 -비교 2) 리턴형 -boolean 3) 매개변수 -String 4) 사용처 -로그인,상세보기
		String[] data= {"JAVA","java","Java","JAva","JAVa","jaVA","javA"};
		for(String s:data) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		
		// equalsIgnorcase는 대소문자를 구분하지 않고 비교
		// 원형 : boolean euqalsIgnoreCase(String s)
		// 사용처: 검색, 영문이름, 영문으로 된 데이터를 찾는 경우
		// 한글 => equals
		// 한글 => 자음으로 찾기 => 사용자 정의(자바,오라클)
		System.out.println("======== equalsIgnorcase =======");
		for(String s:data) {
			if(s.equalsIgnoreCase("java")) {
				System.out.println(s);
			}
		}
		System.out.println("======== length =========");
		String[] data2= {
				"apple",
				  "avocado",
				  "banana",
				  "blackberry",
				  "blueberry",
				  "cherry tomato",
				  "cherry",
				  "coconut", 
				  "grape",
				  "kiwi",
				  "lemon",
				  "lime",
				  "mango",
				  "melon",
				  "orange",
				  "papaya",
				  "peach",
				  "pear",
				  "persimmon",
				  "pineapple",
				  "plum",
				  "strawberry",
				  "tangerine",
				  "tomato",
				 "watermelon"
		};
		// length() 문자갯수
		// 원형: int length()
		// 사용처 : 문자 제한이 있는 경우, 비밀번호
		// 오라클 => VARCHAR2(10)
		
		// 1. 각 과일명의 문자길이를 출력
		for(String s:data2) {
			System.out.println(s+":"+s.length());
		}
		System.out.println("===============================");
		System.out.println("가장 긴 이름의 과일명을 출력해라");
		int max=0;
		
		for(String s:data2) {
			if(max<s.length())
				max=s.length();
		}
		for(String s:data2) {
			if(s.length()==max) {
				System.out.println(s);
			}
		}
		
		// startsWith 시작문자열이 같을 경우
		// 원형 : boolean startsWith(String s)
		// 사용처 : 자동 완성기 (검색기), 쿠키 검색
		// 쿠키 => key는 중복이 되면 안된다 => 구분 : hotel1 hotel2...
		System.out.println("========== startsWith ===========");
		for(String s:data2) {
			if(s.startsWith("p")) {
				System.out.println(s);
//				try
//				{
//					Thread.sleep(500);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
			}
		}
		
		// trim() : 좌우 공백 제거
		// 원형 : String trim()
		// 사용처 : 로그인, 회원가입, 검색...
		// 사용자가 입력시 => space
		// String id="admin"이랑 " adimin"은 다름
		System.out.println("========= trim =========");
		String id="admin";
		if(id.equals(" admin".trim())) {
			System.out.println("같은 ID");
		}
		else
			System.out.println("다른 ID");
		
		// contains 포함문자열을 찾을 경우
		// 원형 : boolean contains(String s)
		// 사용처 : 검색, 추천
		// 추천 => 네이버 블로그, 카페 => 포함된 영화명...
		System.out.println("======= contains ======");
		for(String s:data2) {
			if(s.contains("a")) {
				System.out.println(s);
			}
		}
		
		// valueOf : 모든 데이터형을 문자열로 변환
		// String에서 유일한 static 메소드
		// 원형 : static String valueOf((type)) => 오버로딩된 상태
		// 사용처 : 자바에서 윈도우 전송, 네트워크 전송, 웹(String만 인식)
		System.out.println("======= valueOf ======");
		System.out.println(String.valueOf(10)+String.valueOf(30)); // "10"+"30" ==> "1030"
		
		// substring() 문자열을 자르는 경우
		// 원형 : String substring(int s)
		//       String substring(int s,int e)
		// 오버로딩
		// substring(int s) => s번째부터 마지막까지 잘라온다
		// substring(int s, int e) => s번째부터 e-1번째까지 잘라온다
		// 사용처 : URL주소 제어, 주소 제어, 문자열이 긴 경우...
		// substring(indexOf() 또는 lastIndexOf())
		System.out.println("======== substring ========");
		String ss="http://localhost:8080/JSPProject/main/main.do";
		String res=ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		
		res=ss.substring(ss.indexOf("//")+2 ,ss.indexOf("/J"));
		//ss=ss.substring(ss.indexOf("//")+2);
		//res=ss.substring(0,ss.indexOf("/"));
		System.out.println(res);
		
		ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res=ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());
		res=ss.substring(ss.lastIndexOf("서울"));
		System.out.println(res.trim());
		
		// split 특수문자별로 잘라서 배열에 저장...
		// 원형 : String[] split(String regexp)
		// 사용처 : 구분이 되어있는 문자열이 있는 경우 분리
		System.out.println("======== split ========");
		ss="홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names=ss.split(",");
		for(String name:names) {
			System.out.println(name);
		}
		ss= "갈비살"
			+ " 30,000원"
			+ "돼지갈비"
			+ " 17,000원"
			+ "돼지목살"
			+ " 15,000원"
			+ "삼겹살"
			+ " 15,000원";
		String[] menu=ss.split("원");
		for(String m:menu) {
			System.out.println(m+"원");
		}
		
		ss="red?blue|green|black|white|yellow";
		String[] color=ss.split("\\?");
		// | 정규식에서 사용하는 기호
		// | ? . + * ^
		// 역슬러시(\\)를 넣어주지 않는다면 문자가 아닌 기호로 인식해버림
		for(String c:color) {
			System.out.println(c);
		}
		
		// replace() 문자/문자열 변경
		// 원형 : String replace(char old, char new)
		//       String replace(String old, String new)
		// 사용처 : 데이터 수집 => html을 제거...
		System.out.println("=========== replace ===========");
		ss="https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 오라클에 저장 ==> &를 Scanner로 인식
		res=ss.replace("&", "@");
		System.out.println(res);
		System.out.println(res.replace("@", "&"));
	}

}
