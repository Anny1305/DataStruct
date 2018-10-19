package com.anny.stack;

public class Stackint 
{
	static int arr[] = new int[50];
	static int top=-1;
	
	static void push(int data)
	{
		if(top==50-1)
			throw new StackOverflowError();
		else
			arr[++top]=data;
	}
	
	static int pop()
	{
		if(top==-1)
			throw new StackOverflowError("Stack empty");
		
		System.out.println("\n Pop Called");
		return arr[top--];
	}
	
	static int peek()
	{
		return arr[top];
	}
	
	static void print()
	{
		for(int i =0;i<=top;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	static boolean isEmpty()
	{
	 return top==-1;	
	}
	
	
	public static void main(String[] args) 
	{
		push((char)10);
		push((char)20);
		push((char)30);
		
		print();
		
		pop();
		print();
		
	}
	
}
