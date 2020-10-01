/* Unit 2 - Lesson 8 Coding Activity: Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter distance east: ");
  double east = scan.nextDouble();
  System.out.println("Enter distance north: ");
  double north = scan.nextDouble();
  
  double distance = Math.pow(east, 2.0) + Math.pow(north, 2.0);
  double finale = Math.pow(distance, 0.5);
  
  System.out.println("Distance between points: " + finale);
  
  }
}
