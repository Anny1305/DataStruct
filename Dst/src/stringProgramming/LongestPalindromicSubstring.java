package stringProgramming;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	
	public static void longestPalindrome(String str)
	{
		int maxCount=0;
		 String subStr="";
		 
		for (int i=0;i<str.length();i++)
		{
			for(int j= str.length()-1;j>i;j--)
			{
				int hi=j;
				int lo= i;
				boolean flag = true; int count =0;
                while(lo<hi)
                {
                	if(str.charAt(lo)!=str.charAt(hi))
                	{
                		flag=false;
                		break;
                	}
                	else
                	{
                		count++;
                	}
                  hi--;
                  lo++;
                }
				if(flag && maxCount<count)
				{
					maxCount=count;
					subStr= str.substring(i, j+1);
				}
			}
			
		}
		
//		System.out.println("The longest palindrome with count is   "+maxCount);
//		System.out.println("Value is "+subStr);
		System.out.println(subStr);
		
	}
	
	public static void main(String[] args) {
		// System.out.println("ENter String: ");
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		while (testCase > 0) {
			String str = in.next();
			longestPalindrome(str);
			testCase--;
		}

	}

}
