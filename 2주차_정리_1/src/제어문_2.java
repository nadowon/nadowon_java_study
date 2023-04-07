/*
 * 연산자, 제어문 => 형식, 용도
 * 	- for
 *
 * 	초기값은 한 번만 수행
 * 				| false면 종료
 * 		  1  →	2  ←  4
 * 	for(초기값; 조건식; 증가식)
 * 		{  true ↓     ↑
 * 			3 반복수행 문장
 * 		}
 * 					true
 * 	초기값 => 조건식 ----------> 수행문장 ----> 증가식
 * 					true
 * 			조건식 ----------> 수행문장 ----> 증가식
 * 					true
 * 			조건식 ----------> 수행문장 ----> 증가식
 * 			  	    false
 * 			조건식 ==========> 종료
 * 
 * 	- while => 읽기
 * 
 * 	초기값   ------- 1
 * 	while(조건문) -- 2
 * 	{
 * 		수행문장 ---- 3
 * 		증가식 ------ 4 => true면 조건식 2번으로 이동
 * 					  => false면 종료
 * 	}
 * 
 * 	- 필요에 의해 반복문 제어
 * 	break: 반복문 중단(조건) 예)게임 중단 => Esc // 반복문과 switch에만 사용가능 (if문은 안됨)
 * 	continue: 종료하는 것이 아니라 이동하는 것
 * 			// 반복문에서만 사용이 가능 (특정부분을 제외하는 경우에 주로 사용)
 * 				for => 증가식으로 이동
 * 				while => 조건식으로 이동
 * 	주의점)
 * 		break, continue 밑에는 소스 코딩이 불가하다
 * 		break, continue => 자신 소속{} 반복문만 제어한다
 * 
 * 
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int i=1;
		while(i<=10) {
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} */
		int[] arr= {1,2,3,4,5};
		System.out.println(arr); // arr은 주소[I@6504e3b2를 가진다
		int[] arr2=arr;
		System.out.println(arr2); // arr2는 arr과 주소가 같다
		arr2[0]=10;
		System.out.println(arr[0]); // arr2를 바꾸면 arr도 바뀐다
		int[] arr3=arr.clone(); // arr크기의 새로운 배열 생성
		System.out.println(arr3); // arr과 주소가 다르다 [I@515f550a
		// 주소에 의한 참조 ==> 메모리 주소를 이용해서 실제 데이터 관리 
	}

}
