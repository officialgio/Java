import java.util.Scanner;

public class ComputeBMI {
public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in); // declare an object of Scanner

  double weight, height; // declare variables

  System.out.print("Enter weight in pounds: ");

  weight = input.nextDouble() * 0.45359237; // weight in kgs
// Alternatively, line 9 can be rewritten as
// weight = input.nextDouble();
// weight *= 0.45359237;

  System.out.print("Enter height in inches: ");

  height = input.nextDouble() * 0.0254; // height in meters

  // display the results

  System.out.println("BMI is " + weight / Math.pow(height, 2));
  }
}
