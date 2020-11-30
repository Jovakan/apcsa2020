import java.util.Scanner;

public class runner_Post{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter name:");
    String n = scan.nextLine();
    System.out.println("Enter post content:");
    String m = scan.nextLine();
    System.out.println("Enter number of favorites:");
    int f = scan.nextInt();
    Post p1 = new Post(n, m, f);
    System.out.println("\n"+p1);
  }
}
