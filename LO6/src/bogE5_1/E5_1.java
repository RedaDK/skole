package bogE5_1;

import java.util.Scanner;



public class E5_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Indtast et tal negativ, nul eller positiv : ");
		
		Scanner s1 = new Scanner(System.in);
        
		if(s1.hasNextInt()) {
		  
							        	int number = s1.nextInt();
										
									   if(number < 0 ) {
							    			System.out.println("Nummeret er negativt");
							    		}else if(number > 0) {
							    			System.out.println("Nummeret er positivt");
							    		}else if(number == 0) {
							    			System.out.println("Nummeret er 0");
							    		}
        }else {
    			System.out.println("Det indtastede er ikke et tal!!");
		}
	
			s1.close();		
	}
	
	
}
