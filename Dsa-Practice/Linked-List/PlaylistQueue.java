public class PlaylistQueue {
    public static class Node {
        public int trackId; public Node next;
        public Node(int trackId) { this.trackId = trackId; }
    }
    public void insertAfter(Node current, int trackId) {
        if (current == null) throw new IllegalArgumentException("Current track cannot be null");
        Node inserted = new Node(trackId); inserted.next = current.next; current.next = inserted;
    }
}
