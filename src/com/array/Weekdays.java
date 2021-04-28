package com.array;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		String strActualdays[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day:");
		String strExpected;
		strExpected= sc.next();
		
		for(int intIndex=0;intIndex<strActualdays.length;intIndex++){
			
			if(strActualdays[intIndex].equals(strExpected)){
			
				
				if(strExpected.equals("Mon")){
					System.out.println("Week Started");
				}else if(strExpected.equals("Tue")){
					System.out.println("Work Started");
				}else if(strExpected.equals("Wed")){
					System.out.println("Work in progress");
				}else if(strExpected.equals("Thu")){
					System.out.println("Work Finished");
					break;
				}else if(strExpected.equals("Fri")){
					System.out.println("Weekend");
				}else if(strExpected.equals("Sat")){
					System.out.println("Party");
				}else if(strExpected.equals("Sun")){
					System.out.println("Holiday");
					continue;
				}else{
					System.out.println("invalid");
				}
			}
		}
		}
	}

		 
		

	


