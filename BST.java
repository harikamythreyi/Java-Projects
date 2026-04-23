public class BST {

    class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 25);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 55);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 35);
        tree.insert(tree.root, 75);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}