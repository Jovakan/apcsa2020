/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L4_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = scan.nextInt();
    
    if(a >= 5 && a <= 76)
    System.out.println("False");
    else
    System.out.println("True");
  }
}
