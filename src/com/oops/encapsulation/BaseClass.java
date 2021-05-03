package com.oops.encapsulation;

public class BaseClass {
	private int intEmpID;
    private String strEmpName;
    private int intEmpAge;

    //Getter and Setter methods
    public int getEmpID(){
        return intEmpID;
    }

    public String getEmpName(){
        return strEmpName;
    }

    public int getEmpAge(){
        return intEmpAge;
    }

    public void setEmpAge(int intVal){
    	intEmpAge = intVal;
    }

    public void setEmpName(String strName){
    	strEmpName = strName;
    }

    public void setEmpID(int intID){
    	intEmpID = intID;
    }

}
