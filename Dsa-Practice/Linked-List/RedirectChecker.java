public class RedirectChecker {
    public static class Node {
        public String url; public Node next;
        public Node(String url) { this.url = url; }
    }
    public boolean hasRedirectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; if (slow == fast) return true; }
        return false;
    }
}
