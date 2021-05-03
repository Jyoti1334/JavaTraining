package com.oops;

import java.util.Scanner;

public class Testclass extends JavaInheritance {
	double doubleTemprature;
	int intOxygen;
	Scanner sc=new Scanner(System.in);	
	
	
	public void checkSymptoms(){
		System.out.println("Enter Temprature:");
		doubleTemprature = sc.nextDouble();
		System.out.println("Enter Oxygen:");
		intOxygen=sc.nextInt();
		if(doubleTemprature>98.2&&intOxygen<95){
			System.out.println("You have corona symptoms consult to your doctor");
		}else{
			System.out.println("Your are normal");
		}
		
	}
	
	

	public static void main(String[] args) {
		Testclass objTestclass=new Testclass();
		objTestclass.showInfo();
		objTestclass.checkSymptoms();

	}

}
