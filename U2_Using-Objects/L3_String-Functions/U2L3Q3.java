/* Unit 2 - Lesson 3 Coding Activity: Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter first word:");
  String word1 = scan.nextLine();
  String pstword1 = word1.toLowerCase();
  System.out.println("Enter second word:");
  String word2 = scan.nextLine();
  String pstword2 = word2.toLowerCase();
  System.out.println("Result: " + pstword1.compareTo(pstword2));
  }
}
