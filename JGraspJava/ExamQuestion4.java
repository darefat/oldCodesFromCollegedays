public class ExamQuestion4 {
   
   public static void main(String[] args){
   
      String s = "OnomaZynoXylatXZ";
   
      for(int i = 0; i < s.length(); i ++) {
         if(s.charAt(i) == 'X' || s.charAt(i) == ('Z')) {
           System.out.print(s.charAt(i));
         }
      }
 }
}