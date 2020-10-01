/* Unit 3 - Lesson 2 Coding Activity: Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    double d = scan.nextDouble();
    double e = (a + b + c + d) / 4;
    
    if(e >= 89.5)
    System.out.println("ABOVE AVERAGE");
  }
}
