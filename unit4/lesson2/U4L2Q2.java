/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int a = scan.nextInt();
    String b = Integer.toString(a);
    int c = b.length();
    
    while(c > 0) {
    System.out.println(a % 10);
    a = a / 10; 
    c = c - 1;
    }
    
   
  }
}
