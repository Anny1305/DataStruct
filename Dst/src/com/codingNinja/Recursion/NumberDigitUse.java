package com.codingNinja.Recursion;

import java.util.Scanner;

public class NumberDigitUse {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(NumberDigit.count(n));
	}
	
}