package opg3;

import java.util.ArrayList;




public class Team {

	private String teamName;
	private ArrayList<Player> players;

	public Team(String team) {

		players = new ArrayList<>();
		this.teamName = team;
	}
	
	//Henter navn
	public String getName() {
		return teamName;
	}

	//Henter spiller
	public ArrayList<Player> getPlayer() {
		return players;
	}
	
	//Tilf�jer en spiller til array 
	public void addPlayer(Player p) {
			getPlayer().add(p);
	}
	
	public void printPlayers() {
		for(Player p : players) {
			System.out.println("Player name " + p.getName() + 
									"Age " + p.getAge() +
									"Score : " + p.getScore());
		}
	}
	
	public double averageAge() {
		int ageSum = 0;
		for(Player p : players) {
			ageSum += p.getAge();
		}
	return (double) ageSum/players.size();
	}
	
	public int calcTotalScore() {
		int totalScore=0;
		for(Player p : players) {
			totalScore += p.getScore();
		}
		return totalScore;
	}

	public int calcOldPlayerScore(int ageLimit) {
		int totalScore=0;
		for(Player p : players) {
			totalScore += p.getScore();
			
			if(p.getAge() > ageLimit) {
				totalScore += p.getScore();
			}
		}return totalScore;
	}

//	public ArrayList<String> bestPlayerName(){
//		ArrayList<String> names = new ArrayList<>();
//		
//		for(Player p : players) {
//			if(p.getScore() == maxScore ()) {
//				names.add(p.getName());
//			}
//		}
//	}	return names;
	
}

