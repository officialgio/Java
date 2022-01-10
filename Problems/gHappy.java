/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' 
immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false

*/

public boolean gHappy(String str) {
  int len = str.length();
  boolean happy = true;
  
  for (int i = 0; i < len; i++) {
    if (str.charAt(i) == 'g') {
      happy = true;
      if (i > 0 && str.charAt(i - 1) == 'g') {
      happy = true; 
      } else if (i < len - 1 && str.charAt(i + 1) == 'g') {
      happy = true; 
      }
    else {
      return false; 
      }
    } 
  }
  return happy;
}
