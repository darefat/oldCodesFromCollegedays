import java.util.Scanner;
import java.util.Random;

public class MidtermReviewQ11 {
   public static void main (String[] args) {

      Random rand = new Random();
   
      Scanner scan = new Scanner(System.in);
   
      //random int between 4-9
      int value = rand.nextInt(6) + 4; // 0..5 + 4 is the equivalent of 4...9
   
      System.out.println("Random Number: " + value);
     
      String input = "";
   
      do {
   
      // prompt the user for a word
      System.out.print("Enter a word with " + value + " Character: ");


         // Get the input 
   
      input = scan.next();
      
   
   
       } while(input.length() < value);
     
      // count # of X's 
      int count = 0;
   
       for (int i =0; i <input.length(); i++) {
         if(input.charAt(i)== 'X') count++;
           
   
   }
   
      
      // print Good or Bad dependinf on X
      
    if(count >=2) {
      
         System.out.println("GOOD");
    } else {
         System.out.println("BAD");
       
       }
     }
   

}