package com.project.items;

public class Star {

	private int starid;
	private String starname;
	private String starbd;
	private String starbp;
	
	
	Star(int id, String name, String bd, String bp){
		starid = id;
		starname = name;
		starbd = bd;
		starbp = bp;
	}
	
	Star(){
		starid = 0;
		starname = null;
		starbd = null;
		starbp = null;
	}
	public int getStarid() {
		return starid;
	}
	
	public void setStarid(int starid) {
		this.starid = starid;
	}
	
	public String getStarname() {
		return starname;
	}

	public void setStarname(String n) {
		this.starname = n;
	}

	public String getStarbd() {
		return starbd;
	}

	public void setStarbd(String starbd) {
		this.starbd = starbd;
	}

	public String getStarbp() {
		return starbp;
	}

	public void setStarbp(String starbp) {
		this.starbp = starbp;
	}
	

}
