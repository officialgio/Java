//Selection Sort
class SortingExample {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + "");
        }

    }

    public static void sortArray(int[] list) {

        int minIndex;
        //traverse list
        for (int j = 0; j < list.length - 1; j++) {
            //sets smallest value to beginning
            minIndex = j;
            //find smallest values
            for (int k = j + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) { // change "<" to ">" for descending
                    minIndex = k;
                }
            }
            //swaps values
           int temp = list[j];
            list[j] = list[minIndex];
            list[minIndex] = temp;
        }
    }
    public static void main (String[] args){
        int[] array = {3, 2, 7, 1, 0};
//        printArray(array);

        sortArray(array);

        printArray(array);

    }
}



/*Output*/
7
3
2
1
0
