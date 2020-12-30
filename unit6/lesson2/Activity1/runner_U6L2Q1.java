import java.util.Scanner;
public class runner_U6_L2_Activity_One{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    double[] vals = new double[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals[i] = scan.nextDouble();
    }
    System.out.println("All negative: " + U6_L2_Activity_One.allNegative(vals));
  }
}