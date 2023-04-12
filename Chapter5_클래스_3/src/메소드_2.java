// 매개변수 전송법
/*
 * 
 * = Call By value : 일반 기본형 데이터 전송(String) // 원본은 그대로 있고 복사본만 넘겨준다
 * = Call By Reference : 주소값을 넘겨주는 방식 (배열, 클래스) // 원본을 그대로 넘겨준다(값이 변경된다)
 */
public class 메소드_2 {
	static void swap2(int[] arr2)
	{
		
		System.out.println("arr2="+arr2);
		System.out.println("교환 전: arr2[0]="+arr2[0]+",arr2[1]="+arr2[1]);
		int temp=arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=temp;
		System.out.println("교환 후: arr2[0]="+arr2[0]+",arr2[1]="+arr2[1]);
	}
	static void swap(int x,int y)
	{
		System.out.println("교환 전 x="+x+",y="+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("교환 후 x="+x+",y="+y);
	}
	static void swap3(String id,String pwd)
	{
		System.out.println("교환 전: id="+id+",pwd="+pwd);
		String temp=id;
		id=pwd;
		pwd=temp;
		System.out.println("교환 후: id="+id+",pwd="+pwd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap(a, b);
		System.out.println("종료 후 a="+a+",b="+b);
		// 값만 전송 => Call By Value => 기본형
		int[] arr= {10,20};
		System.out.println("arr="+arr);
		swap2(arr);// int[] arr2=arr
		System.out.println("교환 후: arr2[0]="+arr[0]+",arr2[1]="+arr[1]);
		// 배열, 클래스 => 메소드 자체에서 변경이 가능하다
		// Call By Reference
		String id="admin";
		String pwd="1234";
		swap3(id, pwd);
		System.out.println("종료 후: id="+id+",pwd="+pwd);
		// String은 기본형이라 바뀌지 않는다
		
	}

}
