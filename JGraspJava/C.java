public class C {
    private int radius = 5;
    int y;
      
     public static void main(String[] args) {
       C b = new C();
         b.method1();
        System.out.println(Road.aMethod());
         Road a = new Road();
          a.aZone();
     }
 
    public void method1() {
       method2();
    }
    
   static int getRadius(int b) {
        return b;
    }

   public void method2() {
      //C c = new C();
       System.out.println(getRadius(5) * radius);// remember Static can not call instance method or variable without
       // declaring using the word new, a non-static(aka instance variable on the other hand can call both static 
       // non static method variable.
        
    
    
  }

   
   
   
   
   }
   
   class Road {
        static int aMethod() {
     // C z = new C();
      //System.out.print(C.getRadius(0));
      return C.getRadius(300);
         
   }
   
    void aZone() {
      C o = new C();
      o.method1();
      
    
    }
   
 }