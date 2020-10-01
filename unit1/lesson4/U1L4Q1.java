/* Unit 1 - Lesson 4 Coding Activity: Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One{
  public static void main(String[] args){
      
      /* Write your code here */
      Scanner scan = new Scanner(System.in);
  
      System.out.println("Enter starting number (must be an integer)");
      int x = scan.nextInt();

      x++;
      System.out.println("number is now " + x);
      x++;
      System.out.println("number is now " + x);
      x++;
      System.out.println("number is now " + x);
      x--;
      System.out.println("number is now " + x);
      x--;
      System.out.println("number is now " + x);
      x--;
      System.out.println("number is now " + x);
  }
}
