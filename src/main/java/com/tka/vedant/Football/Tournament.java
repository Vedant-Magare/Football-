package com.tka.vedant.Football;

public class Tournament {

	String tournamentName;
	String tournamentType;
	int tournamentParticipatingTeam;
	String tournamentLocation;
	int tournamentMatchedPlayed;

	public Tournament(String tournamentName, String tournamentType, int tournamentParticipatingTeam,
			String tournamentLocation, int tournamentMatchedPlayed) {
		super();
		this.tournamentName = tournamentName;
		this.tournamentType = tournamentType;
		this.tournamentParticipatingTeam = tournamentParticipatingTeam;
		this.tournamentLocation = tournamentLocation;
		this.tournamentMatchedPlayed = tournamentMatchedPlayed;

	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(String tournamentType) {
		this.tournamentType = tournamentType;
	}

	public int getTournamentParticipatingTeam() {
		return tournamentParticipatingTeam;
	}

	public void setTournamentParticipatingTeam(int tournamentParticipatingTeam) {
		this.tournamentParticipatingTeam = tournamentParticipatingTeam;
	}

	public String getTournamentLocation() {
		return tournamentLocation;
	}

	public void setTournamentLocation(String tournamentLocation) {
		this.tournamentLocation = tournamentLocation;
	}

	public int getTournamentMatchedPlayed() {
		return tournamentMatchedPlayed;
	}

	public void setTournamentMatchedPlayed(int tournamentMatchedPlayed) {
		this.tournamentMatchedPlayed = tournamentMatchedPlayed;
	}

}
