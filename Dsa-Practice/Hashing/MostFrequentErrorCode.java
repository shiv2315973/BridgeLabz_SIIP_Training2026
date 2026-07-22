import java.util.HashMap;
import java.util.Map;

public class MostFrequentErrorCode {
    public int mostFrequentErrorCode(int[] codes) {
        if (codes == null || codes.length == 0) throw new IllegalArgumentException("Codes are required");
        Map<Integer, Integer> counts = new HashMap<>(); int bestCode = codes[0], bestCount = 0;
        for (int code : codes) { int count = counts.merge(code, 1, Integer::sum); if (count > bestCount) { bestCount = count; bestCode = code; } }
        return bestCode;
    }
}
