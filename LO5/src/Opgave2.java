package src;
public class Opgave2 {

	public static void main(String[] args) {
		
		//Variabler uden værdi
		int i1;
		char ch1, ch2;

		ch1 = 'A';
		System.out.println(ch1); //Char A bliver gemt i ch1
		ch2 = '3';
		System.out.println(ch2); //Char 3 bliver gemt i ch2
		i1 = ch1;
		System.out.println(i1); //ch1 har char A og bliver konverteret til ASCII og giver 65
		i1 = 66;
		System.out.println(i1); //i1 bliver overskrevet med 66
		ch2 = (char) i1;
		System.out.println(ch2); //i1 66 ASCII bliver konverteret til char B og overskriver char 3
			
	}

}
