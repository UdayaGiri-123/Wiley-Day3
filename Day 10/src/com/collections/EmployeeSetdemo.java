package com.collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set <Employee> emplist = new HashSet<>();
    Employee e1 = new Employee("Taylor","s");
    Employee e2 = new Employee("Ram","a");
    Employee e3 = new Employee("Ravi","c");
    Employee e4 = new Employee("Taylor","s");
    emplist.add(e1);
    emplist.add(e2);
    emplist.add(e3);
    emplist.add(e4);
    System.out.println(emplist);
    //find out different implementations 
	}

}
