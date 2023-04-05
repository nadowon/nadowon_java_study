
public class 문제_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = {'a','b','c','d'};
		for(char c:alpha) { // for-each구문 = 향상된 for문
			System.out.print(c);
		}
		System.out.println();
		for(int i=0; i<alpha.length; i++)
			System.out.print(alpha[i]);
	}

}
