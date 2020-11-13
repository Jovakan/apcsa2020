/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four{

public static boolean hasRepeat (String word) 
  {
    for (int i = 0; i < word.length() - 1; i++)
    {
        if (word.substring(i, i + 1).equals(word.substring(i + 1, i + 2)))
        {
          return true;
        }
    }
    return false;
  }
  /* Add the method hasRepeat here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
