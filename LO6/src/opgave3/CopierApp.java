package opgave3;

public class CopierApp {

	public static void main(String[] args) {
		
		Copier hest = new Copier(2);
		hest.makeCopy(0);
	//	hest.insertPaper(600);
		System.out.println(hest.getPaperCount());
		
		

	}

}
