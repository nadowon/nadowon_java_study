// ID/PWD를 받아서 로그인 처리
import java.util.Scanner;
/*
 *  리턴형은 경우의 수
 *  두 개 => boolean
 *  세 개 => int / String (경우의 수가 많을 경우, String으로 표시하는게 읽기 쉽다)
 *          ID가 없는 경우 1 NOID
 *          ID는 존재, Password가 틀리는 경우 2 NOPWD
 *          ID,PWD 로그인된 경우 3 LOGIN
 *          -------------------------------
 *          1. 재사용이 좋아야한다
 *          2. 견고해야한다
 *          3. 가독성이 높아야한다
 *          
 */
public class 메소드_2 {
	static String isLogin(String id, String pwd)
	{
		String[] ids= {"hong","park","shim","lee","kang"};
		String[] pwds= {"1234","3456","4567","5678","6789"};
		String[] names={"홍길동","박문수","심청이","이순신","강감찬"};
		// 파일, 오라클, 메모리에 저장(휘발성)
		
		// id 검색
		int index=0;
		boolean bCheck=false;
		for(int i=0;i<ids.length;i++) {
			if(id.equals(ids[i])) {
				bCheck=true; // ID가 존재한다
				index=i;
				break;
			}
		}
		String result=""; // 경우의 수가 3가지라서 String 사용
		if(bCheck==true) {
			// ID가 존재
			// 비밀번호 검색
			if(pwd.equals(pwds[index])) {
				result=names[index]; // 로그인된 상태
			}
			else {
				result="NOPWD"; // 비밀번호가 틀리다
			}
		}
		else {
			// ID가 없는 상태
			result="NOID";
		}
		
		return result;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String id=scan.next();
		
		System.out.print("Password 입력:");
		String pwd=scan.next();
		
		// 검증(로그인 처리)
		String result=isLogin(id,pwd);
		
		if(result.equals("NOID")) { // ID가 없는 상태
			System.out.println("ID가 존재하지 않는다");
		}
		else if(result.equals("NOPWD")) { // 비밀번호가 틀린 상태
			System.out.println("비밀번호가 틀리다");
		}
		else { // 로그인된 상태
			System.out.println(result+"님 로그인되었습니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
