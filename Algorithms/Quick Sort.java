package Algorithms;

import java.util.Random;

// This algorithm is quite efficient for large-sized data sets as its
// average and worst-case complexity are O(n2), respectively.
public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);
        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex]; // last num [numbers.length - 1]

        int leftPointer = partition(array, lowIndex, highIndex, pivot); // new method

        // recursive
        quicksort(array, lowIndex, leftPointer - 1); // quick sort nums less than 7 (left side)
        quicksort(array, leftPointer + 1, highIndex); // quick sort nums greater than 7 (right side
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex; //
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) { // terminate if lp and rp collide
            // increment i until leftPointer > than the pivot then kick out of the loop
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            // deincrement until you find a num that is lower than the pivot
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            // swap the left pointer and right pointer where they stand
            swap(array, leftPointer, rightPointer);
        }
        // once left pointer is collided with right pointer swap left pointer
        // with the highIndex(pivot)
        // now all elements are least to greatest from the pivot | Ex: 1, 5, 3, 4, 7, 8, 9 (pivot: 7)
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] numebrs) {
        for (int i = 0; i < numebrs.length; i++) {
            System.out.println(numebrs[i]);
        }
    }

}
