package com.anny.stack;

import java.util.Scanner;

public class EvaluatePostFixExpression 
{
	
	
   static int  evaluatePostFix(String str)
   {
	   Stackint s = new Stackint();
	   int op1=0;
	   int op2=0;
	   int res=0;
	   char[] ch = str.toCharArray();
	   
	   for(char c:ch)
	   {
		   if((c=='*') || (c=='/') || (c=='+') || (c=='-'))
		   {
			   op1=s.pop();
			   op2=s.pop();
			   
			   switch(c)
			   {
				   case '*': res = op1*op2; break;
				   case '/': res = op1/op2; break;
				   case '+': res = op1+op2;break;
				   case '-': res = op2-op1;break;
		       }	
			   s.push(res);
		   }
		   else 
		   {
			   s.push(c-'0');
		   }

	   }
    return s.pop();
   }
	
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str =s.nextLine();
		System.out.println(evaluatePostFix(str));
		
		
		
		
	}
	
	
	
}
