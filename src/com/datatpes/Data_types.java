package com.datatpes;

public class Data_types {
	  byte byteVal;
	  int intVal = 270;
	  double doubleVal = 128.128;
	  
	public void CharClass(){
	  
	    char charFirst = 'A';
	    char charSecond = 'B';
	       System.out.println("CharDataType");
	       System.out.println("First Alphabet: " +charFirst);
	       System.out.println("Second Alphabet: " +charSecond);
	    charSecond++; 
	       System.out.println("The Incremented value of second alphabet: " +charSecond);
	  }
	
	public void ByteDataType(){
	 
	    byte byte1 = 125;
	    byte byte2 = -46;
	       System.out. println("\n ByteDataType");
	       System.out.println("Byte 1: " +byte1);
	       System.out.println("Byte 2: " +byte2);
	    byte2++;
	       System.out.println("Incremented Value of byte2: " +byte2);
	  }
  
	public void IntDataType(){
	    int intNum1 = -7000;
	    int intNum2 = 90000;
	        System.out. println("\n IntDataType");
		    System.out.println("Number 1: " +intNum1);
		    System.out.println("Number 2: " +intNum2);
	    int result = intNum1+ intNum2;    
		    System.out.println("Addition of two integers: " +result);
	}
	
	public void Conversions(){
		 System.out.println("\n DataType Conversions");
		 byteVal = (byte) intVal;
		 System.out.println("int converted to byte is: "+byteVal);
		 
		 doubleVal = (double) intVal;
		 System.out.println("int converted to double is: "+ doubleVal);
	 
	}
	
	
	public static void main(String[] args) {
		Data_types objData_types= new Data_types();
		objData_types.CharClass();
		objData_types.ByteDataType();
		objData_types.IntDataType();
		objData_types.Conversions();
		
	}

}
