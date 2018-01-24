package com.ds.binarytree.iterativeDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree
{
	Node root;
	public BinaryTree()
	{
		root=null;	
	}
	public static void inOreder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Stack<Node> st=new Stack<Node>();
		Node current=root;
		boolean flag=true;
		
		while(flag)
		{
			
			if(current!=null)
			{
				st.push(current);
				current=current.left;
			}
			else
			{
				if(st.isEmpty())
				{
					flag=false;
				}
				else
				{
					current=st.pop();
					System.out.println(current.data);
					current=current.right;
				}
			}
		}
	}
	
	public static void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> queue=new LinkedList<Node>();
		Node current=root;
		Node pre=null;
		boolean flag=true;
		
		while(flag)
		{
			if(current!=null)
			{
				queue.offer(current);
				if(current.left!=null)
				{
					current=queue.poll();
					pre=current;
					current=current.left;
				}
				else
				{
				
				}
				
				
			}
		}
	}
	public static void main(String[] args) 
	{
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(6);
		bt.root.left=new Node(4);
		bt.root.right=new Node(8);
		bt.root.left.left=new Node(3);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(7);
		bt.root.right.right=new Node(9);
		inOreder(bt.root);
		
	}
}


