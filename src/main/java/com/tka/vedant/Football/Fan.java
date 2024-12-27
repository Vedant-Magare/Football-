package com.tka.vedant.Football;

public class Fan {

	String fanName;
	int fanAge;
	String fanFavoriteTeam;
	String fanMembershipID;

	public Fan(String fanName, int fanAge, String fanFavoriteTeam, String fanMembershipID) {
		super();
		this.fanName = fanName;
		this.fanAge = fanAge;
		this.fanFavoriteTeam = fanFavoriteTeam;
		this.fanMembershipID = fanMembershipID;
	}

	public String getFanName() {
		return fanName;
	}

	public void setFanName(String fanName) {
		this.fanName = fanName;
	}

	public int getFanAge() {
		return fanAge;
	}

	public void setFanAge(int fanAge) {
		this.fanAge = fanAge;
	}

	public String getFanFavoriteTeam() {
		return fanFavoriteTeam;
	}

	public void setFanFavoriteTeam(String fanFavoriteTeam) {
		this.fanFavoriteTeam = fanFavoriteTeam;
	}

	public String getFanMembershipID() {
		return fanMembershipID;
	}

	public void setFanMembershipID(String fanMembershipID) {
		this.fanMembershipID = fanMembershipID;
	}

}
