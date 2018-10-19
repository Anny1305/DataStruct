package com.anny.LinkedStack;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next = null;
	}
}


public class LinkedStack {
	
	static Node Head;

	static Node getNode(int data)
	{
		return new Node(data);
	}
	
	static void push(int data)
	{
		if(Head == null)
		{
			Head =getNode(data);
		}
		else
		{
			Node temp=null;
			temp = getNode(data);
			temp.next = Head;
			Head=temp;
		}
	}
	
	static Node pop()
	{
		Node temp= Head;
		Head=Head.next;
		
		return temp;
	}
	
	static int peek()
	{
		return Head.data;
	}
	
	static void print()
	{
		Node temp=Head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}	
		System.out.println();
	}
	
	static boolean isEmpty()
	{
		return Head==null;
	}
	
	
	public static void main(String[] args) {
		
		push(2);
		push(3);
		push(4);

		print();
		pop();
		print();


	}

}
