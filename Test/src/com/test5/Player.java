package com.test5;

public class Player {

	private int plid;
	private String name;
	private String country_name;
	private String team;
	
	public Player() {
		
	}

	public Player(int plid, String name, String country_name, String team) {
		super();
		this.plid = plid;
		this.name = name;
		this.country_name = country_name;
		this.team = team;
	}

	public int getPlid() {
		return plid;
	}

	public void setPlid(int plid) {
		this.plid = plid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [plid=" + plid + ", name=" + name + ", country_name=" + country_name + ", team=" + team + "]";
	}
	
	
	
	
}
