/* OMIT THIS WHEN DONE */
/* PLEASE READ: EDHESIVE HAS MADE MISTAKES WITH THEIR AUTOGRADER. THE OUTPUT MATCHES, BUT YOU'LL NEED TO CONTACT YOUR TEACHER TO APPROVE IT. */

/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L2_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    int cont = 1;
    int incorr = 0;
    double currlat = 0;
    double currlong = 0;
    
    double minlong = 180;
    double minlat = 90;
    double maxlong = -180;
    double maxlat = -90;
    
    while(cont == 1) {
    incorr = 0;
    System.out.println("Please enter the longitude:");
    currlong = scan.nextDouble();
      if (currlong < -180 || currlong > 180) {
      System.out.println("Incorrect Latitude or Longitude");
      incorr = 1;
      }  
    System.out.println("Please enter the latitude:");
    currlat = scan.nextDouble();
      if (currlat < -180 || currlat > 180) {
      System.out.println("Incorrect Latitude or Longitude");
      incorr = 1;    
      }
      
    if(incorr == 0) {
      if(currlong < minlong)
      minlong = currlong;
      
      if(currlong > maxlong)
      maxlong = currlong;
      
      if(currlat < minlat)
      minlat = currlat;
      
      if(currlat > maxlat)
      maxlat = currlat; 
      }
      
    System.out.println("Would you like to enter another location (1 for yes, 0 for no)?");
    cont = scan.nextInt();
    
    }
    System.out.println("Fartest North: " + maxlat);
    System.out.println("Farthest South: " + minlat);
    System.out.println("Farthest East: " + maxlong);
    System.out.println("Farthest West: " + minlong);
  }
}
