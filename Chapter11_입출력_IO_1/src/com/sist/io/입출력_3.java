package com.sist.io;
// 파일쓰기 = 파일입력
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;
		//BufferedWriter
		FileReader in=null;
		//BufferedReader
		try {
			// 1. 파일 만들기
			File file=new File("c:\\java.datas\\movie.txt");
			if(!file.exists()) { // 파일이 존재하지 않는다면
				file.createNewFile(); // 파일을 생성해라
			}
			// 파일 읽기
			in=new FileReader("c:\\javaDev\\movie.txt");
			// 생성된 파일쓰기
			out=new FileWriter(file);
			//out=new FileWriter("c:\\java.datas\\movie.txt");
			int i=0;
			while((i=in.read())!=-1) {
				out.write(i);
			}
			System.out.println("파일 읽기/쓰기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
