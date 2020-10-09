package ex6_2App_a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Udregner sum af indtastet tal " + "\n" + "venter på input 0 for at afslutte programmet");
		System.out.println("***********************************");
		System.out.println("Indtast flere tilfældige tal :");
	
		Scanner input = new Scanner(System.in); 

		int sum = 0;
		int ciffer = -1;
		while (ciffer != 0) {
			ciffer = input.nextInt();
			if(ciffer != 0) {
			sum += ciffer;
			}
		}
		input.close();
		System.out.println("De indtastede tal giver tilsammen : " + sum);
	}

}
