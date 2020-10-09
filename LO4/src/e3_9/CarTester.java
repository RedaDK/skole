package e3_9;

public class CarTester {

	public static void main(String[] args) {
		
		Car carOne = new Car(15);
		System.out.println("The car can drive " + carOne);
		carOne.SetaddGas(20);
		carOne.setdrive(5);
		System.out.println(carOne.getAddGas());
		System.out.println(carOne.getdrive());
		
	
		
		System.out.println("Gastank has " + carOne.getGasTank() + " liters left");
		

	}

}
