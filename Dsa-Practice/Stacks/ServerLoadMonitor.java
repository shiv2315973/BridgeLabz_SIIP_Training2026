import java.util.ArrayDeque;
import java.util.Deque;

public class ServerLoadMonitor {
    public static int[] loadSpan(int[] load) {
        int[] span = new int[load.length]; Deque<Integer> greater = new ArrayDeque<>();
        for (int i = 0; i < load.length; i++) { while (!greater.isEmpty() && load[greater.peek()] <= load[i]) greater.pop(); span[i] = greater.isEmpty() ? i + 1 : i - greater.peek(); greater.push(i); }
        return span;
    }
}
