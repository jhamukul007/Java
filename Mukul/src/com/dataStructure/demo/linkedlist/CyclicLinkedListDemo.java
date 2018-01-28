package com.dataStructure.demo.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CyclicLinkedListDemo 
{
	static Set<Node> set;
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
	
	public static int length(Node head)
	{
		int len=0;
		while(head!=null)
		{
			len++;
			head=head.next;
			
		}
		return len;
	} 
	
	public static int nthNode(Node head,int n)
	{
		if(head==null)
		{
			return -1;
		}
		int len=length(head);
		if(n<0 || n>len)
		{
			return -1;
		}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				return head.data;
			}
			head=head.next;
			
		}
		
			return -1;
		
		
			
		
	}
	
	
	public static void mergepoint(Node h1, Node h2)
	{
	
		Node head1=h1;
		Node head2=h2;
		
		int l1=length(h1);
		int l2=length(h2);
		
		System.out.println(l1+" "+l2);
		int dif=0;
		if(l2>l1)
		{
			 head1=h2;
			 head2=h1;
			 dif=l2-l1;
			 
		}
		else 
		{
			head1=h1;
			head2=h2;
			dif=l1-l2;
		}
		for(int i=0;i<dif;i++)
		{
			head1=head1.next;
		}
			
			while(head1!=null && head2!=null)
			{
				/*System.out.println(head1.data);
				System.out.println(head2.data);*/
				if(head1==head2)
				{
					System.out.println(head1.data);
					break;
				}
				head1=head1.next;
				head2=head2.next;
			}
		}
		
		
	
		public static void sort(Node head)
		{
			if(head==null)
			{
				return;
			}
			List<Node> list=new ArrayList<Node>();
			
			//set=new TreeSet<Node>();
			while(head!=null)
			{
				list.add(head);
				head=head.next;
			}
			
			printSetData(list);
		}
		public static void printSetData(List<Node>list)
		{
			Comparator<Node> cmp=new Comparator<Node>()
			{

				@Override
				public int compare(Node o1, Node o2)
				{
					
					return o2.data-o1.data;
				}
			
				
			};
			
			Collections.sort(list,cmp);
			Node n;
			Iterator<Node> itr=list.iterator();
			while(itr.hasNext())
			{
				n=itr.next();
				System.out.println(n.data);
			}
		}
		
		
		
		
	public static void main(String[] args)
	{
		//CyclicLinkedListDemo obj=new CyclicLinkedListDemo();
		
		/*obj.head=new Node(1);
		Node one=new Node(2);
		obj.head.next=one;
		Node sec=new Node(3);
		one.next=sec;
		Node thr =new Node(4);
		sec.next=thr;
		Node four=new Node(5);
		thr.next=four;*/
		//four.next=obj.head;
		CyclicLinkedListDemo obj=new CyclicLinkedListDemo();
		obj.head=new Node(1);
		obj.head.next=new Node(2);
		obj.head.next.next=new Node(3);
		obj.head.next.next.next=new Node(4);
		obj.head.next.next.next.next=new Node(5);
		
		CyclicLinkedListDemo obj1=new CyclicLinkedListDemo();
		obj1.head=new Node(9);
		obj1.head.next=new Node(2);
		obj1.head.next.next=new Node(8);
		obj1.head.next.next.next=new Node(2);
		obj1.head.next.next.next.next=new Node(4);
		
		//mergepoint(obj.head, obj1.head);
		sort(obj1.head);
		
	//	System.out.println(CheckNode(obj.head));
		//System.out.println(nthNode(obj.head,4));
	}
}