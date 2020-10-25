/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a String:");
    String str = scan.nextLine();
    System.out.println("Input an integer:");
    int a = scan.nextInt();

for (int i = str.length(); i > 0; i--) 
{
  for (int j = 1; j <= a; j++) 
  {
    System.out.print(str.substring(i - 1, i));
  }
  }
}
}
