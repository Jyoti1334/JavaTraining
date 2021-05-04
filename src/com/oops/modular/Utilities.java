package com.oops.modular;

import java.util.Random;

public class Utilities {
	String strAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String getRandomFirstName(int count){
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*strAlphabets.length());
		builder.append(strAlphabets.charAt(character));
		}
		return builder.toString();
		}
	
	
	public String  getRandomSurname(int count){
		
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*strAlphabets.length());
		builder.append(strAlphabets.charAt(character));
		}
		return builder.toString();
		}
	
	public int getRandomDate(int intRange){
		int intRandomDate=(int)(Math.random()*31);
		return intRandomDate;
		
	}
	public int getRandomMonth(int intRange){
		int intRandomMonth=(int)(Math.random()*12);
		return intRandomMonth;
		
	}
	public int getRandomYear(){
	int intMax=2021;
	int intMin=1900;
	int intRandomYear=(int)(Math.random()*(intMax-intMin))+intMin;
	return intRandomYear;		
	}
	public long getRandomMobileNo(){
		long longMobileNumber=(long)(Math.random()*Math.pow(10, 10));
		return longMobileNumber;
	}
	
	
	
		
	}
	
	
