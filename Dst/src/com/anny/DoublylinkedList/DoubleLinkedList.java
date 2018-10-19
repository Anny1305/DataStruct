package com.anny.DoublylinkedList;


class dNode
{
	int data;
	dNode next;
	dNode prev;
	
	dNode(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	
}

public class DoubleLinkedList {
	

	static dNode getNode(int data)
	{
      return new dNode(data);
	}
	
	
   public static dNode insertLast(int data,dNode Head)
   {
	    if(Head==null)
	    {
	    	Head = getNode(data);
	    }
	    else
	    {
		    dNode temp=null;
		    dNode start=Head;
             temp = getNode(data);
	    	while(start.next!=null)
	    	{
	    		start =start.next;
	    	}
	    	
	    	start.next =temp;
	    	temp.prev=start;
	    }
    	return Head;
   }

   
   public static dNode insertFirst(int data,dNode Head)
   {
	   dNode start = Head;
	   
	   if(start == null)
	   {
		   start = getNode(data);
	   }
	   else
	   {
		   dNode temp = getNode(data);
		   temp.next=start;
		   start.prev=temp;
		   start=temp;
	   }
	   return start;
   } 
	  static void print(dNode Head)
	  {
		  if(Head!=null)
		  {
			  System.out.print(" "+Head.data);
			  print(Head.next);
		  }
		  
	  }
	  
	 static void printForward(dNode Head)
	  {
		 System.out.println("Printing in forward direction");
		  while(Head!=null)
		  {
			  System.out.print(" "+Head.data);
			  Head = Head.next;
		  }
		  
	  }
	 static void printBackward(dNode Head)
	 {
         System.out.println("\n Printing in reverse direction");
         if(Head==null) return;
         
         while(Head.next!=null)
         {
        	 Head = Head.next;
         }
         
         while(Head!=null)
         {
			  System.out.print(" "+Head.data);
			  Head=Head.prev;
         }
	  }
	
	public static void main(String[] args) {
		
		dNode Head=null;
		
		Head = insertLast(5,Head);
		Head = insertLast(6,Head);
		Head = insertLast(7,Head);
		
		Head = insertFirst(4,Head);

		printForward(Head);
		printBackward(Head);
		
		
		
	}
	
	

}
