/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    System.out.println("");
    
    if(a % 2 != 0)
    a++;
    
    while(a <= b) {
    System.out.print(a + " ");
    a += 2; }
    
  }
}
