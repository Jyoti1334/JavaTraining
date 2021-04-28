package com.controlstatements;

import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
        System.out.print("Input a month : ");
        String strMonth;
        strMonth= sc.next();
        
        /*System.out.print("Input a year: ");
        int year = calender.nextInt();*/
        
        switch(strMonth){
           case "January":
        	   System.out.println("This month has 31 days");
        	   break;
           
           case "February":
        	   System.out.println("This month has 28  days or 29 days");
        	   break;
           case "March":  
        	   System.out.println("This month has 31 days");
        	   break;
          case "April":  
        	  System.out.println("This month has 30 days");
        	   break;   
          case "May":  
        	  System.out.println("This month has 31 days");
       	       break; 
          case "June":  
        	  System.out.println("This month has 30 days");
       	       break; 
          case "July":  
        	  System.out.println("This month has 31 days");
       	       break;  
          case "August":  
        	  System.out.println("This month has 31 days");
       	       break;  
          case "September":  
        	  System.out.println("This month has 30 days");
       	       break; 
          case "October":  
        	  System.out.println("This month has 31 days");
       	       break;  
          case "November":  
        	  System.out.println("This month has 30 days");
       	       break;  
          case "December":  
        	  System.out.println("This month has 31 days");
       	       break; 
       	  default:
       		  System.out.println("Invalid input ");
        }

      

	}

}
