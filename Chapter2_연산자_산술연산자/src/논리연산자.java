// && ||
/*
 * && => 범위나 기간에 포함
 * -------------------------
 * (조건) && (조건)
 *  true	true  => true
 *  true	false => false
 *  false	true  => false
 *  false	false => false
 *  
 *  || => 범위나 기간을 벗어난 경우 예)행사기간을 벗어났는지 안 벗어났는지
 * ------------------------------------
 * (조건) || (조건)
 *  true	true  => true
 *  true	false => true
 *  false	true  => true
 *  false	false => false
 *  
 *  => 효율적 연산 (뒤에 조건은 연산을 하지 않는다) => &&: 앞의 조건이 false인 경우 / ||: 앞의 조건이 true인 경우
 *  () && ()
 *  	  --
 *  false
 *  
 *  () || ()
 *  	  --
 *  true
 *  
 *  int a=10;
 *  int b=9;
 *  (a<b) && ++b==a // a<b가 false이므로 뒤조건은 수행되지 않아 b는 증가하지않는다
 *  
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=9;
//		boolean bCheck = (a<b) || ++b==a;
//		System.out.println(bCheck);
//		System.out.println("b="+b);
//		
//		int a =100;
//		int b=99;
//		boolean bCheck = (a>b) && (b==a);
//		System.out.println(bCheck);
//		bCheck = (a>b) || (b==a);
//		System.out.println(bCheck);
//		
//		char c=(char)((Math.random()*26)+65);
//		boolean bCheck = c>='A' && c<='Z';
//		System.out.println("c="+c);
//		System.out.println(bCheck);
//		
//		char sex='M';
//		int score=87;
//		boolean bCheck= (sex=='M' || score<=80);
//		System.out.println(bCheck);
//		
//		int a=10;
//		boolean bCheck= a%2==0 || a<10;
//		System.out.println(bCheck);
//		
		// 윤년 계산 (2월 29일)
		int year=2023;
		boolean bCheck=((year%4==0 && year%100!=0)||(year%400==0));
		System.out.println(bCheck);
		
		
	}

}
