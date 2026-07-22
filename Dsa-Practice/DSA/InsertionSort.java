public class InsertionSort {
    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i], j = i - 1;
            while (j >= 0 && nums[j] > key) { nums[j + 1] = nums[j]; j--; }
            nums[j + 1] = key;
        }
        return nums;
    }
}
