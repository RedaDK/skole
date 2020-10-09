package src;
public class Opgave4_NameApp {

	public static void main(String[] args) {
		
		Name p1  = new Name("Mateusz", "Pawel ",  "Dziurdz");
			
		Name p2 = new Name ("Piotr", "Suski");

		System.out.println("***************************");
		System.out.println(p1.getFullName());
		System.out.println(p2.getFullName());
		System.out.println("***************************");
		System.out.println(p1.getUserName());
		System.out.println(p2.getUserName());
		System.out.println("***************************");
	//	System.out.println(p1.getInits());
	//	System.out.println(p2.getInits());
		System.out.println("***************************");
	//	System.out.println(p1.getCryptoInits(2));
	//	System.out.println(p2.getCryptoInits(2));
		
	}

}
