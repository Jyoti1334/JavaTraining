package com.oops.multipleInheritance;

public class Result extends Student implements Exam {

	Result(String n, int r, int m1, int m2) {
		super(n, r, m1, m2);
		
	}

	@Override
	public void percent_cal() {
		 int intTotal=(intMark1+intMark2);
		  float floatPercent=intTotal*100/200;
		  System.out.println ("Percentage: "+floatPercent+"%");
		
	}
	 public void display() {
		  
		  super.display();
		 }

}
