// Demo

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        // output the three integers with width 5. Add spaces wherever needed
        int intValue1 = 10, intValue2 = 3, intValue3 = 15487;
        System.out.printf("%5d\n%5d\n%5d\n", intValue1, intValue2, intValue3); // "%5d" = width && "/n" = new line
        // Prints in three lines with a width of 5 for each

    }
}



import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

   // output the string with width 10 characters
   // by default, the output is right justified.
   String s = “Hello”;

   // add the minus sign (-) in the format specifier to left justify the
   System.out.printf(“%-10s\n”, s);
      
    }
}
