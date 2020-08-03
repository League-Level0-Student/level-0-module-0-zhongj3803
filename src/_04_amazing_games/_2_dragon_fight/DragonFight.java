package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		
			// playerHealth to store your health - set it equal to 100
	int playerHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
int dragonAttack = 0;
		
		//  This while statement will cause the game to repeat until the player or dragon run out of health
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	String input = JOptionPane.showInputDialog("Do you want to attack the dragon with a yell or a kick?");
				// 4. If they typed in "yell":
	if (input .equals ("yell")) {
					// -- Find a random number between 0 and 10 and store it in playerAttack. Use
					// ran.nextInt(10)
		playerAttack = ran.nextInt(10);
					// -- Subtract the player attack value from the dragon's health
	dragonHealth=dragonHealth-playerAttack;
	}
				// 5. If they typed in "kick":
	if (input .equals ("kick")) {
		playerAttack = ran.nextInt(25);
		dragonHealth = dragonHealth-playerAttack;
	}
					// -- Find a random number between 0 and 25 and store it in playerAttack.
		
					// -- Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 6. Find a random number between 0 and 35 and store it in dragonAttack
	dragonAttack = ran.nextInt(35);
				// 7. Subtract the dragon attack value from the player's health
playerHealth = playerHealth - dragonAttack;
			// ASSESS THE DAMAGE CAUSED 

				// 8. If the player's health is less than or equal to 0
				// call the playerLost() method
	if (playerHealth <= 0 ) {
		playerLost();
	}
			
				// 9. Else if the dragon's health is less than or equal to 0
				// call the dragonLost() method
	else if (dragonHealth <= 0) {
		dragonLost();
	}
			
			// 10.  Pop up a message that tells the player the health levels of player and
			// 		dragon.
JOptionPane.showMessageDialog(null, "The player health is currently " + playerHealth + " and the dragon health is currently " + dragonHealth);
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
JOptionPane.showMessageDialog(null, "The player has lost health " + dragonAttack + ", while the dragon has lost health " + playerAttack);
		}

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
JOptionPane.showMessageDialog (null, "You have been defeated by the dragon and got no treasure. :(");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
JOptionPane.showMessageDialog(null, "You have defeated the dragon and got a ton of gold! :)))");
		System.exit(0);   //This code ends the program
	}

}
