public class CallStack {
    private static class Frame { String name; Frame next; Frame(String name, Frame next) { this.name = name; this.next = next; } }
    private Frame top; private int size;
    public void push(String functionName) { top = new Frame(functionName, top); size++; }
    public String pop() { if (isEmpty()) throw new IllegalStateException("No active call"); String name = top.name; top = top.next; size--; return name; }
    public String peek() { if (isEmpty()) throw new IllegalStateException("No active call"); return top.name; }
    public boolean isEmpty() { return top == null; }
    public int depth() { return size; }
}
