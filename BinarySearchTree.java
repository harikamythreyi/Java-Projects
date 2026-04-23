//inorder
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {

    // Function for inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);   // Visit left
        System.out.print(root.data + " "); // Visit root
        inorder(root.right);  // Visit right
    }

    public static void main(String[] args) {
        // Creating tree manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Call inorder
        inorder(root);
    }
}
