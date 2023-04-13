package com.sist.main;// package가 제일 위에 있다, 딱 한 번만 사용 가능
// 폴더 => 관련된 java파일 저장 => 찾기
// 다른 패키지의 클래스를 불러올 때 반드시 import를 사용해야 한다
// import com.sist.main.클래스구성요소_1; // 패키지가 다를 경우 import를 붙여서 가져온다
// import com.sist.main.*; // 모든 클래스 파일을 불러온다
// import java.util.*; // import는 여러 번 사용 가능
// 주의점 : 키워드는 사용할 수 없다, 대소문자를 구분 => 패키지명은 소문자 권장, 숫자는 앞x
// com.sist.class(x) com.sist.public(x) com.sist.int(x)
// 다른 패키지에서는 같은 이름의 클래스를 만들 수 있다
// => 메소드 => 접근방식.을 이용한다
// => 인스턴스 메소드 => static이 없는 메소드 => 메모리에 따로 저장된다
/*
 * 클래스의 분리
 *  클래스
 *    = 데이터형
 *    = 액션(동작) => 메소드
 *    ------------------
 *    1) 데이터형 (데이터)
 *    2) 데이터 처리 (기능)
 *    3) 조립 => main => 메인보드
 *    --------------------------
 *    메소드 => 140p.
 *    
 *    1. 메소드의 구성요소
 *       리턴타입(결과값) 메소드명(매개변수 → 요청데이터) => 선언부
 *       ----------- 일치(데이터형)
 *       {
 *         구현부
 *         return 결과값
 *                ----
 *                
 *                
 *                
 *       }
 *       
 *       리턴타입 : 사용자가 요청한 내용을 처리 후에 결과값의 데이터형
 *               1) 결과값이 있는 경우
 *               2) 결과값이 없는 경우 => void
 *               리턴타입 / return 값은 항상 일치하지는 않는다
 *               -----   -------
 *               항상 리턴타입이 결과값보다는 크거나 같다
 *                   ------ -----
 *                     int   10.5 => 오류
 *                   double   10  => 정상수행
 *               3) 리턴타입이나 결과값은 1개만 나온다
 *                 ** 여러 개일 경우: 배열, 클래스를 이용한다
 *                                ---  ---- 주소 => 얕은 복사
 *               예) int[] display()
 *                  {
 *                    int[] arr=new int[5];
 *                    return arr;
 *                  }
 *               => int[] arr=display()
 *               => int[] arr=new int[5];
 *                  int[] arr2=arr;
 *                  
 *                  class A
 *                  A display()
 *                  {
 *                    A a=new A();
 *                    return a;
 *                  }
 *                  
 *                  A aa=display() ==> aa=a
 *                  
 *                  리턴형: 기본형, 배열, 클래스 (사용자 정의 데이터형)
 *                  return int => 10
 *                         double => 10.5
 *                         char => 'A'
 *                         배열 => 배열명(주소)
 *                         int[] arr=new int[5];
 *                         return arr;
 *                         클래스 => 객체명(주소)
 *                         A a=new A();
 *                         return a;
 *                  
 *                   getView(int page)
 *                   findData(String s)
 *                   login(String id,String pwd)
 *                        ----------------------
 *                          (매개변수): 사용자 요청값
 *                   
 *                  
 */
class Student
{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}
class StudentSystem
{
	int getHakbun()
	{
		return 1;
	}
	String getName()
	{
		return "홍길동";
	}
	String getSex()
	{
		return "남자";
	}
	int getKor()
	{
		return 90;
	}
	int getEng()
	{
		return 80;
	}
	int getMath()
	{
		return 70;
	}
	Student getData()
	{
		Student s=new Student();
		s.hakbun=2;
		s.name="심청이";
		s.sex="여자";
		s.kor=90;
		s.eng=90;
		s.math=100;
		
		return s;
	}
}
public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		StudentSystem ss=new StudentSystem();
		hong.hakbun=ss.getHakbun();
		hong.name=ss.getName();
		hong.sex=ss.getSex();
		hong.kor=ss.getKor();
		hong.eng=ss.getEng();
		hong.math=ss.getMath();
		
		Student shim=ss.getData();
	}
	
	
}
