import java.util.Scanner;

public class Assignment3 {

  public static void main (String args[]) {
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Welcome. What is your name?");
  String name = scan.nextLine();
  System.out.println("Hello " + name + ". Are you ready to crack the code?");
  String wouldYou = scan.nextLine();
  wouldYou = wouldYou.toUpperCase();
  String answer = "YES";
  
  if(wouldYou.equals(answer)) {
  System.out.println("\nPHASE 1\nEnter a number:");
  int firstDigit = scan.nextInt();
  
    if(firstDigit == 3) {
    System.out.println("Correct!\n");
    System.out.println("PHASE 2\nEnter a number:");
    int secondDigit = scan.nextInt();
      
      if((secondDigit == 1) || (secondDigit >= 33) && ((secondDigit <= 100))) {
      System.out.println("Correct!\n");
      System.out.println("PHASE 3\nEnter a number:");
      int thirdDigit = scan.nextInt();
      
        if((thirdDigit > 0) && ((thirdDigit % 3 == 0) || (thirdDigit % 7 == 0))) {
          System.out.println("Correct!");
          System.out.println("You have cracked the code!");
          }
          else
          System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
        }
          else
          System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      }
            else
            System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
    }
    
  }
  
  }
