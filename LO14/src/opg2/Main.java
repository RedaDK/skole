package opg2;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		String [][] ans = {	{"A","C","B","D","A","C","B","B"},
							{"C","B","C","A","C","D","A","B"},
							{"B","B","A","C","B","C","D","A"},
							{"C","A","C","B","B","D","A","C"},
							{"D","B","C","A","C","D","B","C"},
							{"A","C","A","D","A","A","D","A"},
							{"B","B","B","C","D","A","C","C"},
							{"D","B","C","C","A","B","A","A"},
							{"B","C","D","A","C","D","B","B"},
							{"C","A","B","C","D","C","B","A"},
				
						};

		String [] correct = {"A","C","B","D","A","C","B","B"};
			
			//print(ans);
			//printOne(correct);
			
			//correctStudent(ans, correct);
	}
	
//*****************************************************************************************************/
	
	public static void print(String[][] ans) {
		
		for (int row = 0; row < ans.length; row++) {
			for (int col = 0; col < ans[row].length; col++) {
				System.out.printf("%5s  ", ans[row][col]);
			}
			System.out.println();
		}
	}

	
//	public static int[] correctStudent(char[] [] ans, char [] correct) {
//		int[] correct = new int[ans.length];
//		for(int row = 0; row < ans.length; row++) {
//			int correctAnswer = 0;
//			if(int col = 0; col < ans[row].length; col++ ) {
//				if(ans[row][col] == correct[col]){
//					correctAnswer +=1;
//				}
//				correct[row] = correctAnswer;
//			}
//		return correct;
//		}
//		    	  
//		
//}
		
}	
		


