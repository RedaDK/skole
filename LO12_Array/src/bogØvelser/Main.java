package bogÿvelser;

import java.util.Arrays;

public class Main {
		  public static void main(String[] args) {

					int[] values = { 3, 4, 5, 2, 6, 6, 7, 7, 8 };
					for (int i = 0; i < values.length; i++) {
							  if (i > 0) {
										System.out.print(Arrays.toString(values));
							  }

					}

					/*
					 * int[] values = { 2, 3, 6, 3, 2, 5, 6 }; for (int i = 0; i < values.length;
					 * i++) { if (i > 0) { System.out.print(" | "); } System.out.print(values[i]); }
					 */
					/*
					 * 
					 * int[] values = { 1, 2, 4 }; int total = 0; for (int element : values) {
					 * System.out.println(element); total = total + element; }
					 * 
					 * System.out.println("Sum: " + total);
					 */

		  }
}
