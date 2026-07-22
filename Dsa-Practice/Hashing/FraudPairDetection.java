import java.util.HashMap;
import java.util.Map;

public class FraudPairDetection {
    public int[] findFraudPair(int[] amounts, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < amounts.length; i++) {
            Integer index = seen.get(target - amounts[i]);
            if (index != null) return new int[] {index, i};
            seen.put(amounts[i], i);
        }
        return new int[] {-1, -1};
    }
}
