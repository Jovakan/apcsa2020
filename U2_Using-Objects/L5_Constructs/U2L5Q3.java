/* Unit 2 - Lesson 5 Coding Activity: Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Type the number of sides:");
  int sides = scan.nextInt();
  System.out.println("Type a side length:");
  double length = scan.nextDouble();
  RegularPolygon octagon = new RegularPolygon(sides,length);
  System.out.println(octagon);
  }
}
