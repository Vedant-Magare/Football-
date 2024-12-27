package com.tka.vedant.Football;

public class Match {

	String matchID;
	String matchHomeTeam;
	String matchAwayTeam;
	String matchDate;
	String matchTime;
	String matchVenue;
	String matchReferee;

	public Match(String matchID, String matchHomeTeam, String matchAwayTeam, String matchDate, String matchTime,
			String matchVenue, String matchReferee) {
		super();
		this.matchID = matchID;
		this.matchHomeTeam = matchHomeTeam;
		this.matchAwayTeam = matchAwayTeam;
		this.matchDate = matchDate;
		this.matchTime = matchTime;
		this.matchVenue = matchVenue;
		this.matchReferee = matchReferee;
	}

	public String getMatchID() {
		return matchID;
	}

	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}

	public String getMatchHomeTeam() {
		return matchHomeTeam;
	}

	public void setMatchHomeTeam(String matchHomeTeam) {
		this.matchHomeTeam = matchHomeTeam;
	}

	public String getMatchAwayTeam() {
		return matchAwayTeam;
	}

	public void setMatchAwayTeam(String matchAwayTeam) {
		this.matchAwayTeam = matchAwayTeam;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	public String getMatchVenue() {
		return matchVenue;
	}

	public void setMatchVenue(String matchVenue) {
		this.matchVenue = matchVenue;
	}

	public String getMatchReferee() {
		return matchReferee;
	}

	public void setMatchReferee(String matchReferee) {
		this.matchReferee = matchReferee;
	}

}
