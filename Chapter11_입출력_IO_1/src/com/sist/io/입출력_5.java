package com.sist.io;
import java.io.*;
import java.net.*;
/*
 * 		         URLConnection => url.openConnection
 * 			           |
 *         -------------------------
 *         |                       |
 *  HttpURLConnection     HttpsURLConnection
 *  
 *  class A
 *  class B extends A
 *  B b=(B)new A();
 *      --- 형변환
 *  int a=(int)10.5;
 */
public class 입출력_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		//                     ----------------- url이 HttpURLConnection보다 상위클래스라서 형변환시켜줌
		if(con!=null) {// 연결이 되었다면
			// 브라우저 => 1byte씩 전송
			// 1byte => 2byte로 변환
			// InputStreamReader
			// ----------|------
			//    1byte -> 2byte
			BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			while(true) {
				String data=in.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
			in.close();
			con.disconnect();
		}
	}

}
