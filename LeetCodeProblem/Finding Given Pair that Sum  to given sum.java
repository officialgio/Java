// find pair of numbers in array that add to given sum (HashMap method)
// Test Case: [1,4,2,6,3,8,2,9] sum = 5
// 		5 - 1 = 4 → is 4 in the map? Yes. return 1 or 4
class Solution {
    public int findPairOfGivenSum (int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        // add arr elements to hash map
        for (int i - 0 ; i < arr.lenght; i+) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.lenghl i++) {
            if (map.containsKey(sum - arr[i]) {
                return (sum - arr[i]);
                return arr[i];
            }
        }
    }
}
                
 // Check for a pair that matches given sum (HashSet method)
//[12,3,5,1.9] sum = 10

class Solution {
    public boolean ifPairExist(int[] arr, int sum) {
        if (arr.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(sum - arr[i])) {
                return true;
            } else {
                return false;
            }
        }
    }
}
                
                
                
