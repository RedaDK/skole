package opgP5_1;

public class Season {

	private int day;
	private int month;
	
	public Season(int day, int month) {
		
		this.day = day;
		this.month = month;
		
}

public String getSeason() {
	String result = " ";
	
	if(month == 1 || month == 2 || month == 3) {
		result = "Winther";
	}else if(month == 4 || month == 5 || month == 6) {
		result =  "Spring";
	}else if(month == 7 || month == 8 || month == 9) {
		result =  "Summer";
	}else if(month == 10 || month == 11 || month == 12) {
		result =  "Fall";
	 } 
	
					if(month % 3 == 0 && day >= 21) {
										if(result == "Winther") {
											result = "Spring";
										}else if(result == "Spring") {
											result = "Summer";
										}else if(result == "Summer") {
											result = "Fall";
										}else {
											result = "Winther";
										}
										
						
	
						}
						
		return result;
	}
}