package com.test5;

import java.util.List;

public class Movie {

	private int movieid;
	private String moovieName;
	private List<String> actor;
	
	public Movie() {
		
	}
	
	public Movie(int movieid, String moovieName, List<String> actor) {
		super();
		this.movieid = movieid;
		this.moovieName = moovieName;
		this.actor = actor;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoovieName() {
		return moovieName;
	}

	public void setMoovieName(String moovieName) {
		this.moovieName = moovieName;
	}

	public List<String> getActor() {
		return actor;
	}

	public void setActor(List<String> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moovieName=" + moovieName + ", actor=" + actor + "]";
	}
	
	
	
}
