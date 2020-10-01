/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    if(a >= 0 && b >= 0)
    System.out.println("Both are positive or zero.");
    else
    System.out.println("One or both are negative.");
  }
}
