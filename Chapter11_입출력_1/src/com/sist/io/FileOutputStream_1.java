package com.sist.io;
/*
 * 한글 읽어오기는 글씨가 깨진다
 * 한글 쓰기는 깨지지 않는다
 */
import java.util.*;
import java.io.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 파일 지정
			File file=new File("c:\\java.datas\\school.txt");
			
			// 파일 존재 여부 확인
			if(!file.exists()) {
				file.createNewFile(); // 파일 만들기 명령
			}
			// 파일이 존재할 때 사용
			FileOutputStream fos=new FileOutputStream(file,true);
			String msg="안녕하세요~ 지금은 파일 입출력을 하고 있습니다\r\n";
			//System.out.println((int)'안');
			fos.write(msg.getBytes()); // getBytes : String -> byte[]로 변경
			fos.close();
			System.out.println("저장 완료!");
		} catch (Exception e) {
			
		}
	}

}
