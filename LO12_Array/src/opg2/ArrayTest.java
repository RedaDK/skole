package opg2;

import java.util.Arrays;

public class ArrayTest {
		// Main starter her
		public static void main(String[] args) {
				// L�gger tal sammen i et Array, p� hele tal
				int[] arr = { 2, 7, 5, 9, 6, };
				System.out.println(Arrays.toString(arr));
				int sum = sum(arr);
				System.out.println("Alle tal lagt sammen i array  " + sum);

				System.out.println("*******************************");
				// L�gger tal sammen i et Array, p� decimal tal
				double[] arrTwo = { 2.4, 7.5, 5.1, 9.8, 6.1, 7.9 };
				System.out.println(Arrays.toString(arrTwo));
				double sumDouble = sumDouble(arrTwo);
				System.out.println("Alle tal lagt sammen i array  " + sumDouble);

		}

		// Metode til at l�gge hele tal sammen i array kaldet sum
		public static int sum(int[] t) {
				int total = 0;
				for (int i = 0; i < t.length; i++) {
						total = t[i] + total;
				}
				return total;
		}

		// Metode til at l�gge decimal tal sammen i array kaldet sumDouble
		public static double sumDouble(double[] t) {
				double total = 0;
				for (int i = 0; i < t.length; i++) {
						total = t[i] + total;
				}
				return total;
		}

}
