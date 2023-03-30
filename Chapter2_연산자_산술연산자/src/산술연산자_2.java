/*
 * 
 */
public class 산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.println(a + "%" + b + "=" + (a%b));
		System.out.println(-a + "%" + b + "=" + (-a%b));
		System.out.println(a + "%" + -b + "=" + (a%-b));
		System.out.println(-a + "%" + -b + "=" + (-a%-b)); // 나머지(%)값만 왼쪽부호를 따른다
		System.out.println(-a + "*" + -b + "=" + (-a*-b));
		System.out.println(-a + "/" + -b + "=" + (-a/-b));
	}

}
