import java.util.PriorityQueue;

public class AdmissionCutoff {
    public static int findKthLargest(int[] scores, int k) {
        if (scores == null || k < 1 || k > scores.length) throw new IllegalArgumentException("Invalid k");
        PriorityQueue<Integer> topScores = new PriorityQueue<>(k);
        for (int score : scores) {
            if (topScores.size() < k) topScores.offer(score);
            else if (score > topScores.peek()) { topScores.poll(); topScores.offer(score); }
        }
        return topScores.peek();
    }
}
