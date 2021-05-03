package com.oops.abstractDemo;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Commercial connection");
		BaseClass objBaseClass = new ComercialPlan();
		objBaseClass.getRate();
		objBaseClass.calculateBill(250);
		
		System.out.println("Domestic connection");
		BaseClass objBaseClass_1= new DomesticPlan();
		objBaseClass_1.getRate();
		objBaseClass_1.calculateBill(150);
	}

}
