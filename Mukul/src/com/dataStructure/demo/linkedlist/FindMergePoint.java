package com.dataStructure.demo.linkedlist;

import java.awt.HeadlessException;

public class FindMergePoint 
{
	Node head;
	public FindMergePoint()
	{
		head=null;
	}
	
	public int checkForMerge(Node n1, Node n2)
	{
		if(n1==null && n2==null)
		{
			return -1;
		}
		if(n1==null || n2==null)
		{
			return -1;
		}
		int len1=0,len2=0;
	while(n1!=null)
	{
		len1++;
		n1=n1.next;
	}
	while(n2!=null)
	{
		len2++;
		n2=n2.next;
	}
	int i= MergePoint(n1,len1,n2,len2);
	return i;
		
	}
	
	public static int MergePoint(Node n1,int len1, Node n2, int len2)
	{
		int dif=0;
		if(len1>len2)
		{
			dif=len1-len2;
			
		}
		if(len2>len1)
		{
			dif=len2-len1;
		}
		
		return -1;
	}
	
	public static int nthNode(Node head, int n)
	{
		int len=length(head);
		if(head==null || n>len)
		{
			return -1;
		}
		
		
		int count=1;
		while(head!=null)
		{
			if(n==count)
			{
				return head.data;
			}
			count++;
			head=head.next;
		}
		return -1;
	}
	
	public static int length(Node head)
	{
		
		int count=1;
		
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		
		return count;
	}
	
	public static int mid(Node head)
	{
		if(head==null)
		{
			return -1;
		}
		
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public static int get(Node head)
	{
		if(head==null)
		{
			return -1;
		}
		int len=length(head);
		System.out.println(len);
		/*if(n>len || n<0)
		{
			return -1;
	}*/
		
		
		
		for(int i=1;i<len;i++)
		{
			if(i==len-2)
			{
				return head.data;
			}
			head=head.next;
		}
		return -1;
		
	}
	
	/*public Node merge(Node head1, Node head2)
	{
		if(head1==null && head2==null)
		{
			return null;
		}
		else if(head1==null && head2!=null)
		{
			return head2;
		}
		else if(head1!=null && head2==null)
		{
			return head1;
		}
		
		else if(head1!=null && head2!=null)
		{
			boolean b=true;
			int len=length(head1);
			for(int i=1;i<=len+1;i++)
			{
				if(i==len+1)
				{
					
				}
			}
		}
		
		
	}*/
	
	public static void main(String[] args) 
	{
		FindMergePoint obj=new FindMergePoint();
		obj.head=new Node(1);
		Node one=new Node(2);
		obj.head.next=one;
		Node sec=new Node(3);
		one.next=sec;
		Node thr =new Node(4);
		sec.next=thr;
		Node four=new Node(5);
		sec.next=four;
		Node five =new Node(6);
		four.next=five;
		
		Node six =new Node(7);
		five.next=six;
		
		Node seven =new Node(8);
		six.next=seven;
		
		System.out.println(length(obj.head));
		
		
		
		//System.out.println(mid(obj.head));
		//System.out.println(nthNode(obj.head,2));
		
		//System.out.println(get(obj.head));
		FindMergePoint obj1=new FindMergePoint();
		obj1.head=new Node(9);
		Node one1=new Node(8);
		obj1.head.next=one1;
		Node sec1=new Node(7);
		one1.next=sec1;
		Node thr1 =new Node(4);
		sec1.next=thr1;
		Node four1=new Node(10);
		sec1.next=four1;
		
	
	}
	
}

class Node
{
	Node next;
	int data;
	
	public Node(int data)
	{
		this.data=data;
	}
	
}