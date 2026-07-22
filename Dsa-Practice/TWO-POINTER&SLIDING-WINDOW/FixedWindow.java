import java.util.ArrayList;
import java.util.List;

public class FixedWindow {
    public static List<Integer> fixedWindowSum(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length < k || k <= 0) {
            return result;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        result.add(windowSum);

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            result.add(windowSum);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 8, 3, 6};
        int k = 3;

        System.out.println("Fixed window sums: " + fixedWindowSum(nums, k));
    }
}
