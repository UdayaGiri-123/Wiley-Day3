package com.comparator;

import java.util.Comparator;

import com.collections.Employee;

public class AscendingListEmp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.lastname.compareTo(o2.lastname);
	}

}
