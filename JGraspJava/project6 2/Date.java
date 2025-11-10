package project6;



/*
  Excercise 9.3
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule

(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.*/

public class Date {

   
   public static void main(String[] args) {
         
        java.util.Date date1 = new java.util.Date(); 
        java.util.Date date2 = new java.util.Date();
        java.util.Date date3 = new java.util.Date();
        java.util.Date date4 = new java.util.Date(); 
        java.util.Date date5 = new java.util.Date();
        java.util.Date date6 = new java.util.Date();
        java.util.Date date7 = new java.util.Date();
        java.util.Date date8 = new java.util.Date();
         
    /* set elapsed time by the increments of 10's given I dont want to use for loop here 
       because of the Long I don't want to develop a bad practice of looping Long in a for loop  
    */  
              
         date1.setTime(10000);
         date2.setTime(100000);
         date3.setTime(1000000);
         date4.setTime(10000000);
         date5.setTime(100000000);
         date6.setTime(1000000000);
         date7.setTime(10000000000L);
         date8.setTime(100000000000L);
         
         // Print Day, month format 
                  
           System.out.println(date1.toString());
           System.out.println(date2.toString());
           System.out.println(date3.toString());
           System.out.println(date4.toString());
           System.out.println(date5.toString());
           System.out.println(date6.toString());
           System.out.println(date7.toString());
           System.out.println(date8.toString());
                    
         
         
          
                    
		}
   
   
   
   }




