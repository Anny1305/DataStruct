package com.codingNinja.Recursion;


public class Power {

	public static int power(int x, int n) {
		
          
        if(n==0)
            return 1;
        else
          return  x*power(x,n-1);
     
      
	}
}