/*
 * 반복문 : 유사한 내용이 여러번 반복할 때 주로 사용
 * 		예) 영화목록, 맛집목록, ...목록, 메인화면, ..상세보기(if), 페이징
 * 
 * 종류 :
 *  반복횟수가 정해져 있는 경우 : for
 * 	반복횟수가 정해지지 않는 경우 : while
 * 	한 번 이상 수행이 가능 : do ~ while
 * 	-------------------------------
 * 	자바 : 출력, 제어 => for(2차, 중첩)
 * 		  데이터베이스, 네트워크 => while(1차)
 * 
 * 형식 :
 * 		- for	 1		2	  4		=> 2번이 false면 종료/ 2번이 true면 반복문장 수행
 * 			for(초기값; 조건식; 증감식) {
 * 					반복 수행문장 3
 * 			}
 * 
 * 		- while // 조건보고 증가
 *			초기값 ------------------- 1
 *			while(조건문) { ---------- 2 ===> 수행을 못할 수도 있다(false일 경우)
 *				반복문장 수행문장 ------- 3
 *				증감식 --------------- 4 => true면 2번으로 이동, false면 종료
 *			}
 *
 * 		- do ~ while // 증가하고 조건보기
 * 			초기값 ------------- 1
 * 			do {
 * 				반복수행문장 ----- 2
 * 				증감식 ---------- 3 ===> true든 false든 수행하고 나서 조건문 확인
 * 			} while(조건문); ---- 4
 * 
 * 		- for => 2차
 * 
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] food= {
				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
				"아삭아삭한 고추된장박이",
				"누텔라 견과류 토스트 만들기",
				"달콤 짭조름♡ 떡 베이컨 간장조림♡",
				"등갈비김치찜 김치넣고 푹푹 익히기만 하세요 복잡한건 정말 싫으네요 (양념도 초심플)",
		};
		String[] chef= {
				"루던",
				"돌하우스",
				"dddd516",
				"요블리",
				"즐거운날랄라",
		};
		for(int i=0; i<5; i++) {
			System.out.println(food[i]+"("+chef[i]+")");
		} */
		
		/*
		 * 		 1		2	  4
		 * 	for(초기값; 조건식; 증감식) {
		 * 			반복 수행문장 3
		 * 	}
		 * 
		 * 		1-2-3-4
		 * 		  2-3-4
		 * 
		 * 블록이 없으면 사라지는 변수: 블록변수=지역변수
		 * int a=10;
		 * if() {
		 * 		int b=10;
		 * 		if() {
		 * 			int c=10;
		 * 			} // c 삭제
		 * 		} // b 삭제
		 * 
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		// int i=10; // 변수 선언
		// i=100; // 재사용
		System.out.println("\n===============");
		// A ~ Z 출력
//		for(char c='A'; c<='Z'; c++) {
//			System.out.println(c+" ");
//		}
		char c='A';
		for(int i=0; i<26; i++) {
			System.out.print(c++ +" ");
		}
		
//		// A를 26개 출력
//		for(int i=0; i<26; i++) {
//			char c='A';
//			System.out.print(c++ +" ");
//		} // c 삭제
		
		System.out.println("\n===============");
		
		System.out.println("======== while ========");
		/*
		 * 	<while>
		 * 	초기값 1
		 * 	while(조건식) { 2
		 * 		반복 수행문장 3
		 * 		증감식 4
		 * 	}
		 * 	1-2-3-4 > 2-3-4 > 2-3-4
		 *  => 무한루프(네트워크 서버, 데이터베이스 값 읽기, 파일읽기)
		 *  => 파일읽기 => -1(EOF)
		 * 
		 */
		
		// 1 ~ 10까지 출력
		int i=1; // 초기값(시작점)
		while(i<=10) { // 조건식(종료점) => i가 10이 되면 종료
			System.out.print(i+" ");
			i++; // 제어 : 1에서 10까지 ==> 증가(종료시까지 제어점)
		}
		System.out.println("\n=======================");
		c='A'; // 출력용
		i=0;
		while(i<26) {
			System.out.print(c++ + " ");
			i++;
		}
		System.out.println("\n================");
		// do ~ while : 후조건=> 무조건 1번은 수행한다
		/*
		 *  초기값
		 *  do { 1
		 *  	반복 실행문장 2
		 *  	증감식 3
		 *  	} while(조건식) 4
		 *  
		 *  int i=1;
		 *  do { 
		 *  	sysout(i+ "");
		 *  	=> i=1, i=2 ... i=10
		 *  	i++;
		 *  	=> i=2, i=3 ... i=11
		 *  	} while(i<=10) 
		 */
		System.out.println("\n===== do~while ======");
		i=1;
		do {
			System.out.print(i+ " ");
			i++;
		} while(i<=10);
		
		System.out.println("\n===========");
		c='A';
		i=0;
		do {
			System.out.print(c++ + " ");
			i++;
		} while(i<26);
	}

}
