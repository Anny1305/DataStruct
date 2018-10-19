package com.anny.stack;

import java.util.Scanner;

public class InfixToPostFixProg {

	private static String infixtoPostfix(String str) 
	{
		String outRes ="";
	     char[] exp = str.toCharArray();	
	     Stack s = new Stack();
	     for(char ch:exp)
	     {
	    	 if(operand(ch))
	    	 {
	    	   	 outRes +=ch;
	    	 }
		     else {
			    	 while (!s.isEmpty() && hasHigherPrecedence(s.peek(),ch) )
			    	 {
			    		 outRes+=s.pop();
			    	 }
			    	 s.push(ch);
		    	 }
	     }
	     while(!s.isEmpty())
	     {
	    	 outRes+=s.pop();
	     }
		return outRes;
	}
	
	private static boolean hasHigherPrecedence(char top, char exp)
	{
		if(top=='/' || top =='*')
		{
			if(exp=='+' ||exp=='-' )
			 return true;
		}
		
		return false;
		
	}
	
	
	private static boolean operand(char ch) 
	{
		if(ch!='*' && ch !='+' && ch!='-' && ch!='/' && ch!='%'  )
		{
			return true;
		}
		
		return false;
	}


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(infixtoPostfix(str));
		

	}

	

}
