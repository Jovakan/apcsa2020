/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U3_L7_Activity_Three{
  public static void main(String[] args){

    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter length:");
    double a = scan.nextDouble();
    
    Rectangle first = new Rectangle(a);
    
    System.out.println("Enter 2 lengths:");
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    
    Rectangle second = new Rectangle(b,c);
    
    boolean comp = first.equals(second);
    
    if(comp == true)
    System.out.println("Congruent Rectangles");
    else
    System.out.println("Different Rectangles");
  }
}
