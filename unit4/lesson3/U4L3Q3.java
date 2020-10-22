/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number betweeen 0 and 100:");
    int a = scan.nextInt();
    int c = 0;
    int i;
    if(0 < a && a < 100) {
      for(i = a; i <= 100; i++) {
      System.out.print(i + " ");
      c++;
    
      if(c == 20) {
      System.out.print("\n");
      c = 0; }
    }
  }
  else
  System.out.println("error");
  }
}
