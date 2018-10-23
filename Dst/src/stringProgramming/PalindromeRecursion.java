package stringProgramming;

import java.util.Scanner;

public class PalindromeRecursion {

	public static boolean checkPalindrome(String str,int lo,int hi) {
		
		if(lo>hi)
			return true;
		
		if(str.charAt(lo)==str.charAt(hi))
			return checkPalindrome(str,++lo,--hi);
		else
			return false;
		
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		String[] inputStr = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			int length = in.nextInt();
			inputStr[i] = in.next();
		}

		in.close();
		for (String str : inputStr)
			System.out.println(checkPalindrome(str,0,str.length()-1)==false?"No":"Yes");

	}

}
