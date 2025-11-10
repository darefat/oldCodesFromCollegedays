public class SelectionSort {

  public static void main(String[] args) {
      
      double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
      double[] sort =  {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
       java.util.Arrays.sort(list);
         
         // selectionSort(list);
//          selectionSort(sort);
// 
//          
//          for(double a : list)
//             System.out.print(a + ",");
//             System.out.println("\n");
//    
//          for(double b: sort)
//             System.out.print(b + ",");
//             
//           System.out.println("\n");
//           reverse(sort);
//           
//           System.out.println("\n");
//           reverse(list);
   
   }

    public static void selectionSort(double[]  list) {
            
         for(int i = 0; i < list.length -1; i++){
           //this finds the min in list[i and list.length -1]
               double currentMin = list[i];
               int currentMinIndex = i;
            
            for(int j = i+1; j < list.length; j++){
               if(currentMin > list[j]) {
                 currentMin = list[j];
                 currentMinIndex = j;
            } 
                        
         }
             if(currentMinIndex != i){
                list[currentMinIndex] = list[i]; 
                 list[i] = currentMin;
           } 
        }  
          
    } 
    
    public static void reverse(double[] list) {
      double[] newList = new double[list.length];

      for (int i = 0; i < list.length; i++)
      newList[i] = list[list.length - 1 - i];// the i is what reverses it
      
     // list = newList; this is not needed since newList array occupies list length already

      for(double a : newList){
      System.out.print(a + ",");
      }

    }
    
  }
