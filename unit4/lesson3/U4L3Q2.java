/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L3_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    for(int i = 1; i <= 50; i += 2)
    if(i % 2 == 0)
    System.out.println(i);
    else {
    i++;
    System.out.println(i); }
  }
}
