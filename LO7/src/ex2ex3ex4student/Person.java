package ex2ex3ex4student;

public class Person {
	private String name;
	private int dayOfBirth; // 1..31
	private int monthOfBirth; // 1..12
	private int yearOfBirth; // 1900..2010
	
	

	public Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
	}
	
	public void printPerson() {
		System.out.println(
				name + ", born " + yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
	}
	
	
	public int calcAge(int year, int month, int day) {
		
		if(monthOfBirth > month ) {
			
			return year - yearOfBirth - 1;
		}
			else if(monthOfBirth == month && dayOfBirth > day) {
				
				return year - yearOfBirth - 1;
			
			}else 
				
				return year - yearOfBirth;
			
			}
	
	public String leapYear() {
		String result = " ";
		if(yearOfBirth % 400 == 0) {
			 result = "Dette år er skudår ";
		}else if (yearOfBirth % 100 == 0) {
			result = "Dette er ikke skudår ";			
		}else if (yearOfBirth == 4) {
			result = "Dette år er skudår";
		}else {
			result = "Dette er ikke skudår";
		}
		return result;
	}

}






