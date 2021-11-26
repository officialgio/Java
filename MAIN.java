/*       Main       */
package ScannerExample;
import org.w3c.dom.ls.LSOutput;

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

//The While Loop
class WhileLoop {
    public static void main(String[] args) {
        int ii = 1, sum = 0;
        final int LIMIT = 5;
        while (ii <= LIMIT) {
            sum += ii++; // same as sum = sum + ii; ii++;
        }
        System.out.println("The sum of integers from 1 to "

                + LIMIT + " is " + sum);
    }
}



















