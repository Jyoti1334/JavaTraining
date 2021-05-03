package com.oops.methodOverride;

public class TestClass {

	public static void main(String[] args) {
		MethodOverride objMethodOverride = new MethodOverride();
		objMethodOverride.setName("Raj Kumar");
		objMethodOverride.calculateBill(100);
		
		//System.out.println("========================================");
		Domestic objDomestic = new Domestic();
		objDomestic.setName("Amit Kumar");
		objDomestic.calculateBill(200);
		

	}

}
