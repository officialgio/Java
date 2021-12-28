//Given an array of ints, return true if 6 appears
//as either the first or last element in the array. The array will be length 1 or more.
class firstLast6 {
    public static void main(String[] args) {
        int[] firstLast6 = {6, 3,  2, 6};
        firstLast6(firstLast6);
    }
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            System.out.println("true");
            return true;
        } else
            System.out.println("false");
            return false;
    }
}
