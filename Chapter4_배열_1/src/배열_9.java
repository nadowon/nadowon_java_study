import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 확장 형태
		int[] arr1= {10,20,30,40,50}; // 수정 x
		int[] arr2=new int[10]; // 확장하고 싶은 부분을 수정
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}

}
