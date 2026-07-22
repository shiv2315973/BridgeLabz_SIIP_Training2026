import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LogMerger {
    public static class LogEntry {
        public final long timestamp; public final String message;
        public LogEntry(long timestamp, String message) { this.timestamp = timestamp; this.message = message; }
    }
    public static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        List<LogEntry> result = new ArrayList<>();
        if (sources == null) return result;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Long.compare(sources.get(a[0]).get(a[1]).timestamp, sources.get(b[0]).get(b[1]).timestamp));
        for (int i = 0; i < sources.size(); i++) if (sources.get(i) != null && !sources.get(i).isEmpty()) heap.offer(new int[] {i, 0});
        while (!heap.isEmpty()) { int[] item = heap.poll(); result.add(sources.get(item[0]).get(item[1])); if (++item[1] < sources.get(item[0]).size()) heap.offer(item); }
        return result;
    }
}
