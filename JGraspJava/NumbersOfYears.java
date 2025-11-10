import java.util.Scanner;
public class NumbersOfYears {
   public static void main(String[] args){
      //declare variables 
      int hour = 60, day = 24, year = 365;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Please Enter the Numbers of Minutes: ");
      int minutes = input.nextInt();
      
       //calculations
       int yearsInMinutes = minutes / (hour * day * year);
       
       int daysInMinutes = minutes /(hour * day) % year;
      
      System.out.println(minutes + " minutes is approximately "+ yearsInMinutes + " years and " + daysInMinutes + " days" );
      
      
      
   
   }
}