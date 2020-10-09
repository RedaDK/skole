package craps;

import java.util.Scanner;

public class CrapsGame {

	/**
	 * Simulates playing one game of Craps.
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower = new DiceThrower();
		
		int wins = 0;
		int losses =0;
		boolean finished = false;
		while (!finished) {

			thrower.roll();
			
			System.out.println(thrower.rollDescription());
			
			
			if (thrower.getTotalFaceValue() == 7 || thrower.getTotalFaceValue() == 11) {
				System.out.println("Du vandt");
				wins++;
			} else if (thrower.getTotalFaceValue() == 2 || thrower.getTotalFaceValue() == 3|| thrower.getTotalFaceValue() == 12) {
				System.out.println("Du tabte");
				losses++;
			}
			
			else {
				//thrower.roll();
				int point = thrower.getTotalFaceValue();
				boolean keepPlaying = true;
				
				while(keepPlaying){
					
					if(thrower.getTotalFaceValue() == point)
					{
						System.out.println("Du har ramt dit point, du vandt!");
						wins++;
						keepPlaying = false;
					}
					else if(thrower.getTotalFaceValue() == 7)
					{
						System.out.println("Du har rullet en 7, du taber!");
						losses++;
						keepPlaying = false;						
					}
				}
			}
			System.out.println("Roll again? (Y/n) ");
			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("n")) 
			{
			System.out.println("Du har vundet " + wins + " gang(e)!");
			System.out.println("Du har tabt " + losses + " gang(e)!");
			finished = true;
			}
		}scanner.close();
		
	}


	/**
	 * Prints a 'You have won' message.
	 */
	public void printGameWon() {
		System.out.println("You have won");
	}

	/**
	 * Prints a 'You have lost' message.
	 */
	public void printGameLost() {
		System.out.println("You have lost");
	}

	/**
	 * Prints the rules of craps.
	 */
	public void printRules() {
		System.out.println("=====================================================");
		System.out.println("Rules of Craps" + "\n"
				+ "In the game a player throws 2 dice. The first throw is called 'the come out roll'. The player wins, if\r\n"
				+ "the sum of the dice is 7 or 11. The player loses, if the sum is 2, 3 or 12. If the sum is something else\r\n"
				+ "(that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'. The player will now continue\r\n"
				+ "throwing the dice until he has lost or won. A sum equal his 'point' is a win, and a sum equal 7 is a\r\n"
				+ "loss. ");
		System.out.println("=====================================================");
	}

}
