package com.anny.stack;

import java.util.Scanner;

public class balancedParanthesis {

	public static void main(String[] args) throws Exception {
		
     System.out.println("Enter Expression");
	 Scanner in = new Scanner(System.in);
	 String str = in.nextLine();
		
     boolean check =balancedParanthesis1(str);
     if(check)
     {
    	 System.out.println("Balanced Paranthesis");
     }
     else
     {
    	 System.out.println("Imbalanced Paranthesis");
     }
  	}

	private static boolean balancedParanthesis1(String str) {
		//String str="[{()}]";
		 Stack st = new Stack(); 
		 
		 char[] exp =str.toCharArray();
		 
		 for(int i=0;i<exp.length;i++)
		 {
			 char ch=exp[i];
			 
			 if(ch=='[' ||ch=='{' || ch =='(')
			 {
				 st.push(ch);
			 }
			 else if (ch==']' ||ch=='}' || ch ==')')
			 {
				 if(st.isEmpty()||!arePair(st.pop(),ch))
				 {
					 return false;
				 }
		    }
			 
		 }
		 System.out.println(st.isEmpty());
		 return st.isEmpty();
	}

	private static boolean arePair(char pop, char ch) 
	{
		if(pop=='[' &&ch==']') return true;
		else if(pop=='{' &&ch=='}')  return true;
		else if(pop=='(' &&ch==')') return true;
		
		return false;
		
	}

}
