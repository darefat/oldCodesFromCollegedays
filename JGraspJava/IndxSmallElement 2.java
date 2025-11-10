/*
Excercise 7.10
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


import java.util.Scanner;

public class IndxSmallElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
		double[] num = new double[10]; 
      
      // Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextDouble();

		
	System.out.println("The minimum number is " + num[indxSmallElement(num)] 
        + " index " + indxSmallElement (num));
	}

	public static int indxSmallElement(double[] arr) {
		if (arr.length <= 1)
			   return 0;
		
		double min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}