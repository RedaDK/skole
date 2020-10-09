package craps;

public class DiceThrower {
	// 2 dice with face count of 6 each
		private Die die1, die2;
		private int rollCount; 
		public int totalFaceValue;
		private int totalSix;
		private int sameValueDie;
		private int maxSum;
		private int sum;
		
	public DiceThrower() {
		die1  = new Die(6);
		die2 = new Die(6);
		
		this.rollCount = 0;
		this.totalFaceValue = 0;
	}
		/**
		 * Rolls the 2 dice.
		 */
		public void roll() {
			die1.roll();
			die2.roll();	
			}

		public Die getDie1() {
			return die1;
		}

		public Die getDie2() {
			return die2;
		}

		public int getRollCount() {
			return rollCount;
		}

		public int getTotalFaceValue() {
			sum = die1.getFaceValue() + die2.getFaceValue();
			return sum;
		}

		public int getTotalSix() {
			return totalSix;
		}

		public int getSameValueDie() {
			return sameValueDie;
		}

		public int getMaxSum() {
			return maxSum;
		}

		/**
		 * Returns the sum of the face values in a roll.
		 */
		public int getSum() {
			
			return sum;
		}

		/**
		 * Returns a textual description of the roll of the 2 dice.
		 * Example: Returns "(4,5)" for a roll of 4 and 5.
		 */
		public String rollDescription() {
			
			return "(" + die1.getFaceValue()  + ", " + die2.getFaceValue() + ")";
		}
}
