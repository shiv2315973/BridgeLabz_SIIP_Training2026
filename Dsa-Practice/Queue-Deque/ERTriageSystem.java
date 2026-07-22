import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class ERTriageSystem {
    public static class Patient {
        public final int priority; public final String name; private final long arrivalOrder;
        private Patient(int priority, String name, long arrivalOrder) { this.priority = priority; this.name = name; this.arrivalOrder = arrivalOrder; }
    }
    private long arrivalCounter;
    private final PriorityQueue<Patient> waiting = new PriorityQueue<>((a, b) -> a.priority != b.priority ? Integer.compare(a.priority, b.priority) : Long.compare(a.arrivalOrder, b.arrivalOrder));
    public void admitPatient(int priority, String name) { waiting.offer(new Patient(priority, name, arrivalCounter++)); }
    public Patient callNextPatient() { if (waiting.isEmpty()) throw new NoSuchElementException("No patients waiting"); return waiting.poll(); }
    public Patient peekNextPatient() { if (waiting.isEmpty()) throw new NoSuchElementException("No patients waiting"); return waiting.peek(); }
    public boolean isEmpty() { return waiting.isEmpty(); }
    public int waitingCount() { return waiting.size(); }
}
