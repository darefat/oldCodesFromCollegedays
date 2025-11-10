import java.util.Scanner;
public class GCDMETHOD {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2;
   // Prompt user 
   System.out.print("Enter the larger integer: ");
    num1 = input.nextInt();
   System.out.print("Enter the Smaller integer: ");
    num2 = input.nextInt(); 
    
      System.out.println (gcd(num1,num2));
//   // int a = 98, b = 56;
//    System.out.println (gcd(98,56));

   }
   static int gcd(int a, int b) { 
   int gcd = 1;
 
    for (int i=2; i <= a && i <=b; i++) {
      if(a % i == 0 && b % i == 0) {
         gcd = i;
         i++;
      }
   
    }
     return gcd;



 
   }
 }
