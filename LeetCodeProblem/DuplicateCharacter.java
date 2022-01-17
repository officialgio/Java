// Duplicate Character
// Test Case: String str = “Giovanny” → ‘n’

class Solution {
    public char getDuplicatesChars(String str) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) { // is the char in the set already?
                return ch;
            } else {
                set.add(ch);
            }
        }
    }
}
