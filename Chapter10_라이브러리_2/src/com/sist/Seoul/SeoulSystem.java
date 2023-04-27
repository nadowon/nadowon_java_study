package com.sist.Seoul;
import java.util.*;
import java.io.*;

// ArrayList를 이용하여 목록출력 / 상세보기
public class SeoulSystem {
	
	private static ArrayList datas=new ArrayList();
//	private int curpage;
//	private int totalpage;
	
	static{ 
		
		try {
			// 파일 읽기
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			String[] locations=sb.toString().split("\n");
			
			for(String s:locations) {
				StringTokenizer st=new StringTokenizer(s,"|");
				SeoulLocationVO vo=new SeoulLocationVO();
				vo.setNo(Integer.parseInt(st.nextToken()));		
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				datas.add(vo);
			}
		}catch(Exception ex) {}	
		
	}
	 // 페이지별 데이터 출력
	 public ArrayList SeoulListData(int page) {
		 int totalpage=(int)(Math.ceil(datas.size()/10.0)); // 28
		 int start=(page-1)*10;
		 int end=page*10;
		 if(page==totalpage) {
			 end=start+datas.size()%10;
		 }
		 ArrayList seouList =new ArrayList(datas.subList(start, end));
		 return seouList;
	 }
	 
	 // 메뉴
	 public int menu() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("========MENU=========");
		 System.out.println("1. 목록 출력(페이지별)");
		 System.out.println("2. 상세보기");
		 System.out.println("9. 프로그램 종료");
		 System.out.println("=====================");
		 System.out.print("메뉴선택: ");
		 return sc.nextInt();
	 }
	 
	 // 상세보기 
	 public SeoulLocationVO seoulDetailData(int no) {
		 return (SeoulLocationVO)datas.get(no-1);
	 }
	 
	 // 조립
	 public void process() {
		 System.out.println("★★★★★★★★ Seoul 명소 ★★★★★★★★");
		 Scanner sc=new Scanner(System.in);
		 while(true){
			 int menu=menu();
			 
			 if(menu==9) {
				 System.out.println("Promgram is quite!!");
				 break;
			 }

			 else if(menu==1) {
				 while(true) {
					 System.out.print("페이지 입력(1~28): ");
					 int page=sc.nextInt(); 
					 if(page<1||page>28) {
						 System.out.println("없는 페이지입니다");
						 continue;
					 }
					 break;
				 }
				 int page=sc.nextInt();
				 ArrayList mList=SeoulListData(page);
				 for(int i=0;i<mList.size();i++){
					SeoulLocationVO vo=(SeoulLocationVO)mList.get(i);
					System.out.println(vo.getNo()+"."+vo.getName());
				}		 
			 }
			 
			 else if(menu==2) {
				 System.out.print("상세히 볼 번호 입력(1~273): ");
				 //번호 예외처리 해주면 좋음
				 int no=sc.nextInt();
				 SeoulLocationVO vo=seoulDetailData(no);
				 System.out.println("번호: "+vo.getNo());
				 System.out.println("명소: "+vo.getName());
				 System.out.println("설명: "+vo.getContent());
				 System.out.println("주소: "+vo.getAddress());
			 }
		 }
	 }
}
