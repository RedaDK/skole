package opg1;

public class Main {

	public static void main(String[] args) {

		int[][] numbers =
		{
				{ 0, 4, 3, 9, 6 },
				{ 1, 3, 5, 2, 2 },
				{ 3, 3, 1, 0, 1 },
				{ 0, 0, 9, 7, 1 },

		};

		print(numbers);
		System.out.println();
		int sumR = sumRow(numbers, 0);
		System.out.println("L�gger sammen p� r�kke : " + sumR);
		System.out.println();
		int sumC = sumColumn(numbers, 0);
		System.out.println("L�gger sammen p� colonne : " + sumC);
		System.out.println();
		System.out.println("Alle tal i array lagt sammen : " + sum(numbers));

	}

	// Main ender her
////********************************************************************************************************	
	// Printer hele array
	public static void print(int[][] numbers) {
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.printf("%5d  ", numbers[row][col]);
			}
			System.out.println();
		}
	}

	//

	public static int getValueAt(int[][] numbers, int row, int col) {
		return getValueAt(numbers, row, col);
	}

	public static void setValueAt(int[][] numbers, int row, int col, int value) {
		setValueAt(numbers, row, col, value);
	}

	public static int sumRow(int[][] numbers, int row) {
		int suma = 0;
		for (int col = 0; col < numbers[row].length; col++) {
			suma += numbers[row][col];
		}
		return suma;
	}

	public static int sumColumn(int[][] numbers, int col) {
		int sumb = 0;
		for (int row = 0; row < numbers.length; row++) {
			sumb += numbers[row][col];
		}
		return sumb;
	}

	public static int sum(int[][] numbers) {
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				sum += numbers[row][col];

			}
		}
		return sum;
	}

	public static int sum1(int[][] numbers) {
		int sum = 0;
		for (int[] row : numbers) {
			for (int value : row) {
				sum += value;
			}

		}
		return sum;
	}

}