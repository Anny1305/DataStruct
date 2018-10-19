package com.anny.stack;

import java.util.Arrays;

public class Stack 
{
	static char arr[] = new char[50];
	static int top=-1;
	
	static void push(char data)
	{
		if(top==50-1)
			throw new StackOverflowError();
		else
			arr[++top]=data;
	}
	
	static char pop()
	{
		if(top==-1)
			throw new StackOverflowError("Stack empty");
		
		System.out.println("\n Pop Called");
		return arr[top--];
	}
	
	static char peek()
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
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}
