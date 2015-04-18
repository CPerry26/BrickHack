import java.util.Timer;

/*
 * The math question class
 * 
 */

public class mathQuestion extends Question {
	int a;
	int b;
	long startTime;
	long elapsedTime;
	
	public mathQuestion( int size, int timelimit ) {
		//This might need to return a question.  I'm not sure...
		int a = (int) ( size * Math.random() );
		int b = (int) ( size * Math.random() );
		setAnswer( "" + Integer.toString( a + b ) );
		setQuestionText( "What is "+ Integer.toString(a) +" + "+ Integer.toString(b) +"?" );
	}
	
	public void askQuestion() {
		System.out.println( "You will have " + getTime() + "seconds to answer this question." );
		//start the timer
		startTime = System.currentTimeMillis();
		elapsedTime = 0L;
		//ask the user the question
		System.out.println( getQuestionText() );
		
	}
	
	public boolean getUserAnswer() {
		String UserAnswer = getInput();
		elapsedTime = startTime - System.currentTimeMillis();
		if( elapsedTime < (long)getTime()*1000 ) {
			if( UserAnswer.equals( getAnswer() ) ) {
				return true;
			}
		}
		return false;
	}
	
}
