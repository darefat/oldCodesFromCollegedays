package project6;

/*
Excercise 9.6 main method
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule
   
*/

public class TestStopWatch {
   public static void main(String[] args) {
   
      StopWatch stopWatch = new StopWatch();
      
      int size = 100000;
      
      double[] list = new double[size];
      
      for(int i = 0; i< list.length; i++){
         list[i] = Math.random() * list.length;
         }
         
         stopWatch.start();
         selectSize(list);
         stopWatch.stop();
         
         System.out.println((stopWatch.getElapsedTime()/1000.0) + " Seconds");
      
   
   
   }

      public static void selectSize(double[] list){
          
          for(int i = 0; i < list.length-1; i++) {
               double currentMin = list[i];
               int currentMinIndex = i;
               
               for(int j= i + 1; j < list.length; j++) {
                if (currentMin > list[j]){
                     currentMin = list[j];
                     currentMinIndex = j;
                  }
                 }
                 
                 //swap list[i]
                 
                 if (currentMinIndex !=i) {
                 list[currentMinIndex] = list[i];
                 list[i] = currentMin;
                }
               }
              }
               
                 
          }
