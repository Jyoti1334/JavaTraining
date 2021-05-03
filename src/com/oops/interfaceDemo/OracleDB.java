package com.oops.interfaceDemo;

public class OracleDB implements BaseClass{

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle Database..");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Oracle Database.");
		
	}
	

}
