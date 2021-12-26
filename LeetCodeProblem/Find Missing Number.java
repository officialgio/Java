class MissingNumber2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int sum1, sum2;

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        System.out.println("The sum of sum1 is: " + sum1);

        for (int i = 0; i <= 5; i++) {
            sum2 += i;
        }

        System.out.println("The sum of sum1 is: " + sum2);

        System.out.println("The missing num of the arr is: " + (sum2 - sum1));
        //System.out.println("The missing num of the arr is: " + missingNum(sum1,sum2));

    }
