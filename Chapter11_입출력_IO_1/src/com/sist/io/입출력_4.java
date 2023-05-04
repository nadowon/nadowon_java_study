package com.sist.io;
// BufferedReader / BufferedWriter => 필터스트림
// FileReader / FileWriter => 기반스트림

import java.io.*;
public class 입출력_4 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// FileWriter : 자동으로 지정된 파일을 생성, 이미 존재하는 경우에는 덮어쓴다 (create)
		// 원래 있던 데이터에 추가로 붙여서 저장 (append) : new FileWriter("c:\\java.datas\\movie_1.txt",true)
		FileWriter out=new FileWriter("c:\\java.datas\\movie_1.txt");
		FileReader in=new FileReader("c:\\javaDev\\movie.txt");
		BufferedReader br=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		while(true) {
			String data=br.readLine();
			if(data==null)
				break;
			bw.write(data+"\n");
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
