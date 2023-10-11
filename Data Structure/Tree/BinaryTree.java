import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class BinaryTree {
    
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    static int idx = -1;
    public static Node BuildTree(int[] nodes) {
        idx++;

        if(nodes[idx] == -1) { return null; }

        Node node = new Node(nodes[idx]);
        node.left = BuildTree(nodes);
        node.right = BuildTree(nodes);

        return node;
    }

    public static ArrayList<Integer> getPreOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) { return res; }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node currentNode = stack.pop();
            res.add(currentNode.data);

            if(currentNode.right != null) { stack.push(currentNode.right); }
            if(currentNode.left != null) { stack.push(currentNode.left); }
        }

        return res; 
    }

    public static ArrayList<Integer> getPostOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if(root == null) { return res; }
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        Node previousNode = null;

        while(!stack.isEmpty()) {
            Node currentNode = stack.peek();

            if(previousNode == null || previousNode.left == currentNode || previousNode.right == currentNode) {
                if(currentNode.left != null) {
                    stack.push(currentNode.left);
                }
                else if(currentNode.right != null) {
                    stack.push(currentNode.right);
                }
            }
            else if(currentNode.left == previousNode) {
                if(currentNode.right != null) {
                    stack.push(currentNode.right);
                }
            }
            else {
                res.add(currentNode.data);
                stack.pop();
            }

            previousNode = currentNode;
        }

        return res;
    }

    public static ArrayList<Integer> getInOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if(root == null) { return res; }
        Stack<Node> stack = new Stack<>();

        boolean done = false;
        Node currentNode = root;

        while(!done) {
            if(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else {
                if(stack.isEmpty()) { done = true; }
                else {
                    currentNode = stack.pop();
                    res.add(currentNode.data);
                    currentNode = currentNode.right;
                }
            }
        }

        return res;
    }

    public static ArrayList<Integer> getLevelOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();
            res.add(currentNode.data);

            if(currentNode.left != null) { queue.offer(currentNode.left); }
            if(currentNode.right != null) queue.offer(currentNode.right);
        }

        return res;
    }

    public static int getMaxNode(Node root) {
        int max = -1;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            Node currentNode = q.poll();
            if(currentNode.data > max)
                max = currentNode.data;

            if(currentNode.left != null)
                q.offer(currentNode.left);
                
            if(currentNode.right != null)
                q.offer(currentNode.right);
        }

        return max;
    }

    public static int getDepth(Node root) {
        if(root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

    public static boolean isExist(Node root, int data) {
        if(root == null) {
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if(data == currentNode.data) {
                return true;
            }
            if(currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        return false;
    }

    public static int getSize(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSize = getSize(root.left);
        int rightSize = getSize(root.right);

        return leftSize + rightSize + 1;
    }

    public static ArrayList<Integer> getPath(Node root, int data) {
        return null;
    }

    public static int getMinimumDepth(Node root) {
        if(root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int count = 1;

        while(!q.isEmpty()) {
            Node currentNode = q.poll();
            if(currentNode != null) {
                if(currentNode.left == null && currentNode.right == null) {
                    return count;
                }
                if(currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
            else {
                if(!q.isEmpty()) {
                    count++;
                    q.offer(null);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = BuildTree(nodes);
        System.out.println("Root node is: "+root.data);

        System.out.println("Pre Order Tree is: "+getPreOrder(root));
        System.out.println("Post Order Tree is: "+getPostOrder(root));
        System.out.println("In Order Tree is: "+getInOrder(root));
        System.out.println("Level Order Tree is: "+getLevelOrder(root));

        System.out.println();
        System.out.println("Max element is: "+getMaxNode(root));
        System.out.println("Depth of tree is: "+getDepth(root));

        System.out.println("4 is exist: "+isExist(root, 4));
        System.out.println("Path of 6 is: "+getPath(root, 6));
        System.out.println("Size of Tree is: "+getSize(root));

        System.out.println("Minimum depth is: "+getMinimumDepth(root));
    }
}