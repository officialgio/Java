/*

Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.



*/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); 
        // "yo yo   " -> "yo yo"
        int lastIndex = s.lastIndexOf(' ') + 1;
        
        return s.length() - lastIndex;
        
        
    }
}
