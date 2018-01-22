package com.employee.usingTree;

public class Employee
{
private int id;
private String name;
private Department dep;
private float salary;

public Employee()
{
	id=Integer.MIN_VALUE;
	name=null;
	dep=null;
	salary=Float.MIN_VALUE;
}



public Employee(int id, String name, Department dep, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.dep = dep;
	this.salary = salary;
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



public Department getDep() {
	return dep;
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



public void setDep(Department dep)
{
	this.dep = dep;
}



public float getSalary()
{
	return salary;
}



public void setSalary(float salary)
{
	this.salary = salary;
}


}