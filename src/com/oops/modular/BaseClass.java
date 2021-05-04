package com.oops.modular;

public class BaseClass {
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
