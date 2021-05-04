package com.oops.modular;

public class TestClass extends BaseClass {

	public static void main(String[] args) {
		TestClass objTestClass =new TestClass();
		objTestClass.initializeBrowser("Chrome");
		objTestClass.openUrl("https://www.facebook.com/");
		
	FacebookPageobject objFacebookPageobject=new FacebookPageobject();
	objFacebookPageobject.doSignUp_1("Pass@123");	
	objTestClass.closeBrowser();
//		
//	Utilities objUtilities=new Utilities();
//	System.out.println("FirstName :"+objUtilities.getRandomFirstName(10));
//	System.out.println("Surname :"+objUtilities.getRandomSurname(10));
//	System.out.println("Date: "+objUtilities.getRandomDate(31));
//	System.out.println("Month: "+objUtilities.getRandomMonth(12));
//	System.out.println("Year : "+objUtilities.getRandomYear());
//	System.out.println("Moblie Number "+objUtilities.getRandomMobileNo());
//	
	}

}
