import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class PrintServer {
    private final Deque<Integer> printQueue = new ArrayDeque<>();
    public void submitJob(int jobId) { printQueue.addLast(jobId); }
    public void submitUrgentJob(int jobId) { printQueue.addFirst(jobId); }
    public int printNextJob() { if (printQueue.isEmpty()) throw new NoSuchElementException("No jobs in the queue"); return printQueue.removeFirst(); }
    public boolean isEmpty() { return printQueue.isEmpty(); }
    public int pendingCount() { return printQueue.size(); }
}
