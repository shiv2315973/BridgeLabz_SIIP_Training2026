import java.util.ArrayDeque;
import java.util.Deque;

public class BSTKthSmallest {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /** Finds the k-th smallest value through iterative in-order traversal. */
    public int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (++count == k) {
                return current.val;
            }
            current = current.right;
        }

        throw new IllegalArgumentException("k is out of bounds for this tree");
    }
}
