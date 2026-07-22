public class BSTDelete {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /** Deletes a target SKU from the BST and returns the updated node reference. */
    public Node delete(Node node, int sku) {
        if (node == null) {
            return null;
        }

        if (sku < node.val) {
            node.left = delete(node.left, sku);
        } else if (sku > node.val) {
            node.right = delete(node.right, sku);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }

        return node;
    }
}
