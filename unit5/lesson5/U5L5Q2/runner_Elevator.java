import java.util.Scanner;

public class runner_Elevator{
  public static void main(String[] args){
    String instruction = "";
    Scanner scan = new Scanner(System.in);
    while(!instruction.equals("q")){
      System.out.println("How many floors?");
      int max = scan.nextInt();
      System.out.println("Starting on which floor?");
      int start = scan.nextInt();
      scan.nextLine();
      Elevator e = new Elevator(max, start);
      instruction = "";

      while(!(instruction.equals("q")|| instruction.equals("r"))){
        System.out.println("Elevator is on floor " + e.getCurrentFloor() + " of " + e.getMaxFloor() + ".");
        if(e.isInService())
          System.out.println("Elevator in service.");
        else
          System.out.println("Elevator not in service.");
        System.out.println("Type \"c\" to change floor, \"s\" to put elevator in or out of service, \"r\" to restart, \"q\" to quit.");
        instruction = scan.nextLine();
        instruction = instruction.toLowerCase();
        if(instruction.equals("c")){
          System.out.println("New floor number?");
          int newFloor = scan.nextInt();
          e.goToFloor(newFloor);
          scan.nextLine();
        }
        else if(instruction.equals("s")){
          e.toggleInService();
        }
        else if(!(instruction.equals("q")|| instruction.equals("r"))){
          System.out.println("Instruction not recognized.");
        }
      }
    }
  }
}
