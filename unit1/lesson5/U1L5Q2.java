/* Unit 1 - Lesson 5 Coding Activity: Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {
    public static void main(String[] args) {
      
       /* Write your code here */
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter a three digit number:");
      int number = scan.nextInt();
      System.out.println("Here are the digits:");
      int number1 = number % 10;
      System.out.println(number1);
      int number2 = number / 10; 
      number2 %= 10;
      System.out.println(number2);
      int number3 = number / 100;
      System.out.println(number3);
    }
}
