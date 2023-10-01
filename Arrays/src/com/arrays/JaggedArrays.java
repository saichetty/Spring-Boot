package com.arrays;

import java.util.Arrays;

public class JaggedArrays {
	
	public static void main(String[] args) {
		
		int[][] JaggedArrays= new int [3][];
		
		JaggedArrays[0]= new int [] {1,2,3,4};
		JaggedArrays[1]= new int [] {5,6};
		JaggedArrays[2]= new int [] {6,7,8};
		
		for (int [] row:JaggedArrays) {
			System.out.println(Arrays.toString (row));
			
			
		}
		
	}
	
		
	

}

