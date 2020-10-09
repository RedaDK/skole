package ex2ex3ex4student;

public class PersonApp {

	public static void main(String[] args) {

		Person p1  = new Person("James", 1982, 10, 17);

		p1.printPerson();
		
		System.out.println(p1.calcAge(2020,10,17));
		
		System.out.println(p1.leapYear());
		
	}

}
