import java.util.Scanner;
public class ComputeTringleAngles {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three points: ");
    double x1 = input.nextDouble(); double y1 = input.nextDouble();
    double x2 = input.nextDouble(); double y2 = input.nextDouble();
    double x3 = input.nextDouble(); double y3 = input.nextDouble();

    double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    double c = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
    double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

    System.out.printf("The three angles are %.2f %.2f %.2f", A, B, C);

  }
}

/* Output */
// Enter three points: 1 2 1.5 3 1.9 -1
// The three angles are 136.74 32.28 10.99
