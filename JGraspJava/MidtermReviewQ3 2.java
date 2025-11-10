public class MidtermReviewQ3 {
   public static void main(String[] args) {
   
   String synonyms = "Fatai:Sule";
   
   //Get the position of the colon(:)
   int pos = synonyms.indexOf(":");
   
   // print out the first word
   System.out.println(synonyms.substring(0,pos));
   
   // print out the second word 
   System.out.println(synonyms.substring(pos+1,synonyms.length()));
   
   
   
   
      }
   }