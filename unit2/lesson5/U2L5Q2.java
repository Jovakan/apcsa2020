/* Unit 2 - Lesson 5 Coding Activity: Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Type a radius:");
    double radius = scan.nextDouble();
  
  System.out.println("Type a length:");
    double length = scan.nextDouble();
  
  System.out.println("Type a width:");
    double width = scan.nextDouble();
  
  Circle circle = new Circle(radius);
  Rectangle rectangle = new Rectangle(length,width);
  
  System.out.println(circle);
  System.out.println(rectangle);
  }
}
