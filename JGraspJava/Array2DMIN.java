public class Array2DMIN {

   public static void main(String[] args) {
   
   //int[][] array = new int[2][2];
        

   
   
   }
   public static int arrayMin(int[][] array) {
           int min =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) 
                  if(array[i][j] < min)
                  return min;    
     }
        
   }
   
}
