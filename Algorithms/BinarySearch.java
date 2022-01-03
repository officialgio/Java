package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 6};
        int target = 6;

        System.out.println("Target 6 is found at:" + binSearch(list, target));

    }
    public static int binSearch(int[] list, int target) {
        int left = 0;
        int right = list.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            if (target < list[middle]) { // too high
                right = middle - 1;
            }
            else if (target > list[middle]) { // too low
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

}
