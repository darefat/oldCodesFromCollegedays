/*
Excercise 6.17
   Project 5
   CS130 - Introduction to JAVA 
   Fatai D. Sule
*/
import java.util.*;
public class DisplayMatrix {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      //Prompt user to enter integer you wan to display 
         System.out.print("Please Enter the value for s: ");
          int s = input.nextInt();
     
           //Display an n-by-n matrix
           printMatrix(s);
   
  }
   
   public static void printMatrix(int n) {
            // initiate random class
            Random rand = new Random();
            
      // generate rows 
     for(int i = 0; i < n ; i++) {
         // generate colums
         for(int j = 0; j < n; j++) {
           // generate between 0-1 with random
            int x = rand.nextInt(2);
            System.out.print(x);
         
         }
         //print new line 
         System.out.println();
     
     } 
   
  }
   
}
   
