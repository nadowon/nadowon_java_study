package com.sist.lang;
/*
 * StringBuffer
 * ------------
 *  1. String은 고정형 => 변경이 되면 새로운 메모리를 형성
 *                      원본은 그대로 유지(변하지 않는 문자열 저장)
 *    예) String s="Hello Java";
 *       String ss=s.substring(0,5)
 *       => 변경해서 저장
 *          s=s.substring(0,5)
 *       => 변경 시에 리턴형이 String
 *       
 *  2. String을 보완 => 가변형 => StringBuffer(비동기) / StringBuilder(동기)
 *     *** 프로그램에서 동기(한 개씩 수행) / 비동기(동시에 여러 개의 일을 수행)
 *     
 *     네트워크 : 클라이언트(요청) / 서버(응답)
 *              => 오라클 (자바(요청=>SQL)/오라클서버)
 *              => 웹(클라이언트/서버)
 *                            --- JSP/Spring
 *  3. 데이터가 많은 경우 => 문자열 결합(append)
 *  4. 문자열 처리 => 사용하는 클래스
 *  5. 처리 속도가 빠르다(최적화)
 *  6. 주요 메소드
 *     length() : 문자 갯수
 *     toString() : 객체를 문자열로 변환
 *                  ----------
 *                  toString(),(String), String.valueOf()
 *     delete() : 삭제
 *     ***append() : 문자열 결합
 */

// ***** append() : 문자열 결합 => 데이터수집

// io와 net 클래스 => CheckedException 
import java.io.*;
import java.net.*;

public class 라이브러리_StringBuffer {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			StringBuffer sb=new StringBuffer(); // 가변형 // Buffer : 임시 기억장소
			// 서버("https://www.10000recipe.com/recipe/list.html")에 연결
			URL url=new URL("https://www.10000recipe.com/recipe/list.html");
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			if(con!=null) { // 서버에 연결되면
				// Document doc=Jsoup.connect().get()
				while(true) { 
					BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
					String msg=br.readLine(); // 한줄씩 읽어온다
					if(msg==null)
						break;
					sb.append(msg+"\n");
				}
				con.disconnect(); // 서버 연결 해제
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
