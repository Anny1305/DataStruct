package com.codingNinja.Recursion;

public class CheckNumberArray {
	
	public static boolean checkNumber(int input[], int x) {
		
        
        return checkNumber(input,0,x);
        
		
	}
    
    public static boolean checkNumber(int input[], int index, int x) {
		
        if(index== input.length){
            return false;
        }
        
        
      if(input[index]==x)
          return true;
       else
           return  checkNumber(input,index+1,x);
             
        
		
	}
    
    
    
}