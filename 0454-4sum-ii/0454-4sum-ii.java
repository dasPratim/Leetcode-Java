class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // first get num1 and num2 sum, and save frequency of occurrence
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // second loop num3 and num4.
        // Find a key from the map that, when added to num3 + num4, equals zero.
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                count += map.getOrDefault(0 - num3 - num4, 0);
            }
        }

        return count;
    }
}