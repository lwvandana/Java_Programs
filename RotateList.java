package com.wolf.bootcamp.java;
import java.util.*;
public class RotateList {

	List<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateList rotateList = new RotateList();
		rotateList.populateList();
		System.out.println("Original Array: " + Arrays.toString(rotateList.numbers.toArray()));
		Collections.rotate(rotateList.numbers, -2);
		System.out.println("After Rotating: " + Arrays.toString(rotateList.numbers.toArray()));
	}
	
	private void populateList() {
		for(int i = 1; i <= 6; i++) {
			numbers.add(i);
		}
	}

}
