package opgave2;

public class ChildApp {


	public static void main(String[] args) {
		
	
		Child childOne = new Child(4, true);
		
		
		System.out.println("Instutition " + childOne.institution() + 
												" the child is a " + childOne.isGender());
		
		Child childTwo = new Child(32, false);
		
		System.out.println("Instutition " + childTwo.institution() + 
											" the child is a " + childTwo.isGender() + 
											" on team " + childTwo.team() );
		
	}

}
