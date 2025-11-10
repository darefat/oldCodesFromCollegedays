
/*
Excercise 7.5
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


import java.util.*;

public class PrintDisNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] distinctNum = new int[10]; 
		int num; 				
		int count = 0;			
 
		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// Test if num is distinct
			if (distinct(distinctNum, num)) {
				distinctNum[count] = num;
				count++;	
			}
		}

		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNum.length; i++) {
			if (distinctNum[i] > 0)
				System.out.print(" " + distinctNum[i]);
		}
		System.out.println();
	}

	public static boolean distinct(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) 
				return false;
		}
		return true;
	}
}