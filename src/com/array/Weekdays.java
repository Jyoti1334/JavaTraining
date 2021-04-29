package com.array;


import java.util.Scanner;

public class Weekdays {
	Scanner sc=new Scanner(System.in);
    
    String strActual[]={"monday","tuseday","wednesday","thursday","friday","saturday","sunday"};
    
    String strExpected[]={"monday","tuseday","wednesday","thursday","friday","saturday","sunday"};
    
    public int arrayValidation(){
    
        int flag=0;
         
         for(String strIndexActual:strActual){
             for(String strIndexExpexted:strExpected){
               if(strIndexActual.equals(strIndexExpexted)){
                  flag = 1;  
               
               }else{
                   flag=0;
               }
                   
               }
              }
     return flag;
    }

 

    public void displayWeekWork(){

 

        System.out.println("enter the actual day :");
        String strActualDay=sc.next();
        
        for(int intIndex=0;intIndex<strExpected.length;intIndex++){
            
            if(strExpected[intIndex].equals(strActualDay)){
                if(strActualDay.equals("monday"))
                    System.out.println("work started");
                
                else if(strActualDay.equals("tuseday"))
                    System.out.println("work is in process..");
                
                else if(strActualDay.equals("wednesday"))
                    System.out.println("work finish");
                
                else if(strActualDay.equals("thursday"))
                    System.out.println("braek..");
            
                else if(strActualDay.equals("friday"))
                    System.out.println("weekend day");
                
                else if(strActualDay.equals("saturday"))
                    System.out.println("party day");
            
                else if(strActualDay.equals("sunday"))
                    System.out.println("continue to next week");            
            }
            }
        
    }
    
	
		     public static void main(String args[]){
		        Weekdays objWeekdays=new Weekdays();
		        
		        int intChek=objWeekdays.arrayValidation(); 
		        
		        //System.out.println(intChek);
		        if(intChek==1){
		            
		            System.out.println("Arrays are validated...");
		            
		            objWeekdays.displayWeekWork();
		            
		        }else{
		            
		            System.out.println("Arrays are not Validated we can not proceed further...");
		        }
		    }
		}


