package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.comparator.AscendingListEmp;
import com.comparator.AscendingSalary;

public class EmployeeTreeSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> emplist = new TreeSet<>();
		Employee e1 = new Employee("Taylor", "s",1000);
		Employee e2 = new Employee("Ram", "a",700);
		Employee e3 = new Employee("Ravi", "f",200);
		Employee e4 = new Employee("Surya","b",500);
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		//It throws an error that collection cannot be cast to java.lang.comparable
		//We must implement comparable
		//using natural compareTo method
		System.out.println(emplist);
		
		// using comparator which is a interface
		//Collections.sort(List,Comparator implementation)
		List<Employee> emplist1 = new ArrayList<>();
		emplist1.addAll(emplist);
		Collections.sort(emplist1,new AscendingSalary());
		System.out.println(emplist1);
	}


}
