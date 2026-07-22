import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKCustomerTracker {
    public static List<Integer> topKLargest(int[] transactions, int k) {
        if (transactions == null || k <= 0) return new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int amount : transactions) {
            if (heap.size() < k) heap.offer(amount);
            else if (amount > heap.peek()) { heap.poll(); heap.offer(amount); }
        }
        List<Integer> result = new ArrayList<>(heap); Collections.sort(result); return result;
    }
}
