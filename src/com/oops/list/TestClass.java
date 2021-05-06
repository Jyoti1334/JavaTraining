package com.oops.list;

import java.util.List;

public class TestClass extends JavaList{

	public static void main(String[] args) {
		TestClass objTestClass=new TestClass();
		
		System.out.println("======Add Elements to list =======");
		objTestClass.toaddElemnet();
		
		System.out.println("=======Display Arraylist============================");
		objTestClass.todispalyList();
		
		System.out.println("=========Remove Element=================");
		objTestClass.toremoveElement();
		
		System.out.println("=============================================================");
		objTestClass.todisplaySize();
		
		System.out.println("===========================================================");
		objTestClass.toaddNewElement();
		
		System.out.println("=============================================================");
		objTestClass.torepalceElement();
		
		System.out.println("================================================================");
		objTestClass.tocheckElement();
		
		System.out.println("===============================================================");
		objTestClass.togetElement();
		
		System.out.println("===========================================================");
		objTestClass.tocheckIndexofElement();
		
		System.out.println("==========Extract elements from list=====================");
		objTestClass.toextractElement();
	}

}
