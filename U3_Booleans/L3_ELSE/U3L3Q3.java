/* Unit 3 - Lesson 3 Coding Activity: Question 3 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U3_L3_Activity_Three{
  public static void main(String[] args){

    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  int a = (int)(Math.random() * 12) + 1;
  int b = (int)(Math.random() * 12) + 1;
  int c = a * b;
  
  System.out.println("" + a + " * " + b + " = ?");
  
  int d = scan.nextInt();
  
  if(d == c)
  System.out.println("Correct!");
  
  else 
  System.out.println("Wrong");
  }
}
