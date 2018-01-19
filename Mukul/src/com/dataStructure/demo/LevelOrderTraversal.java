package com.dataStructure.demo;

import java.util.*;

public class LevelOrderTraversal 
{
	Node root;
	public LevelOrderTraversal()
	{
		root=null;
	}
	
	public LevelOrderTraversal(int data)
	{
		root=new Node(data);
	}
	public static void levelOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> que=new LinkedList<Node>();
		que.offer(root);
		//que.offer(null);
		Node n=null;
		while(!que.isEmpty())
		{
			n=que.poll();
			/*
			if(n==null)
			{
				que.offer(null);
				System.out.println("  ");
			
			}*/
		
		
				System.out.println(n.data);
			if(n.left!=null)
			{
				que.offer(n.left);
			}
			if(n.right!=null)
			{
				que.offer(n.right);
			}
			
			
		}
		
	}
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Node currentNode=null;
		Stack<Node> st=new Stack<Node>();
		boolean flag=false;
		while(!flag)
		{
			if(root!=null)
			{
				st.push(root);
				root=root.left;
			}
			else
			{
			if(st.isEmpty())
			{
				flag=true;
			}
			else
			{
				currentNode=st.pop();
				System.out.println(" " +currentNode.data);
				root=currentNode.right;
			}
			}
		}
	}
	public static void main(String[] args) 
	{
		LevelOrderTraversal obj=new LevelOrderTraversal();
		obj.root=new Node(1);
		obj.root.left=new Node(2);
		obj.root.right=new Node(3);
		obj.root.left.left=new Node(4);
		obj.root.left.right=new Node(5);
		obj.root.right.left=new Node(6);
		obj.root.right.right=new Node(7);
		
		//levelOrder(obj.root);
		inOrder(obj.root);
	}
}
