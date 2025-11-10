public class VarArgsDemo {
   public static void main(String[] args) {
            // printMax(0,0);
//       printMax(new double[] {1,2,3});
      printMax(1, 2, 2, 1, 4);
      printMax(new double[]{1, 2, 3});
      
      double[] s = {10,5,2,7,3,8,19};

      
      double j = linearSearch(s, 19);
      System.out.print("The index of " + 19 + " in this array is " + j);
      System.out.print("\n");
      printMax(s);
   }
   public static void printMax(double...numbers){
   
       double result = numbers[0];
       
       for(int i =1; i < numbers.length; i++)
         if(numbers[i] > result)
            result = numbers[i];
            
            System.out.println("The max value is " + result);
            
            
            if(numbers.length == 0){
               System.out.print("No argument passed");
                return;
      
      }
        

         } 
         
        public static double linearSearch(double[] list, int key) {
        
               for(int i = 0; i < list.length; i++) {
                   if (key == list[i])
                     return i;
               }
                 return -1;
        }   
   
    }
   
