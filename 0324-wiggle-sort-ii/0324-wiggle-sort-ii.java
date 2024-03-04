public class Solution {
    public void wiggleSort(int[] nums) {
        int[] tmp = new int[nums.length];
        Arrays.sort(nums);
        int left = (nums.length - 1) / 2, right = nums.length - 1;
        for (int i = 0; i < tmp.length; i ++) {
            if (i % 2 == 0) {
                tmp[i] = nums[left--];
            }
            else {
                tmp[i] = nums[right--];
            }
        }
        for (int i = 0; i < tmp.length; i ++) {
            nums[i] = tmp[i];
        }
    }
}