package com.controlstatements;

import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner calender = new Scanner(System.in);
		
		int intNo_of_Days  = 0; 
        String strMonth_Name = "x";
		
        System.out.print("Input a month number: ");
        int month = calender.nextInt();
        
        System.out.print("Input a year: ");
        int year = calender.nextInt();
        
        switch(month){
           case 1:
        	   strMonth_Name="January"; 
        	   intNo_of_Days = 31;
        	   break;
           
           case 2:
        	   strMonth_Name="February"; 
        	   if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        		   intNo_of_Days= 29; 
        	   }else{
        		   intNo_of_Days=28;
        	   }
        	   break;
           case 3:  
        	   strMonth_Name="March"; 
        	   intNo_of_Days = 31;
        	   break;
          case 4:  
        	   strMonth_Name="April"; 
        	   intNo_of_Days = 30;
        	   break;   
          case 5:  
       	       strMonth_Name="May"; 
       	       intNo_of_Days = 31;
       	       break; 
          case 6:  
       	       strMonth_Name="June"; 
       	       intNo_of_Days = 30;
       	       break; 
          case 7:  
       	       strMonth_Name="July"; 
       	       intNo_of_Days = 31;
       	       break;  
          case 8:  
       	       strMonth_Name="August"; 
       	       intNo_of_Days = 31;
       	       break;  
          case 9:  
       	       strMonth_Name="September"; 
       	       intNo_of_Days = 30;
       	       break; 
          case 10:  
       	       strMonth_Name="October"; 
       	       intNo_of_Days = 31;
       	       break;  
          case 11:  
       	       strMonth_Name="November"; 
       	       intNo_of_Days = 30;
       	       break;  
          case 12:  
       	       strMonth_Name="December"; 
       	       intNo_of_Days = 31;
       	       break; 
       	  default:
       		  System.out.println("Invalid input ");
        }

       System.out.println(strMonth_Name+ "  " +year + " have " +intNo_of_Days +" days \n" );


	}

}
