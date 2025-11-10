package project6;

/*
Excercise 9.8 Test
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/
 public class FanTest {
         public static void main(String[] args) {
         
         Fan fan1 = new Fan();
         Fan fan2 = new Fan(); 
         
         int SLOW = 1;
         int MEDIUM = 2;
         int FAST = 3;
         
         //Set properties
         fan1.setSpeed(FAST);
         fan1.setRadius(10.0);
         fan1.setColor("Yellow");
         fan1.setOn(true);
         
         fan2.setSpeed(MEDIUM);
         fan2.setRadius(5.0);
         fan2.setColor("blue");
         fan2.setOn(false);
         
         
         System.out.println("FAN 1 : " + fan1.toString());
         
         System.out.println("FAN 2 : " + fan2.toString());


         
       }
 } 