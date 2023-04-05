/*
 * 반복제어문
 * 	=> 특정 부분을 제외하고 반복 수행: continue
 * 		while: 조건식으로 이동
 * 		for: 증가식으로 이동
 * 	=> 반복을 중단: break
 */
public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while(i<100) {
			if(i%3!=0) {
				i++;
				continue;
			}
			else
				sum+=i;
				i++;
		}
		System.out.println(sum);
	}

}
