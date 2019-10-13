package com.codingNinja.Recursion;


public class FirstIndexNumber {

	public static int firstIndex(int input[], int x) {
		return firstIndex(input,0,x);
	}
	
    public static int firstIndex(int input[],int index, int x) {

    
        if(index== input.length)
            return -1;
    
        if(input[index]==x)
            return index;
        else
            return firstIndex(input,index+1,x);
    
    }
}