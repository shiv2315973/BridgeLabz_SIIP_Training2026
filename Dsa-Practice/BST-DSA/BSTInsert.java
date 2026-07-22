public class BSTInsert {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /** Inserts a new employee ID into the BST. */
    public Node insert(Node node, int id) {
        if (node == null) {
            return new Node(id);
        }

        if (id < node.val) {
            node.left = insert(node.left, id);
        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }

        return node;
    }
}
