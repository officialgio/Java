import java.util.Random; // to generate random numbers
  public class RandomNumbers {
    public static void main(String[] args) {

      Random rand = new Random(); // declare an object of the class Random()
      double randomDouble = rand.nextDouble();
      double randomFloat = rand.nextFloat();
      int randomInt = rand.nextInt();
      int randomInt10 = rand.nextInt(10);

      System.out.println("Double value from 0 (inclusive) to 1 (exclusive): " + randomDouble);
      System.out.println("Float value from 0 (inclusive) to 1 (exclusive): " + randomFloat);
      System.out.println("Integer value: " + randomInt);\
      System.out.println("Integer value less than 10: " + randomInt10);
      
    }
}
