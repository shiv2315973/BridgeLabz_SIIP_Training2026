import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static int[] findPairIndices(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findPairIndices(nums, target);
        if (result.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair indices: " + result[0] + ", " + result[1]);
        }
    }
}
