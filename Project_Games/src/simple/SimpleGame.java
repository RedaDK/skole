package simple;

import java.util.Scanner;

public class SimpleGame {

	/**
	 * Simulates playing one game of Simple.
	 */
	public void play() {
		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower = new DiceThrower();

		boolean finished = false;
		while (!finished) {
			

			thrower.roll();
			System.out.println(thrower.rollDescription());
			System.out.println("Roll again? (Y/n) ");
			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("n")) {
				finished = true;
			}
		}
		scanner.close();

		System.out.printf("\nResults:\n");
		System.out.printf("-----------------------------------\n");
		// TODO: Print all the results:

		// Use the method: System.out.printf().
		String heading1 = "Fields";
		String heading2 = "Result";
		String maxString = "Max sum";
		int maxRes = thrower.getMaxSum();
		String avaString = "Average";
		double avaRes = (double) thrower.getTotalFaceValue() / thrower.getRollCount();
		String totFace = "Total Face Value";
		int totRes = thrower.getTotalFaceValue();
		String rolString = "Roll count";
		int rolRes = thrower.getRollCount();
		String sixString = "Total Six";
		int sixRes = thrower.getTotalSix();
		String sameString = "Same Value";
		int sameRes = thrower.getSameValueDie();

		System.out.printf("%-40s %s %n", heading1, heading2);
		System.out.printf("%-40s %s %n", maxString, maxRes);
		System.out.printf("%-40s %.1f %n", avaString, avaRes);
		System.out.printf("%-35s %s %n", totFace, totRes);
		System.out.printf("%-40s %s %n", rolString, rolRes);
		System.out.printf("%-45s %s %n", sixString, sixRes);
		System.out.printf("%-40s %s %n", sameString, sameRes);
		/*
		 * System.out.println("Max sum " + thrower.getMaxSum());
		 * System.out.println("Average :" + (double) thrower.getTotalFaceValue() /
		 * thrower.getRollCount()); System.out.println("Total face value " +
		 * thrower.getTotalFaceValue()); System.out.println("Roll Count :" +
		 * thrower.getRollCount()); System.out.println("Total Six :" +
		 * thrower.getTotalSix()); System.out.println("Same Value : " +
		 * thrower.getSameValueDie());
		 * 
		 */

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
