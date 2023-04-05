
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, sum=0;
		
		int i=100;
		while(i<=999) {
			if(i%4!=0) {
				sum+=i;
				num++;
			}
			i++;
		}
		System.out.println("갯수:"+num);
		System.out.println("합:"+sum);
	}

}
