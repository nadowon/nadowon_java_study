// 1. 캡슐화
// => 데이터 보호
// => 데이터 은닉화(private) / 메소드를 통해서 접근이 가능(다른 클래스 연결 => public)
// 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
// 사용자 정의 데이터형 => ~VO
class SutdaCard
{
	private int num;
	private boolean isKwang;
	// getter 읽기
	// setter 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKing(boolean kwang) {
		isKwang = kwang;
	}
	
}
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
