/*
Excercise 7.7
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


import java.util.*;
public class CountSingleDigit {
	public static void main(String[] args) {
      Random rand = new Random();
		int[] count = new int[10]; 
              
		// Store the counts of 100 random numbers
		for (int i = 1; i <= 100; i++) {
              count[rand.nextInt(10)]++;
			
		}

		
		System.out.println("Count for each number between 0 and 9:");
		   for (int i = 0; i < count.length; i++) 
        			System.out.println(i + "s: " + count[i]);
		}
	}
