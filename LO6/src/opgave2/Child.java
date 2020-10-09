package opgave2;
//Class Child starter her
public class Child
{
    private int age;
    private boolean male;

    //Skabelon for Child klasse
    public Child(int age, boolean male)
    {
        this.age = age;
        this.male = male;
    }
//Hent Alder
    public int getAge()
    {
        return age;
    }
//Sæt Alder
    public void setAge(int age)
    {
        this.age = age;
    }

    //Boolean for male true hvis male
    public boolean isMale()
    {
        return male;
    }
//Sætter boolean for male 
    public void setMale(boolean male)
    {
        this.male = male;
    }
// Metode for insitution 
    public String institution()
    {
    	String resultInst =  "";
        if(age == 0) {
        	resultInst = "Home";
        }else if(age >= 1 && age <= 2){
        	resultInst = "Nursery";
        }else if(age >= 3 && age <=5) {
        	resultInst = "Kindergarten";
        }else if(age >=6  && age <=16) {
        	resultInst = "School";
        }else {
        	resultInst = "Out of School";
        }
        return resultInst;
    }
 //Metode for køn
    public String isGender() {
    	String resultGender = "";
    	if(male == true) {
    		resultGender = "boy";
    	}else {
    		resultGender = "girl";
		}
    	return resultGender;
    }
 //Metode for hold
    public String team() {
    	
    	String resultTeam = "";
    	
    	if(isMale() == false && age < 8 ) {
    		resultTeam = "Tumbling girls";
    	}else if(isMale() == false && age >= 8) {
    		resultTeam = "Springy girls";
    	}else if(isMale() == true && age <8) {
    		resultTeam = "Young Boys";
    	}else {
    		resultTeam = "Cool Boys";
    	}
    	return resultTeam;
    }
    
}
