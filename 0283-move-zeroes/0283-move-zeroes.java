public class Solution {
    public void moveZeroes(int[] nums) {
        int cut = -1; // the left of cut is all non-zero
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
               if (i != cut + 1) {
                   while (cut < 0 || nums[cut]!=0) {
                       cut ++;
                   }
                   nums[cut] = nums[i];
                   nums[i] = 0;
               }
               else {
                   cut ++;
               }
            }
        }
    }
}