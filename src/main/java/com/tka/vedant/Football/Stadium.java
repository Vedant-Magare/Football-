package com.tka.vedant.Football;

public class Stadium {

	String stadiumName;
	String stadiumLocation;
	String stadiumCapacity;
	int stadiumYearEstablisghed;
	String stadiumsSurfaceType;

	public Stadium(String stadiumName, String stadiumLocation, String stadiumCapacity, int stadiumYearEstablisghed,
			String stadiumsSurfaceType) {
		super();
		this.stadiumName = stadiumName;
		this.stadiumLocation = stadiumLocation;
		this.stadiumCapacity = stadiumCapacity;
		this.stadiumYearEstablisghed = stadiumYearEstablisghed;
		this.stadiumsSurfaceType = stadiumsSurfaceType;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getStadiumLocation() {
		return stadiumLocation;
	}

	public void setStadiumLocation(String stadiumLocation) {
		this.stadiumLocation = stadiumLocation;
	}

	public String getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(String stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	public int getStadiumYearEstablisghed() {
		return stadiumYearEstablisghed;
	}

	public void setStadiumYearEstablisghed(int stadiumYearEstablisghed) {
		this.stadiumYearEstablisghed = stadiumYearEstablisghed;
	}

	public String getStadiumsSurfaceType() {
		return stadiumsSurfaceType;
	}

	public void setStadiumsSurfaceType(String stadiumsSurfaceType) {
		this.stadiumsSurfaceType = stadiumsSurfaceType;
	}

}
