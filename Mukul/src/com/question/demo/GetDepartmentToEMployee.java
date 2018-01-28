package com.question.demo;

import java.util.HashMap;
import java.util.Map;

public class GetDepartmentToEMployee 
{
	public static void getEmployeename(String department_name)
	{
		if(department_name==null)
		{
			return;
		}
		else
		{
			Map<Department,Employee> map=new HashMap<Department,Employee>();
			Employee emp=new Employee(101, "hsgdh", 4.8f);
			Employee emp1=new Employee(102, "hjhckj", 5.8f);
			Employee emp2=new Employee(103, "dkjfckj", 2.8f);
			Employee emp3=new Employee(104, "mkdjsa", 3.8f);
			Employee emp4=new Employee(105, "dxjh", 5.6f);
			Employee emp5=new Employee(106, "hnxb", 5f);
			
			
			Department dep=new Department(1, emp,"IT");
			Department dep1=new Department(2, emp3,"HR");
			Department dep2=new Department(1, emp4,"FIN");
			Department dep3=new Department(1, emp5,"MARK");
			
			
			
			map.put(dep,emp1);
			map.put(dep1,emp1);
			map.put(dep2,emp1);
			map.put(, value);
			
			
		}
	}
}
