package general;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class fibonacciModification {

	public static int fib(int n,int[] memo)
	{
		int result=0;
		if(memo[n]!=0)
			return memo[n];

		if(n ==0) result= 0;
		if(n ==1 || n==2)
			 result = 1;
		else
			 result = fib(n-1,memo)+fib(n-2,memo);
		memo[n]=result;

		return result;
	}


	public static void main(String[] args) {

	  System.out.println("Find the Number of fibonacci sequence ");
	  Scanner in = new Scanner(System.in);
	  int num = in.nextInt();
	  int[] memo =new int[num+1];

	  //System.out.println("Number is : "+fib(num,memo));
	  List<String> l = Arrays.asList("a");
	  System.out.println(l.getClass().getName());
	  
		
	}

}
