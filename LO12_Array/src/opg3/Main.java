package opg3;

import java.util.Arrays;

public class Main {

		public static void main(String[] args) {

				int[] a = { 2, 1, 7, 2, 3 };
				int[] b = { 4, 6, 8, 2, 6 };
				ArrayTest ar = new ArrayTest();
				System.out.println(Arrays.toString(ar.sumArrays(a, b)));
				System.out.println("******************");
				int[] c = { 2, 1, 7, 2 };
				int[] d = { 4, 6, 8, 2, 6, 7 };
				ArrayTest br = new ArrayTest();
				System.out.println(Arrays.toString(br.sumArrays(c, d)));

		}

}
