package com.oops.interfaceDemo;

public class GoogleDB implements BaseClass {

	@Override
	public void connect() {
		System.out.println("Connecting to Google Database..");
		
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Google Database.");
		
	}

}
