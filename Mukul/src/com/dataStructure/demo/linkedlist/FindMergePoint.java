package com.dataStructure.demo.linkedlist;

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