package com.sist.music;

public class Music {
	private int mno;	// 고유번호 => 중복 없는 데이터
	private int cno;	// 카테고리 번호 => 1.지니 2.멜론
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCrement() {
		return crement;
	}
	public void setCrement(int crement) {
		this.crement = crement;
	}
	
}
