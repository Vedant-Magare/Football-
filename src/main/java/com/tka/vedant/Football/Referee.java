package com.tka.vedant.Football;

public class Referee {

	String refereeName;
	int refereeAge;
	String refereeYellowCardIssued;
	String refereeRedCardIssued;

	public Referee(String refereeName, int refereeAge, String refereeYellowCardIssued, String refereeRedCardIssued) {
		super();
		this.refereeName = refereeName;
		this.refereeAge = refereeAge;
		this.refereeYellowCardIssued = refereeYellowCardIssued;
		this.refereeRedCardIssued = refereeRedCardIssued;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public int getRefereeAge() {
		return refereeAge;
	}

	public void setRefereeAge(int refereeAge) {
		this.refereeAge = refereeAge;
	}

	public String getRefereeYellowCardIssued() {
		return refereeYellowCardIssued;
	}

	public void setRefereeYellowCardIssued(String refereeYellowCardIssued) {
		this.refereeYellowCardIssued = refereeYellowCardIssued;
	}

	public String getRefereeRedCardIssued() {
		return refereeRedCardIssued;
	}

	public void setRefereeRedCardIssued(String refereeRedCardIssued) {
		this.refereeRedCardIssued = refereeRedCardIssued;
	}

}
