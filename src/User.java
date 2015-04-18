import java.util.*;

public class User {
	public int id;
	public String name;
	public String highScore;
	public int rank;
	private Hashtable<String, Integer> topicRanks = new Hashtable<String, Integer>();
	
	public User(int id1, String name1, String highScore1, int rank1){
		id = id1;
		name = name1;
		highScore = highScore1;
		rank = rank1;
		
	}
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name.toString();
	}
	
	public String getHighscore(){
		return highScore.toString();
	}
	
	public int getRank(){
		return rank;
	}
	
}
