package com.arrays;

public class ArraysDemo {
	

		public static void main(String[] args) {
			
			// creating an array with size 5
			// static array creation
			
			int[] numbers = new int[6];
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
			numbers[4] = 50;
			numbers[5] = 60;
			
//			System.out.println(numbers[3]);
//			System.out.println(numbers[4]);
//			System.out.println(numbers[0]);
//			System.out.println(numbers[1]);
//			System.out.println(numbers[2]);
			
			System.out.println(numbers.length);

			for (int i = 0; i < 5; i++) {
				System.out.print(numbers[i] + " ");

			}
//			System.out.println("-----------------");

			for (int number : numbers) {
				System.out.println(number);
			}
			}
		}

//			String[] colors = new String[7];
//			colors[0] = "White";
//			colors[1] = "Black";
//			colors[2] = "Blue";
//			colors[3] = "Red";
//			colors[4] = "Orange";
//			colors[5] = "Yellow";
//			colors[6] = "Purpple";

//			for (int i = 0; i < colors.length; i++) {
//				System.out.println(colors[i]); }}}
			
