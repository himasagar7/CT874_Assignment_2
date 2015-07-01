package Assignment_2;

import java.util.Scanner;
/*
 * Application of a Coffee Company,that accepts the number of bags ordered and displays the number  of bags ordered, the discount given
    and  the total cost of the order  */

public class Coffee_company {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number,total_discount=0;
		double total_amount,b,discount_amount,total_cost; 

		// Declare arrays to store the OrderVolume and discount
		int[] order_volume = {25,50,100,150,200,300}, discount = {5,10,15,20,25,30};
		
		System.out.printf("This program computes the amount of discount\ngiven to the customers of IT125 Coffee Company.\n");
		System.out.printf("Discounts are listed below\n");
		System.out.printf("      Order Volume           Discount\n");
		System.out.printf("   ----------------------------------\n");

		for (int i=0;i<6;i++)
			System.out.printf("%s%4d%10s%2d%s\n","   >=  ",order_volume[i], "bags                ",discount[i],"%");

		System.out.printf(" Enter number of coffee bags purchased:");
		
		// Read the input from user
		 number= s.nextInt();
		 total_amount = number*5.5;
		System.out.printf("%30s%d%s%.2f\n"," Number of  bags ordered : ",number," - € ",total_amount);
		
				
		// Decide the discount after reading the number of bags
		if (number>=25 && number < 50)
			total_discount = 5;
		else if (number>= 50 && number < 100)
			total_discount = 10;
		else if (number>= 100 && number < 150)
			total_discount = 15;
		else if (number>= 150 && number < 200)
			total_discount = 20;
		else if (number>= 200 && number < 300)
			total_discount = 25;
		else if (number>= 300 )
			total_discount = 30;
		else
			System.out.printf("Please enter the value greater than 25bags to avail discount");
		
		// Calculate the discount amount
		 b= total_discount*0.01;
		 discount_amount = total_amount * b;
		System.out.printf("%30s%d%s%.2f\n","Discount : " ,total_discount,"% - € ", discount_amount);
		
		// calculate and display the final amount to be paid
		 total_cost = total_amount-discount_amount;
		System.out.printf("%32s%3.2f","Your total cost is : € ",total_cost);
		s.close();
	}


}
