package com.sist.movie2;
// 영화 한 개에 대한 설계 ==> 저장(new) => 사용자 정의 데이터형(메모리 저장, 읽기)
// 값만 가지고 있다 => VO	(value of)
// 브라우저에 데이터를 묶어서 전송할 목적 => DTO (data transfer object)
public class Movie {

	private String title;
	private String genre;
	private String director;
	private String actor;
	private String story;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	
}