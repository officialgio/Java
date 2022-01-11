/*

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

*/

//Sliding Window Algorithm o(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
    
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        
        while (i < s.length()) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, i - j + 1);
                i++;
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;   
    }
}
