/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L4_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter String:");
    String a = scan.nextLine();
    String b = "";
    
  for (int i = 0; i < a.length(); i++) {
    System.out.println(b + " u working m8? " + i);
    if ((!a.substring(i, i + 1).toLowerCase().equals("a")) && (!a.substring(i, i + 1).toLowerCase().equals("e"))  && (!a.substring(i, i + 1).toLowerCase().equals("i")) && (!a.substring(i, i + 1).toLowerCase().equals("o")) && (!a.substring(i, i + 1).toLowerCase().equals("u"))) {
      b += a.substring(i, i + 1);
  }
}
    a = b;
    System.out.println(a);
  }
}
