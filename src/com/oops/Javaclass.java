package com.oops;

public class Javaclass {
	String strUsername="vstl21@gmail.com";
	String strPassword="Admin@123";
	
	public void dologin(){
		//Enter Username
		System.out.println("Enter Username : "+strUsername);
		
		//Enter Password
		System.out.println("Enter Password : "+strPassword);
		
		//click on login button
		System.out.println("Click on login button");
		
		// verify the login
		System.out.println("Page for logout is displayed");
		
		
	}

	public static void main(String[] args) {
		Javaclass objJavaclass = new Javaclass();
		objJavaclass.dologin();

	}

}
