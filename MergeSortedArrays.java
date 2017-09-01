package com.wolf.bootcamp.java;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {11, 12, 21, 24};
		int[] arr2 = {10,13,20,25};
		int[] arr3 = merge(arr1, arr2);
		System.out.println();
		System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
		
		
	}

	public static int[]merge(int[]arr1, int[]arr2){
		int[]mergedArray = new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		while(i < arr1.length && j<arr2.length) {
			if(arr1[i] <arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			}else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
		
			}
		}
	

