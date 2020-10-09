package lO6;

public class Konto {
//*****Her kommer felter****
	private int nr;
	private int saldo;
	private String kontoType;
	private String status;
//*****Constructor konto****
	public Konto(String kontoType, int nr ) {
		this.kontoType = kontoType;
		this.nr = nr;
		saldo  = 0;
		status = "Åben";
}
//Henter saldo
	public int getSaldo() {
		return saldo;
	}
//Sætter saldo
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
//Henter status på konto
	public String getStatus() {
		return status;
	}
//Sætter status på konto
	public void setStatus(String status) {
		this.status = status;
	}
//Sætter konto type
	public void setKontoType(String kontoType) {
		this.kontoType = kontoType;
	}
//Indsætter beløb hvis konto er åben
	public void indsætBeløb(int beløb) {
		if( status.equals("Åben")) {
			saldo  = saldo + beløb;
		}else {
		System.out.println("Kontoen er lukket!");
		}
	}
	
//Hæver beløb hvis konto er åben
	public void hævBeløb(int beløb) {
		if( status.equals("Åben")) {
			saldo  = saldo - beløb;
		}else {
		System.out.println("Kontoen er lukket!");
		}
	}
	//Lukker konto
	public void lukKonto() {

		status = "Lukket";	
	}
	
}