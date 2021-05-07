package com.oops.modular;

import java.util.Hashtable;

public class BaseTest extends Utilities {
	
	
	Hashtable<String,String> objHashTable;
	
	public BaseTest(){
		objHashTable=new Hashtable<String,String>();
	    
	}
	
	public Hashtable<String,String> getObjHashTable() {
  	  objHashTable.put("FirstName",this.getRandomString(2));
  	  objHashTable.put("Surname",this. getRandomString(4));
 	  objHashTable.put("MoblieNo",this. getRandomMobileNumber());
 	  objHashTable.put("EmailId",this.getRandomEmailId());
 	  objHashTable.put("Password", "Admin@123");
  	  objHashTable.put("Date", this.getRandomNumber(1, 31));
 	  objHashTable.put("Month",this. getRandomNumber(1,12));
 	  objHashTable.put("Year", this.getRandomNumber(1990, 2000));
 	  objHashTable.put("Gender", "Male");
 	  
 		return objHashTable;
  	  
  }
	
	//initialze Browser
	public void initializeBrowser(String strBrowser){
		System.out.println("Browser  initialized is  : "+strBrowser);
	}
	//to open url
	public void openUrl(String strUrl){
		System.out.println("Url is : "+strUrl);
	}
	
	//to close the browser
	public void closeBrowser(){
		System.out.println("Browser is closed ");
	}

}
