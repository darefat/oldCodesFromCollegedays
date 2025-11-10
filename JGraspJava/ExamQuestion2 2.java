
public class ExamQuestion2 {

   public static void main(String[] args){
     
       String s = "cupcake:400";
      
        
        System.out.print( "A cupcake has " + extractDigit(s) + " calories");
        
   
   }
    public static String extractDigit(String str) {
      return str.replaceAll("[^0-9]","");
    
    }
}