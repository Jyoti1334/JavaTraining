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
	
	public void enterMobileNo(int intMobileNo){
		System.out.println("Enter Mobile Number : "+intMobileNo);
	}
	
    public void enterNewPassword(String strPassword){
    	System.out.println("Enter New Password :"+strPassword);
    }
    
    public void selectDate(int intDate){
    	System.out.println("Select Date from Date Dropdown :"+intDate);
    }
    
    public void selectMonth(String strMonth){
    	System.out.println("Select Month from Month Dropdown :"+strMonth);
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
    
    public void doSignUp(String strFirstname, String strSurname, int intMobileNo, String strPassword, int intDate, String strMonth, int intYear, String strGender2){
    	//Step 1. enter FirstName
    	this.enterFirstName(strFirstname);
    	
    	//step 2. enter surname
    	this.enterSurname(strSurname);
    	
    	//step 3. enter mobile number
    	this.enterMobileNo(intMobileNo);
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.selectDate(intDate);
    	
    	//step 6. enter month
    	this.selectMonth(strMonth);
    	
    	//step 7. enter year
    	this.selectYear(intYear);
    	
    	//step 8. select gender
    	this.selectGender(strGender2);
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    }
    /*SignUp with Mobile No*/
    public void doSignUpwithMobileNo(String strPassword, String strGender2){
    	//Step 1. enter FirstName
    	this.getRandomString(2);
    	System.out.println("FirstName :"+getRandomString(2));
    	
    	//step 2. enter surname
    	this.getRandomString(4);
    	System.out.println("Surname :"+getRandomString(4));
    	
    	//step 3. enter mobile number
    	this.getRandomMobileNumber();
    	System.out.println("Mobile number :"+getRandomMobileNumber());
   	
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.getRandomNumber(1, 31);
    	System.out.println("Date :"+getRandomNumber(1, 31));
    	
    	////step 6. enter month
    	this.getRandomNumber(1, 12);
    	System.out.println("Month :"+getRandomNumber(1, 12));
    	
    	//step 7. enter year
    	this.getRandomNumber(1990, 2000);
    	System.out.println("Year :"+getRandomNumber(1990, 2000));
    	
    	//step 8. select gender
    	this.selectGender(strGender2);
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    	
    
    }
	/*to SignUp with email ID*/
    public void doSignUpwithEmail(String strPassword, String strGender2){
    	//Step 1. enter FirstName
    	this.getRandomString(2);
    	System.out.println("FirstName :"+getRandomString(2));
    	
    	//step 2. enter surname
    	this.getRandomString(4);
    	System.out.println("Surname :"+getRandomString(4));
    	
    	//step 3. Enter emailID
    	this.getEmailID();
    	System.out.println("Email Id: "+getEmailID()+"@gmail.com");
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.getRandomNumber(1, 31);
    	System.out.println("Date :"+getRandomNumber(1, 31));
    	
    	////step 6. enter month
    	this.getRandomNumber(1, 12);
    	System.out.println("Month :"+getRandomNumber(1, 12));
    	
    	//step 7. enter year
    	this.getRandomNumber(1990, 2000);
    	System.out.println("Year :"+getRandomNumber(1990, 2000));
    	
    	//step 8. select gender
    	this.selectGender(strGender2);
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    	
    
    }
	

}
