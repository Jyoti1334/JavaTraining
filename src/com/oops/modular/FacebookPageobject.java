package com.oops.modular;

import java.util.Scanner;

public class FacebookPageobject extends Utilities {
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
    
    public void selectGender(){
    	String strGender;
        Scanner scan = new Scanner(System.in);

        System.out.print("Gender :");
        strGender = scan.nextLine();


        if( strGender.equals("f")||strGender.equals("F")||strGender.equals 
           ("female")||strGender.equals("Female")||strGender.equals("FEMALE"))
        {
           System.out.println("female" );
        }

        else if( strGender.equals("m")||strGender.equals("M")||strGender.equals         
            ("male")||strGender.equals("Male")||strGender.equals("MALE"))
        {
           System.out.println(" male");
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
    
    public void doSignUp(String strFirstname, String strSurname, int intMobileNo, String strPassword, int intDate, String strMonth, int intYear){
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
    	this.selectGender();
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    }
    
    public void doSignUp_1(String strPassword){
    	//Step 1. enter FirstName
    	this.getRandomFirstName(10);
    	System.out.println("FirstName :"+getRandomFirstName(10));
    	
    	//step 2. enter surname
    	this.getRandomSurname(10);
    	System.out.println("Surname :"+getRandomSurname(10));
    	
    	//step 3. enter mobile number
    	this.getRandomMobileNo();
    	System.out.println("Mobile number :"+getRandomMobileNo());
    	
    	//step 4.enter new password
    	this.enterNewPassword(strPassword);
    	
    	//step 5.enter date
    	this.getRandomDate(31);
    	System.out.println("Date :"+getRandomDate(31));
    	
    	////step 6. enter month
    	this.getRandomMonth(12);
    	System.out.println("Month :"+getRandomMonth(12));
    	
    	//step 7. enter year
    	this.getRandomYear();
    	System.out.println("Year :"+getRandomYear());
    	
    	//step 8. select gender
    	this.selectGender();
    	
    	//step 9. click on signup button
    	this.clickSignUp();
    	
    	//step 10. verify signup
    	this.verifySignUp();
    	
    	
    	
    
    }
	
	

}
