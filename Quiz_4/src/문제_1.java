
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=0;
		for(int i=100; i<=999; i++) {
			sum+=i;
			if (i%7==0) {
				sum+=i;
				num++;
			}
		}
		System.out.println("7의 배수 갯수:" + num);
		System.out.println("7의 배수 합:" + sum);
	}

}
