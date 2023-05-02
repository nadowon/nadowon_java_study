package com.sist.io2;
import java.util.*;
import java.io.*;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList=new ArrayList<Student>();
	
	// 파일을 읽어서 메모리에 저장
	static
	{	
		FileReader fr=null; // int i=0;
		try
		{
			fr=new FileReader("c:\\java.datas\\school.txt");
			StringBuffer sb=new StringBuffer();
			int i=0; // 문자받기
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			// 1|홍길동|90|90|90|270|90.00\n
			// 학생별 구분
			String[] stds=sb.toString().split("\n"); 
			for(String ss:stds) {
				// 학생 데이터별 구분
				StringTokenizer st=new StringTokenizer(ss,"|");
				Student s=new Student();
				s.setHakbun(Integer.parseInt(st.nextToken())); // String -> Integer
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				// s.setTotal(Integer.parseInt(st.nextToken()));
				// s.setAvg(Double.parseDouble(st.nextToken()));
				int total=s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace(); // 에러 위치 확인
		}
		finally
		{
			try
			{
				fr.close();
			} catch (Exception e) {}
		}
		
	}
	public int menu()
	{
		System.out.println("======== 메뉴 =========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("======================");
		int no=0;
		try {
			// 키보드 읽기 => 예외처리 => Scanner 대체
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("메뉴 번호 입력:");
			String str=in.readLine();
			no=Integer.parseInt(str);
		} catch (Exception e) {}
		return no;
	}
	public void process()
	{
		while(true) {
			int no=menu();
			if(no==5) {
				System.out.println("프로그램 종료");
				// 한글 저장할 때 FileWriter가 편리하다
				FileWriter fw=null;
				try
				{
					// 자바 프로그램과 파일 연결 => 스트림 (출력 스트림)
					// 2byte씩 전송한다 (문자 스트림) => 한글(2byte)
					// 알파벳, 숫자는 1byte,2byte 상관없이 가능
					fw=new FileWriter("c:\\java.datas\\school.txt"); // 파일 연결중 stream 통로 생성
					String temp="";
					for(Student ss:stdList) {
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"
								+ ss.getKor()+"|"+ss.getEng()+"|"
								+ ss.getMath()+"\n";
					}
					fw.write(temp);
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally
				{
					try
					{
						fw.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				break;
			}
			else if(no==1) {
				for(Student ss:stdList) {
					int total=ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					System.out.println(ss.getHakbun()+" "
									+ ss.getName()+" "
									+ ss.getKor()+" "
									+ ss.getEng()+" "
									+ ss.getMath()+" "
									+ ss.getTotal()+" "
									+ String.format("%.2f", ss.getAvg()));
				}
			}
			else if(no==2) {
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.print("이름 입력:");
					String name=in.readLine();
					System.out.print("국어 점수:");
					String kor=in.readLine();
					System.out.print("영어 점수:");
					String eng=in.readLine();
					System.out.print("수학 점수:");
					String math=in.readLine();
					
					// 시퀀스 => 자동 증가 번호 만들기
					int max=0;
					for(Student ss:stdList) {
						if(ss.getHakbun()>max)
							max=ss.getHakbun(); // 학번 자동 생성
					}
					Student s=new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					stdList.add(s);
				} catch (Exception e) {}
			}
			else if(no==4) {
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번 입력:");
					String hak=in.readLine();
					int i=0; // 인덱스 번호
					for(Student ss:stdList) {
						if(ss.getHakbun()==Integer.parseInt(hak)) {
							stdList.remove(i);
							break;
						}
						i++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
