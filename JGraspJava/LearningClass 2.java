
public class LearningClass {
    public int count = 0; // class fields
    
   public static void main(String[] args) { // static main method 
       // anything static can be accessed in the class or by another
       // static object
       // the non static variables on the other hand, needs to 
       // be called using a constuctor. 
         //1. You cannot invoke an instance method 
       // or reference an instance variable from a static method. 
        //2. You can invoke a static method or reference a
        // static variable from an instance method. 
       LearningClass a = new LearningClass(); // create new constructor object
       
              //System.out.println( a.getCount());
            
             System.out.println(" the factorial " + LearningClass.factorize(1) + "is for "  +  a.getCount());// using a.getCount      
             System.out.println(" the factorial " + LearningClass.factorize(2) + " is for " +  a.getCount());// which counts how many times the LearningClass class is called  
             System.out.println(" the factorial " + LearningClass.factorize(3) + " is for " +  a.getCount());// in this case I used the Timtest object to show the 
             System.out.println(" the factorial " + LearningClass.factorize(4) + " is for " +  a.getCount());// iteration of times the Time class was called. 
             System.out.println(" the factorial " + LearningClass.factorize(5) + " is for " +  a.getCount());
             System.out.println(" the factorial " + LearningClass.factorize(6) + " is for " +  a.getCount());

              
           
          }
       
  public int getCount() {  // non-static method known as instance method
        count++; 
        
      return count;
    }
    
    public static int factorize(int n) { // static method
          int result = 1;
            for (int i = 1; i <= n; i++)
               result *= i; 
                  return result;
    
    
    }


}