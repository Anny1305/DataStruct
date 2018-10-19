package com.anny.toh;

public class Hanoi {
	
	static void towerHanoi(int n, String tower1,String tower2,String tower3)
	{
		if(n>=1)
		{
			towerHanoi(n-1, tower1, tower3, tower2);
			System.out.println(tower1+"->"+tower2);
			towerHanoi(n-1, tower3, tower2, tower1);
			
			
			
		}
	
	}
	
	public static void main(String[] args) {
		
	int numberofDisc=3;
	towerHanoi(3,"x","y","z");
		
		
		
	}
	
	
	

}
