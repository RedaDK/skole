package opgP5_1;

import java.util.Scanner;

public class SeasonApp {

	public static void main(String[] args) {
		
		System.out.println("Tast dag i tal : ");
		
		Scanner s1 = new Scanner(System.in);
		
		int input1 = s1.nextInt();
		
		System.out.println("Tast måned i tal : ");
		
		Scanner s2 = new Scanner(System.in);
		
		int input2 = s2.nextInt();
		
		Season season = new Season(input1, input2);
		
		System.out.println(season.getSeason());

		s1.close();
		s2.close();
	} 
	
	

}
