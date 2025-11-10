public class iterationMethod {

   public static void main(String[] args) {
   
      System.out.println (sum(0,4)); 
   
   }
   
   static int sum(int a, int b) {
   
      int sum = 0; 
    for(int i = a; i <=b; i++) {
      sum+=i;
      }
      return sum; 
   }
}