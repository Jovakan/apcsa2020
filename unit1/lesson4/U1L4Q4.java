/* Unit 1 - Lesson 4 Coding Activity: Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a price:");
    double price = scan.nextDouble();
    price = 20 - price;
    System.out.println("Change from $20: $" + price);
  }
}
