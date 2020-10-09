/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 strings:");
    String a = scan.nextLine();
    String b = scan.nextLine();
    
    int aLength = a.length();
    int bLength = b.length();
    
    String aMeasurement = a.substring(0,aLength - 1);
    String bMeasurement = b.substring(0,bLength - 1);
    
    if(a.equals(b))
    System.out.println("Great!");
    
    else if((aLength == bLength) && (aMeasurement.equals(bMeasurement)))
    System.out.println("Close enough");
    
    else
    System.out.println("Try again");

    
  }
}
