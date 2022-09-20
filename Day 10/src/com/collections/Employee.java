package com.collections;

import java.util.Comparator;

public class Employee implements Comparable <Employee>{
public String firstname;
public String lastname;
public double salary;

public Employee(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}
public Employee(String firstname, String lastname,double salary) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.salary=salary;
}
//public String getFirstname() {
//	return firstname;
//}
//public void setFirstname(String firstname) {
//	this.firstname = firstname;
//}
//public String getLastname() {
//	return lastname;
//}
//public void setLastname(String lastname) {
//	this.lastname = lastname;
//}
@Override
public String toString() {
	return "firstname=" + firstname + ": lastname=" + lastname + ": Salary="+salary ;
}
//must be overridden if the objects are added in the set
//The logic should be in corresponding to equals method to avoid unnecessary bucketing
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return firstname.length()*3;
	//write some business logic here so that number of logical bucketing will happen and efficiency of the code is increased
}
//must be overridden if the objects are added in the set
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	Employee e = (Employee)obj;
	return this.firstname.equals(e.firstname)&&this.lastname.equals(e.lastname);
}
//this method gets invoked by treeset to re-arrange the objects
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.firstname.compareTo(o.firstname);
}


}
