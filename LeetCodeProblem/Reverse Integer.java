/*


Given a signed 32-bit integer x, 
return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
then return 0.


Input: x = 123
Output: 321


*/


class Solution {
    public int reverse(int x) {
        // 123 case
        int ans=0;
       while(x!=0){
           int d=x%10; // 32
           if((ans>Integer.MAX_VALUE/10)||(ans<Integer.MIN_VALUE/10)){
               return 0;
           }
           ans=ans*10+d; //32
           x=x/10; //1
       } 
        return ans;
    }
}
