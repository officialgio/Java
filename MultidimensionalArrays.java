package demo;

public class MultidimensionalArrays {
}


class Review {
    public static void main(String[] args) {

        char[] c = {'A', '$', '#'};
        char ch0 = c[0]; // ch0 = 'A'
        c[1] = 'B'; // c = {‘A’, ‘B’, ‘#’};

        // cLength = 3
        int cLength = c.length; // c is an array

        // an array of boolean values
        boolean[] b = {true, false, true, true};
        boolean b0 = b[0]; // b0 = true
        b[2] = false;
        // bLength = 4
        int bLength = b.length; // b is an array

        // an instance of the class String
        // or shortly a variable of type String
        String str = "Hello";
        int strLength = str.length(); // c is an array

        // an array of strings
        String[] s = {"Hello", "Hi", "Goodbye"};
        String s0 = s[0]; // s0 = “Hello”
        String s2 = s[2]; // s2 = “Goodbye”
        // sLength = 3, s0Length = 5
        int sLength = s.length; // s is an array
        int s0Length = s[0].length(); // s[0] is a string
        char ch = s[0].charAt(2); // ch = ?
    }
}

class Introduction {
    public static void main(String[] args) {
        int[] d = {5, 2, 3};
    // The above line is equivalent to:
    // int[] d = new int[3];
    // d[0] = 5;
    // d[1] = 2;
    // d[2] = 3;

        //From 1D arrays to 2D Arrays

        int[] a = {5, 2, 3};
        int[] e = {1, 4, 4};
        int[] f = {0, 8, 0};

        int[][] g = { {5, 2, 3},
                      {1, 4, 4},
                      {0, 8, 0} };
    }
}

class TwoDimensionalArrays {
    public static void main(String[] args) {
        //A 2-D array can be used to store a matrix or a table.


        //Basic Example
        double[][] romeWeather = {
                {54, 57, 62, 67, 75, 83, 89, 89, 81, 72, 62, 55},
                {37, 38, 43, 48, 56, 63, 67, 66, 60, 53, 45, 40},
                {2.9, 2.8, 2.4, 2.9, 2.3, 1.2, 0.8, 1.3, 2.7, 3.6, 4.5, 3.6},
                {9.5, 10.5, 12, 13.5, 14.5, 15, 15, 14, 12.5, 11, 10, 9}
        };
        double aprAvgHigh = romeWeather[0][3];


        // A two-dimensional array is an array of single-dimensional arrays.
        // The name of the i-th row (romeWeather[i]) is a 1-D array.
        // The 2-D array is a 1-D array of 1-D arrays.


    }
}

class DeclarationAndCreationOf2DArrays {
    public static void main(String[] args) {

        double[][] romeWeather = new double[4][12];

        // the number of rows is the number of 1-D arrays in the 2-D array
        System.out.println("Number of rows of the 2-D array is " + romeWeather.length);

        // the number of columns is the number of elements per 1-D array
        System.out.println("Number of columns of the 2-D array is " + romeWeather[0].length);

    }
}

class RaggedArray {
    public static void main(String[] args) {
        // the number of elemenets per row is not specified
        double[][] triangleArray = new double[4][];

        triangleArray[0] = new double[4]; // first row of length 4
        triangleArray[1] = new double[3]; // second row of length 3
        triangleArray[2] = new double[2]; // third row of length 2
        triangleArray[3] = new double[1]; // fourth row of length 1

//        {   {0, 0, 0, 0},
//            {0, 0, 0},
//            {0, 0},
//            {0} };

        /* To initialize a 2D array
        1) Assign a value to each element */
        triangleArray[0][0] = 54;
        triangleArray[0][1] = 57;
        triangleArray[0][2] = 62;
        triangleArray[0][3] = 67;
        triangleArray[1][0] = 37;
        triangleArray[1][1] = 38;
        triangleArray[1][2] = 43;
        triangleArray[2][0] = 2.9;
        triangleArray[2][1] = 2.8;
        triangleArray[3][0] = 9.5;

    }
}

class RaggedArray2 {
    public static void main(String[] args) {

        /* To initialize a 2D array
        2) Use array initializer: Declare and assign the values
        in a single statement*/
        double[][] rArray = { {54, 57, 62, 67},
                              {37, 38, 43},
                              {2.9, 2.8},
                              {9.5} };

        // Another example of ragged array
        // each row can have any positive number of elements

        int[][] rArray2 = new int[3][]; // 3 rows
        rArray2[0] = new int[2]; // 2 columns
        rArray2[1] = new int[4]; // 4 columns
        rArray2[2] = new int[1]; // 1 column

        // assign values to the elements of the array
        rArray2[0][0] = 71; rArray2[0][1] = 35;
        rArray2[1][0] = 28; rArray2[1][1] = 17;
        rArray2[1][2] = 5; rArray2[1][3] = 4;
        rArray2[2][0] = 10;


        // print the elements of the 2D ragged array
        for (int row = 0; row < rArray2.length; row++) {
            for (int col = 0; col < rArray2[row].length; col++) {
                System.out.printf("%d \t", rArray2[row][col]);
            }
            System.out.println();
        }

        //        71 	35
        //        28 	17 	5 	4
        //        10

    }
}

// Processing two-dimensional arrays: Extract the diagonal elements of a square array
class ExtractTheDiagonal {
    public static void main(String[] args) {

        // create a 2D array and assign values to it
        double[][] i2dArr = { {3.72, 1.73, 9.97, 4.15},
                              {0.01, 7.24, 8.13, 5.17},
                              {2.15, 4.12, 0.18, 4.07},
                              {1.75, 2.56, 1.99, 7.89} };

        // invoke the method and assign the result to the created
        // array diagArray
        double[] diagArray = extractDiagonal(i2dArr);

        // print the returned array
        for (int i = 0; i < diagArray.length; i++) {
            System.out.println(diagArray[i]);
        }
    }

    public static double[] extractDiagonal(double[][] iArr2D) {
        // store diagonal elements in the array diagonal
        double[] diagonal = new double[iArr2D.length];

        for (int j = 0; j < iArr2D.length; j++) {
            diagonal[j] = iArr2D[j][j];
        }
        return diagonal;
    }

        // 3.72
        // 7.24
        // 0.18
        // 7.89
}

// Assigning random values to and displaying the elements of a 2-D array
class ProcessingTwoDimensionalArrays {
    public static void main(String[] args){
        // assume that the array is rectangular (all rows have the same
        // length)

        double[][] twoDArray = new double[4][4];

        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[0].length; col++) {
                // Gaussian with mean and std of 1 and 2, respectively
                twoDArray[row][col] = Math.random() * 10;
                // display the elements of the 2-D array
                System.out.printf("%1.2f ", twoDArray[row][col]);
            }
            System.out.println();
        }

    }

        // 4.48 6.69 5.56 9.46
        // 2.33 5.19 7.63 9.02
        // 5.80 8.25 1.90 0.43
        // 2.36 4.40 3.62 9.19

}
