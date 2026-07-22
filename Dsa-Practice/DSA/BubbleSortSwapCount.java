public class BubbleSortSwapCount {
    public static int getBubbleSortSwaps(int[] nums) {
        int swaps = 0;
        for (int end = nums.length - 1; end > 0; end--) {
            boolean changed = false;
            for (int i = 0; i < end; i++) if (nums[i] > nums[i + 1]) { int t = nums[i]; nums[i] = nums[i + 1]; nums[i + 1] = t; swaps++; changed = true; }
            if (!changed) break;
        }
        return swaps;
    }
}
