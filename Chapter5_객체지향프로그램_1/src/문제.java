class 영화
{
	String poster;
	String title;
	String engtitle;
	String regdate;
	String type;
	String country;
	String grade;
	String time;
	double score;
	int rank; // 수시로 변경
	String story;
}
class 신문기사
{
	String poster;
	String title;
	String content;
	String date;
	String company;
}
class 카테고리
{
	int cno;
	String poster;
	String title;
	String subject;
}
class 가게정보
{
	int no;
	String title;
	double score;
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime, etime;
	String menu;
}
class 레시피
{
	String video;
	String title;
	String chef;
	String chef_image;
	int star;
	int comment;
	int hit;
}
class 음악
{
	int rank;
	String poster;
	String title;
	String singer;
	String album;
	int heart;
	int state;
}
class 마트
{
	int sale; // 25 // "↓"+sale+"%"
	String poster;
	String title;
	int price; // 장바구니에서 합산해야하므로 int 사용
}
class 연극
{
	String poster;
	String title;
	boolean isShow;
	String type;
	String start,end;
	String place;
	String actor;
	String grade;
	String time;
}
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
