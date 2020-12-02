import java.util.Scanner;

public class runner_RightTriangle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    RightTriangle t = new RightTriangle();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println("Type the name of the method to test. Type c to construct a new triangle, q to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("getArea")){
        System.out.println(t.getArea());
      }
      else if(instruction.equals("getBase")){
        System.out.println(t.getBase());
      }
      else if(instruction.equals("getHeight")){
        System.out.println(t.getHeight());
      }
      else if(instruction.equals("getHypotenuse")){
        System.out.println(t.getHypotenuse());
      }
      else if(instruction.equals("getPerimeter")){
        System.out.println(t.getPerimeter());
      }
      else if(instruction.equals("toString")){
        System.out.println(t);
      }
      else if(instruction.equals("setBase")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        t.setBase(arg);
        scan.nextLine();
      }
      else if(instruction.equals("setHeight")){
        System.out.println("Enter parameter value:");
        double arg = scan.nextDouble();
        t.setHeight(arg);
        scan.nextLine();
      }
      else if(instruction.equals("equals")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        RightTriangle tOther = new RightTriangle(bs, ht);
        System.out.println(t.equals(tOther));
        scan.nextLine();
      }
      else if(instruction.equals("c")){
        System.out.println("Enter base and height:");
        double bs = scan.nextDouble();
        double ht = scan.nextDouble();
        t = new RightTriangle(bs, ht);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Not recognized.");
      }
    }
  }
}
