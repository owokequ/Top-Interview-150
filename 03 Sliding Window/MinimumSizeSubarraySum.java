/**
 * LeetCode #209 — Minimum Size Subarray Sum
 * 
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[] { 1, 1, 1, 1, 1, 1 }));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minLength = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            while (currentSum >= target) {
                int length = i - l + 1;

                if (minLength == 0) {
                    minLength = length;
                } else {
                    minLength = Math.min(minLength, length);
                }

                currentSum -= nums[l];
                l++;
            }
        }

        return minLength;
    }
}
