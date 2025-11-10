public class CP7_17b {
  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 5};
     reverse(list);
     // System.out.print("\n");
//     for(int a : list){
//      System.out.print(a);
   // }
    // for (int i = 0; i < list.length; i++)
//       System.out.print(list[i] + " ");
  }

  public static void reverse(int[] list) {
    int[] newList = new int[list.length];

    for (int i = 0; i < list.length; i++)
      newList[i] = list[list.length - 1 - i];// the i is what reverses it
      
     // list = newList; this is not needed since newList array occupies list length already

    for(int a : newList){
     System.out.print(a);
    }

  }
}