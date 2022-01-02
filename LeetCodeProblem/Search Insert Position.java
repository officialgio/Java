/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1


*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary Search Method
        int l = 0; // begin index
        int r = nums.length - 1; 
        
        while(l <= r) {
            int midIndex = (l + r) / 2; // specify the index
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                r = midIndex - 1;
            } else {
                l = midIndex + 1;
            }
        }
        return l;   
    }
}

//Test case Example
(0 + 5) / 2 = 2 (index)
    l = midIndex + 1; 
{1, 2, 3, 4, 5}
       ^ 
       (3 + 5) / 2 = 4 (index)
           {1, 2, 3, 4, 5, 6}
                           ^
                           return l(index 5);
           



{1, 2, 3, 4, 5} target = 6
