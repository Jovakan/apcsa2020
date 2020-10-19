/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a word:");
    String word = scan.nextLine();
    String altered = "";
    int index = 0;
    
    if(word.length() % 2 != 0)
    word = word + " ";
    
    while(altered.length() != (word.length() / 2)) {
      altered = altered + word.substring(index, index + 1); 
      index = index + 2;
    }
      
    if(altered.length() == (word.length() / 2))
      System.out.println(altered);
  }
}
