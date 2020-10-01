/* Unit 1 - Lesson 5 Coding Activity: Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One {
    public static void main(String[] args) {
      
       /* Write your code here */
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter a two digit number:");
      int number = scan.nextInt();
      
      System.out.println("Here are the digits: ");
      int number1 = number / 10;
      System.out.println(number1);
      int number2 = number;
      number2 %= 10;
      System.out.println(number2);
    }
}
