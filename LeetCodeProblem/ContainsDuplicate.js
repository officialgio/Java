/*

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false; 
    }
}

//Use this as brute force then use Set for Optimisation
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if (nums.length == 0 || nums.length == null)
            return false;
        
        //Big o (n log n)
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[i + 1]) {
                return true; 
            }
        }
        return false;
    }
}

