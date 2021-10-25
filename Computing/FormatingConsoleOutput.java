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

public class StringDemo {
    public static void main(String[] args) {

//        //The method printf() is used to display formatted output.
//        double doubleAmount = 103.45783;
//        System.out.printf("%f \t %.2f \t %.7f\n", doubleAmount,
//                doubleAmount,
//                doubleAmount);

        boolean boolValue = true;
        int intValue = 7;
        byte byteValue = 10;
        char charValue = 'A';
        float floatValue = (float) 197.145;
        double doubleValue = 197.145;
        String s = "Welcome to Java";
        System.out.printf("boolean value: %b \n"
        + "integer value: %d \n"
        + "byte value: %d \n"
        + "character value: %c\n"
        + "float value: %.2f \n"
        + "double value: %.3f\n"
        + "string value: %s \n",
        boolValue, intValue, byteValue,
                charValue, floatValue, doubleValue, s);
    }
}

/* Output */
boolean value: true 
integer value: 7 
byte value: 10 
character value: A
float value: 197.15 
double value: 197.145
string value: Welcome to Java 
