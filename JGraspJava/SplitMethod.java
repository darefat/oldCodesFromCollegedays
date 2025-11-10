
/*
Excercise 10.25
   Project 7
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/



import java.util.Arrays;
   public class SplitMethod {
      public static void main(String[] args) {
         String s = "ab#12#453";
            System.out.println(Arrays.toString(split(s, "#")));    
}


      public static String[] split(String s, String regex) {
      // define a string array
       String str[];
        // replace  the values in the String using regex 
         s = (s.replaceAll(regex, " $0 "));
         
         /* if String s was "ab#12#453" now it becomes
             s = "ab # 12 # 452" with spaces*/

            // split the string at spaces by using trim and split and return it
       
             str = s.trim().split(" ");
            
             return str;
         }

    }
    
    
    
    
