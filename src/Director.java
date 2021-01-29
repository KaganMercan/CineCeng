package com.project.items;

public class Director {

	private int directorid;
	private String directorname;
	private String directorbd;
	private String directorbp;
	public static Director[] directorlist = new Director[10];
	public static int counterdir = 0;

	Director(int directorid, String directorname, String directorbd, String directorbp) {

		this.directorid = directorid;
		this.directorname = directorname;
		this.directorbd = directorbd;
		this.directorbp = directorbp;
	}

	Director() {

		directorid = 0;
		directorname = null;
		directorbd = null;
		directorbp = null;
	}

	public int getDirectorid() {
		return directorid;
	}

	public void setDirectorid(int directorid) {
		this.directorid = directorid;
	}

	public String getDirectorname() {
		return directorname;
	}

	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}

	public String getDirectorbd() {
		return directorbd;
	}

	public void setDirectorbd(String directorbd) {
		this.directorbd = directorbd;
	}

	public String getDirectorbp() {
		return directorbp;
	}

	public void setDirectorbp(String directorbp) {
		this.directorbp = directorbp;
	}
}