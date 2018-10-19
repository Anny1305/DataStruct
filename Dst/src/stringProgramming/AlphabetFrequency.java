package stringProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class AlphabetFrequency {

	public static void main(String[] args) {

		System.out.println("Please Enter the String");
		Scanner  sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap();
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			if(hm.containsKey(ch[i])== false)
			{
			   hm.put(Character.valueOf(ch[i]), 1);	
			}
			else
			{
				int value = hm.get(ch[i]);
				hm.put(ch[i],++value);
			}
		
		}
		System.out.println(hm);
	}

}
