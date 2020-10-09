package lO6;

public class Main {

	
		public static void main(String[] args) {
			
			Konto konto1 = new Konto("Privat konto", 2323443);
			
			konto1.indsætBeløb(200);
			konto1.hævBeløb(30);
			System.out.println(konto1.getSaldo());
			konto1.hævBeløb(230);
			konto1.lukKonto();
			konto1.hævBeløb(100);
			
			System.out.println(konto1.getStatus());
			System.out.println(konto1.getSaldo());
			
			
			}
}
