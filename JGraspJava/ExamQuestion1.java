public class ExamQuestion1 {
   
   public static void main(String[] args){
      
      int finalGrade = 79;
      
      if (finalGrade >= 90) {
            System.out.println('A'); 
      } else if(finalGrade >=80 && finalGrade < 90) {
            System.out.println('B'); 
         } else if(finalGrade >=70 && finalGrade < 80) {
            System.out.println('C');
         }  else if (finalGrade >=60 && finalGrade < 70){
             System.out.println('D');
         } else {
            System.out.println('F');
         }
         
   
   }

}
