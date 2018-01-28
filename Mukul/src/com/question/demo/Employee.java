package com.question.demo;

public class Employee
{
	private int id;
	private String name;
	private float exp;
	 
	
	public Employee()
	{
		id=0;
		name=null;
		exp=0f;
	}


	public Employee(int id, String name, float exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}


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


	public float getExp() {
		return exp;
	}


	public void setExp(float exp) {
		this.exp = exp;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
