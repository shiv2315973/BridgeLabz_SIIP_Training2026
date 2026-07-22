public class BSTLowestCommonAncestor {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /** Finds the Lowest Common Ancestor (LCA) of two values in a BST. */
    public Node lowestCommonAncestor(Node root, int p, int q) {
        Node current = root;

        while (current != null) {
            if (p < current.val && q < current.val) {
                current = current.left;
            } else if (p > current.val && q > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }

        return null;
    }
}
