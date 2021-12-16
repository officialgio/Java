package demo;
import java.util.Arrays;
import java.util.Scanner;

class DeclaringArrays {
    public static void main(String[] args) {
//        // reference variable
//        int[] intArray;
//        double[] doubleArray;
//        byte[] byteArray;
//        float[] floatArray;

        int [] intArray = new int[5];
        float[] floatArray = new float[5];

        //Assigning values to the array elements
        intArray[0] = 5;
        //intArray[1] = intArray[2] = intArray[3];
    }
}

class DeclerinArrays2 {
    public static void main(String[] args) {
        //double[] myList = {1.5, 2.1, -0.7, 3.3}; // array initializer
        // the above statement is equivalent to
        double[] myList = new double[4];
        myList[0] = 1.5;
        myList[0] = 2.1;
        myList[0] = -0.7;
        myList[0] = 3.3;
    }
}
//Assigning values to the elements of an array using for loop.
class ProcessingArrays {
    public static void main(String[] args){
        double[] doubleArray = new double[10];
        double[] doubleArray2 = new double[5];

        for (int ii = 0; ii < doubleArray.length; ii++) {
            doubleArray[ii] = ii * ii - 3 * ii + 6; // multiplication (use calculator) // assigning values to the elements
            System.out.printf("[%d]Assigned Values: %.3f\t",ii, doubleArray[ii]); // displaying the elements of an array
        }


        //Assigning random values to the elements of an array
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray2[i] = Math.random() * 20 + 5; // * 100 if you want from 0 to 100
            System.out.printf("\n[%d]Assigned Random Value: %.3f\t", i, doubleArray2[i]);
        }
    }
}




// Printing a character Array
class PrintChar {
    public static void main(String[] args) {
        char[] cityName = {'C', 'h', 'i', 'c', 'a', 'g', 'o'};
        System.out.println(cityName);
    }
}

// Summing the elements of an array
class SumElements {
    public static void main(String[] args) {
        double total = 0;
        double[] doubleArray = {1, 2, 3, 4, 5};

        for (int ii = 0; ii < doubleArray.length; ii++) {
            total += doubleArray[ii];
        }
        System.out.println(total); // 15
    }
}

// Finding the largest/smallest element of an array and its index
class LargestAndSmallets {
    public static void main(String[] args) {
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        double max = doubleArray[0]; // anything bigger than larger 1.0 should be printed
        int indexOfMax = 0;
        for (int ii = 1; ii < doubleArray.length; ++ii) {
            if (doubleArray[ii] > max) {
                max = doubleArray[ii];
                //indexOfMax = ii;
            }
            System.out.println(max);
        }
    }
}

// shifting elements
class Shifting {
    public static void main(String[] args) {
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double temp = doubleArray[0]; // index to shift or retain

        // shifting to the left
        for (int i = 1; i < doubleArray.length ;i++) {
            doubleArray[i - 1] = doubleArray[i]; // 1.0
            System.out.println(doubleArray[i - 1]);
        }
        doubleArray[doubleArray.length - 1] = temp; // adds 1.0 to the end of the index
        //System.out.println(temp);

    }
}



class Simpliflying {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "Decemeber"};
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();

        System.out.println("The month is: " + months[monthNumber - 1]); // access the element using 0 to arrayRefVar.length – 1.
    }
}

class ReturnNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: " );

        String[] inputNames = {"Name1", "Name2", "Name3", "Name4"};
        int dInput = input.nextInt();

        // to access elements in an array use input["variable" - 1];
        System.out.println("The name is: " + inputNames[dInput - 1]); // check for th input in length of the string "- 1"
    }
}

// Analyze numbers: Find the number of elements above the average value.
class SingleDimentialArrays {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        // enter the elements and compute the sum of the elements
        System.out.print("Enter the numbers: ");
        for (int ii = 0; ii < numbers.length; ++ii) {
            numbers[ii] = input.nextDouble();
            sum += numbers[ii];
        }

        double average = sum / n;

        int count = 0;
        for (int ii = 0; ii < n; ii++) {
            if (numbers[ii] > average) {
                count++;
            }
            System.out.println("Average is " + average);
            System.out.println("Number of elements above the average is " + count);
        }
    }
}


class Chapter7 {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; // list of vowels
        String s = "Angry people are not always wise."; // an input string

        // convert the string to lowercase (The list of vowels is lowercase)
        int count = countVowels(s.toLowerCase(), vowels);
        System.out.println("The number of vowels in the string is: " + count);
    }
    public static int countVowels(String str, char[] vowels) { // pass string and char array
        int count = 0;

        // nested loop
        //.length is for Arrays, and .length() for Strings
        for (int ii = 0; ii < str.length(); ii++) {
            for (int jj = 0; jj < vowels.length; jj++) {
                if (str.charAt(ii) ==  vowels[jj]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

class CopyingAnArray {
    public static void main(String[] args) {
        final int SIZE = 4;
        int[] sourceIntArray = {7, -2, 1, 5};
        int[] targetIntArray = new int[SIZE];
        double[] sourceDoubleArray = {1.5, -2.1, 3.4, 4};
        double[] targetDoubleArray = new double[SIZE];

        for (int i = 0; i < SIZE; i++) {
            targetIntArray[i] = sourceIntArray[i];
            System.out.println(targetIntArray[i]); // print to check if it's copied
        }
        for (int i = 0; i < SIZE; i++) {
            // double containts int
            targetDoubleArray[i] = sourceIntArray[i];
            System.out.println(targetDoubleArray[i]);
            // type casting
            targetIntArray[i] = (int) sourceDoubleArray[i];
            System.out.println(targetIntArray[i]);
        }
    }
}

// copy a reference value
// different way to print array elements as well
class Copy {
    public static void main(String[] args) {
        int[] sourceArray = {7, -2, 1, 5};

        // copy the array's reference value
        int[] targetArray = sourceArray;

        targetArray[2] = 10;
        sourceArray[1] = -10;

        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(targetArray[i] + "");
        }
    }
}

// Copy an array’s reference value
// Dereferenced data are deleted by the garbage collector

class DereferenceData {
    public static void main(String[] args) {
        int[] sourceArray = {7, -2, 1, 5};

        // copy the array's reference value
        int[] targetArray = {0, 9, 7, 3};

        targetArray = sourceArray;
        // {0, 9, 7, 3} is in the garbage collector

        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(targetArray[i] + "" + sourceArray[i]);
        }

        // 7 7
        // -2 -2
        // 1 1
        // 5 5
    }
}

// Passing arrays to methods
class PassingArraysToMethods {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        int x = 3;

        changePrimitive(x); // case 1
        System.out.println("x is: " + x);
        changeArray(myArray); // case 2
        changePrimitive(myArray[1]); // case 3

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + "");
        }
    }

    public static void changePrimitive(int a) {
        a = 10;
        System.out.println("ChangePrimitive is: " + a);
    }

    public static void changeArray(int[] y) {
        y[0] = 15;
    }

}

// return an array from a method
class ReturningAnArrayFromMethod {
    public static void main(String[] args) {

        int[] myArray = {7, -2, 1, 5};
        // first call
        int[] output1 = arrayPower(myArray);
        for (int i = 0; i < output1.length; i++) {
            System.out.println(output1[i] + "");
        }

        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 8);
        }
        // second call
        int[] output2 = arrayPower(myArray);

    }

    public static int[] arrayPower(int[] a) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * a[i];
        }
        return result;
        // result is deleted as the execution is out
        // of the variable’s scope. Data are no more
        // referenced by result
    }

}

//Return a boolean array that contains true if the corresponding char in a string is a vowel
//and false otherwise.
class BooleanArray {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'}; // list of vowels
        String s = "Hello."; // an input string
        // convert the string to lowercase (The list of vowels is lowercase)
        boolean[] vowelsFlag = vowelsAnalysis(s.toLowerCase(), vowels);

        for(int i = 0; i < vowelsFlag.length; i++) { // print output
            System.out.println(vowelsFlag[i] + "");
        }
    }
    public static boolean[] vowelsAnalysis(String str, char[] vowels) {
        boolean[] vowelsIndicator = new boolean[str.length()];
        for (int ii = 0; ii < str.length(); ii++) {
            for (int jj = 0; jj < vowels.length; jj++) {
                if (str.charAt(ii) == vowels[jj]) {
                    vowelsIndicator[ii] = true;
                    break; // break the internal loop (jj loop)
                }
            }
        }
        return vowelsIndicator; // return a reference variable of type boolean
    }
}

// returning an array from a method
//class ReturnArray {
//    public static void main(String[] args) {
//        int[] myArray = {1 , 7, 3, 4};
//
//        double[] output = weightedPower(myArray);
//
//    }
//
//    public static double[] weightedPower(int[] a) {
//
//        double[] result = new int [a.length];
//        int[] weight = {1, 2, 2, 1};
//
//        double sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i] * a[i]; // multiply the element by itself
//        }
//        sum /= (Math.sqrt(sum) / a.length);
//        for (int i = 0; i < a.length ; i++) {
//            result[i] = (a[i] * weight[i] / sum);
//        }
//        return result;
//    }
//}


// searching arrays
//Linear search compares the key element sequentially with each element in the
//array.
class LinearSearch {
    public static int linearSearch(int[] myList, int key) {
        for (int ii = 0; ii < myList.length; ii++) {
            if (key == myList[ii])
                return ii;
        }
        return -1;
    }
}

class LinearSearchExample {
    public static void main(String[] args) {

        // linear search == iterate through a collection one at a time.
        // runtime complexity: O(n)
        // slow for large data sets
        // fast for searches of small/medium data sets

        int[] intArray = {4, 2, 8, 9, 15, 3, 6};

        int key = 3;
        System.out.println(key + " is found at index: " + linearSearch(intArray, key));
    }

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }
}


class sortEx {
    public static void arraySorting(double[] myList, double[] sortedArray, int[] sortedIndices) {

// copy myList to tmpArray and initialize the indices
        for (int j = 0; j < myList.length; j++) {
            sortedArray[j] = myList[j];
            sortedIndices[j] = j;
        }
        double currentMin;
        int currentMinIndex, tmp;
        for (int j = 0; j < sortedArray.length - 1; j++) {
            currentMin = sortedArray[j];
            currentMinIndex = j;
            for (int k = j + 1; k < sortedArray.length; k++) {
                if (currentMin > sortedArray[k]) {
                    currentMin = sortedArray[k];
                    currentMinIndex = k;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 5; // length of the array
        double[] arr = new double[N];
        // prompt the user to enter the values of the array
        System.out.print("Enter the values of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextDouble();
        }
        double[] sortedArr = new double[N]; // to store the sorted array
        int[] sortedInd = new int[N]; // to store the indices of the sorted elements
        // invoke the method arraySorting to sort the array
        arraySorting(arr, sortedArr, sortedInd);
        // print the three arrays
        printArrays(arr, sortedArr, sortedInd);
    }
    public static void printArrays (double[] myList, double[] sortedArray, int[] sortedIndices) {
        System.out.println("Unsorted array:");
        for (int i = 0; i < myList.length; i++)
            System.out.printf("%.2f\t", myList[i]);
        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < myList.length; i++)
            System.out.printf("%.2f\t", sortedArray[i]);
        System.out.println();
        System.out.println("Sorted indices:");
        for (int i = 0; i < myList.length; i++)
            System.out.printf("%3d\t", sortedIndices[i]);
    }
}

class TheMatrixOfRelationships {
    public static int[] adjacencyMatrix(int size) {
        int[] out = new int[size];
        int counter = 0;
        String[] str = {"S1", "S2", "S3", "S4"};
        for (int ii = 0; ii < str.length; ii++) { // for each student
            for (int jj = 0; jj < str.length; jj++) { // with all other students
                if (ii != jj) { // except self-relationship
                    out[counter] = (int)(Math.random() * 4) + 1; // generate random level of relationship
                    counter++;
                }
            }
        }
        return out;

    }

    public static void printAdjacencyMatrix(String[] names, int[] relationships) {
        int count = 0;
        System.out.printf("\t\t\t\t\t"); // beginning of print
        for (int ii = 0; ii < names.length; ii++)
            System.out.printf("%11s\t", names[ii]); // print the names of the students (column-wise) (top)
        System.out.println();
        for (int ii = 0; ii < names.length; ii++) { // for each student ii
            System.out.printf("%10s\t|\t", names[ii]); // print his/her name
            for (int jj = 0; jj < names.length; jj++) {
                if (ii != jj) {
                    System.out.printf("%10d", relationships[count]); // print the relationship ii→jj
                    count++;
                } else {
                    System.out.printf("%10d", 0); // self-relationship = 0 (no need to save it in the array)
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] str = {"S1", "S2", "S3", "S4"}; // list of students
        // the number of (directed) relationships: S1 -> S2, S2 -> S1, etc.
        int totalNumRelationships = str.length * str.length - str.length;
        // generate the relationship levels and store them in the array adjMat
        int[] adjMat = adjacencyMatrix(totalNumRelationships);
        // print the matrix of relationships
        printAdjacencyMatrix(str, adjMat);
    }
}

// Variable-length argumenet list
class PowerArrayVariableLength {
    public static void main(String[] arg) {
        // invoke the method with the length-variable argument of length = 4
        System.out.println(powerArray(3, new double[] {1.5, 2.1, 3.7, 2})); // 1.5^{3}+2.1^{3}+3.7^{3}+2^{3}
        // invoke the method with the length-variable argument of length = 1
        System.out.println(powerArray(2, 1.5));

        //powerArray(2, 1.5)
        // 2 is the exponent && 1.5 is the num

        //Anonymous array is an array that does not have a name. The variable-length parameter
        //passed to the method in Line 4 is an anonymous array.


    }
    public static double powerArray(int pow, double... numbers) {
        double result = 0;

        for (int i = 0; i < numbers.length; i++)  {
            result += Math.pow(numbers[i], pow);
            // elemenet ^ pow(exponent) = result
            //1.5^3 = result then add to result and accumulate the sum.
        }
        return result;
    }
}

//Variable-length argument list Example

class VariableLengthArgument {
    public static void main(String[] args) {
        System.out.println( sum(1, 7)); // once passed in the method -> {1, 7}
    }

    private static int sum(int... numbers) { // arguments that were passed are the elements of the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

// THe Arrays Class
// java.util.Arrays class contains useful methods for array processing
class TheArrayClass {
    public static void main(String[] args) {

        double[] doubleArray = {1., 2.1, -5.2, 7., 3.5, 2.9};
        java.util.Arrays.sort(doubleArray); // sort the array
        java.util.Arrays.parallelSort(doubleArray); // parallel sorting the array
//        for (int i = 0; i < doubleArray.length; i++) {
//            System.out.println(doubleArray[i]);
//        }
        // sorts the elements from doubleArray[1] to doubleArray[4-1]
        java.util.Arrays.sort(doubleArray, 1, 4);
//        for (int i = 0; i < doubleArray.length; i++) {
//            System.out.println(doubleArray[i]);
//        }

        //binary search
        double[] doubleArray2 = {-5.2, 1., 2.1, 2.9, 3.5, 7.}; // sorted array
        System.out.println(Arrays.binarySearch(doubleArray, 3.5));
        //Arrays.binarySearch(doubleArray, 3.5); // returns 4; the index of 3.5

        System.out.println("-----------");
        // compare arrays: check whether the arrays are strictly equal
        int[] list1 = {2, 4, 10, 3}, list2 = {2, 4, 10, 3}, list3 = {2, 4, 3, 10};

        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list1, list3)); // false

        System.out.println("-----------");

        java.util.Arrays.fill(list1, 7);
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i] + "");
        }
        java.util.Arrays.fill(list1, 0, 2, 10); // assign 10 to list1[0] to list1[2]

        System.out.println("-----------");

        // .toString method returns a string of an array
        System.out.println(java.util.Arrays.toString(list1)); // displays [2, 4, 10, 3]
    }
}

public class OneDimensionalArrays {
}
