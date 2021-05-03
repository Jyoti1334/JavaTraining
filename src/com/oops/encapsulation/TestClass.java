package com.oops.encapsulation;

public class TestClass {

	public static void main(String[] args) {
	BaseClass objBaseClass =new BaseClass();
	objBaseClass.setEmpName("Raj Kumar");
	objBaseClass.setEmpID(124985);
	objBaseClass.setEmpAge(28);
	System.out.println("Employee Name : "+objBaseClass.getEmpName());
	System.out.println("Employee ID : "+objBaseClass.getEmpID());
	System.out.println("Employee Age : "+objBaseClass.getEmpAge());
	}

}
