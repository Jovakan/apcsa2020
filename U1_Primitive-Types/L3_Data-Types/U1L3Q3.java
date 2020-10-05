/* Unit 1 - Lesson 4 Coding Activity: Question 1 */

import java.util.Scanner;

public class U1_L3_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What month were you born in?");
    String month = scan.nextLine();
    System.out.println("What day were you born?");
    int day = scan.nextInt();
    System.out.println("Your birthday is on " + month +  " "  + day + ".");
  }

}
