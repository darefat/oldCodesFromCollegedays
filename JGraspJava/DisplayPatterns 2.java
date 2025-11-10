/*
Excercise 6.6
   Project 5
   CS130 - Introduction to JAVA 
   Fatai D. Sule
*/
import java.util.Scanner;
public class DisplayPatterns {

   public static void main(String[] args) {
          // Create a Scanner input
   		Scanner input = new Scanner(System.in); 
   
   		// Prompt the user to enter the number of rows
   		System.out.print("Enter the number of rows: ");
   		int rows = input.nextInt();
   
   		// call displayPattern Method 
   		displayPattern(rows);
   	}
   
   	// displayPattern Method 
   	public static void displayPattern(int n) {
      
   		// declare, loop and hold number of whitespace
         int padding = n - 1;	
   		for (int r = 1; r <= n; r++) {
         
   			// loop and print padding
   			for (int p = 0; p < padding; p++) {
   				System.out.print("  ");
   			}
   
   			// loop and Print numbers
   			for (int i = r; i > 0; i--) {
   				System.out.print(i + " ");
   			}
            
            // Decrement padding
   			System.out.println();
   			padding--; 
   		}
   	}
   }