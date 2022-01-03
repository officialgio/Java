/*

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].



*/

// Solutions explained:
// There are a total of two cases: 
//     1. all digits are 9
//     2. any other cases: as long as there's one digit that is not 9
// for case #1, we can just flip all 9s into zero and add one to the very left end of the given array;
// for case #2, as long as we encounter a digit that is not 9, we could just increment it by one and return.


class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            
        }
        // [9] -> [1, 0]
        int[] newNumber = new int[len + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
