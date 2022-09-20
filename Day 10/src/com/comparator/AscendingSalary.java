package com.comparator;

import java.util.Comparator;

import com.collections.Employee;

public class AscendingSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary==o2.salary)
			return 0;
		else if(o1.salary>o2.salary)
			return 1;
		else
			return -1;
	}

}
