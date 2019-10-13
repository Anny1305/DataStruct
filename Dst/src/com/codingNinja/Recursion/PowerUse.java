package com.codingNinja.Recursion;

import java.util.Scanner;

public class PowerUse {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(Power.power(x, n));
	}
}
