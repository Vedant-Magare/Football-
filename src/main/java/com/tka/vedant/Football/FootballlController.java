package com.tka.vedant.Football;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballlController {

	@GetMapping("FootballPlayers")
	public Map<String, ArrayList<Player>> playerList() {

		// ----------------** THIS ONCES IS A PLAYER SECTION **---------------------

		// Create a Object of Player class using ArrayList()...
		ArrayList<Player> alPlayer = new ArrayList<Player>();

		// --------------------------** Real Madrid Team **------------
		// Fill the values of the Player class Constructor by using create object.....
		Player pr1 = new Player("Luka Modric", "Central Midfielder", 10, 38, "Real Madrid");
		Player pr2 = new Player("Vinícius Júnior", "Left Winger", 7, 23, "real Madrid");
		Player pr3 = new Player("Jude Bellingham", "Central Midfielder / Attacking Midfielder", 5, 21, "real Madrid");
		Player pr4 = new Player("Eduardo Camavinga", "Defensive Midfielder / Left Back", 12, 21, "Real Madrid");
		Player pr5 = new Player("Antonio Rüdiger", "Center Back", 20, 30, "Real Madrid");

		// add the reference variable Object of the player class object...
		alPlayer.add(pr1);
		alPlayer.add(pr2);
		alPlayer.add(pr3);
		alPlayer.add(pr4);
		alPlayer.add(pr5);

		// --------------------------** Manchester City Team **------------
		// Fill the values of the Player class Constructor by using create object.....
		Player pm1 = new Player("Erling Haaland", "Striker", 9, 23, "Manchester City");
		Player pm2 = new Player("Kevin De Bruyne", "Midfielder", 17, 32, "Manchester City");
		Player pm3 = new Player("Phil Foden", "Attacking Midfielder  / Left Winger", 47, 23, "Manchester City");
		Player pm4 = new Player("Bernardo Silva", " Midfielder / Right Winger", 20, 29, "Manchester City");
		Player pm5 = new Player("Rodri", " Defensive Midfielder", 16, 27, "Manchester City");

		// add the reference variable Object of the player class object...
		alPlayer.add(pm1);
		alPlayer.add(pm2);
		alPlayer.add(pm3);
		alPlayer.add(pm4);
		alPlayer.add(pm5);

		// Create a Map with "playersOfTeam" as the key and the ArrayList as the value
		Map<String, ArrayList<Player>> response = new HashMap<>();
		response.put("players", alPlayer);

		return response;
	}

	// ---------------** THIS ONCES IS A TEAM SECTION **--------------------------
	@GetMapping("FootballTeam")
	public Map<String, ArrayList<Team>> teamList() {

		// Create a Object of Team class using ArrayList().......
		ArrayList<Team> alTeam = new ArrayList<Team>();

		// Fill the values of the Team class Constructor by using create object.....
		Team pTeam1 = new Team("Real Madrid Team ", "Madrid, Spain", "Carlo Ancelotti",
				" 1.La Liga Titles: 35 (as of 2024) , 2.UEFA Champions League Titles: 14 (as of 2024, a record), 3.Copa del Rey Titles: 20 ,4.FIFA Club World Cup Titles: 5 , 5.UEFA Super Cup Titles: 5 ,6.Numerous other domestic and international honors.",
				"Luka Modric , Vinícius Júnior , Jude Bellingham , Eduardo Camavinga , Antonio Rüdiger ");
		Team pTeam2 = new Team(" Manchester City", " Manchester, England", "Guardiola (as of 2024)",
				"1.Premier League Titles: 9 (as of 2024) , 2.FA Cup Titles: 6 , 3.EFL Cup Titles: 8 ,4.UEFA Champions League Titles: 1 (2022-23 season) , 5.Community Shield Titles: 6 ,6.Numerous other domestic honors.",
				"Erling Haaland , Kevin De Bruyne , Phil Foden , Bernardo Silva , Rodri");

		// add the reference variable Object of the Team class object...
		alTeam.add(pTeam1);
		alTeam.add(pTeam2);

		// Create a Map with "Team" as the key and the ArrayList as the value
		Map<String, ArrayList<Team>> response = new HashMap<>();
		response.put("Teams", alTeam);

		return response;
	}

	// ---------------** THIS ONCES IS A MATCH SECTION **-----------------------

	@GetMapping("FootballMatches")
	public Map<String, ArrayList<Match>> matchList() {

		// Create a Object of Match class using ArrayList()...
		ArrayList<Match> alMatch = new ArrayList<Match>();

		// Fill the values of the Match class Constructor by using create object.....
		Match m1 = new Match("101", "real Madrid", "Barcelona", "2024-03-02", "21:00",
				"Santiago Bernabéu, Madrid, Spain", "Antonio Mateu Lahoz");
		Match m2 = new Match("102", "Atlético Madrid", "real Madrid", "2024-04-16", "20:45",
				"Cívitas Metropolitano, Madrid, Spain", "Alejandro Hernández");
		Match m3 = new Match("103", "real Madrid", "Sevilla ", "2024-05-12", "19:30",
				"Santiago Bernabéu, Madrid, Spain", "Alejandro Hernández");
		Match m4 = new Match("201", "Manchester City", "Liverpool", "2024-03-10", "16:00",
				"Etihad Stadium, Manchester, England", "Michael Oliver");
		Match m5 = new Match("202", "Manchester United", "Manchester City", "2024-04-20", "18:30",
				"Old Trafford, Manchester, England", "Anthony Taylor");
		Match m6 = new Match("203", "Manchester City", "Arsenal", "2024-05-05", "14:00",
				"Etihad Stadium, Manchester, England", "Paul Tierney");

		// add the reference variable Object of the Match class object...
		alMatch.add(m1);
		alMatch.add(m2);
		alMatch.add(m3);
		alMatch.add(m4);
		alMatch.add(m5);
		alMatch.add(m6);

		// Create a Map with "Match" as the key and the ArrayList as the value
		Map<String, ArrayList<Match>> response = new HashMap<>();
		response.put("Matches", alMatch);

		return response;

	}

	// ---------------** THIS ONCES IS A LEAGUES SECTION **-----------------------
	@GetMapping("FootballLeagues")
	public Map<String, ArrayList<League>> leagueList() {

		// Create a Object of League class using ArrayList()...
		ArrayList<League> alLeague = new ArrayList<League>();

		// Fill the values of the League class Constructor by using create object.....
		League l1 = new League("Premier League", "England",
				"Manchester City , Liverpool , Arsenal , Manchester United , Chelsea , Tottenham Hotspur", "2023/2024",
				"380", "Barclays , Nike , EA Sports");
		League l2 = new League("La Liga", "Spain",
				"Real Madrid , Barcelona , Atletico Madrid , Sevilla , Villarreal , Real Sociedad ", "2023/2024", "380",
				"Santander , Puma , EA Sports");
		League l3 = new League("UEFA Champions League", "Europe",
				"Manchester City , Real Madrid , Bayern Munich , Paris Saint-Germain , Inter Milan , Napoli ",
				"2023/2024", "125", "Heineken , Gazprom , Mastercard , Adidas");

		// add the reference variable Object of the League class object...
		alLeague.add(l1);
		alLeague.add(l2);
		alLeague.add(l3);

		// Create a Map with "League" as the key and the ArrayList as the value
		Map<String, ArrayList<League>> response = new HashMap<>();
		response.put("Leagues", alLeague);

		return response;
	}

	// ---------------** THIS ONCES IS A COACH SECTION **-----------------------
	@GetMapping("FootballCoach")
	public Map<String, ArrayList<Coach>> coachList() {

		// Create a Object of Coach class using ArrayList()...
		ArrayList<Coach> alCoach = new ArrayList<Coach>();

		// Fill the values of the Coach class Constructor by using create object.....
		Coach c1 = new Coach("Pep Guardiola", 53, "Spanish", "Manchester City", "17");
		Coach c2 = new Coach("Jürgen Klopp", 56, "German", "Liverpool", "19");
		Coach c3 = new Coach("José Mourinho", 61, "Portuguese", "AS Roma", "23");
		Coach c4 = new Coach(" Antonio Conte", 54, "Italian", "Tottenham Hotspur", "18");
		Coach c5 = new Coach(" Zinedine Zidane", 52, "French", "None (currently not managing)",
				"18 6 (as a head coach");

		// add the reference variable Object of the Coach class object...
		alCoach.add(c1);
		alCoach.add(c2);
		alCoach.add(c3);
		alCoach.add(c4);
		alCoach.add(c5);

		// Create a Map with "Coach" as the key and the ArrayList as the value
		Map<String, ArrayList<Coach>> response = new HashMap<>();
		response.put("Coach", alCoach);

		return response;

	}

	// ---------------** THIS ONCES IS A Stadium SECTION **-----------------------
	@GetMapping("FootballStadium")
	public Map<String, ArrayList<Stadium>> stadiumList() {

		// Create a Object of Stadium class using ArrayList()...
		ArrayList<Stadium> alStadium = new ArrayList<Stadium>();

		// Fill the values of the Stadium class Constructor by using create object.....
		Stadium s1 = new Stadium(" Camp Nou", "Barcelona, Spain", "99,354", 1957, "Grass");
		Stadium s2 = new Stadium("Old Trafford", "Manchester, England", "74,140", 1910, "Grass");
		Stadium s3 = new Stadium("Allianz Arena", "Munich, Germany", "75,000", 2005, "Grass");
		Stadium s4 = new Stadium("Santiago Bernabéu", "Madrid, Spain", "81,044", 1947, "Grass");
		Stadium s5 = new Stadium("Wembley Stadium", "London, England", "90,000", 2007, "Grass");

		// add the reference variable Object of the Stadium class object...
		alStadium.add(s1);
		alStadium.add(s2);
		alStadium.add(s3);
		alStadium.add(s4);
		alStadium.add(s5);

		// Create a Map with "Stadium" as the key and the ArrayList as the value
		Map<String, ArrayList<Stadium>> response = new HashMap<>();
		response.put("Stadium", alStadium);

		return response;

	}

	// ---------------** THIS ONCES IS A Tournament SECTION **-------------------
	@GetMapping("FootballTournament")
	public Map<String, ArrayList<Tournament>> tournamentList() {

		// Create a Object of Tournament class using ArrayList()...
		ArrayList<Tournament> alTournment = new ArrayList<Tournament>();

		// Fill the values of the Tournament class Constructor by using create
		// object.....
		Tournament t1 = new Tournament("FIFA World Cup", "International, Knockout and Group Sta", 32,
				" Various host countries", 64);
		Tournament t2 = new Tournament("UEFA Champions League", "International, Knockout and Group Stage", 32,
				" Various European cities", 125);
		Tournament t3 = new Tournament("Copa América", "International, Group Stage and Knockout", 12,
				" Varies (e.g., Brazil, Argentina, Chile)", 26);

		// add the reference variable Object of the Tournament class object...
		alTournment.add(t1);
		alTournment.add(t2);
		alTournment.add(t3);

		// Create a Map with "Tournament" as the key and the ArrayList as the value
		Map<String, ArrayList<Tournament>> response = new HashMap<>();
		response.put("Tournament", alTournment);

		return response;
	}

	// ---------------** THIS ONCES IS A FAN SECTION **-------------------
	@GetMapping("FootballFan")
	public Map<String, ArrayList<Fan>> fanList() {

		// Create a Object of Fan class using ArrayList()...
		ArrayList<Fan> alfan = new ArrayList<Fan>();

		// Fill the values of the Fan class Constructor by using create object.....
		Fan f1 = new Fan("John Doe", 28, "Manchester United", "MUFC123456");
		Fan f2 = new Fan("Maria Lopez", 35, "FC Barcelona", "FCB789101");
		Fan f3 = new Fan(" Ahmed Ali", 22, "Paris Saint-Germain", "PSG112233");
		Fan f4 = new Fan(" Sarah Thompson", 40, "Chelsea FC", "CHE456789");
		Fan f5 = new Fan(" Carlos Pereira", 50, "Real Madrid", "RM789012");

		// add the reference variable Object of the Fan class object...
		alfan.add(f1);
		alfan.add(f2);
		alfan.add(f3);
		alfan.add(f4);
		alfan.add(f5);

		// Create a Map with "fan" as the key and the ArrayList as the value
		Map<String, ArrayList<Fan>> response = new HashMap<>();
		response.put("Fan", alfan);

		return response;
	}

	// ---------------** THIS ONCES IS A REFEREE SECTION **-------------------
	@GetMapping("FootballReferee")
	public Map<String, ArrayList<Referee>> refereeList() {

		// Create a Object of Referee class using ArrayList()...
		ArrayList<Referee> alreferee = new ArrayList<Referee>();

		// Fill the values of the Referee class Constructor by using create object.....
		Referee r1 = new Referee("Mark Clattenburg", 49, "350", "20");
		Referee r2 = new Referee("Stéphanie Frappart", 40, "110", "7");
		Referee r3 = new Referee(" Anthony Taylor", 45, "400", "35");
		Referee r4 = new Referee(" Björn Kuipers", 39, "397", "15");

		// add the reference variable Object of the referee class object...
		alreferee.add(r1);
		alreferee.add(r2);
		alreferee.add(r3);
		alreferee.add(r4);

		// Create a Map with "referee" as the key and the ArrayList as the value
		Map<String, ArrayList<Referee>> response = new HashMap<>();
		response.put("Referee", alreferee);

		return response;
	}

	// ---------------** THIS ONCES IS A FOOTBALLASSOCIATION SECTION
	// **-------------------
	@GetMapping("FootballFootballAssociation")
	public Map<String, ArrayList<FootballAssociation>> footballAssociationList() {

		// Create a Object of Referee class using ArrayList()...
		ArrayList<FootballAssociation> alFootballAssociation = new ArrayList<FootballAssociation>();

		// Fill the values of the FootballAssociation class Constructor by using create
		// object.....
		FootballAssociation f1 = new FootballAssociation("The Football Association (FA)", "England", "Mark Bullingham");
		FootballAssociation f2 = new FootballAssociation("Fédération Française de Football (FFF)", "France",
				"Noël Le Graët");
		FootballAssociation f3 = new FootballAssociation("Deutscher Fußball-Bund (DFB)", "Germany", "Bernd Neuendorf");
		FootballAssociation f4 = new FootballAssociation("Italian Football Federation (FIGC)", "Italy",
				"Gabriele Gravina");
		FootballAssociation f5 = new FootballAssociation("Asociación del Fútbol Argentino (AFA)", "Argentina",
				"Claudio Tapia");

		// add the reference variable Object of the FootballAssociation class object...
		alFootballAssociation.add(f1);
		alFootballAssociation.add(f2);
		alFootballAssociation.add(f3);
		alFootballAssociation.add(f4);
		alFootballAssociation.add(f5);

		// Create a Map with "FootballAssociation" as the key and the ArrayList as the
		// value
		Map<String, ArrayList<FootballAssociation>> response = new HashMap<>();
		response.put("Football Association", alFootballAssociation);

		return response;
	}

}
