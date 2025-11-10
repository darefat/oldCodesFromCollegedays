import java.util.Scanner;
public class sumOfDigit {
   public static void main(String[] args){
  //  declare variables 
      int sum,remainder,firstDigit,secondDigit,thirdDigit, fourthDigit;
      
      Scanner input =  new Scanner(System.in);
      
  //     Prompt User to Enter integer between 0 and 1000.
      System.out.print("Please Enter a number between 0 and 1000: ");
        int number = input.nextInt();
      
      // calculations 
      firstDigit = number%10;
      remainder =  number/10; 
      secondDigit = remainder%10;
      remainder /=10;
      thirdDigit = remainder%10;
      remainder/=10;
      fourthDigit=remainder%10;
     
     
     sum = firstDigit + secondDigit + thirdDigit +  fourthDigit;
     
     
     System.out.println("The sum of integer " + number + " equals " + sum);
      
   }
}