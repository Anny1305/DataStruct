package stringProgramming;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str) {
		int length = str.length();
		char[] ch = str.toCharArray();
		boolean isPalindrome = true;

		for (int index = 0, lastindex = length - 1; index < length / 2; index++, lastindex--) {
			if (ch[index] == ch[lastindex])
				continue;
			else {
				isPalindrome = false;
				break;
			}

		}
		return isPalindrome;
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
			System.out.println(checkPalindrome(str)==false?"No":"Yes");

	}

}
