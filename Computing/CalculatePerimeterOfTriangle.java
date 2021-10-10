import java.util.Scanner;

public class TrianglePerimeter {
 
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the three edges of the triangle a, b and c: ");

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    if ((a + b > c) && (a + c > b) && (b + c > a)) {
      System.out.println("The perimeter is the triangle is " + (a + b + c));
    }
    else {
      System.out.println("The input is invalid.");
    }
  }
}


/* Output */

// Enter the three edges of the triangle a, b and c: 3 5 4
// The perimeter is the triangle is 12.0

//Enter the three edges of the triangle a, b and c: 5 2 3
//The input is invalid.
