public class BrowserHistory {
    public static class Node {
        public String pageUrl; public Node next;
        public Node(String pageUrl) { this.pageUrl = pageUrl; }
    }
    public Node reverseHistory(Node head) {
        Node previous = null;
        while (head != null) { Node next = head.next; head.next = previous; previous = head; head = next; }
        return previous;
    }
}
