package opg4;

import java.util.Arrays;

public class ArrayTest {
		// Main starter her
		public static class Main {

				public static void main(String[] args) {
						// Alm. Array
						int[] arr = { 2, 2, 1, 2 };
						System.out.println(Arrays.toString(arr));
						System.out.println(hasUneven(arr));
				}

				// Metode der checker om der er et lige eller ulige tal i Array!!
				public static boolean hasUneven(int[] t) {
						for (int element : t) {
								if (element % 2 == 1) {
										return true;
//										System.out.println("Ulige");
								}
//								
						}
						return false;
				}
		}
}
