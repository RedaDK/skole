package opg1;

import java.util.Arrays;

public class Main {

		public static void main(String[] args) {

				// opgave a
				System.out.println("Opg. a");

				int tal[] = new int[10];
				for (int i = 0; i < tal.length; i++) {
				}
				System.out.println(Arrays.toString(tal));

				// opgave b
				System.out.println("Opg. b");

				int random[] = { 2, 44, -23, 99, 8, -5, 7, 10, 20, 30 }; // Printer tilf�ldig
				for (int i = 0; i < random.length; i++) {

				}
				System.out.println(Arrays.toString(random));

				// opgave c
				System.out.println("Opg. c");

				int[] gange = new int[10]; // Her s�tter man et array p� l�ngden 10
				for (int i = 0; i < gange.length; i++) { // K�rer array loop igennem
						gange[i] = i * 1;
				}
				System.out.println(Arrays.toString(gange));

				// opgave d
				System.out.println("Opg. d");

				int[] gangeTo = new int[11]; // S�tter Array l�ngden til 11
				for (int i = 1; i < gangeTo.length; i++) {
						gangeTo[i] = i * 2; // Ganger i med 2

				}
				System.out.println(Arrays.toString(gangeTo));

				// opgave e
				System.out.println("Opg. e");

				int[] pow = new int[10]; // S�tter Array til 11
				for (int i = 0; i < pow.length; i++) {
						pow[i] = (int) Math.pow(i, 2); // S�tter i til anden..
				}
				System.out.println(Arrays.toString(pow));

				// opgave f
				System.out.println("Opg. f");

				int[] mod = new int[10];
				for (int i = 0; i < mod.length; i++) {
						mod[i] = i + 1;
						if (i % 2 == 0) {
								mod[i] = 0;
						} else if (i % 2 != 0) {
								mod[i] = 1;
						}

				}
				System.out.println(Arrays.toString(mod));
				// opgave g
				System.out.println("Opg. g");

				int[] a = new int[10];

				for (int i = 0; i < a.length; i++) {
						if (i < 5) {
								a[i] = i * 1;

						} else if (i > 5) {

								a[i] = (i * 1) - 5;

						}
				}
				System.out.println(Arrays.toString(a));

				// OBS ikke f�rdigt !!
				System.out.println("Opg. h");
				int[] c = new int[10];
				for (int i = 0; i < c.length; i++) {
						if (i % 2 == 0) {
								c[i] = (i * 2);
						} else if (i % 2 != 0) {
								c[i] = 2 * i + 1;
						}
				}
				System.out.println(Arrays.toString(c));
		}

}