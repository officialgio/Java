import java.util.Scanner;
public class ComputeAverage {
public static void main(String[] args) {

  Scanner input = new Scanner(System.in); // declare an object of Scanner

  double num1, num2, num3, average; // declare variables

  System.out.print("Enter three numbers: ");

  num1 = input.nextDouble();

  num2 = input.nextDouble();

  num3 = input.nextDouble();

  // compute average

  average = (num1 + num2 + num3) / 3;

  // display the three numbers and their average value

  System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);

  }
}
