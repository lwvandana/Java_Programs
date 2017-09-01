package com.wolf.bootcamp.java;

import java.util.Scanner;

public class ComputeSumAndProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number");
				int sum = 0;
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				
				System.out.println("Press 1 if you want the sum of the first "  +n+ " numbers");
				System.out.println("Press 2 if you want the product of the first "  +n+ " numbers");
				
				int choice = scan.nextInt();
				scan.close();
				
				switch(choice) {
				case 1:
					for(int i = 1;i<=n;i++)
					{
						sum = sum + i;
					}
				System.out.println("The Sum Of the first " +n+ " Numbers is: " +sum);
						break;
				case 2:
					int product = 1;
				for (int number = 1;number <=n;number++) {
					product = product * number;
				}
				
				System.out.println("The Product Of the first "+n+" Numbers is: " +product);
				break;
				}
	}
				
				

}
