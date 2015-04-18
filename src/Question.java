import java.util.Scanner;

public class Question {
	private int time;
	private int id;
	private String questionText;
	private String answer;
	private int pointValue;
	private int difficulty;
	
	public String getInput() {
		Scanner sc = new Scanner( System.in );
		String returnMe = sc.next();
		sc.close();
		return returnMe;
	}
	
	public void setID( int id ) {
		this.id = id;
	}
	
	public void setPointValue( int pointValue ) {
		this.pointValue = pointValue;
	}
	
	public void setDifficulty( int difficulty ) {
		this.difficulty = difficulty;
	}
	
	public void setTime( int time ) {
		this.time = time;
	}
	
	public void setAnswer( String answer ) {
		this.answer = answer;
	}
	
	public void setQuestionText( String qText ) {
		this.questionText = qText;
	}
	
	public int getID() {
		return id;
	}
	
	public int getPointValue() {
		return pointValue;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int getTime() {
		return time;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getQuestionText() {
		return questionText;
	}
}
