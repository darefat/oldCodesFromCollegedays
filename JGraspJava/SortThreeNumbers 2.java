/*
Excercise 6.5
   Project 5
   CS130 - Introduction to JAVA 
   Fatai D. Sule
*/


import java.util.Scanner;
public class SortThreeNumbers {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

      //Prompt user to enter the values of the 
      
          
       System.out.println("Enter three values you want to sort in increasing order: ");
         double x = input.nextDouble();
         double y = input.nextDouble();
         double z = input.nextDouble();
         
   
   
           displaySortedNumbers(x,y,z);
   }
   
   public static void displaySortedNumbers(double num1, double num2, double num3) {
   
   
      double temp;
      
      if(num1 < num2) {
         temp = num2;
         num2 = num1;
         num1= temp;
      
      }
      if(num2 < num3) {
         temp = num3;
         num3 = num2;
         num2 = temp;
        }
        
      if(num3 < num1){
         temp = num1;
         num1 = num3;
         num3 = temp;
         
        }
         
         System.out.println(num1 + " " + num2 + " " + num3);
         
         
         
         
   
   
   }

}