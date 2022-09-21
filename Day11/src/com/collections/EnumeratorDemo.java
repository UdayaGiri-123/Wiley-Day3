package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector<String> vector = new Vector<>();
     vector.add("Abc");
     vector.add("Xyz");
     vector.add("ram");
     vector.add("ravi");
     // System.out.println(vector.get(3));
     Enumeration enumeration = vector.elements();
     System.out.println(
	          "The output after Enumerating through the Vector : ");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	}

}
