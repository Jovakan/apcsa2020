/* Unit 1 - Lesson 6 Coding Activity: Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number: ");
    double number = scan.nextDouble();
    number = (int) (number + 0.5);
    System.out.println("Answer: " + (int)number);
  }
}
