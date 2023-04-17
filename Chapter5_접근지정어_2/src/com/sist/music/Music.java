package com.sist.music;
/*
 * 1. 재사용
 *   = 상속 = is-a
 *     기존의 클래스를 확장해서 사용 => extends
 *    => 자바는 단일 상속만 가능하다
 *            -------
 *       class A
 *       class B extends A (A클래스를 확장해서 사용하겠다) => 라이브러리에서 많이 받아옴
 *       ------------------
 *       class A
 *       class B
 *       class C extends A,B => 오류 (C언어에서는 가능)
 *       C=A+B+알파
 *       
 *       class A
 *       class B extends A
 *       class C extends B
 *       ------------------ 여러개를 동시에 받을 때 하나씩 해줘야함
 *       class A(int a,b,c,d)
 *       class B(int a,b)
 *       -------- A와 B는 다른 클래스 => 크기를 가지지 않는다
 *       A > B => 오류 => 상속이 없으면 크기를 잴 수가 없다
 *       데이터가 많다고 해서 크기가 커지는 건 아니다
 *       
 *       class A(int a,b)
 *       class B(int c) extends A => class B: int a,b,c
 *       A > B => 크기는 상속을 내리는 클래스가 크다, 데이터가 많다고 해서 큰게 아님
 *       
 *               동물
 *                |
 *        포유류  양서류  조류
 *          |
 *         인간
 *          |
 *       남자  여자
 *       
 *   *** 모든 클래스는 Object 상속을 받고 있다
 *       Object => 모든 클래스의 최상위 클래스
 *       
 *   *** 상속의 예외 조건
 *       생성자, static, private, 초기화 블록
 *       
 *   = 포함 = has-a *****
 *     
 */
public class Music {
	private int rank;
	private String state;
	private int idcrement;
	private String title;
	private String singer;
	private String album;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
}
