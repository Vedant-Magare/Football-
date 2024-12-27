package com.tka.vedant.Football;

public class FootballAssociation {

	String footballAssociationName;
	String footballAssociationCountry;
	String footballAssociationPresident;

	public FootballAssociation(String footballAssociationName, String footballAssociationCountry,
			String footballAssociationPresident) {
		super();
		this.footballAssociationName = footballAssociationName;
		this.footballAssociationCountry = footballAssociationCountry;
		this.footballAssociationPresident = footballAssociationPresident;
	}

	public String getFootballAssociationName() {
		return footballAssociationName;
	}

	public void setFootballAssociationName(String footballAssociationName) {
		this.footballAssociationName = footballAssociationName;
	}

	public String getFootballAssociationCountry() {
		return footballAssociationCountry;
	}

	public void setFootballAssociationCountry(String footballAssociationCountry) {
		this.footballAssociationCountry = footballAssociationCountry;
	}

	public String getFootballAssociationPresident() {
		return footballAssociationPresident;
	}

	public void setFootballAssociationPresident(String footballAssociationPresident) {
		this.footballAssociationPresident = footballAssociationPresident;
	}

}
