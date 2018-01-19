package com.dataStructure.binarysearchtree.demo;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree 
{
	Node root;
	public BinarySearchTree(int data)
	{
		root=new Node(data);
	}
	public static void print(Node root)
	{
		if(root==null)
		{
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
	static int max=0;
	public static int max(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			max=root.data;
			max(root.right);
			
		}
		return max;
	}
	static int min=0;
	public static int min(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			min=root.data;
			min(root.left);
		}
		return min;
	}
	static int data1=0;
	public static boolean search(Node root, int data)
	{
		/*3.*/
		
		
		if(root!=null)
		{
			if(root.data==data)
			{
				/*System.out.println("data found");*/
				return true;
				
			}
			
			else if(data<root.data)
			{
				 //data=root.data;
				search(root.left,data);
			}
			else if(root.data<data)
			{
				 //data=root.data;
				search(root.right,data);
			}
		}
		return false;	 
	}
	public static void levelOrder(Node root)
	{
		if(root!=null)
		{
			Queue<Node> queue=new LinkedList<Node>();
			Node current=null;
			queue.offer(root);
			while(!queue.isEmpty())
			{
				current=queue.poll();
				System.out.print(" "+current.data);
				if(current.left!=null)
				{
					queue.offer(current.left);
				}
				if(current.right!=null)
				{
					queue.offer(current.right);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		BinarySearchTree obj=new BinarySearchTree(10);
		obj.root.left=new Node(5);
		obj.root.left.left=new Node(2);
		obj.root.left.right=new Node(6);
		//obj.root.left.right.left=new Node(3);
		obj.root.right=new Node(15);
		obj.root.right.left=new Node(13);
		obj.root.right.right=new Node(17);
		obj.root.right.right.right=new Node(18);
		/*print(obj.root);
		System.out.println("Max element in a BST:"+max(obj.root));
		System.out.println("Min element in a BST:"+min(obj.root));*/
		System.out.println(search(obj.root,18));
		//search(obj.root,18);
		/*if(b==true)
		{
			System.out.println("data found");
		}
		else
		{
			System.out.println("data not found");
	}*/
		levelOrder(obj.root);
	}
}

class Node
{
	Node left,right;
	int data;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}