package com.oops.methodOverride;

public class Domestic extends MethodOverride {
	
	
//Calculate bill for RS 2.50 per unit
	@Override
	public void calculateBill(int intUnits) {
		// TODO Auto-generated method stub
		super.calculateBill(intUnits);
		//System.out.println("Customer: "+getName());
		//System.out.println("Bill amount= "+intUnits*2.50);
	}

	
}
