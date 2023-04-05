
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0, odd=0;
		
		int i=1;
		while(i<=30) {
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
			 i++;
		}
		System.out.println("짝수합:"+ even);
		System.out.println("홀수합:"+ odd);
	}

}
