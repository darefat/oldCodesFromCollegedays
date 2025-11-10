public class RandomShuffle {
   public static void main(String[] args) {
      
     String[] solutionArray = { "D", "E", "S", "M","O", "N", "D", "&", "F","A", "T","A","I" };
     
     RandomShuffle.shuffle(solutionArray);

      for(int i = 0; i < solutionArray.length; i++) {
         System.out.print(solutionArray[i] + " ");
      
      }
   }
   
   public static void shuffle(Object[] ar) {
   
      int numerosElemento = ar.length; 
      
      for(int i = 0; i < numerosElemento; i++) {
      
         int s = i +(int)(Math.random() *(numerosElemento -i)); 
         
         Object temp = ar[s];
         ar[s] = ar[i];
         ar[i]= temp;
      
         }
   
     }
}