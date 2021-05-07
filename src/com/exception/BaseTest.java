package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseTest {
	 private String strName;
	
	 /***
	  * Method to show Arithmetic Exception
	  */
	public void toshowException(){
		
		
		try{
			System.out.println("Open Files");
			
			
			int intNum1=30;
			System.out.println("Number1= "+intNum1);
			
			int intNum2=0;
			System.out.println("Number2= "+intNum2);
			
			int intOutput=intNum1/intNum2;
			System.out.println("Result :"+intOutput);
			
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
	
	
		/***Method to throw out exception without handling it
		 * to accept the name
		 * @throws IOException
		 */
	    public void toacceptName() throws IOException{
	    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    	System.out.println("Enetr Name: ");
	        strName=br.readLine();
	    }
	    
	    /***
	     * to display the name
	     */
	    public void todisplayName(){
	    	System.out.println("Name :"+strName);
	    }
	    
	   
	}

	

