package e3_9;

public class Car {
	
private int km_pr_liter;
private int drive;
private int addGas;


public Car(int km_pr_liter) {
	
	this.km_pr_liter = km_pr_liter;
	
}

public int getAddGas() {
	return addGas;
}

public void SetaddGas(int addGas) {
	this.addGas = addGas;
}

public int getdrive() {
	return drive;
}

public void setdrive(int drive) {
	this.drive = drive;
}

public float getGasTank() {

	float rest = getdrive()/ km_pr_liter; 
	
	
	return rest;
}

}
