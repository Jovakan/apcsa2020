/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Input String:");
    String a = scan.nextLine();
    int count = 0;

for (int i = 0; i < a.length() - 1; i++) 
{
  if (a.substring(i, i + 2).toLowerCase().equals("sh"))
  {
    count++;
  }
}
    System.out.println("Contains \"sh\" " + count + " times.");
    
  }
}
