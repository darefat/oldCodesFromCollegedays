import java.util.Scanner;
public class CompoundValue {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        // Prompt user to enter monthly saving amount and get input. 
      System.out.print("Pleasse Enter monthly saving amount: ");
      double monlthlySavings = input.nextDouble();
            
            // loop to iterate through to 6 months.
         for (int i = 1; i <= 6; i++) {

            if (i == 1) {
                monlthlySavings *= (1.0 + 0.00417);
              } else {
                monlthlySavings = (100 + monlthlySavings) * (1.0 + 0.00417);
              }
            }
           
          System.out.print("After the sixth month, the account value is: ");
          System.out.printf("$%.2f", monlthlySavings);
                
     }
  }
