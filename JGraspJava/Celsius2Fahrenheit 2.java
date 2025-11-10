import java.util.Scanner;
public class Celsius2Fahrenheit {
   public static void main(String[] args){
       
       // declare variables
      double celsius, fahrenheit; 
      
      
      Scanner input = new Scanner(System.in);
      
      // Prompt user to Enter °C they wish to convert to °F.
      System.out.print("Please Enter your Temperature in degrees Celsius: ");
          celsius = input.nextDouble();
         
        //  calculations
          fahrenheit = (9/5.0) * celsius + 32;
         
         System.out.println( celsius + " °C"+ " = " + fahrenheit + " °F");
      
    }
 }