package src;

public class Opgave1 {

	public static void main(String[] args) {
		
		// int i1, i2, 
		//a = 4, b = 11, c=2; 
		//double d1, d2, 
		//r = 4.0, s = 11.0, t = 2.0;
		
		int i1;
		int i2;
		int a = 4;
		int b = 11;
		int c = 2;
		
		double d1;
		double d2;
		double r = 4.0;
		double s = 11.0;
		//double t = 2.0; // Bliver ikke brugt..???
	
		i1 = b / a;
		System.out.println("opg :  i1 = b / a  : ==> " + i1); //Tager kun hele tal og smider decimal ud
		c = (int)(s / r);
		System.out.println("opg : c = (int)(s / r) : ==> " + c ); //Laver resultat om til hele tal - CAST
		d1 = b / a;
		System.out.println("opg : d1 = b / a :==>   " + d1); //To tal med int divideret reslutere i mistede decimaler
		d2 = s / r;
		System.out.println("opg : d2 = s / r :==>  " + d2); //To tal med double giver decimal
		d1 = b / r;
		System.out.println("opg : d1 = b / r :==>  " + d1); //Int tal divideret med double giver double med decimal
		d2 = 11.0 / 4.0;
		System.out.println("opg : d2 = 11.0 / 4.0 :==>  " + d2 ); //To double giver double
		d1 = 11.0 /( 8);
		System.out.println("opg : d1 = 11.0 / a * c :==>  " + d1); // double divideret med int giver double
		i1++;
		System.out.println("opg : i1++ :==>  " + (i1++) ); //i1 har værdien 2 gemt blive til lagt med 1 og giver 3
		i1 += 4;
		System.out.println("opg : i1 += 4 :==> " + i1 ); //i1 har værdien 3 og bliver til lagt 4 og giver 8
		i1 = b % a;
		System.out.println("opg : i1 = b % a :==> " + i1  ); // 11 modolus 4 giver 3
		i1 = 3 + 7 * 2;
		System.out.println("opg : i1 = 3 + 7 * 2 :==> " + i1 ); // gange er stærkest og bliver først udført og plus bagefter
		i2 = (3 + 7) * 2;
		System.out.println("opg : i2 = (3 + 7) * 2 :==> " + i2 ); // parantes bliver først udregnet og ganget bagefter
	
	}
		
}
