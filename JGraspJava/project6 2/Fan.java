package project6;

/*
Excercise 9.8
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/
 class Fan {
   	int SLOW = 1;		// Fan speed slow
	   int MEDIUM = 2;	// Fan speed medium
		int FAST = 3;		// Fan speed fast
      private int speed = SLOW;
      private boolean on;
      private double radius;
      String color;
      
      // fan constructor
      Fan() {
         speed = SLOW;
           on = false;
         radius = 5;
         color = "blue";
         }
         // accessor for speed
         
       public int getSpeed() {
            return speed;
            }
          public boolean isOn() {
            return on;
          }
          
          //assessor for radius
          public double getRadius() {
            return radius;
          
          }
          
          // assessor get color
          public String getColor() {
          
            return color;
          }
          
          // mutatator for speed 
          public void setSpeed(int speed) {
            this.speed = speed;
           }
                      
           public void setOn(boolean on) {
            this.on = on;
           
           }
           
           public void setRadius(double radius) {
               this.radius = radius;
           }
           
          
          public void setColor(String color) {
          
               this.color = color;
            }
            
            //checking for on 
           public String toString() {
           
           
           if(isOn()) {
           
            return "Speed = " + getSpeed() + " " +
                    "Color = " + getColor() + " " +
                    "Radius = " + getRadius();
                } else {
                  return "Color = " + getColor() + " " + "Radius = " +
                   getRadius() + " " + "Fan is Off ";
                 }

      }
		
      
  }

