/* Unit 2 - Lesson 3 Coding Activity: Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a string:");
  String exmple = scan.nextLine();
  int last = exmple.length();
  int lastNew = last;
  int lastBound  = last - 1;
  System.out.println(exmple.substring(0,1) + exmple.substring(lastBound,lastNew));
  

  
  
  }
}
