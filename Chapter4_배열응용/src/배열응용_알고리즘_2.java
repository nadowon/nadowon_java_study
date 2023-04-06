import java.util.Arrays;

// 선택정렬 => 문자
/*
 * 	i=0 : 맨 앞의 값과 비교
 * 	B C A E D => ASC(ABCDE)/DESC(EDCBA)
 * 	- -
 * 	B C
 *  -   -
 *  A   B
 *  -     -
 *  A     E
 *  -       -
 *  A       D
 * ====================== 1round
 * 	i=1 : 두번째 값과 비교
 *  A C B E D
 *    - -
 *    B C
 *    -   -
 *    B   E
 *    -     -
 *    B     D
 * ====================== 2round
 *  i=2 : 세번째 값과 비교
 *  A B C E D 
 *  	- -
 *  	C E
 *  	-   -
 *  	C   D
 * ====================== 3round
 *  i=3 : 네번째 값과 비교
 *  A B C E D
 *        - -
 *        D E
 * ====================== 4round // 종료 => 5개의 배열은 4바퀴만 돈다 => 따라서 length-1개만큼 돌아간다
 *  // 수행 x
 * 	i=4   
 *  A B C D E 
 * 	
 */
public class 배열응용_알고리즘_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char)((int)(Math.random()*26)+65);
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(arr));
		System.out.println("==== 정렬 후(ASC) ====");
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i]; // 임시 변수 있어야만 한다
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("==== 정렬 후(DESC) ====");
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
