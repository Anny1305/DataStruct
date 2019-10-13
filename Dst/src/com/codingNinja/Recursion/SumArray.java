package com.codingNinja.Recursion;

public class SumArray {

	public static int sum(int input[]) {
		
     return  sum(input,0);
		
	}
    
    public static int sum(int input[],int num){
        
        if(num == input.length-1)
        {
           return  input[num];
        }
        
        
        return input[num]+sum(input,num+1);
    }
}