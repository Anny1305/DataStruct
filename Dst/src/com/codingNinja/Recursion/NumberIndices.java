package com.codingNinja.Recursion;
import java.util.*;
public class NumberIndices {

	public static int[] allIndexes(int input[], int x) {
		
       return allIndexes(input,0,x);   
        
	}
    
    public static int[] allIndexes(int input[], int index, int x) {
		
        int[]out = null;
        
        if(index == input.length){
            int[] out1 = {};
            return out1;
        }
            
        
        int[] smallAns = allIndexes(input,index+1,x);
      
        if(input[index]!=x){
            return smallAns;
        }
        else{
            out = new int[smallAns.length+1];
            out[0]=index;
            int idx=0;
            for(int i =1;i<out.length;i++){     
                out[i]=smallAns[idx];
                idx++;
            }  
        }
        
            
        return out;
	}
	
}