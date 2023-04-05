import java.util.Arrays;

public class 문제_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d=new int[10];
		for(int i=0; i<d.length; i++) {
			d[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(d));
		System.out.println(d[2]+" "+d[4]+" "+d[9]);
		System.out.println("세번째:"+d[2]);
		System.out.println("다섯번째:"+d[4]);
		System.out.println("마지막:"+d[d.length-1]);
	}

}
