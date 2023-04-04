import java.util.Scanner; // 라이브러리, 사용자 정의
// => 클래스가 다른 폴더에 저장된 경우
// import가 생략이 가능한 라이브러리: java.lang.* 예) Math, String, Object...
// 외부에서 만든 라이브러리 => org/com

public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = scan.nextInt();
		if(num>0)
			System.out.println(num+"는(은) 양수입니다");
		else
			System.out.println(num+"는(은) 음수입니다");
	}

}
