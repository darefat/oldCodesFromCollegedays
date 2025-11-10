import java.util.Scanner;
public class MonthArray {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "september", "October", "November", "December"};
       System.out.print("Enter a month number from (1 to 12): ");
       int monthNumber = input.nextInt();
       
       System.out.println("The month is  " + months[monthNumber - 1]);
       //System.out.println(months[(int)(Math.random() * months.length)]); randomly generates months with math random
   
   }
   
   

}