class Solution {
    public int removeElement(int[] nums, int val) {
        
        int validSize = 0;
        
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[validSize] = nums[i];
                validSize++;
            }
        }
        return validSize;
    }
}



// [3,2,2,3]
//  ^
// [2,3,2,3] // I++
//    ^ ^
// [2,3,2,3]
//      ^
// [2,2,3,3]
//        ^
       
//        //return validSize; -> [2, 2] Size of 2
