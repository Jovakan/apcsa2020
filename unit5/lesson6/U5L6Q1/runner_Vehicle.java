import java.util.Scanner;

public class runner_Vehicle
{
  public static void main (String str[]){
    Scanner scan = new Scanner(System.in);
    Vehicle v = new Vehicle ();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println(v);
      System.out.println("Location: " + v.getLocation());
      System.out.println("Type \"f\" to move forwards, \"b\" to move backwards, \"n\" for new vehicle, \"q\" to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("f")){
        v.forward();
      }
      else if(instruction.equals("b")){
        v.backward();
      }
      else if(instruction.equals("n")){
        System.out.println("Starting location for new vehicle?");
        int start = scan.nextInt();
        v = new Vehicle(start);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Instruction not recognized.");
      }
    }
  }
}
