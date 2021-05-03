package com.oops.interfaceDemo;

public class TestClass {

	public static void main(String[] args) {
		BaseClass objBaseClass = new OracleDB();
		BaseClass objBaseClass_1=new GoogleDB();
		
		objBaseClass.connect();
		objBaseClass.disconnect();
		
		objBaseClass_1.connect();
		objBaseClass_1.disconnect();
	}
}
