package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String mathanswer = JOptionPane.showInputDialog("What's 9+10?");
				// 3.  Use an if statement to check if their answer is correct
				if (mathanswer .equals ("19")) {
					
				
				// 4.  if the user's answer was correct, add one to their score 
		score++;
				}
				
				else {
					score--;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String presidentanswer = JOptionPane.showInputDialog("Who was the first president of the United States?");
		if (presidentanswer .equals ("George Washington")) {
			score++;
		}
		
		else {
			score--;
		}
		
		JOptionPane.showMessageDialog(null, "Your score is:"+ score);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
