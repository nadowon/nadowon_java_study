package com.sist.exception;
// finally => 생략이 가능
// finally => try를 수행, catch를 수행 관계없이 무조건 수행되는 문장
// 파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결
/*
 *  try
 *  {
 *  	정상수행이 가능
 *  	=> 에러(예상하지 못한 에러가 발생할 수 있다)
 *  	프로그래머의 실수, 사용자의 입력값 오류...
 *  } catch(예상되는 예외클래스)
 *  {
 *  	에러 발생 시에 처리
 *  	= 에러를 확인
 *  	= 복구를 할 수 있다 => 오류 메세지 전송도 가능
 *  }
 *  finally => 생략이 가능
 *  {
 *  	무조건 수행하는 문장을 코딩
 *  	파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결
 *  }
 *  
 *  실행순서
 *  ------
 *  문장1
 *  문장2
 *  try
 *  {
 *  	문장3
 *  	문장4 => 에러 발생
 *  	문장5
 *  }catch(예외처리 클래스1)
 *  {
 *  	문장6
 *  }catch(예외처리 클래스2)
 *  {
 *  	문장7
 *  }catch(예외처리 클래스3)
 *  {
 *  	문장8
 *  }
 *  finally
 *  {
 *  	문장9
 *  }
 *  문장10
 *  문장11
 *  
 *  => 1. try 정상 수행시 => 1-2-3-4-5-9-10-11
 *  
 *  => 2. try 수행 중 에러1 => 1-2-3 =>catch(1)=> -6-9-10-11
 *  
 *  => 2. try 수행 중 에러2 => 1-2-3 =>catch(2)=> -7-9-10-11
 *  
 *  => 2. try 수행 중 에러3 => 1-2-3 =>catch(3)=> -8-9-10-11
 *  => 목적 에러 시에 제외를 하고 나머지 문장 수행
 *  => 멀티 예외처리
 *  
 */
public class 예외처리_예외복구_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
		System.out.println(arr[0]/arr[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 하나의 객체를 가지고 두개를 동시에 처리 => 멀티 catch
			System.out.println("에러 발생");
		}
		System.out.println("프로그램 종료"); // 정상종료
		// 다중 catch는 순서를 잘 봐야한다 // catch를 여러 개 씀
		// 멀티 catch는 |를 사용하여 하나를 가지고 두개를 동시에 처리할 때 씀
	}

}
