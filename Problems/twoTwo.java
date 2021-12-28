// Given an array of ints, return true if every 2 that appears in the array is next to another 2.


// twoTwo([4, 2, 2, 3]) → true
// twoTwo([2, 2, 4]) → true
// twoTwo([2, 2, 4, 2]) → false


public boolean twoTwo(int[] nums) {
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      int numberTwos = 0;
      while(i < nums.length && nums[i] == 2) { // in length and is == 2
        numberTwos++;
        i++;
      }
      if (numberTwos == 1) return false;
    }
  }
  return true;
}
