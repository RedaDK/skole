package test;

import java.awt.List;
import java.util.Arrays;

public class Test {


	public static void main(String[] args){ 
	    
		int [][] firsts = {{1, 10}, {0, 4}, {1, 1}};
	    int[][] seconds = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {0, 10}};

	    for(int[] secondRow : seconds) {
	        for(int[] firstRow: firsts) {
	            if(firstRow[1] == secondRow[1])
	                secondRow[0] = firstRow[0];
	        }
	    }       

	    // Use for displaying updated result only
	    for(int[] secondRow : seconds)
	        System.out.println("[" + secondRow[0] + ", " + secondRow[1] + "]");     

	
}
	
}