public class TaskQueue {
    public static class Node {
        public int val; public Node next;
        public Node(int val) { this.val = val; }
    }
    public Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        if (head.val == taskId) return head.next;
        Node previous = head, current = head.next;
        while (current != null && current.val != taskId) { previous = current; current = current.next; }
        if (current != null) previous.next = current.next;
        return head;
    }
}
