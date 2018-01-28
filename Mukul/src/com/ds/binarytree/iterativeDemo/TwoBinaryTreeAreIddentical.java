package com.ds.binarytree.iterativeDemo;

import java.util.LinkedList;
import java.util.Queue;

public class TwoBinaryTreeAreIddentical 
{
	Node root;
	public TwoBinaryTreeAreIddentical()
	{
		root=null;
	}
	
	public static boolean isIdentical(Node root1, Node root2)
	{
		/*if(root1==null || root2==null )
		{
			return false;
		}*/
		
		Queue<Node> queue=new LinkedList<Node>();
		Queue<Node> queue1=new LinkedList<Node>();
		
		queue.offer(root1);
		queue1.offer(root2);
		Node n1=null;
		Node n2=null;
		while(!queue.isEmpty() && !queue1.isEmpty())
		{
			n1=queue.poll();
			n2=queue1.poll();
			if(n1.data!=n2.data)
			{
				return false;
			}
			
			if(n1.left!=null)
			{
				queue.offer(n1.left);
			}
			if(n2.left!=null)
			{
				queue.offer(n2.right);
			}
			
			if(n1.right!=null)
			{
				queue.offer(n1.right);
			}
			
			if(n2.right!=null)
			{
				queue1.offer(n2.right);
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) 
	{
		TwoBinaryTreeAreIddentical obj= new TwoBinaryTreeAreIddentical();
		obj.root=new Node(10);
		TwoBinaryTreeAreIddentical obj1=new TwoBinaryTreeAreIddentical();
		obj1.root=new Node(10);
		
		
		System.out.println(isIdentical(obj.root,obj1.root));
	}
	
}
