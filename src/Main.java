package com.project.items;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static boolean flag = true;

	public static void Menu(String usercommand) throws IOException {

		Management system = new Management();
		system.loadFile();

		if ((usercommand).equalsIgnoreCase("display actors")) {
			System.out.println("STAR LIST = \n");
			system.displayActors();

		} else if ((usercommand).equalsIgnoreCase("display directors")) {
			System.out.println("DIRECTORS = \n");

			system.displayDirectors();
		} else if ((usercommand).equals("display movies")) {
			System.out.println("MOVIES = \n");

			system.displayMovies();
		} else if ((usercommand).equals("endtheday")) {
			for (int i = 0; i < 50; i++) {
				System.out.println(" ");
			}
			system.endTheDay();

		} else {

			System.out.println("Please enter again");
			flag = false;

		}

	}

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		menu: for (int i = 0; i < 10; i++) {

			System.out.println("Please enter the command wished: ");
			System.out.println("For displaying stars : 'display actors'");
			System.out.println("For displaying directors : 'display directors'");
			System.out.println("For displaying movies : 'display movies'");
			System.out.println("For displaying the statics : 'endtheday'");

			String ucommand = s.nextLine();

			Menu(ucommand);

			if (flag == false) {
				continue menu;
			}
		}
		s.close();

	}

}
