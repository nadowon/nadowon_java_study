/*
 *  1. 같은 자바파일에 클래스를 여러 개 만들 수 있다
 *     ----------------
 *     public은 한 개의 class에서만 사용이 가능
 *     
 *  2. 권장사항 => 파일을 따로 만든다
 */
class Category
{
	int no; // 카테고리 구분 번호
	String poster;
	String title;
	String subject;
}
/*
 *  멤버변수 (인스턴스변수)
 *  -----------------
 *  1. 기본형
 *  2. 배열
 *  3. 클래스
 *  
 *  
 */
class FoodHouse
{
	int no; // 구분문자, 중복이 안 된 숫자 => primary key => 상세보기
	int cno; // 참조키 => foreign key
	String[] poster=new String[5]; // 페이지마다 5장의 사진이 고정으로 나와서(동일해서) 배열을 쓸 수 있음
	String title;
	double score;
	String address1,address2;
	String tel;
	String food;
	String price;
	String parking;
	String stime, etime;
	String hol;
	String menu; // 카테고리마다 메뉴 갯수가 달라서 배열을 못씀 => 메뉴 전체를 통으로 저장
}
public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
