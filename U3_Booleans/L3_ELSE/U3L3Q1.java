/* Unit 3 - Lesson 3 Coding Activity: Question 1 */

import java.util.Scanner;

public class U3_L3_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int a = scan.nextInt();
    
    if (a >= 0)
    System.out.println("Positive");
    
    else 
    System.out.println("Negative");
  }
}
