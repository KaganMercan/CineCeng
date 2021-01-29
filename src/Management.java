package com.project.items;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import enigma.core.Enigma;

public class Management {

	enigma.console.Console console = Enigma.getConsole("CineCeng", 80, 30, 12, 0);

	public void loadFile() throws IOException {
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("C:\\Users\\Kaðan\\Desktop\\Movie Info\\input.txt"));
			String line = null;
			while ((line = bf.readLine()) != null) {
				command(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void command(String command) {

		String commandName = command;
		if (command.contains(";"))
			commandName = command.substring(0, command.indexOf(";"));
		switch (commandName) {
		case "addStar":
			addStar(command);
			break;
		case "addDirector":
			addDirector(command);
			break;
		case "addMovie":
			addMovie(command);
			break;
		case "sellTicket":
			sellTicket(command);
			break;
		case "cancelTicket":
			cancelTicket(command);
			break;
		case "updateShowtime":
			updateShowTime(command);
			break;
		case "updateSaloon":
			updateSaloon(command);
			break;

		}
	}

	Star[] starlist = new Star[12];
	public int counterstar = 0;
	Director[] directorlist = new Director[4];
	public int counterdir = 0;
	Movie[] movielist = new Movie[5];
	public int countermovie = 0;
	Saloon[] saloons = new Saloon[3];
	Showtime[] showtimes = new Showtime[3];
	double[] price = new double[9];
	int counterprice = 0;

	public void addStar(String command) {
		String[] splitted = command.split(";");
		Star star = new Star(counterstar, splitted[1], splitted[2], splitted[3]);
		starlist[counterstar] = star;
		counterstar++;

	}

	public void addDirector(String command) {
		String[] splitted = command.split(";");
		Director director = new Director(counterdir, splitted[1], splitted[2], splitted[3]);
		directorlist[counterdir] = director;
		counterdir++;

	}

	public void addMovie(String command) {
		String[] splitted = command.split(";");
		Movie movie = new Movie(countermovie, splitted[1], splitted[2], splitted[3]);
		movielist[countermovie] = movie;
		countermovie++;

	}

	public void displayActors() {
		for (int i = 0; i < counterstar; i++) {

			System.out.println("Star Name: " + starlist[i].getStarname() + "\tBD : " + starlist[i].getStarbd()
					+ "   Birthplace : " + starlist[i].getStarbp());
		}
	}

	public void displayDirectors() {
		for (int i = 0; i < counterdir; i++) {

			System.out.println("Director Name : " + directorlist[i].getDirectorname() + "\tBD : "
					+ directorlist[i].getDirectorbd() + "   Birthplace : " + directorlist[i].getDirectorbp());

		}

	}

	public void displayMovies() {
		for (int i = 0; i < countermovie; i++) {

			System.out.println("Movie ID : " + movielist[i].getMovieid() + "   Movie Name : " + movielist[i].getTitle()
					+ "\tGenre : " + movielist[i].getGenre() + "\tDuration : " + movielist[i].getDuration());
		}
	}

	public void displaySeats() {

		console.getTextWindow().setCursorPosition(12, 4);
		System.out.println("S1");
		console.getTextWindow().setCursorPosition(0, 8);
		System.out.println("MORNING");

		Showtime showtime = saloons[0].getShowtime("morning");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 10, i + 6);
				if (showtime.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}
		console.getTextWindow().setCursorPosition(0, 14);
		System.out.println("NOON");
		System.out.println();
		Showtime showtime2 = saloons[0].getShowtime("noon");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 10, i + 12);
				if (showtime2.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}
		System.out.println();
		Showtime showtime3 = saloons[0].getShowtime("evening");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 10, i + 18);
				if (showtime3.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}
		console.getTextWindow().setCursorPosition(22, 4);
		System.out.println("S2");

		Showtime showtime4 = saloons[1].getShowtime("morning");
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 20, i + 6);
				if (showtime4.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();

		}

		Showtime showtime5 = saloons[1].getShowtime("noon");
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 20, i + 12);
				if (showtime5.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();

		}

		Showtime showtime6 = saloons[1].getShowtime("evening");
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 20, i + 18);
				if (showtime6.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}

		console.getTextWindow().setCursorPosition(32, 4);
		System.out.println("S3");

		Showtime showtime7 = saloons[2].getShowtime("morning");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 30, i + 6);
				if (showtime7.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}
		Showtime showtime8 = saloons[2].getShowtime("noon");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				console.getTextWindow().setCursorPosition(j + 30, i + 12);

				if (showtime8.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}

		console.getTextWindow().setCursorPosition(0, 20);
		System.out.println("EVENING");
		Showtime showtime9 = saloons[2].getShowtime("evening");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				console.getTextWindow().setCursorPosition(j + 30, i + 18);
				if (showtime9.getSeat()[i][j].getControl()) {
					System.out.print("X");
				} else
					System.out.print("O");
			}
			System.out.println();
		}
	}

	private void updateSaloon(String command) {
		String[] splitted = command.split(";");

		int saloonId = Integer.parseInt(command.split(";")[1].substring(1)) - 1;
		saloons[saloonId] = new Saloon(movielist[Integer.parseInt(splitted[2]) - 1], "s" + (saloonId + 1));

	}

	public void updateShowTime(String command) {
		String[] splitted = command.split(";");
		int saloonID = Integer.parseInt(command.split(";")[1].substring(1)) - 1;

		saloons[saloonID].getShowtime(splitted[2]).setPrice(Double.parseDouble(splitted[3]));
		price[counterprice] = saloons[saloonID].getShowtime(splitted[2]).getPrice();
		counterprice++;

	}

	private void cancelTicket(String command) {
		String[] splitted = command.split(";");
		int column = Integer.parseInt(splitted[3].substring(1));
		char row = splitted[3].substring(0, 1).charAt(0);

		int saloonID = Integer.parseInt(splitted[1].substring(1)) - 1;
		if (!(column == -1)) {
			saloons[saloonID].getShowtime(splitted[2]).cancelSeat(row, column - 1);
			saloons[saloonID].getMovie().decreaseWatchCount();

		}

	}

	public static double revenue = 0.0;

	// DO staff about sellTicket
	public void sellTicket(String command) {
		String[] splitted = command.split(";");
		int column = Integer.parseInt(splitted[3].substring(1));
		char row = splitted[3].substring(0, 1).charAt(0);

		int saloonID = Integer.parseInt(splitted[1].substring(1, 2)) - 1;
		if (!(column == -1)) {
			saloons[saloonID].getShowtime(splitted[2]).setSeat(row, column - 1);
			saloons[saloonID].getMovie().increaseWatchCount();
			saloons[saloonID].getShowtime("morning").increaseShowtimeFill();
			saloons[saloonID].getShowtime("noon").increaseShowtimeFill();
			saloons[saloonID].getShowtime("evening").increaseShowtimeFill();
		}

		String person = splitted[4];

		if (saloonID == 0) {
			if (splitted[2].equals("morning")) {
				if (person.equals("regular")) {
					revenue = revenue + price[0];

				} else if (person.equals("student")) {
					revenue = (price[0] / 2) + revenue;
				}

			} else if (splitted[2].equals("noon")) {
				if (person.equals("regular")) {
					revenue = revenue + price[1];
				} else if (person.equals("student")) {

					revenue = revenue + (price[1] / 2);
				}
			} else if (splitted[2].equals("evening")) {
				if (person.equals("regular")) {
					revenue = revenue + price[2];
				} else if (person.equals("student")) {
					revenue = revenue + (price[2] / 2);
				}
			}

		} else if (saloonID == 1) {
			if (splitted[2].equals("morning")) {
				if (person.equals("regular")) {
					revenue = revenue + price[3];
				} else if (person.equals("student")) {
					revenue = revenue + (price[3] / 2);
				}
			} else if (splitted[2].equals("noon")) {
				if (person.equals("regular")) {
					revenue = revenue + price[4];
				} else if (person.equals("student")) {
					revenue = revenue + (price[4] / 2);
				}
			} else if (splitted[2].equals("evening")) {
				if (person.equals("regular")) {
					revenue = revenue + price[5];
				} else if (person.equals("student")) {
					revenue = revenue + (price[5] / 2);
				}

			} else if (saloonID == 2) {
				if (splitted[2].equals("morning")) {
					if (person.equals("regular")) {
						revenue = revenue + price[6];
					} else if (person.equals("student")) {
						revenue = revenue + (price[6] / 2);
					}
				} else if (splitted[2].equals("noon")) {
					if (person.equals("regular")) {
						revenue = revenue + price[7];
					} else if (person.equals("student")) {
						revenue = revenue + (price[7] / 2);
					}
				}
			} else if (splitted[2].equals("evening")) {
				if (person.equals("regular")) {
					revenue = revenue + price[8];
				} else if (person.equals("student")) {
					revenue = revenue + (price[8] / 2);
				}
			}

		}

	}

	public void endTheDay() {

		Movie mostWatched = null;
		int mostWatchedCount = -1;
		for (int i = 0; i < movielist.length; i++) {
			if (mostWatchedCount < movielist[i].getWatchCount()) {
				mostWatched = movielist[i];
				mostWatchedCount = mostWatched.getWatchCount();
			}
		}
		Showtime mostFilled = null;
		int mostFilledCount = -1;
		for (int i = 0; i < saloons.length; i++) {

			Showtime morning = saloons[i].getShowtime("morning"), noon = saloons[i].getShowtime("noon"),
					evening = saloons[i].getShowtime("evening");
			if (mostFilledCount < morning.getShowtimeFill()) {
				mostFilled = morning;
				mostFilledCount = mostFilled.getShowtimeFill();
			}
			if (mostFilledCount < noon.getShowtimeFill()) {
				mostFilled = noon;
				mostFilledCount = mostFilled.getShowtimeFill();
			}
			if (mostFilledCount < evening.getShowtimeFill()) {
				mostFilled = evening;
				mostFilledCount = mostFilled.getShowtimeFill();
			}

		}
		Movie highestIncome = null;
		int highestIncomeCount = -1;
		for (int i = 0; i < saloons.length; i++) {
			Saloon saloon = saloons[i];
			int currentCount = 0;

			Showtime morning = saloon.getShowtime("morning");
			for (int k = 0; k < 5; k++) {
				for (int l = 0; l < 5; l++) {
					if ("student".equals(morning.getSeat()[k][l].getPersonType())) {
						currentCount += morning.getPrice() / 2;
					} else {
						currentCount += morning.getPrice();
					}
				}
			}

			Showtime noon = saloon.getShowtime("noon");
			for (int k = 0; k < 5; k++) {
				for (int l = 0; l < 5; l++) {
					if ("student".equals(noon.getSeat()[k][l].getPersonType())) {
						currentCount += noon.getPrice() / 2;
					} else {
						currentCount += noon.getPrice();
					}
				}
			}

			Showtime evening = saloon.getShowtime("evening");
			for (int k = 0; k < 5; k++) {
				for (int l = 0; l < 5; l++) {
					if ("student".equals(evening.getSeat()[k][l].getPersonType())) {
						currentCount += evening.getPrice() / 2;
					} else {
						currentCount += evening.getPrice();
					}
				}
			}

			if (saloon.getMovie() == highestIncome) {
				highestIncomeCount += currentCount;
			} else if (highestIncomeCount < currentCount) {
				highestIncome = saloon.getMovie();
				highestIncomeCount = currentCount;

			}
		}

		console.getTextWindow().setCursorPosition(0, 0);
		System.out.println("The most-watched movie : " + mostWatched.getTitle());
		System.out.println("Total revenue of CineCENG : " + revenue);
		System.out.println("The most-filled showtime : " + mostFilled.getName());
		System.out.println("The highest-income movie : " + highestIncome.getTitle() + " - " + highestIncomeCount);
		displaySeats();
	}
}