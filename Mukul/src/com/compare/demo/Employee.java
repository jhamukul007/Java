package com.compare.demo;

public class Employee implements Comparable
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o)
	{
		Employee emp=(Employee)o;
		if(this.id>emp.id)
		{
			return 1;
			
		}
		else if(this.id<emp.id) {
			return -1;
		}
		return 0;
	}
	
	
	
}
