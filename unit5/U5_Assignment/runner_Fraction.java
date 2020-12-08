import java.util.Scanner;

public class runner_Fraction{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Fraction f = new Fraction();
    String instruction = "";
    while(!instruction.equals("q")){
      System.out.println("Type the name of the method to test. Type c to construct a new Fraction, q to quit.");
      instruction = scan.nextLine();
      if(instruction.equals("getNumerator")){
        System.out.println(f.getNumerator());
      }
      else if(instruction.equals("getDenominator")){
        System.out.println(f.getDenominator());
      }
      else if(instruction.equals("getNumFractions")){
        System.out.println(Fraction.getNumFractions());
      }
      else if(instruction.equals("toString")){
        System.out.println(f);
      }
      else if(instruction.equals("mixedNumber")){
        System.out.println(f.mixedNumber());
      }
      else if(instruction.equals("setNumerator")){
        System.out.println("Enter parameter value:");
        int arg = scan.nextInt();
        f.setNumerator(arg);
        scan.nextLine();
      }
      else if(instruction.equals("setDenominator")){
        System.out.println("Enter parameter value:");
        int arg = scan.nextInt();
        f.setDenominator(arg);
        scan.nextLine();
      }
      else if(instruction.equals("add")){
        System.out.println("Method 1 or 2?\n1 - add(int n, int d)\n2 - add(Fraction other)");
        int methodNum = scan.nextInt();
        if(methodNum != 1 && methodNum != 2){
          System.out.println("Not valid.");
        }
        else{
          System.out.println("Enter a numerator and denominator:");
          int n = scan.nextInt();
          int d = scan.nextInt();
          if(methodNum == 1){
            f.add(n, d);
          }
          else{
            Fraction fOther = new Fraction(n, d);
            f.add(fOther);
          }
        }
        scan.nextLine();
      }
      else if(instruction.equals("multiply")){
        System.out.println("Method 1 or 2?\n1 - multiply(int n, int d)\n2 - multiply(Fraction other)");
        int methodNum = scan.nextInt();
        if(methodNum != 1 && methodNum != 2){
          System.out.println("Not valid.");
        }
        else{
          System.out.println("Enter a numerator and denominator:");
          int n = scan.nextInt();
          int d = scan.nextInt();
          if(methodNum == 1){
            f.multiply(n, d);
          }
          else{
            Fraction fOther = new Fraction(n, d);
            f.multiply(fOther);
          }
        }
        scan.nextLine();
      }
      else if(instruction.equals("c")){
        System.out.println("Enter a numerator and denominator:");
        int n = scan.nextInt();
        int d = scan.nextInt();
        f = new Fraction(n, d);
        scan.nextLine();
      }
      else if(!instruction.equals("q")){
        System.out.println("Not recognized.");
      }
    }
  }
}
