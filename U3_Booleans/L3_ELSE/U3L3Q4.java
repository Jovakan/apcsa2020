/* Unit 3 - Lesson 3 Coding Activity: Question 4 */

import java.util.Scanner;

public class U3_L3_Activity_Four{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the temperature?");
    double a = scan.nextDouble();
    
    if (a < 99)
    System.out.println("WARNING");
    
    else if(a > 102)
    System.out.println("WARNING");
    
    else
    System.out.println("Temperature is OK");
  }
}
