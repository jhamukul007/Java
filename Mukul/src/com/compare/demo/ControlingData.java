package com.compare.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ControlingData 
{
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	Employee emp1=new Employee(101,"hdfjhd");
	Employee emp2=new Employee(103,"hfhjd");
	Employee emp3=new Employee(106,"jdshfj");
	Employee emp4=new Employee(104,"hdjfjk");
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	Collections.sort(list);
	/*for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getId()+" "+list.get(i).getName());
	}*/
	
	Iterator<Employee> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next().getId());
	}
}
}
