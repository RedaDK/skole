package ex2App;

public class Main {

	public static void main(String[] args) {
		
	// opagave a 
		int sum = 0; 
		for(int i = 0; i <= 100; i++){ 
			if(i % 2 == 0) {	// checker om tallet er lige eller ulige 
				sum += i;
				//System.out.println(sum += i); 
			} 
		} 
		System.out.println("Summen af lige numre er : " + sum); // Lægger alle lige tal sammen 
		
		// opagave b 
		int sumSqr = 0;
		
		for(int i = 0; i <=100; i++) {
			
			sumSqr += Math.pow(i, 2);
			}
				System.out.println("Summen af i i anden er  : " + sumSqr);
		
		// opagave c 
				int sumSqrTwo = 0;
				
				for(int i = 0; i <=20; i++) {
					
					sumSqrTwo += Math.pow(2, i);
					}
						System.out.println("Summen af 2 i ' i ' er  : " + sumSqrTwo);
	
	
	}
		
		
	}


	

