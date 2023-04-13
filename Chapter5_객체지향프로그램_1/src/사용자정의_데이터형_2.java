// 데이터가 있어야한다 / 기능을 가지고 있어야한다
//     명사형               동사형
/*
 *   명사형(변수) : 번호 / 작성자 / 제목 / 내용 / 비밀번호 / 작성일 / 조회수
 *   동사형(메소드) : 글쓰기 / 수정하기 / 내용보기 / 삭제하기 / 조회수 올리기
 *   
 *   학생 => 유형
 *   게시판 => 무형
 *   ------------- 모든 것을 단순화 => 객체 지향 프로그램
 *   시계 초침, 분침, 시침
 *   
 *   클래스
 *    ***= 변수 여러 개를 저장하는 공간 => 사용자정의 데이터형 : 데이터형 클래스
 *      ~VO(Spring), ~DTO(MyBatis), ~Bean(JSP)
 *                    date transfor object
 *       value object(기능은 없고 값만 가진다)
 *    ***= 기능만 설정하는 클래스 :    ~DAO,      ~Service,    ~Manager
 *                            데이터베이스연결, 브라우저 전산, 파일에서 불러오기 Jsoup (액션 클래스)
 *    = 변수+메소드 혼합 => 극히 드물다
 */
// -- 커뮤니티 CURD(IUSD)
class Board
{
	int no; // 0
	String name; // null
	String subject; // null
	String content; // null
	String pwd; // 본인여부 확인
	String regdate; // null
	int hit; // 0
}
public class 사용자정의_데이터형_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫번째 게시물
		Board b1=new Board();
		System.out.println("b1="+b1); // Board@515f550a => 데이터 7개를 저장할 수 있는 메모리 공간 생성
		b1.no=1; 
		b1.name="홍길동"; 
		b1.subject="메모리 공간 만들기(사용자 정의)";
		b1.content="class를 이용해서 데이터를 모아서 관리";
		b1.regdate="2023-04-12";
		b1.pwd="1234";
		// b1.hit=0; // hit은 자동으로 0으로 초기화
		System.out.println("게시물 번호:"+b1.no);
		System.out.println("작성자:"+b1.name);
		System.out.println("제목:"+b1.subject);
		System.out.println("내용:"+b1.content);
		System.out.println("작성일:"+b1.regdate);
		System.out.println("조회수:"+b1.hit);
	}

}
