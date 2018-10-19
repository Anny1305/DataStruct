package stringProgramming;

import java.util.Scanner;

public class StringReverse {

	String outStr="";
	
	
	public String revString (String str)
	{
		
		if(str==null || str.length()==1)
		{
		    return str;	
		}
	
		
		return revString(str.substring(1))+str.charAt(0);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		String inputStr= in.nextLine();
		String outStr= "";

		int lastIndex = inputStr.length()-1;
		while(lastIndex>=0)
		{
			outStr+=inputStr.charAt(lastIndex--);
		}
		
		System.out.println(outStr);
	}

}
