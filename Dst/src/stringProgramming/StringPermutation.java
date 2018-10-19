package stringProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StringPermutation {
	
	public static void createStr(char[] charac)
	{
		Map<Character, Integer> m = new HashMap<>();
		
		for(char c:charac)
		{
		      if(m.get(c)==null)
		    	  m.put(Character.valueOf(c), 1);
		      else
		      m.put(Character.valueOf(c),m.get(c)+1);
		}	
		
		char[] str = new char[m.size()];
		int[] count = new int[m.size()];
		
		int index =0;
		for( Map.Entry<Character, Integer>  mp :m.entrySet())
		{
			str[index]=mp.getKey();
			count[index]= mp.getValue();
			index++;
		}
	  	
		char result[] = new char[charac.length];
		permuteUtils(str, result, count, 0);
	   
	}

	
	
	public static void permuteUtils(char[] str, char[] res, int[] count, int level)
	{
		if(res.length==level) {
		  print(res);
		  return;
		}
		
		for(int i=0; i<str.length;i++)
		{
            if(count[i]==0)
            	continue;
            
            res[level]=str[i];
            count[i]--;
            permuteUtils(str, res, count, level+1);
            count[i]++;
		}
	}
	
	
	public static void  print(char[] res)
	{
		for(Character ch:res)
		{
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine().trim();
		
		
		createStr(str.toCharArray());
	
	}

}
