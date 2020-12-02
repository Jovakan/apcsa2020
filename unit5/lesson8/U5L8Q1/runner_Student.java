import java.util.Scanner;
public class runner_Student{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean go = true;
    while(go){
      System.out.println("Input student first name or \"default\" for default values, \"q\" to quit:");
      String fn = scan.nextLine();
      if(fn.equals("default")){
        Student s = new Student();
        System.out.println("\n" + s + "\n");
      }
      else if(fn.equals("q")){
        go = false;
      }
      else{
        System.out.println("Input student last name:");
        String ln = scan.nextLine();
        System.out.println("Input year:");
        int y = scan.nextInt();
        System.out.println("Input GPA:");
        double g = scan.nextDouble();
        Student s = new Student(fn, ln, y, g);
        System.out.println("\n" + s + "\n");
        scan.nextLine();
      }
    }
  }
}
