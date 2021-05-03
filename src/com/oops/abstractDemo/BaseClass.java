package com.oops.abstractDemo;

public abstract class BaseClass {
	 double doubleRate;
	
	public abstract void getRate();
	
	public void calculateBill(int intUnits){
		System.out.print("Bill amount for "+ intUnits +" unit: " );
		System.out.println(doubleRate*intUnits);
	}

}
