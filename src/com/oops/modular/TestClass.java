package com.oops.modular;

public class TestClass extends BaseTest {

	public static void main(String[] args) {
		TestClass objTestClass =new TestClass();
		System.out.println("============Browser Initialized with url========================");
		objTestClass.initializeBrowser("Chrome");
		objTestClass.openUrl("https://www.facebook.com/");
		
	FacebookPageobject objFacebookPageobject=new FacebookPageobject();
	
	System.out.println("=======================SignUp with Mobile No===================");
	
	objFacebookPageobject.doSignUp(objFacebookPageobject.getRandomString(2),
			                       objFacebookPageobject.getRandomString(4),
			                       objFacebookPageobject.getRandomMobileNumber(),"Pass@123",
			                       objFacebookPageobject.getRandomNumber(1, 31),
			                       objFacebookPageobject.getRandomNumber(1, 12),
			                       objFacebookPageobject.getRandomNumber(1990, 2000), "male");
	
	System.out.println("=====================SignUp with Email Id============================");
	
   objFacebookPageobject.doSignUpwithEmailId(objFacebookPageobject.getRandomString(4), 
		                            objFacebookPageobject.getRandomString(6),
		                            objFacebookPageobject.getRandomEmailId(), "Admin@12",
		                            objFacebookPageobject.getRandomNumber(1, 31), 
		                            objFacebookPageobject.getRandomNumber(1, 12), 
		                            objFacebookPageobject.getRandomNumber(2000, 2021), 
		                            "female");
   
   
   System.out.println("=================HashTable for Facebook SignUp with Mobile No===============================");
   objFacebookPageobject.doSignUp(objTestClass.getObjHashTable().get("FirstName"),
		                          objTestClass.getObjHashTable().get("Surname"),
		                          objTestClass.getObjHashTable().get("MoblieNo"),
		                          objTestClass.getObjHashTable().get("Password"),
		                          objTestClass.getObjHashTable().get("Date"),
		                          objTestClass.getObjHashTable().get("Month"),
		                          objTestClass.getObjHashTable().get("Year"), 
		                          objTestClass.getObjHashTable().get("Gender"));
  
   System.out.println("============================Browser is closing===========");
		   objTestClass.closeBrowser();
	
	  
	}

}
