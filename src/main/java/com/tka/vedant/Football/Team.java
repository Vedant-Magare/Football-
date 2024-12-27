package com.tka.vedant.Football;

public class Team {

	String teamName;
	String teamHomeCity;
	String teamCoach;
	String teamTitlesWon;
	String teamPlayersList;

	public Team(String teamName, String teamHomeCity, String teamCoach, String teamTitlesWon, String teamPlayersList) {
		super();
		this.teamName = teamName;
		this.teamHomeCity = teamHomeCity;
		this.teamCoach = teamCoach;
		this.teamTitlesWon = teamTitlesWon;
		this.teamPlayersList = teamPlayersList;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamHomeCity() {
		return teamHomeCity;
	}

	public void setTeamHomeCity(String teamHomeCity) {
		this.teamHomeCity = teamHomeCity;
	}

	public String getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

	public String getTeamTitlesWon() {
		return teamTitlesWon;
	}

	public void setTeamTitlesWon(String teamTitlesWon) {
		this.teamTitlesWon = teamTitlesWon;
	}

	public String getTeamPlayersList() {
		return teamPlayersList;
	}

	public void setTeamPlayersList(String teamPlayersList) {
		this.teamPlayersList = teamPlayersList;
	}

}
