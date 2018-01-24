package com.dataStructure.demo.linkedlist;

public class CyclicLinkedListDemo 
{
	Node head;
	
	public static boolean CheckNode(Node head)
	{
		if(head==null)
		{
			return false;
		}
		
		Node temp=head;
		int count=0;
		while(head!=null )
		{
			if(count>1)
			{
				
			if(head==temp)
			{
				return true;
			}
			}
			head=head.next;
			count++;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		CyclicLinkedListDemo obj=new CyclicLinkedListDemo();
		
		obj.head=new Node(1);
		Node one=new Node(2);
		obj.head.next=one;
		Node sec=new Node(3);
		one.next=sec;
		Node thr =new Node(4);
		sec.next=thr;
		Node four=new Node(5);
		thr.next=four;
		//four.next=obj.head;
		
		System.out.println(CheckNode(obj.head));
	}
}