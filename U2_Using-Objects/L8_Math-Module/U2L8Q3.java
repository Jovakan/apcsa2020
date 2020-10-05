/* Unit 2 - Lesson 8 Coding Activity: Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter two integers: ");
  int first = scan.nextInt();
  int second = scan.nextInt();
  
  int finale = Math.abs(first - second);
  
  System.out.println("Difference: " + finale);

  }
}
