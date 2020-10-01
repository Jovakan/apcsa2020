/* Unit 1 - Lesson 6 Coding Activity: Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two new integers:");
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    
    double number3 = (double) (number1+number2)/2.0;
    System.out.println();
    System.out.println("The average is: " + number3);
  }
}
