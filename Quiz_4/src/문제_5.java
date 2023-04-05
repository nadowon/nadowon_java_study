
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, a7=0, a9=0;
		
		int i=1;
		while(i<=1000) {
			if(i%7==0)
				a7+=i;
			if(i%9==0)
				a9+=i;
			 i++;
		}
		System.out.println(a7);
		System.out.println(a9);
		System.out.println(a7+a9);
	}

}
