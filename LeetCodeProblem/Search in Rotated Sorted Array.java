/*

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

*/

//Linear Search Method
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // linear search 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        
        return -1;
    }
}


//Binary Search Method

class Solution {
    public int search(int[] nums, int target) {
        if (nums == null && nums.length == 0) return -1; 
        
        int left = 0; 
        int right = nums.length - 1;
        
        
        //nums = [4,5,6,7,0,1,2], target = 0
            
        // boundries
        while (left < right) {
            int midpoint = left + (right - left) / 2; // midpoint
            if (nums[midpoint] > nums[right]) { // smallest element 0
                left = midpoint + 1;
            } else {
                right = midpoint; // normal
            }
        }
        
        int start = left;
        left = 0; // reset for binary search 
        right = nums.length - 1;
        
        // sorted versiomn
        if (target >= nums[start] && target <= nums[right]) {
           left = start;  // search to the right
        } else {
            right = start; // search to the left
        }
        
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            } else if (nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1; 
            }
        }
        return -1;
    }
}
