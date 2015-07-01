package Assignment_2;

import java.util.Scanner;

/*
 * Program that replies either Leap Year of Not a Leap Year when given a year  */ 

public class LeapyearCheck {

	public static void main(String[] args) {
		
		// Read the year from user
		System.out.println("Enter an Year to check");
		Scanner s= new Scanner(System.in);
		int year = s.nextInt();

		// Check the condition for leap year
		//if the year is divisible by 4 but not by 100
		if((year%4==0) && (year%100 != 0))
		{
			System.out.println("Its a LEAP Year");
		}
		// A year that is divisible by both 4 and 100 is a leap year if it is also divisible by 400 is a Leap Year
		else if((year%4==0) && (year%100==0) && (year%400==0))
		{
			System.out.println("Its a Leap Year");
		
		}
			
		else{
			System.out.println("Not a Leap Year");
		}
			
	s.close();
	}
	
	

}
