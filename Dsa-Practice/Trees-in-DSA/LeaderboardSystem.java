import java.util.*;

public class LeaderboardSystem {
    static class Node {
        int score;
        Node left, right;

        Node(int score) {
            this.score = score;
        }
    }

    public static int findTopScore(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int left = findTopScore(root.left);
        int right = findTopScore(root.right);
        return Math.max(root.score, Math.max(left, right));
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.right.right = new Node(90);

        System.out.println("Top score: " + findTopScore(root));
    }
}
