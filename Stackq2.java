import java.util.Scanner;

public class Q17 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void addend(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;

        }
    }

    public void removefront() {
        // Node new_node= new Node(data);
        if (head == null) {
            System.out.println("Linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;

        }

    }

    public void printt(Q17 list, int x) {

        if (x == 3) {
            int kt = 0;
            Q17.Node n = list.head;
            while (n != null) {
                kt = kt + 1;
                n = n.next;
            }
            System.out.print("The size of array is " + kt);
        } else if (x == 4) {
            if (head == null) {
                System.out.println("Linked list is empty");
            } else {
                System.out.println("Linked list is not empty");
            }
        } else if (x == 5) {
            if (head != null) {
                System.out.println("Top element of queue is " + head.data);
            } else {
                System.out.println("Linked list is empty");
            }
        } else {
            Q17.Node n = list.head;
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }

        }
    }

    public static void main(String[] args) {
        Q17 list = new Q17();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of operations : ");
        int b = input.nextInt();
        input.close();

        for (int k = 0; k < b; k++) {
            System.out.print("Enter which operation you want to perform");
            System.out.println("\n1 - Push \n2 - Pop \n3 - Size \n4 - empty check\n5 - top element\n6 - exit");
            int a = input.nextInt();
            int mp = 0;
            mp = a;

            switch (a) {
                case 1 -> {
                    System.out.print("Enter the number you want to add : ");
                    int c = input.nextInt();
                    list.addend(c);
                    list.printt(list, mp);
                }
                case 2 -> {
                    list.removefront();
                    list.printt(list, mp);
                }
                case 3 -> {
                    list.printt(list, mp);
                }
                case 4 -> {
                    list.printt(list, mp);
                }
                case 5 -> {
                    list.printt(list, mp);
                }
                case 6 -> {
                    list.printt(list, mp);
                    return;
                }
            }

        }
    }
}
