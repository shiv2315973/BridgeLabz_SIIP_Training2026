import java.util.ArrayDeque;
import java.util.Deque;

public class NetworkThroughputMonitor {
    public static int[] maxThroughputWindow(int[] readings, int k) {
        if (readings == null || k < 1 || k > readings.length) throw new IllegalArgumentException("Invalid window");
        int[] result = new int[readings.length - k + 1]; Deque<Integer> candidates = new ArrayDeque<>();
        for (int i = 0; i < readings.length; i++) {
            while (!candidates.isEmpty() && candidates.peekFirst() <= i - k) candidates.pollFirst();
            while (!candidates.isEmpty() && readings[candidates.peekLast()] <= readings[i]) candidates.pollLast();
            candidates.offerLast(i); if (i >= k - 1) result[i - k + 1] = readings[candidates.peekFirst()];
        }
        return result;
    }
}
