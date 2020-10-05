/* Unit 3 - Lesson 1 Coding Activity: Question 3 */

import java.util.Scanner;

public class U3_L1_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two integers: ");
    
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    
    if(num1 == num2)
      System.out.println("YES");
  }
}
