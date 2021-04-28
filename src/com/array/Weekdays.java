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
			
				
				if(strExpected=="Mon"){
					System.out.println("Week Started");
				}else if(strExpected=="Tue"){
					System.out.println("Work Started");
				}else if(strExpected=="Wed"){
					System.out.println("Work in progress");
				}else if(strExpected=="Thu"){
					System.out.println("Work Finished");
					break;
				}else if(strExpected=="Fri"){
					System.out.println("Weekend");
				}else if(strExpected=="Sat"){
					System.out.println("Party");
				}else if(strExpected=="Sun"){
					System.out.println("Holiday");
					continue;
				}else{
					System.out.println("invalid");
				}
			}
		}
		}
	}

		 
		

	


