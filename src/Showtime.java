package com.project.items;

import java.util.Random;

public class Showtime {

	Seat[][] seats = new Seat[5][5];
	private double price;
	private int showtimeFill = 0;
	private String name;

	public String getName() {
		return name;
	}

	public class Seat { // Sold or not sold situation

		private boolean control;
		private String personType;

		public boolean getControl() {
			return control;
		}

		public void setControl(boolean x) {
			control = x;
		}

		public String getPersonType() {
			return personType;
		}

		public void setPersonType(String personType) {
			this.personType = personType;
		}

	}

	public Showtime(String name) {
		price = 0.0;
		for (int i = 0; i < seats[0].length; i++) {
			for (int j = 0; j < seats[1].length; j++) {
				seats[i][j] = new Seat();
			}
		}
		this.name = name;

	}

	private void setSeat(int row, int column) {
		if (seats[row][column].getControl() != true) {
			seats[row][column].setControl(true);
		} else {
			Random rnd = new Random();
			int rnd1 = rnd.nextInt(5);
			int rnd2 = rnd.nextInt(5);
			while (seats[rnd1][rnd2].getControl()) {
				rnd1 = rnd.nextInt(5);
				rnd2 = rnd.nextInt(5);
			}
			seats[rnd1][rnd2].setControl(true);
		}

	}

	public void setSeat(char row, int number) {
		int intRow = -1;
		switch (row) {
		case 'A':
			intRow = 0;
			break;
		case 'B':
			intRow = 1;
			break;
		case 'C':
			intRow = 2;
			break;
		case 'D':
			intRow = 3;
			break;
		case 'E':
			intRow = 4;
			break;
		}
		setSeat(intRow, number);
	}

	public void cancelSeat(char row, int number) {
		int intRow = -1;
		switch (row) {
		case 'A':
			intRow = 0;
			break;
		case 'B':
			intRow = 1;
			break;
		case 'C':
			intRow = 2;
			break;
		case 'D':
			intRow = 3;
			break;
		case 'E':
			intRow = 4;
			break;
		}
		cancelSeat(intRow, number);
	}

	private void cancelSeat(int row, int column) {

		if (seats[row][column].getControl() == true) {
			seats[row][column].setControl(false);
		} else {
			System.out.println("The ticket that you choose isn't sold. row=" + row + ", column =" + column);
		}
	}

	public Seat[][] getSeat() {
		return seats;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getShowtimeFill() {
		return showtimeFill;
	}

	public void setShowtimeFill(int showtimeFill) {
		this.showtimeFill = showtimeFill;
	}

	public void increaseShowtimeFill() {
		showtimeFill += 1;
	}

}