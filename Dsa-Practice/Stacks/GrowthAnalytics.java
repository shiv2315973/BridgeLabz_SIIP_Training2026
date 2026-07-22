import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class GrowthAnalytics {
    public static int[] nextBusierDay(int[] visitors) {
        int[] answer = new int[visitors.length]; Arrays.fill(answer, -1); Deque<Integer> waiting = new ArrayDeque<>();
        for (int day = 0; day < visitors.length; day++) { while (!waiting.isEmpty() && visitors[day] > visitors[waiting.peek()]) answer[waiting.pop()] = visitors[day]; waiting.push(day); }
        return answer;
    }
}
