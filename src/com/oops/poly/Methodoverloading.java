package com.oops.poly;

public class Methodoverloading {
	public void dologin(String strUsername, String strPassword){
		//Enter Username
		System.out.println("Enter Username : "+strUsername);
		
		//Enter Password
		System.out.println("Enter Password : "+strPassword);
		
		//click on login button
		System.out.println("Click on login button");
		
		// verify the login
		System.out.println("Page for logout is displayed");
		
		
	}

	
	public void dologin(String strUsername, String strPassword,String strUser){
		System.out.println("======================================");
		//Enter Username
		System.out.println("Enter Username : "+strUsername);
		
		//Enter Password
		System.out.println("Enter Password : "+strPassword);
		
		//User role
		System.out.println("User role is: "+strUser);
		
		//click on login button
		System.out.println("Click on login button");
		
		// verify the login
		System.out.println("Page for logout is displayed");
		
		
	}

	public static void main(String[] args) {
		Methodoverloading objMethodoverloading= new Methodoverloading();
		objMethodoverloading.dologin("Amit", "Pass@12");
		objMethodoverloading.dologin("Raj", "RAj@12", "Admin");
	}

}
