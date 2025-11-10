package finalReview;

public class FinalReview1 {

   public static void main(String[] args) {
   
      int[] number = {28, 44, 88, 10, 50, 26, 99};
      
           int count = 0;
           
           for(int i = 0; i < number.length; i++) {
           
               if(number[i] % 2 ==0)count++;
           }
            System.out.print(count);   
        
           }  
   

}