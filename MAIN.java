package ScannerExample;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

class ScannerExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scnaner

        System.out.print("Enter 3 numbers: ");

        double a = input.nextDouble(); //Input type


    }
}


class CharacterDataType {

    public static void main(String[] args) {

        //System.out.println("A \t B"); // A followed by a tab character followed by B

        //System.out.println("A \n B"); // print A, go to the beginning of next
                                    // line and print B
    }

}

class StringExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scans the
        String message1 = "Welcome to Java"; // declaration and assignment

        // next() reads a string up to the first space

        System.out.print("Enter a string: ");

        String message2 = input.next(); // reads the following string

        System.out.println("The entered string is " + message2); //"printIn" it prints the string then it prints the message2
    }
}


class StringDemo {

    public static void main(String[] args) {

        String message = "Giovanny Hernandez";
        char ch = message.charAt(3);

        //System.out.println(ch); // ch = 'v'


        String message2 = "Welcome to Java";
        char ch2 = message2.charAt(1); // prints 'e'
        //System.out.println(ch2);

        int sLength = message2.length();

        // Add space at the beginning of the string in concat
        String s1 = message2.concat(" Giooo!").concat(" 1234"); // adds to the String ".concat()";
        String s4 = "wecome to Java";

        System.out.println(s4.trim());
        //System.out.println(sLength); // returns the length of the String = 15
    }

}


// Different ways to add a string
class StringDemo2  {

    public static void main(String[] args) {
        String message = "Welcome to Java";
        //Method 1
        String s1 = message.concat("Programming");
        //Method 2
        String s2 = message + " Programming";

        System.out.println(s1);
    }
}
// Reading two strings using scanner and input.next();
class ReadingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter two strings: ");
//
//        String s1 = input.next(); // Reads first string
//        String s2 = input.next(); // Reads second String
//        System.out.println("s1 is: " + s1 + " and s2 is:  " + s2);

        // Seperate
        System.out.print("Enter a line: ");
        String s3 = input.nextLine(); //reads the entire line

        System.out.println("s3 is: " + s3);

    }
}

//Return chars using Scanner
class ReturningCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // to read a single character

        // read the whole line then invoke charAt(0) to get
        // the first entered character
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        System.out.println("The character entered is: " + ch);
    }
}

//Conversions between strings and numbers
class ConvertsionsBetweenStrAndNums  {
    public static void main(String[] args) {
        // Convert a number into a string: Using the string concatenation operator +
        float floatValue = (float)15.08;
        String s = floatValue + "";
        System.out.println(s);
    }
}


class FormatingConcoleOutput {
    public static void main(String[] args) {
        double doubleAmount = 103.45783;
        System.out.printf("%f \t %.2f \t %.7f\n", doubleAmount, doubleAmount, doubleAmount);

    /*
                  <--Output-->

          1             2             3
     103.457830 	 103.46 	 103.4578300
        Float      2 decimals     7 decimals

     %f returns floating point (1)
     %.2f returns floating point with 2 decimal places (2)
     %.7f returns floating point with 7 decimal places (3)

    <--Pseudo Code-->`
    %return a  floating num  \tab  %return a floating num with 2 decimals  \tab  %return floating point with 7 decimals


    */
    }
}


// IMPORTANT! //Lecture 2 pg 14-15
class FormatingConsoleOutput {
    public static void main(String[] args) {
        boolean boolValue = true; // or false
        int intValue = 7; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        byte byteValue = 10; // Stores whole numbers from -128 to 127
        char charValue = 'A'; // Stores a single character
        float floatValue = (float)197.145; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double doubleValue = 197.145; // Stores fractional numbers. Sufficient for storing 15 decimal digits
        String s = "Giovanny Hernandez";
        short theShort = 32_767; // Stores whole nums from -32,768 to 32,767
        //long theLong = 9_223_372_036; // Stores whole nums from -9223372036854 to 9223372036854

        System.out.printf("boolean value: %b \n"
        + "integer value: %d \n"
        + "byte value: %d \n"
        + "character value: %c\n"
        + "float value: %.2f \n"
        + "double value: %.3f\n"
        + "string value: %s \n",
        boolValue, intValue, byteValue,
                charValue, floatValue, doubleValue, s);

        /*          Remember!
                %b = Boolean value
                %c = character
                %d = decimal integer
                %f = floating-point number
                %e = number in e notation
                %s = string
        */
    }
}


// REMEMBER!
class FrequentlyUsedMethods {
    public static void main(String[] args) {

        char ch= 'A';
        System.out.println(Character.isDigit(ch)); // false
        System.out.println(Character.isLetter(ch)); // true
        System.out.println(Character.isLowerCase(ch)); // false
        System.out.println(Character.isUpperCase(ch)); // true
        System.out.println(Character.toLowerCase(ch)); // 'a'

    }
}

class formatiingConsoleOutput2 {
    public static void main(String[] args) {

        int intVal1 = 10;
        int intVal2 = 3;
        int intVal3 = 1587;
        float floatVal = 15.3456F;

        char ch = 'G';
        char ch2 = 'H';
        String s1 = "Giovanny!";
        String s2 = "Hernandez";

        System.out.printf("%-5.2f\n", floatVal); // 2 decimal places

        System.out.printf("%15s%15s\n", s1,s2); // strings

        System.out.printf("%-5c\t%-10c\n", ch, ch2); // char

        // %5d adds 5 spaces at the beginning (change to understand) & %d returns a decimal int
        System.out.printf("%5d\n%5d\n%5d\n",intVal1, intVal2, intVal3);

        // output the string with width 10 characters
        // by default, the output is right justified.
        String s = "Hello";
        System.out.printf("%10s\n", s);
        // add the minus sign (-) in the format specifier to left justify the
        // output
        System.out.printf("%-10s\n", s);

    }
}

class FormatExcersise {
    public static void main(String[] args) {
        //%-10s Format a string with the specified
        //number of characters and also left justify.
        //and %10s is right justify.

        System.out.printf("%-10s%-10s%-10s%-10s\n ", "Degrees", "Radians", "Sine", "Cosine");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians));

        degrees = 90;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians));
    }
}

// Generate a vehicle plate number assuming it consists of three uppercase
// letters followed by four digits
//import java.util.Random; <-- must add
class VehiclePlateNumber {
    public static void main(String[] args) {
        Random rnd = new Random(); //object random

        String plateNumber = (char)(rnd.nextInt(26) + 'A') + "" // "" = new string
        + (char)(rnd.nextInt(26) + 'A')
                + (char)(rnd.nextInt(26) + 'A') // form 1-26 //Alphabet consists of 26 letter
                + rnd.nextInt(10) // from 1-10
                + rnd.nextInt(10)
                + rnd.nextInt(10)
                + rnd.nextInt(10);
        System.out.println("Generate vehicle number is: " + plateNumber);
    }
}

class StackAndHeap {
    public static void main(String[] args) {
        // String objects are immutable
        String s1 = "Java";
        String s2 = "Java";

        // declaring a String using the
        // new operator (new object)
        String s3 = new String("Java");
        String s4 = new String("Giovanny Hernandez");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s3); // false
        System.out.println(s4 == s4); // true

        System.out.println("The fourth string is: " + s4);
        System.out.println("The index 4 of s4 is: " + s4.charAt(4)); // a

    }
}

class indexReturn {
    public static void main(String[] args) {
        String s1 = "Giovanny Hernandez";
        System.out.println(s1.charAt(3)); //v
    }
}

class ConvereStringAndNumbers {
    public static void main(String[] args) {
        // Convert a string into an integer value: intValue = 1718
        String intString = "1718";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);

        // Convert a string into a double value: doubleValue = 17.18
        String doubleString = "17.18";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleString);

        // Convert a number into a string: Using the string concatenation operator +
        float floatValue = (float)16.08;
        String s = floatValue + "";
        System.out.println(floatValue);

        // Example for + "" operator
        // s1 = 15...351
        int wholeNumberPart = 15;
        int fractionalPart = 351;
        String s1 = wholeNumberPart + "..." + fractionalPart;
        System.out.println(s1);
    }
}

//Practice
class ConvertPractice {
    public static void main(String[] args) {
        String strNum = "1234";
        int intVal = Integer.parseInt(strNum);
        System.out.println(strNum);

        String strNum2 = "12.45";
        double doubleVal = Double.parseDouble(strNum2);
        System.out.println(strNum2);

        float floatVal = 33.33F;
        String s = floatVal + "";
        System.out.println(floatVal);

    }
}

class ConversionBetweenStringsAndNums2  {
    public static void main(String[] args) {
        String s1 = "12.5";
        String s2 = "126";

        double dNum = Double.parseDouble(s1);
        int iNum = Integer.parseInt(s2);

        System.out.printf("%.3f\t%d\n", dNum, iNum); //
        System.out.println("Parsed double value is: " + dNum);
        System.out.println("Parsed int value is: " + iNum);
        System.out.println("THe binary of " + iNum + " is " + Integer.toBinaryString(iNum));
        System.out.println("The hexadecima; of " + iNum + " is " + Integer.toHexString(iNum).toUpperCase());
    }
}

// Important !
class HandlingStrings {
    public static void main(String[] args) {
        String s1 = "12.5 3.7 -15.4";
        String s2 = "4 7 -4";
        String s3 = "773 342 123";
        // Scanner dInput = new Scanner(System.in) <-- It will let you input a num
        Scanner dInput = new Scanner(s1); // The instance input will scan values from the string s1 (You don't input)

        System.out.println("The first number is: " + dInput.next());
        System.out.println("The second number is: " + dInput.next());
        System.out.println("The third number is: "  + dInput.next());

        Scanner iInput = new Scanner(s2);

        //Convert the output to int
        int iNum1 = Integer.parseInt(iInput.next());
        int iNum2 = Integer.parseInt(iInput.next());
        int iNum3 = Integer.parseInt((iInput.next()));

        System.out.printf("\n %d \t %d \t %d \n", iNum1, iNum2, iNum3);

        //Scanner scanNums = new Scanner(System.in);

//        System.out.print("Enter a string: ");
//        System.out.println("The first string is: " + scanNums.nextLine().toUpperCase());


        // New Method
        Scanner newScan = new Scanner(System.in); //type
        System.out.print("Enter a String: ");
        System.out.println("The first string is: " + newScan.nextLine()); // reads the entire line
        System.out.println("Enter another String: ");
        System.out.println("The second String is : " + newScan.nextLine().toUpperCase());

        Scanner newScanNums = new Scanner(s3);
        System.out.println("The first string is: " + newScanNums.next());
        System.out.println("THe second string is: " + newScanNums.next());

        //Example
        String ownStr = "4500 5555 500";
        Scanner newScannerNums = new Scanner(ownStr);

        int intConvert = Integer.parseInt(newScannerNums.next());
        int intConvert2 = Integer.parseInt(newScannerNums.next());
        int intConvert3 = Integer.parseInt(newScannerNums.next());
        System.out.printf("\n %d \t %d \t %d \n", intConvert, intConvert2, intConvert3);
    }
}

//Demo
class HandlingStrings2 {
    public static void main(String[] args) {
        Scanner dInpit2 = new Scanner(System.in);

        System.out.print("Enter a String: ");
        System.out.println("The first string entered is: " + dInpit2.nextLine());

        //char
        char ch = 'A';
        Scanner charInput = new Scanner(String.valueOf(ch));
        System.out.println("THe char entered is: " + charInput.next());
    }
}







class ComparingStrings {
    public static void main(String[] args) {
        // equals()
        String s1 = "Java", s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s2); // false
        // equalsIgnoreCase()
        String s4 = "Java", s5 = "java";
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4.equalsIgnoreCase(s5)); // true //Same as equals(s1) except that the
                                                            //comparison is case insensitive
        //compareTo()
        String city1 = "Chicago", city2 = "Boston";
        System.out.println(city1.compareTo(city2)); // 1
        System.out.println(city1.compareTo(city1)); // 0
        System.out.println(city2.compareTo(city1)); // -1

        //compareToIgnoreCase()
        System.out.println(city1.compareToIgnoreCase("chicago")); // 0

        //startsWith(prefix)
        System.out.println(city2.startsWith("Bo")); // true
        System.out.println(city2.startsWith("bo")); // false

        //endsWith(suffix)
        System.out.println(city1.endsWith("go")); // true
        System.out.println(city1.endsWith("go ")); // false

        //contains()
        System.out.println(city1.contains("cag")); // true
        System.out.println(city1.contains("Chicago")); // true

    }
}

class ObtainingSubstrings {
    public static void main(String[] args) {
        // Make sure to change the variable names when running or you'll get errors.

        //substring(beginIndex)
//        String s1 = "Java is fun!";
//        String s2 = s1.substring(8);
//        System.out.println("s2 = " + s2); // displays s2 = fun!

        //substring(beginIndex, endIndex)
        String s1 = "Java is fun!";
        String s2 = s1.substring(5, 11);
        System.out.println("s2 = " + s2); // displays s2 = is fun


        /*
                J a v a   i s   F u n  !
        Index = 0 1 2 3 4 5 6 7 8 9 10 11
                                ^------->
                          ^------------->


        */

    }
}

class PracticeSubstrings {
    public static void main(String[] args) {
        String stringName = "Welcome to Java!";
        String subStr = stringName.substring(0, 6);
        System.out.println(subStr); // Welcom
    }
}

//All Methods
class FindingACharacterOrASubstringInAString {
    public static void main(String[] args) {
        String s1 = "Java";
        //indexOf(ch)
        int indexMain = s1.indexOf('a'); // returns only the index of the char
        System.out.println(indexMain); // 1
        //indexOf(ch, fromIndex)
        int index = s1.indexOf('a', 2); // 3 // starts searching from index 2
        int index1 = s1.indexOf('s', 1); // -1 because it doesn't exist

        System.out.println(index);

        //indexOf(s) (string)
        String city = "Chicago";
        String city2 = "Boston";

        int indexNonExist = city.indexOf(city2); // -1
        int indexCity = city.indexOf("go"); // 5
        System.out.println(indexCity);

        //Example
        String myStr = "Hello how are you?";
        int indexFromStr = myStr.indexOf('e', 5); //starts searching from index 5
        System.out.println(indexFromStr);
        //or
        System.out.println(myStr.indexOf("e", 5)); // ideal

        /*
               H e l l o   h o w    a  r e  y o u ?
       index = 0 1 2 3 4 5 6 7 8 9 10 11 12
                         ^---->           ^
        */
    }
}

//indexOf(ch)
class FindingACharacterOrASubstringInAString2 {
    public static void main(String[] args) {
        String s1 = "Java";

        int index = s1.indexOf('a'); // returns only the index of the char
        int index1 = s1.indexOf('s'); // -1
        System.out.println(index); // 1
    }
}

//indexOf(ch, fromIndex)
class FindingACharacterOrASubstringInAString3  {
    public static void main(String[] args) {
        String s1 = "Java";
        int index = s1.indexOf('a', 2); // 3 // starts searching from index 2
        int index1 = s1.indexOf('s', 1); // -1 because it doesn't exist

        System.out.println(index);
    }
}

//indexOf(s) (string)
class FindingACharacterOrASubstringInAString4 {
    public static void main(String[] args) {

        String s1 = "Chicago", s2 = "Boston";
        int index = s1.indexOf(s2); // -1
        int index1 = s1.indexOf("go"); // 5
        System.out.println(index1);
    }
}

//lastIndexOf(ch), //last occurrence
//lastIndexOf(s)
class FindingACharacterOrASubstringInAString5 {
    public static void main(String[] args) {
        String s1 = "international";
        int index = s1.lastIndexOf('i'); // 8
        int index1 = s1.lastIndexOf("na"); // -1
        System.out.println(index);
    }
}

//lastIndexOf(ch, fromIndex),
//lastIndexOf(s, fromIndex)
class FindingACharacterOrASubstringInAString6 {
   public static void main(String[] args) {
       String s1 = "international";
       int index = s1.lastIndexOf('i', 10); // 19
       int index1 = s1.lastIndexOf("na", 7); // 10
       System.out.println(index);
   }
}


//Review
class Review {
    public static void main(String[] args) {
        double theta = Math.PI / 4;
        System.out.println("Angle in degree: " + Math.toDegrees(theta));
        System.out.printf("Angle in radians: %.2f", theta);
        System.out.printf("\nCosine of theta is %-8.3f\n", Math.cos(theta)); // left adjustment

    }
}

//Basic Understanding
class THeWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        //While count is less than or equal to 20
        //loop 20 times
        //ONLY TRUE!
        while (count <= 20) {
            System.out.println("Count " + count);
            count++;
        }
    }
}

//The While Loop
class WhileLoop {
    public static void main(String[] args) {
        int ii = 1, sum = 0;
        final int LIMIT = 5;
        while (ii <= LIMIT) {
            sum += ii++; // same as sum = sum + ii; ii++;
            System.out.println("ii: " + sum);

        }
        System.out.println("The sum of integers from 1 to "

                + LIMIT + " is " + sum);
    }
    /*

    ii increases by one when adding "ii++"
    sum is being added by "ii++"
        sum = 0
        sum = 1 = 1 +1
        sum = 1 + 1 + 1 = 3  +2
        sum = 1 + 1 + 1 + 1 + 1 + 1 = 6 +3
        sum = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 +1 = 10 +4 ...

    */

}

//Compute the average of the entered positive numbers, terminate if input = 0
class addNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        boolean condition = true;

        while (condition) {
            System.out.println("Enter a positive integer, 0 to exit: ");
            int intValue = input.nextInt(); // reads only as int
            if (intValue > 0) { // input has to be greater than 0
                sum += intValue; // the inputs will be added into sum (accumulation)
                count++; // increase count && keep track of the inputs
            }
            else if (intValue < 0) { // if pressed 0
                System.out.println("Invalid input, Try again. ");
            }
            else { // otherwise is false
                condition = false;
            }
        }

        System.out.println("The sum of the " + count + " entered positive integers is " + sum);
        System.out.printf("The average value of the entered numbers is %.3f\n" + (double)sum / count);
    }
}

//Example
class AddNumbersDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOdd = 0, countOdd = 0, sumEven = 0, countEven = 0;
        int intValue;
        boolean condition = true;
        while (condition) {
            System.out.print("Enter a positive integer, 0 to exit: ");
            intValue = input.nextInt(); // reads input as int
            if (intValue > 0) { // only if the in the value is > 0 execute the following...
                if (intValue % 2 == 0) {
                    sumEven += intValue; // add the inputs by the inputs
                    countEven++; // keep track of the inputs
                } // entered even number
                else {
                    sumOdd += intValue; // add
                    countOdd++; // keep track
                } // entered odd number
            } else if (intValue < 0) {
                System.out.println("Invalid input. Try again. ");
            } else {
                condition = false;
            }
        }
        System.out.println("The sum of the " + countEven + " entered positive even integers is " + sumEven);
        System.out.println("The sum of the " + countOdd + " entered positive odd integers is " + sumOdd);

    }
}


class addDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0, nInput;
        boolean condition = true;

        while(condition) {
            System.out.print("Enter a positive integer or Press 0 to exit: " );
            nInput = input.nextInt(); // reads as int
            if (nInput > 0) {
                sum += nInput;
                count++;
            } else if (nInput < 0) {
                System.out.print("Invalid output, Please try again ");
            } else {
                condition = false;
            }
        }
        System.out.println("The sum of the " + count + " entered positive integers is: " + sum);
    }
}

// Do While Loop starter
class DoWhileLoopStarter {
    public static void main (String[] args) {

        // do only executes only once
        int count = 21;

        do {
            System.out.println(count);
            count++;
        }
        while (count <= 20);
    }
}

class DoWhileLoop {
    public static void main(String[] args) {
        int ii = 1, sum =0;
        final int LIMIT = 5;

        // do while loop executes once regardless of the condition
        // only use it if you want to execute once
        do {
            sum += ii++;
        } while (ii <= LIMIT);
        System.out.println("The sum of th integers from 1 to " + LIMIT + " is " + sum);
    }
}

class ForLoops {
    public static void main(String[] args) {

      int sum = 0;
      final int LIMIT = 5;
    // ii is declared and initialized at the same time
    // it is a good practice to do so if ii is used only
    // in the loop
      for (int ii = 1; ii < LIMIT; ii++) {
          sum += ii;
          System.out.println(ii);
      }
    }
}

class ForLoops2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int ii = 0, jj = 5; ii < 100 ; ii++, jj+=5) {
            sum += (ii + jj);
            System.out.println(ii); // ii = 99 //  jj = 500

            // ii iterates bby ones, and jj iterates by fives
        }
    }
}

/* Difference */
//class ForLoopsVsWhileLoops {
//    public static void main(String[] args) {
//
//        // this for loop is equivalent to the following while loop
//        for ( ; loop-continuation-condition ; ) {
//            // loop body: DO something
//        }
//
//        while (loop-continuation-condition) {
//            // loop body: DO something
//        }
//    }
//}

class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("               Multiplication Table");
        System.out.print("    ");

        //print the first row
        for (int jj = 1; jj <= 9; jj++) {
            System.out.print("    " + jj);
        }
        System.out.println("\n-----------------------------------------");
        //display the table
        for (int ii = 1; ii <= 9; ii++) {
            System.out.println(ii + " | ");
            for (int jj = 1; jj <= 9; jj++) {
                System.out.printf("%8d", ii * jj);
            }
            System.out.println();
        }
    }
}

//Starter
class NestedLoopExcersize {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
    //   output

//        0 0
//        0 1
//
//        1 0
//        1 1
//
//        2 0
//        2 1
}

class NestedLoopExcersize2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*              Output

                     *
                     **
                     ***
                     ****
                     *****


    */
}

//same thing
class NestedloopExcersize3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("?");
            }
            System.out.println();
        }
    }
}

//Using while loop to predict salaries
class PredictingSalary {
    public static void main(String[] args) {
        double employeeeSalary = 50000; // starting salary
        int year = 0; // initialize year

        // In how many years will the salary will be doubled??
        while (employeeeSalary < 100000) { // 50000 is less than 100000 so this is executed until it's over 100000
            employeeeSalary *= 1.05; // the salary increases by 5% yearly
            year++; // increase year for each execution
        }
        System.out.println("Salary will be double in " + year + " years.");
        System.out.printf("Salary will be $%.2f in %d years",employeeeSalary, year);
    }
}

// Keywords beak and continue

class ContinueKeyWord {
    public static void main(String[] args) {

        // if it's an even num then continue to the outer loop
        // and ignore the rest of the body and do the change "i++"
        // if it's an odd number then the if statement won't run
        // and it will print i " "
        for (int i = 0; i <= 10; i++ ) {
            if (i % 2 == 0)
                continue;
                System.out.print(i + " ");

        }
    }
}

//Guide
class ContinueAndBreakKeywords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a number between 1 and 10: ");
            n = input.nextInt();

            if ( n < 1 || n > 10) // if it's not between 1 and 10
                continue; // continue with the loop and skip the rest of the body or what's below
                System.out.println(n + " is between 1 and 10 ");
                break; // if is between 1 and 10 ends the while loop or exit the loop
        }
    }
}


class ContinueAndBreakKeywords2 {
    public static void main (String[] args) {
        int sum = 0, number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue; // exclude remaining part of the loop and go to next iteration

            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}

class ContinueAndBreakKeywords3 {
    public static void main(String[] args) {


        /* Understanding the % operator (Review)
        10 / 2 gives 5 with 0 remainder
        (10 is even)
        13/2  gives 6 with 1 remainder(odd)
        */

        int factor = 2, n = 10;
        while (factor <= n) {
            if (n % factor == 0)
                break;

            factor++;
        }
        System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
    }
}

//Compute the average of the entered positive even/odd numbers,
class ComputerAverageOfPositiveAndOddNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize variables
        int sumOdd = 0, countOdd = 0, sumEven = 0, countEven = 0;
        int intValue;

        while (true) {  // infinite loop and can only be terminated by "break" keyword
            System.out.print("Enter a positive integer, 0 to exit:  ");
            intValue = input.nextInt();

            if (intValue > 0) { // executes only once is 0
                if (intValue % 2 == 0) { // divides by 2 and if the remainder is 0 then is even
                    sumEven += intValue; // your input is being added to the sumEven (accumulate the sum)
                    countEven++; // track your number of inputs
                } else {
                    sumOdd += intValue;
                    countOdd++;
                }
            }
            else if (intValue < 0) { // less than 0
                System.out.println("Invalid input. Try again.");
            }
            else {
                break; // terminate the loops once is 0
            }

            System.out.println("The sum of the " + countEven + " entered positive even integers is " + sumEven);
            System.out.println("The sum of the " + countOdd + " entered odd even integers is " + sumOdd);

        }
    }
}

//This is the old way
//class ArraysDont {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a, b, c, d, e, f, g, h, i, j;
//
//        System.out.println("Enter 10 integers: ");
//        a = input.nextInt();
//        b = input.nextInt();
//        c = input.nextInt();
//        d = input.nextInt();
//        e = input.nextInt();
//        f = input.nextInt();
//        g = input.nextInt();
//        h = input.nextInt();
//        i = input.nextInt();
//        j = input.nextInt();
//
//        double avgValue = (a + b + c + d + e + f + g + h + i + j) / 10.0;
//        System.out.println(avgValue);
//    }
//}

class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10]; //length of arr is 10
        // elements of arr are initialize to 0.
        int sum = 0;

        System.out.print("Enter 10 integers: ");

        /*
        assume you input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        arr[ii] = 0 -> 1 which is then added to sum
        arr[ii] is then incremented by 1 and we have arr[1] = 2
        so is then added to sum: sum(1) + 2 = 3 and so for

        sum = arr[0] + arr[1] + arr[2] + arr[3]...
        * */
        for (int ii = 0; ii < 10; ii++) {
           arr[ii] = input.nextInt();
           sum += arr[ii];
        }
        double avgValue = sum / 10.0; // return a double value
        System.out.println(avgValue);
    }
}

// Array of characters
class Arrays {
    public static void main(String[] args) {
        final int SIZE = 15; // declare a constant
//        char charArray[]; // array declaration (a reference to an array is created, no data yet)
        char[] charArray = new char[SIZE]; // ideal method
        //charArray = new char[SIZE]; // 15 characters of memory are allocated and referenced by charArray
        // characters are initialized to 0000...
        for (int ii = 0; ii < SIZE; ii++) {
            charArray[ii] = (char) (Math.random() * 26 + 65);
        }
        System.out.println(charArray);
    }
}

// Numeric ypes of arrays
class NumericArrays {
    public static void main(String[] args) {
        // Double Arrau
        double doubleArray[] = {2.1, -5.1, 3.7, 0, 2.8}; // declaration and assignment
        //Float Array
        float floatArray[] = {2.1f, -5.1f, 3.7f, 0f, 2.8f};
        //Boolean Arrray
        boolean boolArray[] = {true, true, false, false};
        //Integer Array
        int intArray[] = {3, 1, -20, 7, 10, 7};
        //Byte Array
        byte byteArray[] = {0, 12, -7, 127};

        // print arrays and reference to one another by multiplying etc..
        System.out.println(intArray[0]); // print the first element of intArray[] // 3

        System.out.println(intArray[1] * 10); // print the second element of inArray[] multiplied by 10 // 10

        System.out.printf("%.3f\n", doubleArray[2] - intArray[0]); // 0.700

        doubleArray[1] *= 2; // multiply the second element of doubleArray[] by 2
    }
}

class PracticeArrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // store elemts in a int array
        char charArray[] = {'w', 'e', 'l', 'c', 'o', 'm', 'e'}; // store elements in a char array


        System.out.printf("The first index of the array is : " + arr[1]); //2

        System.out.println(charArray[2]);
//        System.out.printf("\n\t\t %d \n", arr[4]);

        double doubleArray[] = new double[8]; // create a double array of 8 elements {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}

        int intArray[] = new int[8]; // create a int array of 8 elements {0, 0, 0, 0, 0, 0, 0, 0}
    }
}










//Review
//class Review3 {
//    public static void main(String[] args) {
//
//        String s1 = "555 754 543";
//        String s2 = "4334 443 4444";
//        Scanner input = new Scanner(s1);
//
//        System.out.print("------------------------ \n");
//        System.out.printf("\t String Format \n");
//
//        System.out.println("The first number is: " + input.next());
//        System.out.println("The secoond number is: " + input.next());
//        System.out.println("The third number is: " + input.next());
//
//
//        Scanner numInput = new Scanner(s2);
//        int num1 = Integer.parseInt(numInput.next());
//        int num2 = Integer.parseInt(numInput.next());
//        int num3 = Integer.parseInt(numInput.next());
//
//        System.out.print("------------------------ \n");
//        System.out.printf("\t Integer Format \n");
//        System.out.printf("The first int is: %d \nThe second int is: %d \nThe third number is %d \n", num1, num2, num3 );
//
//    }
//}


//Review here how to justify the output
class JustifyingConsoleOutputPractice {
    public static void main(String[] args) {

        int intValue2 = 555, intValue3 = 444;
        System.out.printf("%5d\n%4d\n", intValue2, intValue3);
    }
}
