package stringProgramming;

import java.util.Scanner;

public class AnagramRecursion {
	private static int index =0;
	
	private static boolean anagram(String str1, String str2,int count) {

		boolean flag=false;
		for (int i = 0; i < str2.length(); i++) 
		{
			if(str1.charAt(0) == str2.charAt(i))
			{
				flag=true;
				break;
			}
		}
		
		if(!flag) return false;
		
		if(count==str2.length())
			return true;
		
		return anagram(str1.substring(index,++index),str2,++count);

	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("PLease enter first String");
		String str1 = in.next();
		System.out.println("PLease enter Second String");
		String str2 = in.next();
		
		System.out.println(anagram(str1,str2,0));
		
	}

	

}
