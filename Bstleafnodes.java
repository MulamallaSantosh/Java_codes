public class Bstleafnodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static int sum;

    static void leafSum(Node root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            sum += root.data;

        leafSum(root.left);
        leafSum(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(2);

        sum = 0;
        leafSum(root);
        System.out.println(sum);
    }
}
