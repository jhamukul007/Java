package com.employee.usingTree;

public class BST 
{
	
	Node root;
	public BST() {
		root=null;
	}
	
	public static void main(String[] args) 
	{
		Department d1=new Department(1,"Medical");
		Department d2=new Department(2,"IT");
		Department d3=new Department(3, "Management");
		Department d4=new Department(4, "Non-IT");
		
		Employee e1=new Employee(101, "ABC", d1, 512155f);
		Employee e2=new Employee(102, "jhC", d2, 5155f);
		Employee e3=new Employee(103, "A45", d2, 512f);
		Employee e4=new Employee(104, "ABDFC", d2, 5155f);
		Employee e5=new Employee(105, "ABCjhj", d4, 51245455f);
		Employee e6=new Employee(106, "ABhdhC", d3, 515655f);
		
		
		BST bst=new BST();
		bst.root=new Node(e1);
		bst.root.setRight(new Node(e2));
		
		
	}
}

class Node
{
	private Node left,right;
	private Employee emp;
	
	public Node()
	{
		left=right=null;
		emp=null;
	}
	
	public Node(Employee emp)
	{
		this.emp=emp;
	}
	
	public void setLef(Node left)
	{
		this.left=left;
	}
	
	public void setRight(Node right)
	{
		this.right=right;
	}
	public void setData(Employee emp)
	{
		this.emp=emp;
	}
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public Employee getData()
	{
		return emp;
	}
}