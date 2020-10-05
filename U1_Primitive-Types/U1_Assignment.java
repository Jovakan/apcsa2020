/* Unit 1 - Assignment 1: Movie Ratings */

import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please enter the movie name: ");
    String title = scan.nextLine();
    
    System.out.println("");
    System.out.println("Please enter the running time in minutes.");
    double runtime = scan.nextDouble();
    int hour = (int) runtime / 60;
    int min = (int) runtime % 60;
    
    System.out.println("");
    System.out.println("Please enter ratings from the movie review website.");
    double rating1 = scan.nextDouble();
    double rating2 = scan.nextDouble();
    double rating3 = scan.nextDouble();
    double rating4 = (rating1 + rating2 + rating3) / 3;
    
    System.out.println("");
    System.out.println("Please enter ratings from the focus group.");
    double focusrating1 = scan.nextDouble();
    double focusrating2 = scan.nextDouble();
    double focusrating3 = (focusrating1 + focusrating2)/2;
    
    System.out.println("");
    System.out.println("Please enter the average movie critic rating.");
    double criticrating = scan.nextDouble(); 
    
    System.out.println("");
    System.out.println("Title: " + title);
    
    System.out.println("Running time: " + hour + "h" + min);
    
    System.out.println("Average website rating: " + rating4);
    
    System.out.println("Average focus group rating: " + focusrating3);
    
    System.out.println("Average movie critic rating: " + criticrating);
    
    double finalrating = (((rating4 * 20) + (focusrating3 * 30) + (criticrating * 50))/100) + .5;
    
    System.out.println("Overall movie rating: " + (int) finalrating);
    

  }
}

