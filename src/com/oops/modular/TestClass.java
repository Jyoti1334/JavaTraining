package com.oops.modular;

public class TestClass extends BaseTest {

	public static void main(String[] args) {
		TestClass objTestClass =new TestClass();
		objTestClass.initializeBrowser("Chrome");
		objTestClass.openUrl("https://www.facebook.com/");
		
	FacebookPageobject objFacebookPageobject=new FacebookPageobject();
	
	objFacebookPageobject.doSignUp(objFacebookPageobject.getRandomString(2),
			                       objFacebookPageobject.getRandomString(4),
			                       objFacebookPageobject.getRandomMobileNumber(),"Pass@123",
			                       objFacebookPageobject.getRandomNumber(1, 31),
			                       objFacebookPageobject.getRandomNumber(1, 12),
			                       objFacebookPageobject.getRandomNumber(1990, 2000), "male");
	
	System.out.println("=====================================================");
	
   objFacebookPageobject.doSignUp_1(objFacebookPageobject.getRandomString(4), 
		                            objFacebookPageobject.getRandomString(6),
		                            objFacebookPageobject.getEmailID()+"@gmail.com", "Admin@12",
		                            objFacebookPageobject.getRandomNumber(1, 31), 
		                            objFacebookPageobject.getRandomNumber(1, 12), 
		                            objFacebookPageobject.getRandomNumber(2000, 2021), 
		                            "female");;
	objTestClass.closeBrowser();

	}

}
