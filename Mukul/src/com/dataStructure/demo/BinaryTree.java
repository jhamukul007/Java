package com.dataStructure.demo;

public class BinaryTree 
{
	Node root;
	public BinaryTree()
	{
		root=null;
	}
	
	public static boolean search(Node root,int data)
	{
/*		boolean flag=false;*/
		if(root==null)
		{
			return false;
		}
		
			if(root.data==data)
			{
				return true;
				
			}
			
			else 
			{
			return search(root.left,data)|| search(root.right,data);
			
			}
			
		
		/*if(flag==true)
		{
			
		}
		else
		{
			System.out.println("not found");
		}*/
		
	}
	
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		inOrder(root.left);
		inOrder(root.right);
	}
static int sum=0;
	public static int sum(Node root)
	{
		
		if(root==null)
		{
			return -1;
		}
		sum=sum+root.data;
		sum(root.left); 
		sum(root.right);
		return sum;
	}
	static int max=0;
	public static int max(Node root)
	{
		if(root==null)
		{
			return -1;
		}
		if(root.data>max)
		{
			max=root.data;
		}
		max(root.left);
		max(root.right);
		return max;
		
	}
	
	 /*int min(Node root)
	{
		if(root==null)
		{
			return -1;
		}
		if(root.data<min)
		{
			min=root.data;
			
		}
		min(root.left);
		min(root.right);
		return min;
		}*/
	public static void main(String[] args)
	{
		BinaryTree root=new BinaryTree();
		root.root=new Node(12);
		root.root.left=new Node(20);
		root.root.left.right=new Node(40);
		root.root.right=new Node(50);
		root.root.right.left=new Node(21);
		root.root.right.right=new Node(11);
		
		if(search(root.root,21))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
		System.out.println("Sum of All Node:"+sum(root.root));
	//	inOrder(root.root);
		System.out.println("Max Element in Binary Tree: "+max(root.root));
		//System.out.println("Min Element in Binary Tree: "+root.min(root.root));
		
		
	}
}
