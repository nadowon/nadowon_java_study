import java.util.Arrays;

public class 문제_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,10,9,3,2};
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println(Arrays.toString(a));
		
		char[] c={'A','B','C','D','E','F','G','H','I','J'};
		for(char i:c) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println(c);
		
		int[] b= {5,3,9,6,8,4,2,8,10,1};
		System.out.print(b[2]+" "+b[4]+" "+b[9]);
		System.out.println();
		
		int[] d=new int[10];
		for(int i=0; i<d.length; i++) {
			d[i]=(int)(Math.random()*100)+1;
			System.out.print(d[i]+" ");
		}
		System.out.println();
		
		int max=0;
		for(int i=0; i<d.length; i++) {
			if(max<d[i])
				max=d[i];
		}
		System.out.println("가장 큰 수:"+max);
		
	}

}
