package general;

import java.util.Scanner;

public class Fibonacci {

	public static void fibonacci(int num)
	{
		int a=0,b =1;
		
		System.out.print(a+","+b);
		while(num>2)
		{
			int x =b;
			b=a+b;
			a=x;
			System.out.print(","+b);
			num--;
		}
	}	
	
	public static void main(String[] args) {
		
	  System.out.println("Enter the length of fibonacci sequence number: ");	
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      fibonacci(num);
	}

}
