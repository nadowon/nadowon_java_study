import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		// arr[0] 첫번째 => 값읽기/값변경 가능 => 변수와 동일
		
		// 1. 배열의 크기를 출력 arr.length
		System.out.println(arr.length);
		// 2. 3번째값을 300으로 바꿔라 arr[2]=300;
		arr[2]=300;
		System.out.println(Arrays.toString(arr));
		// 3. 5번째값을 출력 arr[4]
		System.out.println(arr[4]);
		
	}

}
