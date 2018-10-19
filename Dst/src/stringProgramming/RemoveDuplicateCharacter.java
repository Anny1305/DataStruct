package stringProgramming;

import java.util.Scanner;


/* * This solution assumes that given input String only contains * ASCII characters. You should ask this question to your Interviewer, * if he says ASCII then this solution is Ok. This Algorithm * uses additional memory of constant size. 

public static String removeDuplicatesFromString(String input) 
{ 

if (input == null || input.length() &lt; 2) { return input; }    
boolean[] ASCII = new boolean[256]; char[] characters = 
input.toCharArray(); ASCII[input.charAt(0)] = true; 
int dupIndex = 1; 
for (int i = 1; i &lt; input.length(); i++) 
{ 
	if (!ASCII[input.charAt(i)]) 
	{ 
		characters[dupIndex] = characters[i]; 
		++dupIndex; 
		ASCII[characters[i]] = true; 
	} 
	else { 
	    characters[dupIndex] = 0; ++dupIndex; 
	} 
} 

return toUniqueString(characters); }


 * * Utility method to convert Character array to String, omitting * NUL
 * character, ASCII value 0.
  public static String toUniqueString(char[] letters) {
	StringBuilder sb = new StringBuilder(letters.length);
	for (char c : letters) {
		if (c != 0) {
			sb.append(c);
		}
	}
	return sb.toString();
}*/



public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		Scanner in = new  Scanner(System.in);
		String str  = in.nextLine();
		
		String outputStr="";
		
		
		char[] ch = str.toCharArray();
		
		
		outputStr = m1(outputStr, ch);
		System.out.println(outputStr);	
		}

	private static String m1(String outputStr, char[] ch) {
		for(int i =0;i<ch.length;i++)
		{
			int j=i-1;
			boolean flag = true;

			while(j>=0)
			{
				if(ch[i]==ch[j])
				{
					flag= false;
					break;
				}
				j--;
			}

			if(flag)
			{
				outputStr+=ch[i];
			}


		}
		return outputStr;
	}
		
		
		
		
		
	}


