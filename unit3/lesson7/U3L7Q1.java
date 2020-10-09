/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter password: ");
    String password = scan.nextLine();
    String correct = "swordfish";
    
    if(password.equals(correct))
    System.out.println("Access granted!");
    else
    System.out.println("Access denied!");
  }
}
