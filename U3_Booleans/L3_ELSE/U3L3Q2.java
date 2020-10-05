/* Unit 3 - Lesson 3 Coding Activity: Question 2 */

import java.util.Scanner;

public class U3_L3_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    
    if(a == 4)
    System.out.println("A");
    
    else if(a == 3)
    System.out.println("B");
    
    else if(a == 2)
    System.out.println("C");
    
    else if(a == 1)
    System.out.println("D");
    
    else if(a == 0)
    System.out.println("F");
  }
}
