// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//          int i=0;
//          while (i<nums.length){
//             if(nums[i]!=i){
//             return i;
//             }
//             else i++;
//          }
//      return i;   
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {

        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}