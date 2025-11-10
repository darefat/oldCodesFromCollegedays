public class PlayingJava {

   public static void main(String[] args) {
   
      int[] list = {1, 2, 3, 5, 4};


         for (int i = 0, j = list.length -1; i < list.length/2; i++, j--) {
            // Swap list[i] with list[j]
                   int temp = list[i];
                   list[i] = list[j];
                   list[j] = temp;         
                   System.out.print(list[j]);
      }
      // int[] a = {1, 2};
//       swapArray(a);// calling the method to swap array int[] a
//       System.out.print(a[0] + " " + a[1]); // print out swaped array called if you don't call it nothing will happen.  
//       //System.out.print(swapArray(a));
      /*
       int x = 0; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values
         m(x, y); // Invoke m with arguments x and y
          System.out.println("x is " + x);
         System.out.println("y[0] is " + y[0]);
         */
         
}
  public static void swapArray(int[] array) {
      int temp = array[0];
      array[0] = array[1];
      array[1] = temp;
  
  
  }
   public static void m(int number, int[] numbers) {
   number = 1001; // Assign a new value to number
      numbers[0] = 5555; // Assign a new value to numbers[0]
   
   // 
//      String[] tokens = "A,B;C".split("[,;]");
//     for (int i = 0; i < tokens.length; i++)
//       System.out.print(tokens[i]+ ",");
//       //System.out.println("A,B;C".replaceAll("[,;]", "#"));
   
   
   
   }


         // char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1','2'};
//              "0isfun1".getChars(1, 6, dst, 4);      
//               System.out.print(dst);
              
  // String str = new String(new char[3] );//{'J', 'A', 'V', 'A', '1', '3', '0', '1'});
//    //String str = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
//       System.out.print(str);
     // String s1 = "Welcome";
//      String s2 = "welcome";
//      
      //String s2 = new String("Hello");
     
       //  System.out.print(s1.replace('e', 'E'));
//         System.out.print(s2);
//            
           
    
   //  double san = 5.44;
//     
//     String.valueOf(5.44);
//     System.out.println();  
      
   

  // public static void main(String[] args) {
//    
//       char[] dst = {'J','A','V','A','1','3','0','1'};
//       "CS3720".getChars(2, 6, dst, 4);
//       
//        String str = new String(new char[]{'J','A','V','A'});
//    
//        for(int i = 0; i < dst.length; i++) {
//          System.out.print(i);
//        }
// 
//   }

 }