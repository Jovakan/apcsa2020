/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four{

  /* Add the method realTime here */
public static void realTime(int a) {
  int hours = 0;
  int min = 0;
  int sec = 0;
  
  hours = a / 3600;
  a = a % 3600;
  
  min = a / 60;
  a = a % 60;
  
  sec = a;
  
  System.out.println("Hours: " + hours);
  System.out.println("Minutes: " + min);
  System.out.println("Seconds: " + sec);

}

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
