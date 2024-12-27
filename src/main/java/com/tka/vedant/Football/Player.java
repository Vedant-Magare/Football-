package com.tka.vedant.Football;

public class Player {
	String playerName;
	String playerPosition;
	int playerJersyNumber;
	int playerAge;
	String playerTeam;

	public Player(String playerName, String playerPosition, int playerJersyNumber, int playerAge, String playerTeam) {
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.playerJersyNumber = playerJersyNumber;
		this.playerAge = playerAge;
		this.playerTeam = playerTeam;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public int getPlayerJersyNumber() {
		return playerJersyNumber;
	}

	public void setPlayerJersyNumber(int playerJersyNumber) {
		this.playerJersyNumber = playerJersyNumber;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}

}
