package com.sist.io;
/*
 * 메모리 입출력
 * 파일 입출력 ===> 객체단위 저장(프로젝트에서 이용)
 * -------- ObjectInputStream => 객체 단위로 읽기 - 역직렬화(위에서 아래로) readObject
 * -------- ObjectOutputStream => 객체 단위로 파일에 저장 - 직렬화(옆으로) writeObject
 * 
 *   객체 단위로 저장
 *   ------------
 */
import java.io.*;
import java.util.*;
public class Object_InputOutput_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));
		list.add(new Sawon(2,"심청이","영업부","과장",5500));
		list.add(new Sawon(3,"박문수","기획부","사원",3500));
		list.add(new Sawon(4,"이순신","자재부","부장",6500));
		list.add(new Sawon(5,"강감찬","총무부","대리",4500));
		FileOutputStream fos=new FileOutputStream("c:\\java.datas\\sawon.txt");
		// ObjectOutputStream : file단위(문자열) -> 객체 단위 저장
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list); // list 자체가 통째로 저장
		fos.close();
		oos.close();
		System.out.println("객체 단위 저장 완료");
	}

}
