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
		status = "�ben";
}
//Henter saldo
	public int getSaldo() {
		return saldo;
	}
//S�tter saldo
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
//Henter status p� konto
	public String getStatus() {
		return status;
	}
//S�tter status p� konto
	public void setStatus(String status) {
		this.status = status;
	}
//S�tter konto type
	public void setKontoType(String kontoType) {
		this.kontoType = kontoType;
	}
//Inds�tter bel�b hvis konto er �ben
	public void inds�tBel�b(int bel�b) {
		if( status.equals("�ben")) {
			saldo  = saldo + bel�b;
		}else {
		System.out.println("Kontoen er lukket!");
		}
	}
	
//H�ver bel�b hvis konto er �ben
	public void h�vBel�b(int bel�b) {
		if( status.equals("�ben")) {
			saldo  = saldo - bel�b;
		}else {
		System.out.println("Kontoen er lukket!");
		}
	}
	//Lukker konto
	public void lukKonto() {

		status = "Lukket";	
	}
	
}