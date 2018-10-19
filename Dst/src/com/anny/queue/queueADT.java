package com.anny.queue;

public class queueADT {
	
	static int[] arr = new int[5];
	
	static int front=-1;
	static int rear=-1;
	
	static void enqueue(int data)
	{
		//if(rear==arr.length-1)
		//	{System.out.println("queue is full");return;}
		
		if(isEmpty())
		{
		  front=0;rear=0;
			arr[rear]=data;
		}
		else if (!isFull())
		{
			//System.out.println(front+ "**" +rear);
			rear=(rear+1)%arr.length;
			arr[rear]=data;
		}
		else
			System.out.println("Queue is full");
		

		
	}
	
	static void dequeue()
	{
		if(isEmpty())
		{
			return;
		}
		else if (front ==rear)
			front =rear=-1;
		else	
		    front=(front+1)%arr.length;
	}
	
	static boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	
	int front()
	{
		return arr[front];
	}
	
	static void print()
	{
		int top=front;
		while(top!=rear)
		{
			System.out.print(" "+arr[top]);
			top=(top+1)%arr.length;
		}
		System.out.print(" "+arr[top]);
		System.out.println();


	}
	
	static boolean isFull()
	{
		return front==(rear+1)%arr.length;
	}
	
	public static void main(String[] args) 
	{
		enqueue(5);
		enqueue(6);
		enqueue(7);
		enqueue(8);
		enqueue(9);
		print();
        dequeue();
        dequeue();
		print();
		enqueue(10);
		enqueue(11);
		print();




		
		
		
		
	}

}
