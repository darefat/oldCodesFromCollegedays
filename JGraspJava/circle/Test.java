package circle;

public class Test {

   public static void main(String[] args) {
   
      PrivateCircleFields myCircle = new PrivateCircleFields(1);
      
        int n = 5;
        printAreas(myCircle, n);
        
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
   }
   
    public static void printAreas(PrivateCircleFields c, int times) {
      System.out.println("Radius \t\t Area");
         while (times >= 1) {
          System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
             times--;
                              
      }
//       System.out.println("The area of the circle with radius " + c.getRadius()+ 
//       " is " + c.getArea() + " and number of objects = " + c.getNumberOfObjects());
//    
   
   }
   

}