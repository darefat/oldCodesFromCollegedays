import java.util.Scanner;
public class WindChillTemp {
   public static void main(String[] args){
   
       Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Temperature in Fahrenheit between -58°F and 41°F: ");
        double outsideTemp = input.nextDouble();

        System.out.print("Please Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * outsideTemp - 35.75 *
                           Math.pow(speed, 0.16) + 0.4275 * outsideTemp * 
                           Math.pow(speed, 0.16);

        System.out.print("The wind chill index is ");
        System.out.printf("%.5f", windChill);
   
   
   }
}