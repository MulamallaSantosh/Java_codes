import java.util.*;

public class Binarytree {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    Binarytree() {
        root = null;
    }

    Binarytree(int value) {
        root = new Node(value);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        try (Scanner abc = new Scanner(System.in)) {
            int num = 0;
            while (num != -1) {
                System.out.println("Enter any number(-1 to exit) : ");
                num = abc.nextInt();
                tree.insert(num);
            }
        }
        tree.inorder();
    }
}
