package src;

public class Opgave3 {

	public static void main(String[] args) {
		
	 String ord1 = "Datamatiker";
	 String ord2 = "Uddannelsen";
	 
	//a
	 System.out.println(ord1.toUpperCase()); //Datamatiker konverteret til stor bogstaver
	//b
	 System.out.println(ord2.toLowerCase()); //Uddannelsen konverteret til sm� bogstaver
	//c
	 System.out.println(ord1 + " " + ord2); //Datmatiker string og Udannelsen string lagt sammen
	//d
	 String ord3 = ord1 + " " + ord2.toLowerCase(); 
	 System.out.println(ord3); //Opg c samlet - F�rste bogstav p� Uddannelsen lavet til lille bogstav
	//e
	 System.out.println(ord3.length()); //L�ngde p� hele Datamatiker uddannelsen
	 //f
	 System.out.println(ord1.substring(0,7)); //Printer alle ord fra Datamatiker fra start index 0 til slut index 7
	 //g
	 System.out.println(ord2.substring(3,7)); //Printer alle ord fra Uddannelsen fra start index 3 til slut index 7
	 //h
	 int halv = ord3.length() / 2;
	 System.out.println(ord3.substring(halv)); //Printer halvdelen af l�ngden p� ord3 
	
	}
	
}
