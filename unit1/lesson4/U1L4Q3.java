/* Unit 1 - Lesson 4 Coding Activity: Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a radius:");
    double radius = scan.nextDouble();
    double oldradius = radius; 
    radius = radius * 2 * 3.14;
    System.out.println("Circumference: " + radius);
    radius = radius / 2 * oldradius;
    System.out.println("Area: " + radius);
  }
}
