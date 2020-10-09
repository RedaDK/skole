package person;

import java.util.Scanner;

public class PersonTester {

	public static void main(String[] args) {
		/*
		//Person pOne = new Person("Jean Paul Jensen", "Nørre Alle 23, 2700 Hellerup", 14582, 1.025);
		
		//pOne.printPerson();
*/
		
		System.out.println("Tast dit fulde navn : " );
		
		Scanner scr = new Scanner (System.in);
		
		String name = scr.nextLine();
		
		//scr.close();
		
		System.out.println("Tast din adresse : " );
		
		Scanner scr1 = new Scanner (System.in);
		
		String adress = scr1.nextLine();
		
		//scr1.close();
		
		System.out.println("Tast din månedsløn : " );
		
		Scanner scr3 = new Scanner (System.in);
		
		int monthlySalery = scr3.nextInt();
		
		//scr3.close();
		
		System.out.println("Tast din bonus i procent : " );
		
		Scanner scr4 = new Scanner (System.in);
		
		double bonus = scr4.nextDouble();
		
		scr4.close();
		
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		
		Person ptwo = new Person(name, adress, monthlySalery, bonus);
		
		ptwo.printPerson();
		
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		scr.close();
		scr1.close();
		scr3.close();
	}

}
