
/*
Excercise 8.18
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/

import java.util.*;
public class ShuffleRows {
	
	public static void main(String[] args) {
		
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		// Randomly shuffle the rows in the matrix
		shuffle(m);

		//print shuffled row matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	// shuffle two dimensional row method
	public static void shuffle(int[][] m) {
      Random rand = new Random();
		int[] temp = new int[2];

		for (int i = 0; i < m.length; i++) {
			// Generate random index
			int index = rand.nextInt(m.length);

			// Swap row i with row index
			temp[0] = m[i][0];
			temp[1] = m[i][1];
			m[i][0] = m[index][0];
			m[i][1] = m[index][1];
			m[index][0] = temp[0];
			m[index][1] = temp[1];
		}
	}
}