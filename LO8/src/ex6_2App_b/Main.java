package ex6_2App_b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tast tilfældige tal " + "\n" + " giver det højeste og det laveste tal!");
		System.out.println("********************************************");
		Scanner scr = new Scanner(System.in);		
		int max = 0;
		int min = 200000;
		int type = -1;
		
		while(type != 0) {
			type = scr.nextInt();
			if(type > max && type != 0) {
				max  = type;
			}else if (type < min && type != 0 ) {
				min = type;
			}		
		}
		System.out.println("Det højeste tal er : " + max );
		System.out.println("Det laveste tal er : " + min);
		scr.close();
	}

}
