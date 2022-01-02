/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

*/

class Solution {
    public void reverseString(char[] s) {
        int i = 0; 
        int j = s.length -1;
        
      // once pointers meet break
        while (i < j) {
          //swap chars
            char tmp = s[i];
            s[i] = s[j];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
