package opg2;

import java.util.ArrayList;

public class Ex2 {

		/**
		 * Tests all the methods.
		 */
		public static void main(String[] args) {
				ArrayList<Integer> ints = new ArrayList<Integer>();
				ints.add(12);
				ints.add(0);
				ints.add(45);
				ints.add(7);
				ints.add(-16);
				ints.add(0);
				ints.add(23);
				ints.add(-10);
				// ints.addAll(Arrays(12, 0, 45, 7, -16, 0, 23, -10));
				System.out.println("ints: " + ints);
				System.out.println();

				// Test of sum() method: correct sum is 61.
				int total = sum(ints);
				System.out.println("Sum: " + total);

				// Test of minimum() method: correct minimum is -16.
				int mini = min(ints);
				System.out.println("Minimum : " + mini);
				// Test of maximum() method: correct maximum is 45.
				int maxi = max(ints);
				System.out.println("Maximum : " + maxi);
				// Test of average() method: correct average is 7.625.
				//int aver = average(ints);
				// System.out.println("Average : " + average);
				// Test of zeroes() method: correct number of zeroes is 2.

				// Test of evens() method: correct result is [12, 0, -16, 0, -10].
		}

		// sum made with for statement

		public static int sum(ArrayList<Integer> list) {

				int sum1 = 0;
				if (list.size() != 0) {
						for (int sumOne : list) {
								sum1 += sumOne;
						}
				} else {
						System.out.println("Listen er tom!");
				}
				return sum1;
		}

		public static int min(ArrayList<Integer> list) {
				int min = Integer.MAX_VALUE;
				if (list.size() != 0) {
						for (int sr : list) {
								if (min > sr) {
										min = sr;
								}
						}
				} else {
						System.out.println("Listen er tom!");
				}
				return min;
		}

		public static int max(ArrayList<Integer> list) {
				int max = Integer.MIN_VALUE;
				if (list.size() != 0) {
						for (int sr : list) {
								if (max < sr) {
										max = sr;
								}
						}
				} else {
						System.out.println("Listen er tom!");
				}
				return max;
		}

		public static double average(ArrayList<Integer> list) {
				double average = 0.0;
				double sum = 0.0;
				if (list.size() != 0) {
						for (int sr : list) {
								sum = sum + sr;
						}

				} else {
						System.out.println("Listen er tom");
				}
				return (double) sum/list.size();
		}

} // Slutning p� klassen Ex2