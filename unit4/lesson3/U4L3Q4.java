/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U4_L3_Activity_Four{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int a = scan.nextInt();
    
    if(a > 0) {
      for(int i = a; i >= 0; i--){
        if(i % 5 == 0)
          System.out.print(i + " ");
  }
}
    else
    System.out.println("error");
    }
}
