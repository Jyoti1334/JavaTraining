package com.array;

import java.util.Scanner;

public class WeekDays2 {

	public static void main(String[] args) {
		String strActualdays[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		//String strExpectedDay[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		String strVal;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day:");
        strVal= sc.next();
    
    OUTER:
    for (String strActualday : strActualdays) {
        if (strActualday == null ? strVal == null : strActualday.equals(strVal)) {
            if (null == strVal) {
                System.out.println("invalid");
            } else {
                switch (strVal) {
                    case "Mon":
                        System.out.println("Week Started");
                        break;
                    case "Tue":
                        System.out.println("Work Started");
                        break;
                    case "Wed":
                        System.out.println("Work in progress");
                        break;
                    case "Thu":
                        System.out.println("Work Finished");
                        break OUTER;
                    case "Fri":
                        System.out.println("Weekend");
                        break;
                    case "Sat":
                        System.out.println("Party");
                        break;
                    case "Sun":
                        System.out.println("Holiday");
                        continue;
                    default:
                        System.out.println("invalid");
                        break;
                }
            }
        }
    }
}

	}


