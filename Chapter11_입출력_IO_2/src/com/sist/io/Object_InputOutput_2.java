package com.sist.io;
import java.util.*;
import java.io.*;
public class Object_InputOutput_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream out=new FileInputStream("c:\\java.datas\\sawon.txt");
		// 객체 단위로 값을 읽어온다
		ObjectInputStream ois=new ObjectInputStream(out);
		List<Sawon> list=(List<Sawon>)ois.readObject();
		for(Sawon s:list) {
			System.out.println(s.getSabun()+" "
								+ s.getName()+" "
								+ s.getDept()+" "
								+ s.getJob()+" "
								+ s.getPay());
		}
	}

}
