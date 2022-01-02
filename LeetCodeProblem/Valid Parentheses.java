/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true



*/


class Solution {
    public boolean isValid(String s) {
        
        //Put all left brackets in stack and whenever right brackets 
        //comes pop its corresponding left bracket . If it's not present             //then return false.
        
        Stack<Character> stack = new Stack();
        
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } if(ch ==']'){
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            else
            if(ch =='}'){
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
            else
            if(ch ==')'){
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
    
        }
        return stack.isEmpty(); 
    }
}
