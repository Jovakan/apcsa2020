/* Unit 2 - Lesson 6 Coding Activity: Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter number of sides: ");
  int sides = scan.nextInt();
  
  System.out.println("Enter side length: ");
  double length = scan.nextDouble();
  
  RegularPolygon pent = new RegularPolygon(sides,length);
  
  double perimeter = pent.getPerimeter();
  double area = pent.getArea();

  
  System.out.println("A " + pent + " has perimeter " + perimeter + " and area " + area); 
  
  }
}
