package com.codingNinja.Recursion;

import java.util.*;

	public class LastIndexNumber {

		public static int lastIndex(int input[], int x) {
	        return lastIndex(input,input.length-1,x);
		}
	    
	    public static int lastIndex(int input[], int index, int x){
	        
	        if(index==-1)
	            return index;
	        
	        if(input[index]==x)
	            return index;
	        else
	           return lastIndex(input,index-1,x);
	            
	    }
		
	}