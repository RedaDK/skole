package src;

//Klassen Name starter her
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
//Objekt Name stater her
	public Name(String firstName, String middleName, String lastName) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
public Name(String firstName,  String lastName) {
		
		this.firstName = firstName;
		this.middleName = "";
		this.lastName = lastName;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getFirstName() {
		return firstName + " ";
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMiddleName() {
		return middleName + " ";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName + " ";
	}
	
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String getUserName() {
		String userFirstName = getFirstName().substring(0,2).toUpperCase();
		//String numberOfLettersMiddleName = 
		int userMiddle = middleName.length();
		String userLastName = getLastName().substring((getLastName().length() - 3)).toLowerCase(); //har tilføjet -3 i istedet for -2 pga. tilføjet 
		return userFirstName + userMiddle + userLastName;														// mellemrum i funktioner get
	}
	
	public String getInits() {
		
		
		char firstInit = firstName.charAt(0);
		
		char middleInit = middleName.charAt(0);
		
		char lastInit = lastName.charAt(0);
		
		if (middleInit ==  ' ') {
		
			return "" + firstInit + lastInit;
			
		} else {
			
			return "" + firstInit + middleInit + lastInit;

		}
		
	}
	
	//Crypto metode convertere initialer 
	public String getCryptoInits(int count) {
	
		//int charFirst =(int) //Konvertere første Char til ASCII nummer og lægger count til
		char first = (char) (firstName.charAt(0) + count);   //Konvertere fra ASCII nummer til Char 
		char last = (char) (lastName.charAt(0) + count);
		
		return "" + first  + last;
		/*
		if (charMiddle == 0) {
			
			return  "" + first + last ;

		} else {
		
			return "" + first +  middle + last;
			
			
			
		}
		*/
	}
	
	
}
