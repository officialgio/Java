package demo;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



// Guide Example (value returning methods) IMPORTANT!
class CallingAMethod {
    public static int max(int num1, int num2) {

        int result;

        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result; // returns a value
    }
}


class Methods {
    public static void main(String[] args) {
        System.out.println("THe grade is: ");
        //printGrade(95.2)
    }
// using new method
    private static void printGrade(double score) {
        if (score < 0 || score > 100) {
            System.out.println("invalid Score");
            return; // terminate a void method
        }

        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >- 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('f');
        }
    }

    // previous turned into this method
    public static char printGrade2(double score) { // returning a char value so we don't use void
        if (score >= 90.0)
            return('A');
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
        return 'F';

    }
}

//In pass-by-value, the value of the argument is passed to the parameter. The value of
//the argument is not affected, regardless to the changes made to the parameter.
class PassingParameters{
    public static void main(String[] args) {

        int x = 5;
        System.out.println("before the call, x is " + x);
        divideByTwo(x);
        System.out.println("After the call, x is " + x);
    }

    public static void divideByTwo(int y) {
        y /= 2;
        // a /= b is equivalent to divide a by b and put the result in a
        System.out.println("Inside the method, y is " + y);
    }
}

//Beginner Guide
class ValueReturningMethod {
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}

class CallingSum {
    public static void main(String[] args) {
        System.out.println("message1");
        System.out.println(sum(1,2)); // set 1 = x, 2 = y && return the sum
        System.out.println("message2");
    }
    public static int sum(int x, int y) {
        return x + y; //sum
    }
}

//Review
class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value of hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

    }
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int ii = 0; ii < hex.length(); ii++) {
            char hexChar = hex.charAt(ii);
            //System.out.println(hexChar);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';

    }
}

//Methods with object parameters
class ArrayParameterDemo {
    public static void main(String[] args) {
        final int SIZE = 10;
        double[] doubleArray = new double[SIZE];

        //include (doubleArray) as argument because want the arr to be associated with the methods.
        randomVector(doubleArray); // associate with the array (argument)
        double avgValue = avgVector(doubleArray); // store the avg vector in a variable

        System.out.printf("The average value of the array is %.3f.\n", avgValue);
    }

    public static void randomVector(double[] a) { // we're not return a value so is void
        for (int ii = 0; ii < a.length; ii++) { // assigning a Random vector to each element in the array
            a[ii] = Math.random();
        }
    }

    public static double avgVector(double[] a) { // return a double value so we don't use void
        double result = 0;
        for (int ii = 0; ii < a.length; ii++) {
            result += a[ii];
        }
        return result / a.length;
    }
}
//package com.random.character;
//Generating random characters
class RandomCharacter {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1) );
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}

//Generating random characters


class TestRandomCharacter {
        public static void main(String[] args) {
            final int NUMBER_OF_CHARS = 175;
            final int CHARS_PER_LINE = 25;

            for (int ii = 0; ii < NUMBER_OF_CHARS; ++ii) {
                char ch = RandomCharacter.getRandomUpperCaseLetter();
                if ((ii + 1) % CHARS_PER_LINE == 0)
                    System.out.println(ch);
                else
                    System.out.print(ch);

            }
        }
}

//Small Method to Generate Random Characters
class RandomChar {
    public static void main(String[] args) {
        Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);
    }
}

//Palindrome Integer
class PalindromeInteger {
    public static int reverese(int number) {
        int reverseNumber = 0;
        while (true) {
            reverseNumber *= 10; // multiply the most right digit by 10
            reverseNumber += number % 10;  // take out the most right digit
            number /= 10;
            if (number == 0) break;
        }
        return reverseNumber;
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = reverese(number);
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is the number " + number + " a palindrome? " + isPalindrome(number));
    }
}

//Review this for Understanding
class PalindromeExplained {
    public static int reverse(int number) {
        int reverse = 0;

        while (true) {

            /*
                    GUIDE
                   -------
            0*10 = 0 + 1234 % 10 = 4 (Last Digit)
            reverse = 4
            number (1234) / 10 = 123 (4 is eliminated)
            number = 123;

            reverse = 4
            4*10 = 40 , 123 % 10 = 3, 40 + 3 = 43
            reverse = 43
            number = 123 / 10 = 12 (3 is eliminated)
            number = 12;

            reverse = 43 *10 = 430 + 2 = 432
            reverse = 432
            number = 12 / 10 = 1 (eliminate 2)
            number = 1;

            number = 1
            reverse = 432 * 10 = 4320 % 10 = 432 + number(1) = 4321
            number = 1/ 10 = 0;

            */
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
            if (number == 0) break;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: "); //1234
        int number = input.nextInt();
        System.out.println("The number is " + reverse(number));
    }
}

class FindFirstNUmAndLastNUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dInput, lastDigit;
        while(true) {
            System.out.print("Enter a integer: ");
            dInput = input.nextInt();
            lastDigit = dInput % 10; // to get the last digit use "% 10"
            System.out.println("Last Digit: " + lastDigit);

            if (dInput == 0) break;
        }
        //System.out.println("Last Digit: " + lastDigit);

    }
}


