import java.util.Scanner;
public class CurrentTime {
   public static void main(String[] args){
   
   
   
      Scanner input = new Scanner(System.in);
      
     //  Prompt User to Enter time zone offset from GMT(Don't forget daylight Savings).
       System.out.print("Enter the time zone offset from GMT(e.g. UTC Eastern Standard time is -5): ");
       
       long utcOffset = input.nextLong(); 
       
       // total time in milliSeconds since Jan 1, 19970. 
             long milliSeconds = System.currentTimeMillis();
       
         
        // calculate total seconds from milliseconds 
        long totalSeconds = milliSeconds/1000;  
        
        // calculate current seconds from total seconds
        long currentSeconds = totalSeconds % 60;
        
        // calculate total minutes from total seconds 
        
        long totalMinutes = totalSeconds/60;
        
        // calculate current minutes from total minutes 
        long currentMinutes = totalMinutes % 60;
        
        
        // calculate total hours from total minutes
        
        long totalHours = totalMinutes/60;
        
        // Obtain current hour from total hours and timezone change 
         
         long currentHour = (totalHours + utcOffset) % 24; // change 24 to 12 if you want 12 hour time. 
         
         
         // Print current time 
         
         System.out.println("Current time is: " + currentHour + " : " + currentMinutes + " : " + currentSeconds);
        
        
        
        
   }
}