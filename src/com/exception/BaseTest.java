package com.exception;

public class BaseTest {
	
	
	public void checkException(){
		
		
		try{
			System.out.println("Open Files");
			
			
			int intNum1=30;
			System.out.println("Number1= "+intNum1);
			
			int intNum2=0;
			System.out.println("Number2= "+intNum2);
			
			int intOutput=intNum1/intNum2;
			System.out.println("Result :"+intOutput);
			int array[]={25,20,45};
			array[50]=100;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
				
				System.out.println("Please check the data");
			}
			finally
			{
				System.out.println("Close Files");
			}
			
		}
		
	}

	

