/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two{

  /* Add the method reverser here */
  public static void reverser(String a) {
    String reverse = "";
    for(int i = a.length() - 1; i >= 0; i--) {
    reverse += a.charAt(i);
    }
    System.out.println(reverse);
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
