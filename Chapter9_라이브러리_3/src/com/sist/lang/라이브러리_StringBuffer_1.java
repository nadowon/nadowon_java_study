package com.sist.lang;
// delete, insert => 원본 변경
// substring => 원본 변경 x
public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("홍길동입니다");
		
		// delete와 insert는 자체를 변경 (원본이 변경)
		
		sb.delete(3, 6); // delete(int s,int e) => s부터 e-1까지 삭제한다
		//          ---  따라서 원래 자르고 싶은 인덱스번호보다 +1 해야함
		System.out.println(sb.toString()); // 홍길동
		
		sb.insert(3, "입니다"); // insert(int s,String e) => s뒤에 e를 붙인다
		System.out.println(sb.toString()); // 홍길동입니다
		
		// substring은 자체 변경이 되지 않는다 (원본 변경x)
		System.out.println(sb.substring(3)); // 새로운 메모리 저장 // 입니다
	}

}
