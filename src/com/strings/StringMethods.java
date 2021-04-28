package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		String strS1="Java is a programming language";
		String strS2= new String("I Like CODING");
		char charArr[]={'L','o','c','k','d','o','w','n'};
		String strS3= new String(charArr);
		
		//display all 3 strings
		System.out.println(strS1);
		System.out.println(strS2);
		System.out.println(strS3);
		
		// length of first string
		System.out.println(" Length of S1="+strS1.length());
		
		//Concat two strings
		System.out.println(strS1.concat(strS2));
		
		//substring
		System.out.println("Substring of S1 is : "+strS1.substring(0, 10));
		
		//Uppercase
		System.out.println("Upper case of S3 : "+strS3.toUpperCase());
		
		//Lowercase
		System.out.println("Lowercase of S2 : "+strS2.toLowerCase());
		
		//trim String
		System.out.println("Trimed String S2 is : "+strS2.trim());
		
		//Replace string
		//System.out.println("Replaceing String S1"+strS1.replace(a, x));
		
		
		

	}

}
