/*
 * 클래스 관리는 인터페이스 / 데이터 관리는 배열
 * 
 * 	배열: 관련된 데이터를 여러 개 모아서 한 개의 이름으로 관리
 *       ---------				---------
 *      데이터형이 동일
 *    1) 데이터를 배열로 모아서 관리 => 연속적인 메모리 공간을 만든다
 *       						 --------------- 
 *    2) 고정적이다 (한번 지정되면 추가, 삭제가 불가능하다)
 *    	--------- 가변형 (컬렉션 프레임워크 제공)
 *    3) 한 개의 이름으로 사용 (구분자: 인덱스) => 0부터 시작
 *    예) 
 *    		int a=10,b=20,c=30,d=40,e=50;
 *    		
 *    		  RAM(한번 쓰고 프로그램 종료시 끝)
 *    		0-----
 *    		 이클립스에서 사용중
 *    		4-----
 *    		   10 ==> a
 *    		8-----
 *    		 이클립스에서 사용중
 *    		12----
 *    		   20 ==> b
 *    		16----
 *    		  이클립스에서 사용중
 *    		20----
 *    		   30 ==> c
 *    		24----
 *    		  이클립스에서 사용중
 *    		28----
 *    
 *    			배열 => 데이터를 5개 만들어 달라
 *    			----------------------------------------
 *    			  10	|  20	|  30	|  40	|  50
 *    			----------------------------------------
 *    			|		|		|		|		|
 *    			100		104		108		112		116
 *    			arr		arr+1	arr+2	arr+3	arr+4
 *    			
 *    			=> 100+0*4 => arr[0]
 *    			=> 100+1*4 => arr[1]
 *    			=> 100+2*4 => arr[2] : 100번지로부터 2번째 값을 가져와라 ==> 108 => 30
 *    			=> 100+3*4 => arr[3]
 *    			=> 100+4*4 => arr[4]
 *    			=================================== index 번호는 0 ~ 갯수만큼
 *    			* index 번호는 순차적으로 만들어진다
 *    			* 갯수확인 => length
 *    			* 4는 int, 2는 char, 8은 double, []안의 값은 index
 *    
 *    			1. 배열 선언
 *    				데이터형[] 배열명; => 권장사항
 *    				데이터형 배열명[]; => C언어에서 파생
 *    
 *    			2. 배열 초기화
 *    				1) 선언과 동시에 초기화
 *    					데이터형[] 배열명={10,20,30,40,50} => 5개를 동시에 저장하는 공간 생성
 *    					데이터형[] 배열명=new 데이터형[갯수];
 *    						 --- x
 *    				  * new를 사용하면 자동으로 기본 디폴트값으로 채운다
 *    					byte,short, int => 0
 *    					long => 0L
 *    					char => '\0'
 *    					float =>0.0F
 *    					double => 0.0
 *    					boolean => false
 *    					
 *    			3. 데이터 읽기
 *    				int a=10;
 *    				sysout(a)
 *    				int[] arr={10,20,30,40,50}
 *    				sysout(arr[1]) ==> 20
 *    
 *    			4. 변경
 *    				int a=10;
 *    				a=20;
 *    
 *    				int[] arr={10,20,30,40,50};
 *    				arr[3]=200;
 *    					  arr={10,20,30,200,50};
 *    수정 삭제 추가 읽기 CURD
 *    			
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개 연속적으로 배치 => 배열
		/*
		 *  5개 변수 => 10,000개
		 *  같은 데이터형 변수가 3개 이상이라면 대부분 배열을 사용한다
		 */
		int[] arr=new int[10000];
		
		for(int i=0; i<5; i++) {
			System.out.println("arr["+i+"]="+arr[1]);
		}
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		
		int a6=(int)(Math.random()*100)+1;
		int a7=(int)(Math.random()*100)+1;
		int a8=(int)(Math.random()*100)+1;
		int a9=(int)(Math.random()*100)+1;
		int a10=(int)(Math.random()*100)+1;
		
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
		System.out.println("a4="+a4);
		System.out.println("a5="+a5);
		
		System.out.println("a6="+a6);
		System.out.println("a7="+a7);
		System.out.println("a8="+a8);
		System.out.println("a9="+a9);
		System.out.println("a10="+a10);
		
		int max=a1;
		if(max<a2)
			max=a2;
		
	}

}
