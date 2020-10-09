package opgave3;

public class Copier {

	private int paperCount;

	private int  makeCopy;
	 
	
	public Copier() {
		paperCount = 0;
		//paperStuck = true;
	}
	
	public Copier(int paperCount) {	
	this.paperCount = paperCount;
}
	
	public void makeCopy() {
	
	//	this.makeCopy = makeCopy;
	/*
		if(paperCount == 0) {
			System.out.println("ERROR");
		}else {
			paperCount++;
		}
		*/
}

	public void insertPaper(int amount) {
		
		if(amount > 500) {
			System.out.println("ERROR TOO MUCH PAPER");
		}else {
			amount--;
		}
			}

	public void makeCopy(int copies) {
		if(copies <= 0) {
			System.out.println("ERROR NO PAPER LEFT");
		}
		this.makeCopy = copies ;
	}
	
	public int getPaperCount() {
		return paperCount - makeCopy  ;
	}
	
/*	
	public void makePaperJam() {
	
	if(paperStuck == true) {
		System.out.println("PAPER STUCK");
	}else {
		return false;
	}

     }
     */
}