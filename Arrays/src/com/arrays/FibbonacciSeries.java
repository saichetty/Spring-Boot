package com.arrays;

public class FibbonacciSeries {
	
	
	public static void main(String[] args) {
		
		int[] num =new int[10];
		int n1=0;
		int n2=1;
		int n3;
	
		
		//System.out.println(n1+" "+n2);
		
		for (int i=2; i<num.length; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	
		
	}
}
	