import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Min_Max_Depth {

    static int idx = -1;

    public static Node build(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node node = new Node(nodes[idx]);
        node.left = build(nodes);
        node.right = build(nodes);

        return node;
    }

    public static int getMinimumDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        int count = 0;
        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            if (currentNode != null) {
                if (currentNode.left == null && currentNode.right == null) {
                    return count;
                }

                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }

            } else {
                if (!q.isEmpty()) {
                    count++;
                    q.offer(null);
                }
            }
        }

        return count;
    }

    public static int getMaximumDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int count = 0;
        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            if (currentNode.left != null) {
                q.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                q.offer(currentNode.right);
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nodes = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
        Node root = build(nodes);

        System.out.println("Root node is: " + root.data);
        System.out.println("Minimum depth: " + getMinimumDepth(root));

        System.out.println("Maximum depth is: " + getMaximumDepth(root));
    }
}
