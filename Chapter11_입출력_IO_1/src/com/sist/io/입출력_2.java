package com.sist.io;
 // 파일읽기 = 파일출력
/*
 *  366p
 * FileInputStream / FileReader
 * 한글이 포함 ==> 반드시 2byte씩 읽어야 한글이 깨지지 않는다 
 */
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		try
		{
			reader=new FileReader("c:\\javaDev\\movie.txt"); // 읽어 온 데이터를
			BufferedReader in=new BufferedReader(reader); // Buffer에 저장
			// BufferedReader : 네트워크 통신 시에 많이 사용
			int i=0; // 한 글자씩 읽기 => read()
			// int read() => 글자의 ASC코드를 읽어온다(정수)
			// A => read() => 65
			// int read(byte[],int,int) => 읽은 바이트 수를 읽어온다
			long start=System.currentTimeMillis();
//			while((i=in.read())!=-1) { // -1 : 읽을 데이터가 없는 경우 = 데이터 전체를 읽은 경우 // EOF 데이터를 다 읽음
//				System.out.print((char)i);
//			}
			while(true) {
				String data=in.readLine(); // 한 줄씩 읽어온다
				if(data==null)
					break;
				System.out.println(data);
			}
			long end=System.currentTimeMillis();
			System.out.println("읽은 시간: "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
