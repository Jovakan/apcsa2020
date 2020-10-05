/* Unit 3 - Lesson 4 Coding Activity: Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the first octet:");
    int a = scan.nextInt();
    System.out.println("Please enter the second octet:");
    int b = scan.nextInt();
    System.out.println("Please enter the third octet:");
    int c = scan.nextInt();
    System.out.println("Please enter the fourth octet:");
    int d = scan.nextInt();
    boolean e = true;
    
    if(!(a >= 0 && a <= 255)) {
      System.out.println("Octet 1 is incorrect");
      e = false;
    }
    if(!(b >= 0 && b <= 255)) {
      System.out.println("Octet 2 is incorrect");
      e = false;
    }
    if(!(c >= 0 && c <= 255)) {
      System.out.println("Octet 3 is incorrect");
      e = false;
    }
    if(!(d >= 0 && d <= 255)) {
      System.out.println("Octet 4 is incorrect");
      e = false;
    }

    if(e != false) {
      System.out.println("IP Address: " + a + "." + b + "." + c + "." + d);
    }
  }
}