package stringProgramming;

import java.util.Scanner;

//Reverse words in a given string
class StringReverse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int index = 0;
		int testCases =  in.nextInt();
		String[] inputStr = new String[testCases];
		
		while (testCases > 0) {
			inputStr[index] = new Scanner(System.in).nextLine();
			index++;
			testCases--;
		}
		for(int i =0;i<inputStr.length;i++)
		{
		    System.out.println(reverseEachWord(inputStr[i]));
		}

	}

	private static String reverseEachWord(String inputStr) {
		String outStr = "";
		String[] splitStr = inputStr.split("\\.");

		for (int i = 0; i < splitStr.length; i++) {
			String temp = splitStr[i];
			outStr = (i == 0 ? temp + outStr : temp + "." + outStr);
		}
		return outStr;
	}

}
