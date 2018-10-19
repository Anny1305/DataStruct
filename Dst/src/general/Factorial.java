package general;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int num)
	{
		if(num==0 || num==1)
			return 1;
		else
			return num*fact(num-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner in = new Scanner(System.in);
		int num  =in.nextInt();
		System.out.println("Factorial is : "+fact(num));
	}

}
