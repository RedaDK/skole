package ex3App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Tast et begynder tal : ");
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Tast et ende tal : ");
		
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		int sum = 0;
		while(a < b) {
	    a++;
		if(a%2 != 0)
	    sum = sum + a;
		
		}
		System.out.println("*****************************");
		System.out.println("Alle ulige tal lagt sammen giver " + sum);
		
	s1.close();
	s2.close();
	}

}
