package stringProgramming;

import java.util.Scanner;

public class Anagram {

	private static boolean checkAnagram(String str1, String str2) {
      
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
        boolean outResult = true;		
		
  outer:for(int index=0;index<ch1.length;index++) 
		{
			char ch = ch1[index];
			for (int index1 = 0; index1 < ch2.length; index1++) {
				if (ch2[index1] == ch) {
					continue outer;
				}
			}
			return false;

		}
	 return outResult;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// int testCases = in.nextInt();

		System.out.println("Please enter first String");
		String str1 = in.next();
		System.out.println("Please enter Second String");
		String str2 = in.next();

		in.close();
		boolean result =checkAnagram(str1, str2);
		System.out.println(result?"NO":"YES");

	}

}

