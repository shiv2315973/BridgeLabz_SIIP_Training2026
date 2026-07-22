public class PacketBuffer {
    private final int[] data; private int front; private int count;
    public PacketBuffer(int capacity) { if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive"); data = new int[capacity]; }
    public boolean enqueue(int packetId) { if (isFull()) return false; data[(front + count) % data.length] = packetId; count++; return true; }
    public int dequeue() { if (isEmpty()) throw new IllegalStateException("Buffer empty"); int packet = data[front]; front = (front + 1) % data.length; count--; return packet; }
    public boolean isEmpty() { return count == 0; }
    public boolean isFull() { return count == data.length; }
    public int size() { return count; }
    public int capacity() { return data.length; }
}
