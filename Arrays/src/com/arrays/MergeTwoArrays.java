package com.arrays;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		
		int array[ ] = {10, 20, 5, 30, 25};
		
		
	
		System.out.println(array.length);
		
		
		
	int arr[]= {1,2,3,4,5}, 
		arr2[]= {8,9,10,11};
	
	
	
	
//	int firLength = arr.length;
//	int secLength = arr2.length;
//	
//	System.out.println(firLength+", "+ secLength);
//	
//	int[] both  = new int [firLength+secLength];
//	
//	System.arraycopy(arr, 0, both,0, firLength);
//	System.arraycopy(arr2, 0, both, firLength, secLength);
//	
//	
//	System.out.println(Arrays.toString(both));
//	
	
	int[] mergedArray = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();
	
		System.out.println(Arrays.toString(mergedArray));
		
		int [] byjava8 = IntStream.concat(Arrays.stream(array), Arrays.stream(arr2)).toArray();
		
		System.out.println(Arrays.toString(byjava8));
		
	}

}
