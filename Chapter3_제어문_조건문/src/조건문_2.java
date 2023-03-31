
// 정수를 입력을 받아서 3의 배수, 5의 배수, 7의 배수인지 확인 , 아닌 경우에는 "배수가 아니다"

public class 조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=(int)(Math.random()*100)+1;
		int num=15;
		System.out.println("num=" + num);
		
		if(num%3==0)
			System.out.println(num + "는 3의 배수입니다");
		if(num%5==0)
			System.out.println(num + "는 5의 배수입니다");
		if(num%7==0)
			System.out.println(num + "는 7의 배수입니다");
		if( !(num%3==0 || num%5==0 || num%7==0))	
			System.out.println("해당 배수가 아닌 수 입니다");
		
		// else if 다중조건문은 하나만 수행하고 끝난다 (단일 조건 수행)
		// 반복적인 수행을 하려면 if 단일문을 사용하여야한다 (여러가지 조건 수행)
		
			
	}

}
