import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayAtMostNDistinct {
    public static int longestSubarrayAtMostNDistinct(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() > k) {
                int leftValue = nums[left];
                freq.put(leftValue, freq.get(leftValue) - 1);
                if (freq.get(leftValue) == 0) {
                    freq.remove(leftValue);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println("Longest subarray length: " + longestSubarrayAtMostNDistinct(nums, k));
    }
}
