import java.util.*;
public class Sort {
   public static void main(String[] args) {
   
         String[] numbers = {"Juice", "Romeo", "Katya" , "Fatai", "Kirill", "Olu", "Damola", "Dare"};
         //java.util.Arrays.sort(numbers); // Sort the whole array
         //java.util.Arrays.parallelSort(numbers); // Sort
         
         List<String> l1= Arrays.asList(numbers);
        
         
         Collections.sort(l1); 
         
          System.out.printf("%s\n",l1);
         
         
    }

}