/* Unit 2 - Lesson 3 Coding Activity: Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a sentence:");
  String phrase = scan.nextLine();
  int cutoff = phrase.indexOf(" ");
  String newcutoff = (phrase.substring(0,cutoff));
  int anewcutoff = newcutoff.length();
  System.out.println(anewcutoff);
  
  }
}
