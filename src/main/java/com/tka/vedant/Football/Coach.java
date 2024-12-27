package com.tka.vedant.Football;


public class Coach {

	String coachName;
	int coachAge;
	String coachNationallity;
	String coachTeam;
	String coachExperiences;

	public Coach(String coachName, int coachAge, String coachNationallity, String coachTeam, String coachExperiences) {
		super();
		this.coachName = coachName;
		this.coachAge = coachAge;
		this.coachNationallity = coachNationallity;
		this.coachTeam = coachTeam;
		this.coachExperiences = coachExperiences;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getCoachAge() {
		return coachAge;
	}

	public void setCoachAge(int coachAge) {
		this.coachAge = coachAge;
	}

	public String getCoachNationallity() {
		return coachNationallity;
	}

	public void setCoachNationallity(String coachNationallity) {
		this.coachNationallity = coachNationallity;
	}

	public String getCoachTeam() {
		return coachTeam;
	}

	public void setCoachTeam(String coachTeam) {
		this.coachTeam = coachTeam;
	}

	public String getCoachExperiences() {
		return coachExperiences;
	}

	public void setCoachExperiences(String coachExperiences) {
		this.coachExperiences = coachExperiences;
	}

}
