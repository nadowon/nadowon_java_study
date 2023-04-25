package com.sist.string;
import java.io.*;
public class 라이브러리_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 문자 읽기 => int로 읽어오기 때문에 int로 씀
			StringBuffer data=new StringBuffer();
			//String data="";
			while((i=fr.read())!=-1) { // -1(EOF) file의 끝
				data.append((char)i);
				//data+=(char)i;
			}
			long end=System.currentTimeMillis();
			fr.close();
			System.out.println(data.toString());
			//System.out.println(data);
			System.out.println("걸린 시간:"+(end-start));
			
		} catch (IOException ex) {
			ex.printStackTrace(); // 에러메세지 확인
		}
	}

}
