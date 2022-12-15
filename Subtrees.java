import java.util.concurrent.atomic.AtomicInteger;

class Node

{

    int data;

    Node left, right;

    Node(int data)

    {

        this.data = data;

        this.left = this.right = null;

    }

}

class Main1

{

    public static Node insert(Node root, int key)

    {

        if (root == null) {

            return new Node(key);

        }

        if (key < root.data) {

            root.left = insert(root.left, key);

        }

        else {

            root.right = insert(root.right, key);

        }

        return root;

    }

    public static boolean findSubTrees(Node root, int low, int high,

            AtomicInteger count)

    {

        if (root == null) {

            return true;

        }

        boolean left = findSubTrees(root.left, low, high, count);

        boolean right = findSubTrees(root.right, low, high, count);

        if (left && right && (root.data >= low && root.data <= high))

        {

            count.incrementAndGet();

            return true;

        }

        return false;

    }

    public static void main(String[] args)

    {

        int low = 5, high = 8;

        int[] keys = { 6, 5, 8, 7, 32, 10 };

        Node root = null;

        for (int key : keys) {

            root = insert(root, key);

        }

        AtomicInteger count = new AtomicInteger(0);

        findSubTrees(root, low, high, count);

        System.out.println("Count of subtrees: " + count);

    }

}