import java.util.Scanner;
public class AreaOfTriangle {

    public static void main(String[] args) {
       // declare variables
       double x1,y1,x2,y2,x3,y3;
       
        Scanner input = new Scanner(System.in);
       
       // Prompt user to Enter the three points of the Triagle
        System.out.print("Please Enter the first points for a triangle: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        
        System.out.print("Please Enter the second points for a triangle: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        System.out.print("Please Enter the third points for a triangle: ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        // Calculate the sides of the triangle
        double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);

        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.print("The area of the triangle is "); 
        System.out.printf("%.1f", area);
    }
}