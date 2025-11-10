public class whileLoop{
   public static void main(String[] args){
    int temp = 123;
      int sum = 0;
      while(temp!=0){
      int remainder = (int) (temp % 10);
      sum+= remainder;
      temp = temp/10;
       
      }
      System.out.println(sum);
   }
}