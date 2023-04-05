import java.util.Arrays;

public class 문제_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d=new int[10];
		for(int i=0; i<d.length; i++) {
			d[i]=(int)(Math.random()*100)+1;
			System.out.print(d[i]+" ");
		}
		System.out.println(Arrays.toString(d));
		
		int max=0;
		
		for(int i:d) {
			if(max<i)
				max=i;
		}
		
		for(int i=0; i<d.length; i++) {
			if(max<d[i])
				max=d[i];
		}
		System.out.println("가장 큰 수:"+max);
	}

}
