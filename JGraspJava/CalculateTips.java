import java.util.Scanner;
public class CalculateTips {
   public static void main(String[] args){
     
   // declare variables
     double gratuityRate = 15.0/100,total,gratuity; 
      
      Scanner input = new Scanner(System.in);
                    
      // Prompt User to enter their subtotal amount.
      System.out.print("Please Enter the subtotal $(dollar) amount: "); 
         double subTotal = input.nextDouble();
         
       //   calculations
       gratuity = gratuityRate * subTotal;
       total = gratuity + subTotal; 
       
      System.out.print("The gratuity $(dollar) amount  is ");
      System.out.printf("$%.2f\n",gratuity);


      System.out.print("The total $(dollar) amount plus gratuity is ");
      System.out.printf("$%.2f",total);

      
      
      
   }
}