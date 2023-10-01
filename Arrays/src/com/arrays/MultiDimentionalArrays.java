package com.arrays;

public class MultiDimentionalArrays {
	
	
	public static void main(String[] args) {
	
		int row=2;
		int col=3;
		
		int[] [] arrays2D = new int[row] [col];
		
		arrays2D[0][0]=1;
		arrays2D[0][1]=2;
		arrays2D[0][2]=3;
		arrays2D[1][0]=4;
		arrays2D[1][1]=5;
		arrays2D[1][2]=6;
		
		for (int i=0; i<arrays2D.length; i++ ) {
			
			for (int j=0; j<arrays2D[i].length; j++){
				
			
				System.out.print(arrays2D[i][j]+" ");
			}
		
			System.out.println();
		}
			
		
		//enhanced for loop or for each loop
		
		for(int [] arr:arrays2D) {
			for(int num:arr) {
				
				System.out.print(num+" ");
				
			}
			
			
			System.out.println();
		}
		
	
		
		
	}
	

}
