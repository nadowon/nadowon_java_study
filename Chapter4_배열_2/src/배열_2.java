
/*	알파벳 10개를 저장하는 공간 만들기
*	char c1 ~ c10;
*	char[] alpha=new char[10];
*	가장 큰 알파벳을 출력해라
*	=> if(max<c2) => 9개의 조건문을 생성해야함
*	=> char[] alpha=new char[10]; => for문 한번만 가능
*
*	*** 배열: 변수가 3개 이상이면 예) 국어,영어,수학 점수를 구하라: 일반변수 / 5명의 점수를 구하라: 배열
*
*/
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 선언
		int[] arr=new int[5]; // new는 동적메모리 할당
		// 2. 초기값
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 3. 출력
		for(int i:arr) {
			System.out.print(i+" ");
		}
		// 4. 제어
		// 정렬
		
		// 5. 결과값 출력
		
		
	}

}
