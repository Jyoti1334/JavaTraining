package com.oops.modular;

import java.util.Scanner;

public class FacebookPageobject extends Utilities {
	

   String strGender;

	public void createAcount(){
		System.out.println("Click on create account button");
		
	}
	
	public void verifySignUpPage(){
		System.out.println("Window with SignUp text is displayed");
	}
	
	public void enterFirstName(String strFirstname){
	System.out.println("Enter First Name  :"+strFirstname);
}
	
	
	public void enterSurname(String strSurname){
		System.out.println("Enter Surname :"+strSurname);
	}
	
	public void enterMobileNo(String strMobileNo){
		System.out.println("Enter Mobile Number : "+strMobileNo);
	}
	public void enterEmailID(String strEmailID){
		System.out.println("Enter Email Id : "+strEmailID);
	}
    public void enterNewPassword(String strPassword){
    	System.out.println("Enter New Password :"+strPassword);
    }
    
    public void selectDate(int intDate){
    	System.out.println("Select Date from Date Dropdown :"+intDate);
    }
    
    public void selectMonth(int intMonth){
    	System.out.println("Select Month from Month Dropdown :"+intMonth);
    }
    
    public void selectYear(int intYear){
    	System.out.println("Select year from Year Dropdown : "+intYear);
    }
    
    public void selectGender(String strGender2){
    	this.strGender=strGender2;
    
        if(strGender.toLowerCase().equals("female"))
        {
           System.out.println("Gender:female" );
        }

        else if(strGender.toLowerCase().equals("male") )
        {
           System.out.println("Gender: male");
        }
        else{
        	System.out.println("custom");
        }
        	

    }
    
    public void clickSignUp(){
    	System.out.println("Click on SignUp button");
    	
    }
    
    public void verifySignUp(){
    	System.out.println("Welcome page is displayed");
    }
    /*SignUp with Mobile No*/
    public void doSignUp(String strFirstname, String strSurname, String strMobileNo, String strPassword, int intDate, int intMonth, int intYear, String strGender2){
    	//Step 1. enter FirstName
    	this.enterFirstName(strFirstname);
    	
    	//step 2. enter surname
    	this.enterSurname(strSurname);
    	
    	//step 3. enter mobile number
    	this.enterMobileNo(strMobileNo);
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.selectDate(intDate);
    	
    	//step 6. enter month
    	this.selectMonth(intMonth);
    	
    	//step 7. enter year
    	this.selectYear(intYear);
    	
    	//step 8. select gender
    	this.selectGender(strGender2);
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    }
    /*SignUp with Email Id*/
    public void doSignUp_1(String strFirstname, String strSurname, String strEmailID, String strPassword, int intDate, int intMonth, int intYear, String strGender2){
    		//Step 1. enter FirstName
    	this.enterFirstName(strFirstname);
    	
    	//step 2. enter surname
    	this.enterSurname(strSurname);
    	
    	//step 3. enter mobile number
    	this.enterEmailID(strEmailID);;
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.selectDate(intDate);
    	
    	//step 6. enter month
    	this.selectMonth(intMonth);
    	
    	//step 7. enter year
    	this.selectYear(intYear);
    	
    	//step 8. select gender
    	this.selectGender(strGender2);
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    }
    
	

}
