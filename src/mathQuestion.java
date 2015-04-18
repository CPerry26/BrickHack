/*
 * The math question class
 * 
 */

public class mathQuestion extends Question {
	int a;
	int b;
	int timelimit;
	String answer;
	String questionText;
	
	public void makeMathQuestion( int size, int timelimit ) {
		//This might need to return a question.  I'm not sure...
		int a = (int) ( size * Math.random() );
		int b = (int) ( size * Math.random() );
		String answer = Integer.toString( a + b );
		String quesitonText = ("What is "+ Integer.toString(a) +" + "+ Integer.toString(b) +"?");
		return;
	}
}
