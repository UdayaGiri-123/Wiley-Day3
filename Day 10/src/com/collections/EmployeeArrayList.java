package com.collections;

import java.util.Arrays;
import java.util.List;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Arrays.asList method
	  // the method asList() returns a list
		List<Employee> empList = Arrays.asList(new Employee("John","Doe"),new Employee("Johnny","depp"));
	    System.out.print(empList);
	}

}
