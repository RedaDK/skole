package lO6;

public class Main {

	
		public static void main(String[] args) {
			
			Konto konto1 = new Konto("Privat konto", 2323443);
			
			konto1.inds�tBel�b(200);
			konto1.h�vBel�b(30);
			System.out.println(konto1.getSaldo());
			konto1.h�vBel�b(230);
			konto1.lukKonto();
			konto1.h�vBel�b(100);
			
			System.out.println(konto1.getStatus());
			System.out.println(konto1.getSaldo());
			
			
			}
}
