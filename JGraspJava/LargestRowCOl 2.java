/*
Excercise 8.10
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


import java.util.*;
public class LargestRowCOl{
	public static void main(String[] args) {
      Random rand = new Random();
		// Create a 4-by-4 matrix
		int[][] matrix = new int[4][4];
 
 		// randomly fills matrix with 0s and 1s
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(2);
			}
		}

		// Displays the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		
		// Find and display the first row and column with the most 1s
		System.out.println("The largest row index: " + largestRow(matrix));
		System.out.println("The largest column index: " + largestCol(matrix));

	}

//  largest row with most 1's static method
	public static int largestRow(int[][] row) {
		int maxRowIndex = 0;
		int max = 0;
		for (int i = 0; i < row.length; i++) {
			int count = 0;
			for (int j = 0; j < row[i].length; j++) {
				if (row[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxRowIndex = i;
			}
		}
		return maxRowIndex;
	}

    // largest column with the most 1's static method
	public static int largestCol(int[][] column) {
		int maxColIndex = 0;
		int max = 0;
		for (int col = 0; col < column[0].length; col++) {
			int count = 0;
			for (int row = 0; row < column.length; row++) {
				if (column[row][col] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxColIndex = col;
			}
		}
		return maxColIndex;
	}
 }