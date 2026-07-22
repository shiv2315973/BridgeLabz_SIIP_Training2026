public class BSTSearch {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /** Searches for a target value in a Binary Search Tree iteratively. */
    public boolean search(Node root, int target) {
        Node current = root;

        while (current != null) {
            if (target == current.val) {
                return true;
            }
            current = target < current.val ? current.left : current.right;
        }

        return false;
    }
}
