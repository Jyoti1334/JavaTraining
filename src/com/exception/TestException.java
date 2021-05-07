package com.exception;

import java.io.IOException;

public class TestException {

	public static void main(String[] args) throws IOException {
		
		BaseTest objBaseTest=new BaseTest();
		objBaseTest.toshowException();
		
		System.out.println("============Exception without handling by using Throws Clause======================");
		objBaseTest.toacceptName();
		objBaseTest.todisplayName();
		
		
	}

}
