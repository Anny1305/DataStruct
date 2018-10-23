package stringProgramming;


import java.util.*;
import java.lang.*;
import java.io.*;

class Test1 {
    
    private static int numTestCases;
    private static int wordLength;
    private static String word;
    
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        
        numTestCases = scanner.nextInt();
        
        for(int i = 0; i < numTestCases; i++) {
            wordLength = scanner.nextInt();
            word = scanner.next();
            testPalindrone(wordLength, word);
        }
	}
	
	private static void testPalindrone(int wordLength, String word) {
	    int lo = 0;
	    int hi = word.length() - 1;
	    
	    while(lo < hi) {
	        
	        if(word.charAt(lo) != word.charAt(hi)) {
	            System.out.println("No");
	            return;
	        }
	            
            lo++;
            hi--;
	        
	    }
	    
	    System.out.println("Yes");
	}
}