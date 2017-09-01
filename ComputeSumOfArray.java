package com.wolf.bootcamp.java;

public class ComputeSumOfArray {
	int [] integerArray = {1,2,3,4,5};
	int sum = 0;
	
	public void computeSumUsingForLoop() {
		for (int i : integerArray)
			sum += i;
		System.out.println("Sum from For Loop :" + sum);
		sum = 0;
	}
	
	public void computeSumUsingWhileLoop() {
		int i = 0;
		while(i < integerArray.length) {
			sum = sum + integerArray[i];
			i++;
		}
		System.out.println("Sum from While Loop : " + sum);
		sum = 0;
	}
	
	private int recurseTheArray(int []a, int n) {
		if(n == 0) {
			return a[n];
		}else {
			return a[n] + recurseTheArray(a, n - 1);
			}
	}
	
	public void computeSumRecursive() {
		int sum = recurseTheArray(integerArray, integerArray.length - 1);
		System.out.println("Sum using recursion : " + sum);
	}
	
	public static void main(String [] args) {
		ComputeSumOfArray  computeS = new ComputeSumOfArray ();
		computeS.computeSumUsingForLoop();
		computeS.computeSumUsingWhileLoop();
		computeS.computeSumRecursive();
	}
}
