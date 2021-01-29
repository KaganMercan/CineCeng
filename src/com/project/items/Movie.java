package com.project.items;

public class Movie {

	private int movieid;
	private String title;
	private String genre;
	private String duration;
	private int watchCount = 0;

	public Movie(int movieid, String title, String genre, String duration) {
		super();
		this.movieid = movieid;
		this.title = title;
		this.genre = genre;
		this.duration = duration;

	}

	Movie() {
		movieid = 0;
		title = null;
		genre = null;
		duration = null;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getWatchCount() {
		return watchCount;
	}

	public void setWatchCount(int watchCount) {
		this.watchCount = watchCount;
	}

	public void increaseWatchCount() {
		this.watchCount += 1;
	}

	public void decreaseWatchCount() {
		this.watchCount -= 1;
	}
}