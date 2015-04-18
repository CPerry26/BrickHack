
public class Question {
	private int time;
	private int id;
	private String questionText;
	private String answer;
	private int pointValue;
	private int difficulty;
	
	public void setAnswer( String answer ) {
		this.answer = answer;
	}
	
	public void setQuestionText( String questionText ) {
		this.questionText = questionText;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getQuestionText() {
		return questionText;
	}
}
