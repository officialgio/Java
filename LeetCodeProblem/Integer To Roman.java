class Solution {

public String intToRoman(int num) {
    
    // When a symbol appears after a larger (or equal) symbol it is added
    // Example: VI = V + I = 5 + 1 = 6
    // Example: LXX = L + X + X = 50 + 10 + 10 = 70
    // But if the symbol appears before a larger symbol it is subtracted
    // Example: IV = V − I = 5 − 1 = 4
    // Example: IX = X − I = 10 − 1 = 9
    
   StringBuilder s = new StringBuilder();
    
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    for (int i = 0; i < values.length; i++) {
		while (num >= values[i]) {
			num -= values[i];
			s.append(roman[i]);
		}
	}
	return s.toString();
    

    }
}
