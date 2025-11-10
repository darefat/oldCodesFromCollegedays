import java.util.Scanner;
public class RPS {
   public static void main(String[] args)  {
      Scanner input = new Scanner(System.in);
      
      int computer = (int) Math.random() * 3;
      
     // Prompt user to enter Rock(0), Paper(1), Scissor(2) 
      System.out.print("Enter 0 for Rock, 1 for paper, and 2 for Scissors: ");
      int Desmond = input.nextInt(); 
      
      System.out.println("Computer picked " + computer);
      System.out.println("??? picked " + Desmond);
      
      if(computer == Desmond) 
         System.out.print("Game is Tied, Play Again");
       else if(Desmond == 1 && computer == 0) 
         System.out.print(" Paper sits on Rock, ??? wins!");
       else if(Desmond == 2 && computer == 0 )
         System.out.print("Rock crushes scissors, CPU wins!");
       else if(Desmond == 0 && computer == 1 )
         System.out.print("Rock sits on paper, ??? wins!");
       else if(Desmond == 1 && computer == 2 )
         System.out.print("Scissors cuts paper, ??? wins!");
       else if(Desmond == 2 && computer == 0 )
         System.out.print("Rock beats Scissors, ??? wins!");

else if(Desmond == 2 && computer == 1 )
         System.out.print("Scissors cuts paper, ??? wins!");

else if(Desmond == 0 && computer == 2 )
         System.out.print("Rock beats Scissors, ??? wins!");
    else 
      System.out.print("Invalid user input enter value between 0 and 2");
// 
// else if(person ==  && computer == 1 )
//          System.out.print("Scissors cuts paper, Person wins!");
// 
// else if(person == 2 && computer == 1 )
//          System.out.print("Scissors cuts paper, Person wins!");
// 
// else if(person == 2 && computer == 1 )
//          System.out.print("Scissors cuts paper, Person wins!");



       
         

  }
}