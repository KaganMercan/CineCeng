package com.project.items;

public class Saloon {

	private Movie movie;
	private String saloonname;
	private Showtime[] showtimes;
	

	public Saloon(Movie movie,String saloonId) {
		saloonname = null;
		this.movie = movie;
		this.showtimes = new Showtime[3];
		showtimes[0] = new Showtime(saloonId+"-morning");
		showtimes[1] = new Showtime(saloonId+"-noon");
		showtimes[2] = new Showtime(saloonId+"-evening");
	}

	public Showtime getShowtime(String time) {
		switch (time) {
		case "morning":
			return showtimes[0];
		case "noon":
			return showtimes[1];
		case "evening":
			return showtimes[2];
		default:
			System.out.println("hata");
			return null;
		}
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getSaloonname() {
		return saloonname;
	}

	public void setSaloonname(String saloonname) {
		this.saloonname = saloonname;
	}

}

