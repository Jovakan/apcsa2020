/* Unit 3 - Lesson 1 Coding Activity: Question 4 */

import java.util.Scanner;

public class U3_L1_Activity_Four{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a Number:");
    int num1 = scan.nextInt();
    num1 = num1 % 2;
    
    if(num1 == 1)
      System.out.println("Odd");
      
    if(num1 == 0)
      System.out.println("Even");
  }
}
