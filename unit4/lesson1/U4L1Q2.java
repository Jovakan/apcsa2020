/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Scores:");
    double input = 1;
    double total = 1;
    int counter = -1;
    
    while(input != -1) {
      input = scan.nextInt();
      total = input + total;
      counter++;
    }
    double finale = total / counter;
    System.out.println("\nThe average is: " + finale);
  }
}
