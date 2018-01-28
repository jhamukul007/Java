package com.question.demo;

public class Department
{
	private int d_id;
	private Employee emp;
	private String d_name;
	
	public Department()
	{
		d_id=0;
		emp=null;
		d_name=null;
	}

	public Department(int d_id, Employee emp, String d_name) {
		super();
		this.d_id = d_id;
		this.emp = emp;
		this.d_name = d_name;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + d_id;
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
		Department other = (Department) obj;
		if (d_id != other.d_id)
			return false;
		return true;
	}
	
	
	
	
	
}
