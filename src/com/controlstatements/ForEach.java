package com.controlstatements;

public class ForEach {

	public static void main(String[] args) {
		 //Enter a array with numbers
		   int[] intNum = {5,6,7,-8,4,2,9};
		   int intSum = 0;

		   //For Each Loop
		   for (int number: intNum) {
		     intSum += number;
		   }
		  
		   System.out.println("Sum = " + intSum);

	}

}
