public class LogMerger {
    public static class Node {
        public long timestamp; public String logMessage; public Node next;
        public Node(long timestamp) { this.timestamp = timestamp; }
    }
    public Node mergeLogStreams(Node first, Node second) {
        Node dummy = new Node(0), tail = dummy;
        while (first != null && second != null) {
            if (first.timestamp <= second.timestamp) { tail.next = first; first = first.next; }
            else { tail.next = second; second = second.next; }
            tail = tail.next;
        }
        tail.next = first != null ? first : second;
        return dummy.next;
    }
}
