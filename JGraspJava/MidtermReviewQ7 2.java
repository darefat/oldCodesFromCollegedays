import java.util.Scanner;
public class MidtermReviewQ7 {
   public static void main(String[] args) {
      final int SENTINEL = -1;
     Scanner scan = new Scanner(System.in);
      int num = 0;
      
      do {
         System.out.print("Enter a number: ");
            num = scan.nextInt();
            
            if(Math.sqrt(num) >= 10) 
               System.out.println(num);
         
         
      
         } while(num != SENTINEL);
   
   
      }
   }
