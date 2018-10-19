package com.anny.linkedList;

class Node
{

	int data;
	Node next;

	public Node(int data, Node link) {
		super();
		this.data = data;
	}


}


public class LinkedList {


	static Node getNode(int data)
	{
      return new Node(data, null);
	}

	
	public static void  deleteNode(int pos,Node Head)
	{
		int count =1;
		Node prev;
		
		while(Head!=null)
		{
			prev=Head;
			Head =Head.next;
			if(++count ==pos)
				prev.next=Head.next;
		}
		
		
	}

	static Node insertFirst(int data,Node Head)
	{
		
		Node temp = getNode(data);
		temp.next=Head;
		Head=temp;

		return Head;
	}

	static Node insertLast(int data, Node Head)
	{
	  Node temp = getNode(data);
	 
	  Node temp1= Head;
	  while (temp1.next!=null)
	  {
		  temp1=temp1.next;
	  }
	  
	  temp1.next=temp;
	  
	  return Head;	
		
	}

	static void print(Node Head)
	{
		int flag =0;
		System.out.println("Head.. "+Head);
		while(Head!=null)
		{
			flag=1;
			System.out.print(Head.data);	
			Head= Head.next;
			if(Head!=null)
				System.out.print("==>");
			
		}
		System.out.println();	

	}
	
	private static Node insertPosition(int data, int pos, Node head) {

		Node temp=head,prev=null;
		Node newNode = getNode(data);
		int count =1;
		
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
			
		}
		else {
			while(temp!=null)
			{
				prev=temp;
				temp=temp.next;

				if(++count==pos)
					break;
			}
			newNode.next=temp;
			prev.next=newNode;
		}
		
		return head;
	}
	
	private static int count(Node head) {
       int count=0;
		
		Node temp=head;
		while(temp!=null)
		{
			count++;

			temp=temp.next;
			
		}
		return count;
	}
	
	private static void swapAdjacentNode(int i, int j,Node Head) 
	{
		Node p=null,q=null,r=null;
		
		while(Head!=null)
		{
			if(Head.data==i)
			{
			  p=Head;
			}
			else if(Head.data==j)
			{
				q=Head;
			}
			
			Head = Head.next;
		}
		
		System.out.println(" "+p.data +" "+ q.data);
		
		r=q.next;
		System.out.println(" "+r.data);
		
		q.next =r.next;
		r.next= q;
		p.next=r;
		
		
	}

	public static Node IterativeReverse(Node Head)
	{
		Node curr=Head,fwd=Head;
		Node prev=null;
		
		while(fwd!=null)
		{
			fwd=fwd.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
			
		}
		
		return prev;
	}
	
	static Node reverseRecursion(Node prev,Node Head)
	{

		if(Head != null)
		{
	        Node headNext =Head.next;
			Head.next=prev;
		    return reverseRecursion(Head, headNext);
		}
		else
			return prev;		
	}
	

	public static void main(String[] args) 
	{
		Node Head=null;
		System.out.println("Linked list ");
		
		//Head = getNode(10);
		Head = insertFirst(9,Head);
		 Head=insertFirst(8,Head);
		 Head=insertFirst(7,Head);
		
		insertLast(10,Head);
		insertLast(4,Head);
		
		Head=insertPosition(6,4,Head);
		Head=insertPosition(5,1,Head);

		deleteNode(3, Head);

		
		print(Head);
		
		
		swapAdjacentNode(9,6,Head);
		print(Head);
		Head= IterativeReverse(Head);
		print(Head);
		System.out.println("reverse recursion ");
		Head=reverseRecursion(null, Head);
		print(Head);

			
       //System.out.println("\ncount of linked list: "+count(Head));	
		
	}


	

	


	




}
