package com.employee.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Employee 
{
	private int employee_id;
	
	private String name;
	private Date doj;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		result = prime * result + employee_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Employee(int employee_id, String name, Date doj) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.doj = doj;
	}
	
	
	public static void main(String[] args) 
	{
		List<Employee> empList=new ArrayList<Employee>();
		Employee emp=new Employee(101, "ABC",new Date(12/10/2015));
		Employee emp1=new Employee(12,"fvhd", new Date(15/12/2016));
		empList.add(emp);
		empList.add(emp1);
		
		 Comparator<Employee> cmp=new Comparator<Employee>() 
		 {
			 @Override
				public int compare(Employee e1,Employee e2)
				{
					return e1.getDoj().compareTo(e2.getDoj());
				}
		};
		Collections.sort(empList,cmp);
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
			
		}
	}
}
