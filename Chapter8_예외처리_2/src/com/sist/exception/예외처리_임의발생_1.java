package com.sist.exception;
/*
 * 임의발생: 테스트 목적
 * ----------------- 배포전(배포:상용화)
 * 형식)
 *      throw new 예외처리생성자()
 */
public class 예외처리_임의발생_1 {

//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
////		try
////		{
////			Thread.sleep(10);
////		}catch (InterruptedException e) {}
//		// InterruptedException < Exception < Throwable
//		Thread.sleep(10);
//	}

	public static void main(String[] args) {
		try
		{
			int a=10;
			if(a%2==0) {
				System.out.println("임의로 예외발생");
				throw new NumberFormatException("정수변환이 안됨"); // 생성자에 새로운 메세지 삽입
				// throw => 사용자 정의 예외처리
				// => catch로 이동(try는 끝남) => 소스코딩을 할 수 없다
				//System.out.println();
				
				// getMessage변경 => 생성자 매개변수 이용
				/*
				 *  class NumberFormatException extends Exception
				 *  {
				 *    private String message=For input string :" 10";
				 *    public NumberFormatException()
				 *    {
				 *    }
				 *    public NumberFormatException(String message)
				 *    {
				 *      this.message=message;
				 *    }
				 *  }
				 */
				//Integer.parseInt(" 10");
			}
		}catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			// 에러 확인 ==> 에러부분을 수정
		}catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException:"+e.getMessage()); // 생성자에서 바뀌면 메세지도 바뀜
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
