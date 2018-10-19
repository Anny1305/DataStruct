package general;

import java.util.Scanner;

public class FindFibonacci {

	public static int fib(int n)
	{
		
	    if(n==1 || n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}	
	
	public static void main(String[] args) {
		
	  System.out.println("Find the Number of fibonacci sequence ");	
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.println("Number is : "+fib(num));
	}

}
