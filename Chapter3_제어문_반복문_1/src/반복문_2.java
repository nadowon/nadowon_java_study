
// 1 ~ 100 까지의 합

public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("=====최종 결과값=====");
		System.out.println("1~100까지의 합:"+sum);
		
		sum=0; // 값을 변경 => 다시 누적, 이미 메모리가 만들어진 상태일 때는 int를 넣지 않는다 (+ 초기값은 0, * 초기값은 1)
		for(int i=0; i<100; i+=2) { // 짝수
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("=====최종 결과값=====");
		System.out.println("짝수의 합:"+sum);
		
		sum=0;
		for(int i=1; i<=100; i+=2) { // 홀수
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("=====최종 결과값=====");
		System.out.println("홀수의 합:"+sum);
		
		sum=0;
		for(int i=3; i<=100; i+=3) { // 3의 배수
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("=====최종 결과값=====");
		System.out.println("3의 배수의 합:"+sum);
		
	}

}
