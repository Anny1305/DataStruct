package com.anny.tree;

import java.util.LinkedList;
import java.util.Queue;

class Bnode
{
	int data;
	Bnode left;
	Bnode right;
	
	Bnode(int data)
	{
		this.data=data;
		this.left =null;
		this.right=null;
	}
	
	Bnode getBnode(int data)
	{
		return new Bnode(data);
	}
}



public class BinarySearchTree {
	

	static Bnode getBnode(int data)
	{
		return new Bnode(data);
	}

	static Bnode insert(Bnode root, int data)
	{
	      if(root == null)
	    	  root= getBnode(data);
	      
	      else if (root.data>data)
	    	   root.left=insert(root.left,data);
	      else
	    	   root.right=insert(root.right,data);
	      
	      return root;
	}
	
	
	static boolean search(Bnode root,int data)
	{
		if(root == null)
			return false;
		else if(root.data==data)
			return true; 
		else if (root.data>data )
			return search(root.left,data);
		else
			return search(root.right,data);
			
	}
			
	static Bnode findmin(Bnode root)
	{
		if(root.left==null)
		   return root;
		
		else
		   return findmin(root.left);
		
	}
	
	static Bnode findmax(Bnode root)
	{
		if(root.right==null)
		   return root;
		
		else
		   return findmax(root.right);
		
	}
	
	static void printTree(Bnode root) throws InterruptedException
	{
		if(root!=null)
		{
		   printTree(root.left);	
		   System.out.print(" "+root.data);
		   printTree(root.right);
		}
	}
	
	static int height(Bnode Root)
	{
		if(Root==null)
			return -1;
		
    	int left = height(Root.left);
	    int right= height(Root.right);		

	    return 1 +Math.max(left, right);
	}
	
	static void preorder(Bnode root)
	{
		if(root!=null)
		{
			System.out.print(" "+root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	static void postorder(Bnode root)
	{
		if(root!=null)
		{
			postorder(root.left);
		    postorder(root.right);
		    System.out.print(" "+root.data);
		}
		
		
	}
	
	static void inorder(Bnode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
		}
	}
	
	static void levelOrderTraversal(Bnode root)
	{
		Queue<Bnode> q = new LinkedList();
        q.add(root);
        
		while(!q.isEmpty())
		{

			if(q.peek().left!=null)
			   q.add(q.peek().left);
			if(q.peek().right!=null)
			   q.add(q.peek().right);
			
			System.out.print(q.remove().data+ " ");

			
		}
	}
	
	static boolean isBST(Bnode root)
	{
		if(root ==null)
			return true;
		
		if(isBST(root.left) && isBST(root.right))
		{
		   boolean lflag=true;
		   boolean rflag=true;
		   boolean cflag=false;
		   
		   if(root.left!=null)
			   lflag=root.left.data<=root.data  && root.data>findmax(root.left).data;
		   if(root.right!=null)
			   rflag=root.right.data>=root.data && root.data<findmin(root.right).data;
			   
			
			return lflag&&rflag;
				
		}
		else 
			return false;
		
	}
	
	static boolean isBSTOpt(Bnode root,int min,int max)
	{
		if(root ==null)
			return true;
		
		if(isBSTOpt(root.left,min,root.data) && isBSTOpt(root.right,root.data,max))
		{
			boolean lflag=true;
			boolean rflag=true;
			   
			if(root.left!=null)
				   lflag=root.left.data<=root.data  && root.left.data>=min && root.left.data<=max;
			if(root.right!=null)
				   rflag=root.right.data>=root.data && root.right.data>=min && root.left.data<=max;
				
			return lflag&&rflag;
		}
		else
			return false;
		
	}
	
	
	static boolean isBSTEmpty(Bnode root)
	{
		if(root==null)
			return true;
		else 
			return false;
		
	}
	
	static Bnode findNode(Bnode root,int data)
	{
		if(root==null)
			return null;
		
		if(root!=null && root.data==data)
			return root;
		
		if(data<root.data)
			return findNode(root.left,data);
		else
		  return findNode(root.right,data);
		
	}
	

	static Bnode inorderSuccessor(Bnode root,int data)
	{
		if(root == null)
			return null;
		Bnode current = findNode(root,data);
		
		if(current.right!=null)
			return findmin(current.right);
		else
		{  
			Bnode successor =null;
			Bnode ancestor =root;
			while(ancestor!=current)
			{
				if(current.data<ancestor.data)
				{
					successor=ancestor;
					ancestor=ancestor.left;
				}
				else
					ancestor=ancestor.right;
			}
			return successor;
		}
	}
	
	
	static Bnode Anc(Bnode root,Bnode n1, Bnode n2)
	{
		if(root==null)
			return null;
		
		if(root==n1 || root==n2) return root;
		
		  Bnode left =  Anc(root.left,n1,n2);
		  Bnode right = Anc(root.right,n1,n2);
		
		if(left==null || right ==null)
			return null;
		if(left!=null && right!=null)
			return root;
			
		
		return left!=null?left:right;
		
		
	}
	
    int largestBST(Bnode root,boolean flag,int count,int min ,int max)
    {
    	if(root.left==null && root.right == null)
    		return largestBST(root, true, 1, root.data, root.data);
    	
    	if(root.left!=null)
    	  largestBST(root.left,flag,count,min,max);
    	
    	if(root.right!=null)
    	  largestBST(root.right,flag,count,min,max);
    	
    	
    	
    	return 0;
    	
    }
    
   static Bnode deleteBst(Bnode root, Bnode dnode)
   {
//	   
//	   Bnode node = 	
//	   
//	   if(node.left==null &&  )
//	   
	   
	   
	   
	   return null;
   }
    
    
	
	public static void main(String[] args) throws InterruptedException 
	{
		Bnode root = null;
		
		root = insert(root,20);
		root = insert(root,10);
		root = insert(root,25);
		root = insert(root,5);
		root = insert(root,15);
		root = insert(root,22);
		root = insert(root,30);
		root = insert(root,35);
		root = insert(root,21);
		root = insert(root,23);
		root = insert(root,3);

		printTree(root);
		System.out.println();
		System.out.println(search(root,22));
		
		System.out.println("min value is : "+findmin(root).data);
		System.out.println("height of tree: "+height(root));
		levelOrderTraversal(root);
		System.out.println("\n Preorder");
		preorder(root);
		System.out.println("\n inorder");
		inorder(root);
		System.out.println("\n postorder");
		postorder(root);
		System.out.println();
        System.out.println(" \n is BST tree: "+isBST(root));
      //  System.out.println(" \n is BSTOptimaization tree: "+isBSTOpt(root,Integer.MIN_VALUE,Integer.MAX_VALUE)); 
		//System.out.println("find node 15 "+" addre " +findNode(root, 31) );
		//System.out.println("Inorder Succesor 10 : "+inorderSuccessor(root,22).data);
        
//        System.out.println("Level by level printing of BST");
//        System.out.println("reverse level order traversal");
//        System.out.println("spiral printing");
//        System.out.println("Lowest common ancestor in binary search tree");
//        System.out.println("Lowest BST in binary search tree");
        
        //System.out.println("\n deleting a node in BST : "+deleteBST(root,findNode(root,30));

		
		
	}

}
