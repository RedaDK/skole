package ex4App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("***SORTERE ULIGE NUMRE FRA ET TILF�LDIGT TAL " + "\n" + " OG L�GGER DEM TIL!***");
		System.out.println("Indtast et tilf�ldigt tal : ");

		Scanner s = new Scanner(System.in);

		int ran = s.nextInt();
		System.out.println("*******************");
		int sum = 0;
		while (ran > 0) {

			if (ran % 2 != 0) {
				int ciffer = (ran % 10);
				System.out.println("De ulige numre er " + ciffer);
				sum += ciffer;
			}
			ran = ran / 10;
		}
		System.out.println("*******************");
		System.out.println("Summen er : " + sum);
		
		s.close();
	}

}
