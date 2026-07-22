public class ServerChain {
    public static class Node {
        public String serverName; public Node next;
        public Node(String serverName) { this.serverName = serverName; }
    }
    public Node findMiddleServer(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        return slow;
    }
}
