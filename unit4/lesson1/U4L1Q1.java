/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter positive numbers (-1 to stop)");
  int n = 0;
  int a = 1;
  while (n != -1) 
{
  n = scan.nextInt();
  a = a + n;
}

System.out.println("Sum is " + a);
  
    
  }

  
}
