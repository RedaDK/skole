package pigs;

import java.util.Scanner;

public class PigsGame {

	/**
	 * Simulates playing one game of Simple.
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower = new DiceThrower();
		int sum = 0;
		int maxPoint = 100;
		boolean finished = false;

		while (!finished) {
			thrower.roll();
			
			System.out.println("Your hit is : " + thrower.getSum());
			sum += thrower.getSum();
			System.out.println("You have " + sum + " so far");
			System.out.println("Roll again? (Y/n) ");
			String answer = scanner.nextLine();
			if (thrower.getSum() == 1 || answer.equalsIgnoreCase("n") || maxPoint <= 100) {
				
				
				System.out.println("Sorry lost the game");
				finished = true;
			}
		}
		scanner.close();
		
		System.out.printf("\nResults:\n");
		System.out.println("The total sum is " + sum);
		System.out.printf("---------\n");
		// TODO: Print all the results:
		// roll count, total of all face values, average sum in one roll,
		// count of face value 6, count of same face value on both dice,
		// max sum in one roll.
		// Use the method: System.out.printf().

	}

	/**
	 * Prints the rules of Simple.
	 */
	public void printRules() {
		System.out.println("=====================================================");
		System.out.println("Rules of Simple:");
		System.out.println("The player throws the 2 dice as long as he/she wants.");
		System.out.println("=====================================================");
	}

}
