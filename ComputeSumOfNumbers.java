package com.wolf.bootcamp.java;

import java.util.Scanner;

public class ComputeSumOfNumbers {
	  public static void main(String[] args){
			// TODO Auto-generated method stub
	    	  
	    	  System.out.println("Enter a Number to get the sum of Numbers");
			
			int sum = 0;
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			scan.close();
			for(int i =1; i <= n; i++)
			{
				sum = sum + i;
				
			}
				
	      System.out.println("The sum of the first " +n+  " Numbers is: " + sum);
		}
}
