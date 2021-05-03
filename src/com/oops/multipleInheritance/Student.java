package com.oops.multipleInheritance;

public class Student {
	 String strName;
	 int intRollNo;
	 int intMark1;
	 int intMark2;
	 
	 Student(String n, int r, int m1, int m2) {
	  
		 strName=n;
		 intRollNo=r;
		 intMark1=m1;
		 intMark2=m2;
	 }
	 public void display() {
		  
		  System.out.println ("Name of Student: "+strName);
		  System.out.println ("Roll No. of Student: "+intRollNo);
		  System.out.println ("Marks of Subject 1: "+intMark1);
		  System.out.println ("Marks of Subject 2: "+intMark2);
		 }

}
