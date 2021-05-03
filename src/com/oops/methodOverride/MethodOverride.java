package com.oops.methodOverride;

public class MethodOverride {
	
	private String strName;
	
	public void setName(String strName){
		this.strName= strName;
	}
	
	String getName(){
		return strName;
	}
	//Calculate bill for Rs 5.00 per unit
	public void calculateBill(int intUnits){
		System.out.println("Customer: "+getName());
		System.out.println("Bill amount= "+intUnits*5.00);
	}

	

}
