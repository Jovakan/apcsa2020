/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;
import edhesive.testing.Math;

public class U5_L3_Activity_Two{
  
  /* Add the method randomize here */
public static void randomize(RegularPolygon a) {
    a.setNumSides((int) ((Math.random() * (20 - 10 + 1) + 10)));
    a.setSideLength((Math.random() * (11 - 5 + 1) + 5));
  }
  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  
  /* public static void main(String[] args){
  System.out.println((int) ((Math.random() * 21) + 10)); 
  } */
  
}
