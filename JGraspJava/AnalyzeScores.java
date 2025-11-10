/*
Excercise 7.4
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/

import java.util.*;
public class AnalyzeScores {
   public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    
     System.out.print("Enter positive number for score: ");
     
     int[] score;
     score = new int[10];
     
     int num;
     int numScore = 0, average = 0;
     
     for(int i = 0; i< 10; i++) {
         num = input.nextInt();
          if(num < 0)
             break;
             
          score[i] = num;
          average+=num;
          numScore++;
     }
      average /= numScore;
      
       int aboveAvg=0, belowAvg=0;
       
        for(int i = 0; i < numScore; i++) {
               num = (score[i] >= average) ? aboveAvg++ : belowAvg++;    
             }
             
        System.out.println("\nAverage score: " + average);
		System.out.println("Number of scores >= average: " + aboveAvg);
		System.out.println("Number of scores < average: " + belowAvg);
        
        }

     
     }
    
         
         
     