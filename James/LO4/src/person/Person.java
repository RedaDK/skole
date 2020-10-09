package person;



public class Person {

	private String name;
	private String adress;
	private int monthlySalery;
	private double bonus;

	public Person(String name, String adress, int monthlySalery, double bonus) {
		this.name = name;
		this.adress = adress;
		this.monthlySalery = monthlySalery;
		this.bonus = bonus;
			
	} 
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}
	
	public void setmonthlySalery(int monthlySalery) {
		this.monthlySalery = monthlySalery;
	}

	public int getmonthlySalery() {
		return monthlySalery;
	}
	
	public void printPerson() {
		System.out.println("Fulde navn : " + name);
		System.out.println();
		System.out.println("Adresse : " + adress);
		System.out.println();
		System.out.println("Månedsløn : " + monthlySalery);
		System.out.println();
		System.out.println("Årsløn med bonus : " + yearSaleryBonus());
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double yearSaleryBonus() {
		
		double total = ((monthlySalery * 12) * bonus);
		
		return total;
	}
	
	
}
