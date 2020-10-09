package opg_6_javaFx.cars;

public class CarApp
{

    public static void main(String[] args)
    {
    	
    	System.out.println("**********************************************");
        Car myCar = new Car("VW UP", "Hvid");
        System.out.println("****> Mærket på bilen er : " + myCar.getBrand() + "\r\n" + "****> Farven er : " + myCar.getColor());
        myCar.setRegistrationNumber("AB 11 123");
        System.out.println("****> Nummerpladen er " + myCar.getRegistrationNumber());
        System.out.println("**********************************************");
        
        System.out.println("\r\n");
        
        System.out.println("**********************************************");
        Car myCarTwo = new Car("Porsche Cayenne", "Metalic dark blue");
        System.out.println("****> Mærket på bilen er : " + myCarTwo.getBrand() + "\r\n" + "****> Farven er : " + myCarTwo.getColor());
        myCarTwo.setRegistrationNumber("CE 11 370");
        System.out.println("****> Nummerpladen er : " + myCarTwo.getRegistrationNumber());
        myCarTwo.setKm(25800);
        System.out.println("****> Km stand er : " + myCarTwo.getKm());
       // myCarTwo.setService(31000);
        System.out.println("****> Næste service er : " + myCarTwo.getService());
        System.out.println("**********************************************");
       
        
    }

}
