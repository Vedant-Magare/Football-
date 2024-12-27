package com.tka.vedant.Football;

public class League {

	String leagueName;
	String leagueCountry;
	String leagueTeams;
	String leagueSeason;
	String leagueTotalMatches;
	String leagueSponsors;

	public League(String leagueName, String leagueCountry, String leagueTeams, String leagueSeason,
			String leagueTotalMatches, String leagueSponsors) {
		super();
		this.leagueName = leagueName;
		this.leagueCountry = leagueCountry;
		this.leagueTeams = leagueTeams;
		this.leagueSeason = leagueSeason;
		this.leagueTotalMatches = leagueTotalMatches;
		this.leagueSponsors = leagueSponsors;

	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueCountry() {
		return leagueCountry;
	}

	public void setLeagueCountry(String leagueCountry) {
		this.leagueCountry = leagueCountry;
	}

	public String getLeagueTeams() {
		return leagueTeams;
	}

	public void setLeagueTeams(String leagueTeams) {
		this.leagueTeams = leagueTeams;
	}

	public String getLeagueSeason() {
		return leagueSeason;
	}

	public void setLeagueSeason(String leagueSeason) {
		this.leagueSeason = leagueSeason;
	}

	public String getLeagueTotalMatches() {
		return leagueTotalMatches;
	}

	public void setLeagueTotalMatches(String leagueTotalMatches) {
		this.leagueTotalMatches = leagueTotalMatches;
	}

	public String getLeagueSponsors() {
		return leagueSponsors;
	}

	public void setLeagueSponsors(String leagueSponsors) {
		this.leagueSponsors = leagueSponsors;
	}

}
