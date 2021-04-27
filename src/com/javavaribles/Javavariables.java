package com.javavaribles;

public class Javavariables {
	 //Global Variable
	  int intEmpno =101;
	  String strName = "Amit";
	  int intSal = 5000;
	  
	  public void display(){
		  System.out.println("Employee No :"+intEmpno + " The name is :"+strName);
	  }
	  
	  public void totalsalary(){
		//Local variable  
		 String strVal ="20000"; 
		 int intTotalSal;
		 //TypeCasting
		 int intVal=Integer.parseInt(strVal);
		 
		 intTotalSal =intSal+intVal;
		 System.out.println("Toal Salary :"+intTotalSal);
	  }
	   public void salarywithbonus(){
		   double floatBonus=1500.65;
		   int intTotalSal;
		   intTotalSal= (int) (intSal+floatBonus);
		   
		   System.out.println("Salary with Bonus is:"+intTotalSal);
		     
		   
	   }
	 

	public static void main(String[] args) {
		Javavariables objJavavariables = new Javavariables();
		objJavavariables.display();
		objJavavariables.totalsalary();
		objJavavariables.salarywithbonus();
	}

}
